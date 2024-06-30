public class primitiveDT{
    public static void main(String[] args){
        int x=5;
        int y = 7;
        System.out.println("X is : "+x);
        System.out.println("Y is : "+y);
        byte b = 10;
        System.out.println("B is : "+b);
        byte b2 = (byte)129;
        System.out.println("B2 is : "+b2);
        int i = b;
        System.out.println("I is : "+i);
        float f = (float)5.5;
        char ch ='a';
        //operands
        int z = x+y;
        System.out.println("Z is : "+z);
        //post increment
        int m = 5;
        int n = m++;
        System.out.println("M is : "+m);
        System.out.println("N is : "+n);
        //pre increment
        int e = 5;
        int d = ++e;
        System.out.println("E is : "+e);
        System.out.println("D is : "+d);
    }
}