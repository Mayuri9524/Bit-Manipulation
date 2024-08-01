/* Count the SET bits in N till 32 bit

 */

public class CountSetBit {
    private long A;

    public CountSetBit(int a) {
        A = a;
    }

    public long countSetBits() {
        int count = 0;

        for (int i = 0; i <= 31; i++)
        {
            if((A&(1<<i))>0)
            {
                ++count;
            }
        }
        return count;
    }

    public long countSetBitsFast() {
        int count = 0;

        while(A>0)
        {
            if((A&1)==1)
            {
                ++count;
            }
            A=A>>1;
        }
        return count;
    }
}
