//Solution:

public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
	    int size = a.size();
        for(int k = 0; k< size/2; k++)
	    {
	      Collections.swap(a , k , size-1-k);
	    }
	    
	    for (int i = 0; i < size; i++)
	    {
	    for (int j= i; j< size; j++)
	    {
	        if(i !=j)
	        {
	            int temp1 = a.get(i).get(j);
	            int temp2 = a.get(j).get(i);
	            a.get(i).set(j , temp2);
	            a.get(j).set(i, temp1);
	        }
	    }
	    }
	}
}
/*
Problem Statement:

Rotate Matrix
Asked in:  
Google
Facebook
Amazon
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note that if you end up using an additional array, you will only receive partial score.

Example:

If the array is

[
    [1, 2],
    [3, 4]
]
Then the rotated array becomes:

[
    [3, 1],
    [4, 2]
]
