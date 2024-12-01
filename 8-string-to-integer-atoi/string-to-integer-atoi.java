class Solution {
    public int myAtoi(String s) {
        // Get the length of the string
        int len = s.length();
        
        // Flags to track whether the number is negative, digits have been read, and if the sign has been read
        boolean neg = false, digitReaded = false, sign_readed = false;
        
        // Index variables for iterating through the string and tracking digits
        int i = 0;
        int j = 0;
        
        // Use long to store the number to prevent overflow during calculation
        long num = 0;
        
        // Array to store the digits found in the string (though this is not strictly necessary)
        int[] num_digits = new int[len];

        // Iterate through the string while characters are valid (digits, space, '+', or '-')
        while (i < len && (Character.isDigit(s.charAt(i)) || s.charAt(i) == '-' || s.charAt(i) == '+' || s.charAt(i) == ' ')) {

            // Skip spaces at the beginning, but stop once digits or sign have been encountered
            if (s.charAt(i) == ' ') {
                if (!digitReaded && !sign_readed) { // Only skip if no digit or sign has been read
                    i++;
                    continue;
                } else break; // Stop if space is encountered after digits or sign
            }

            // Handle the negative sign
            if (s.charAt(i) == '-') {
                if (!digitReaded && !sign_readed) { // Allow a negative sign only if no digit or sign has been read
                    neg = true; // Mark the number as negative
                    i++;
                    sign_readed = true; // Mark that a sign has been read
                    continue;
                } else break; // Stop if a sign appears after digits or if a sign was already encountered
            } 
            // Handle the positive sign
            else if (s.charAt(i) == '+') {
                if (!digitReaded && !sign_readed) { // Allow a positive sign only if no digit or sign has been read
                    i++;
                    sign_readed = true; // Mark that a sign has been read
                    continue;
                } else break; // Stop if a sign appears after digits or if a sign was already encountered
            }

            // Break the loop if a non-digit character is encountered
            if (!Character.isDigit(s.charAt(i))) break;

            // Store the digit found into the num_digits array
            num_digits[j] = Character.getNumericValue(s.charAt(i));
            j++;
            i++;
            digitReaded = true; // Mark that a digit has been read

            // Incrementally calculate the numeric value while avoiding overflow
            num = num * 10 + num_digits[j - 1];
            
            // If the number exceeds Integer.MAX_VALUE, return the clamped value
            if (!neg && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            // If the number is below Integer.MIN_VALUE, return the clamped value
            if (neg && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        // Apply the negative sign if necessary
        if (neg) {
            num = -num;
        }

        // Return the final result, cast to an int (since the value is now within the int range)
        return (int) num;
    }
}