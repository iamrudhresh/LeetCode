class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> storeValue=new HashMap<>();
         Set<Integer> sortedSet = new TreeSet<>();
        for(int i=0;i<arr1.length;i++){
            storeValue.put(arr1[i],storeValue.getOrDefault(arr1[i], 0) + 1);
            int v=arr1[i];
            boolean exists = Arrays.stream(arr2).anyMatch(x -> x == v);
            if(!exists)sortedSet.add(arr1[i]);
        }
        int j=0;
        for(int i=0;i<arr2.length;i++){
            int val=storeValue.get(arr2[i]);
            for(int p=0;p<val;p++){
                arr1[j++]=arr2[i];
            }
        }
        for (Integer element : sortedSet) {
            System.out.println(element);
            int val=storeValue.get(element);
            for(int p=0;p<val;p++){
                arr1[j++]=element;
            }
        }
        return arr1;
    }
}