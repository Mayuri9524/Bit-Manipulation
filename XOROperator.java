/* Unset the ith bit of a given number if it is set

 */
public class XOROperator {
    private int K;
    private int N;

    public XOROperator(int k, int n) {
        K = k;
        N = n;
    }

    public int unSetBit()
    {
        if((N&(1<<K))==0)
            return N;
        return (N^(1<<K));
    }
}
