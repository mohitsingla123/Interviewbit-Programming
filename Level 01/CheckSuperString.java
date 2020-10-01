public class Solution {
    public int solve(String A) {
        A = A.toUpperCase();
        int len = A.length();
        int count = 0;
        for(int i = 0;i<len;i++)
        {
            if(A.charAt(i) == 'A' || A.charAt(i) == 'E'|| A.charAt(i) == 'I' || A.charAt(i) == 'O'||A.charAt(i) == 'U')
            {
                count += (len - i);
            }
        }
        int cal = count % 10003 ;
        //System.out.println(cal);
        return cal;
    }
}
