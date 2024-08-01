/* XOR property say's A^A =0
All the duplicate element will get cancelled because of this property and
will show the only Unique element
 */

public class NotDuplicateElement {
    private int[] arr;

    public NotDuplicateElement(int[] arr) {
        this.arr = arr;
    }

    public int FindUniqueInArray()
    {
        int ans=0;

        for(int i=0;i<arr.length;i++)
        {
            ans^=arr[i];
        }
        return ans;
    }
}
