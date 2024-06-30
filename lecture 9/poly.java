// class parent{
//     void fun(){
//         System.out.println("i am in parent");
//     }
// }
// class child extends parent{
//     void fun(){
//         System.out.println("i am in child");
//     }
// }


// public class poly{
//     public static void main(String[] args){
//         System.out.println("in main class");

//         child c=new child();
//         c.fun();

//     }
    
// }





class parent{
    void fun(){
        System.out.println("i am in parent");
    }
    void fun(int a){
        System.out.println("i am in parent 1 a:"+a);
    }
    void fun(int a,int b){
        System.out.println("i am in parent 2 a and b"+a+" "+b);
    }
}
public class poly{
    public static void main(String[] args){
        System.out.println("in main class");

        parent c=new parent();
        c.fun();
        c.fun(1);
        c.fun(1,2);

    }
    
}
