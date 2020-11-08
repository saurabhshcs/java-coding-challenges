package com.techsharezone.challenges.misc;

/*
 * @created 08/11/2020 -00:19
 * @project coding-challenges
 * @author  saurabhshcs
 */

import java.util.HashMap;
import java.util.Map;

/*
*
* Problem - Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.


You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
* */
public class FindIndicesOfSumOfTwoNumbers {

    public static void main(String[] args) {
        int[] numbers = new int[] {3,2,4};
        int targetSumOfTwoNumbers = 6;
        int result[] = getIndicesForTargetSum(numbers, targetSumOfTwoNumbers);

        System.out.println(result[0] + " " + result[1]);
    }
    public static int[] getIndicesForTargetSum(final int[] numbers, final int targetSumOfTwoNumbers){
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for (int i = 0; i < numbers.length; i++){
            int number = targetSumOfTwoNumbers - numbers[i];
            if(visitedNumbers.containsKey(number)){
                return new int[] {i, visitedNumbers.get(number)};
            }
            visitedNumbers.put(numbers[i], i);
        }

        return new int[] {-1, -1};
    }
}
