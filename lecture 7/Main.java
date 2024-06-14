
class car{
    String name;
    String color;
    int year;
    int topspeed;
    void acc(){
        System.out.println("car is acceleration");
    }

    boolean speed(){
        if(topspeed>100){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Main{
    public static void main(String args[]){
        car supra=new car();
        System.out.println(supra.name);
        supra.name="supraaa";
        supra.topspeed=20;
        supra.color="red";
        supra.year=2004;
        System.out.println(supra.name);
        System.out.println(supra.topspeed);        
        System.out.println(supra.color);        
        System.out.println(supra.year);      
        System.out.println(supra.speed());  
    }
}