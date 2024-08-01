/* Set the ith bit of a given number if it is not set

 */
public class ANDOpreator {

    private int K;
    private int N;

    public ANDOpreator(int K,int N)
    {
        this.K=K;
        this.N=N;
    }
    public boolean setBit()
    {
        if((N&(1<<K))==0)
            return true;
        return false;
    }
}
