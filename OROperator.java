/* Create a binary number with specific pattern
The pattern is: A,B,C <=20
     A 0's
     B 1's
     C 0's
 Return the decimal value of ans
 */
public class OROperator {
    private int A;
    private int B;
    private int C;

    public OROperator(int a, int b, int c) {
        A = a;
        B = b;
        C = c;
    }

    public long BinaryNumber()
    {
        long ans=0;
        for(int i=C;i<(B+C-1);i++)
        {
            ans|=(1<<i);
        }
        return ans;
    }
}
