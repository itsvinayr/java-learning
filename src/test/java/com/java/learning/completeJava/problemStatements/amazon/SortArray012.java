package com.java.learning.completeJava.problemStatements.amazon;

/*
Set three variables low=0,mid=0, high=n-1 where n=length of input array
While (mid<=high), consider three cases on basis of the value of array [mid].
If array[mid] is 0
Swap (array [low], array [mid]) since 0's should be at starting
Increment low
Increment mid
Break statement
If array[mid] is 1
Keep as it is since 1's should be at middle after being sorted
Increment mid
Break statement
If array[mid] is 2
Swap (array [mid], array [high])
Decrement high
Break statement
Resulting array is sorted.
 */

import java.util.Arrays;

public class SortArray012 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0, 1, 1, 2, 2, 0, 0};
        int low = 0, mid = 0, high = arr.length - 1, temp=0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
