class Solution:
    def minimumCost(self, nums: List[int], k: int, dist: int) -> int:
        
        def move_from_left_to_right():
            nonlocal current_sum
            element = left_set.pop()
            current_sum -= element 
            right_set.add(element)

        def move_from_right_to_left():
            nonlocal current_sum
            element = right_set.pop(0)
            left_set.add(element)
            current_sum += element 

        k -= 1

        current_sum = sum(nums[:dist + 2])
        left_set = SortedList(nums[1:dist + 2])
        right_set = SortedList()

        while len(left_set) > k:
            move_from_left_to_right()

        min_cost = current_sum 

        for i in range(dist + 2, len(nums)):
            outgoing_element = nums[i - dist - 1]
            if outgoing_element in left_set:
                left_set.remove(outgoing_element)
                current_sum -= outgoing_element
            else:
                right_set.remove(outgoing_element)

            incoming_element = nums[i]
            if left_set and incoming_element < left_set[-1]:
                left_set.add(incoming_element)
                current_sum += incoming_element
            else:
                right_set.add(incoming_element)

            while len(left_set) < k:
                move_from_right_to_left()
            while len(left_set) > k:
                move_from_left_to_right()

            min_cost = min(min_cost, current_sum)

        return min_cost 