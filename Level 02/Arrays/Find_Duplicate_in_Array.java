public class Solution {
    public int repeatedNumber(final int[] A) {
        int result = -1;
        Arrays.sort(A);
        for(int i = 1;i<A.length;i++)
        {
            if(A[i-1] == A[i])
            {
                result = i;
                break;
            }
        }
        return result;
    }
}
/*
Problem Statement:

Find Duplicate in Array
Asked in:  
Amazon
VMWare
Riverbed
Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.

Sample Input:

[3 4 1 4 1]
Sample Output:

1
If there are multiple possible answers ( like in the sample case above ), output any one.

If there is no duplicate, output -1
