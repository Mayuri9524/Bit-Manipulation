public class Main {
    public static void main(String[] args) {
        System.out.println("AND operator");

        ANDOpreator obj = new ANDOpreator(12,3);
        if(obj.setBit())
        {
            System.out.println("Set the bit");
        }
        else
        {
            System.out.println("Set Not the bit");
        }

        System.out.println("XOR Operator");
        XOROperator obj2 = new XOROperator(3,12);
        System.out.println(obj2.unSetBit());


        System.out.println("OR operator");
        OROperator obj3= new OROperator(4,3,2);
        System.out.println(obj3.BinaryNumber());


        System.out.println("Set bits in N count till 32 bits");
        CountSetBit obj4 = new CountSetBit(12);
        System.out.println(obj4.countSetBits());
        System.out.println(obj4.countSetBitsFast());

        System.out.println("Find Unique Element from the array");
        int[] arr = {1,2,3,4,1,2,4,3,6};
        NotDuplicateElement N = new NotDuplicateElement(arr);
        System.out.println(N.FindUniqueInArray());
    }
}