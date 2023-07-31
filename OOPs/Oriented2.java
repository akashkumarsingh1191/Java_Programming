public class Oriented2 {
    public static void main(String args[]){
        Mustang myhorse=new Mustang();
        Horse h=new Horse();
        h.eats();
        h.walk();
        System.out.println(h.color);

        Chiken c=new Chiken();
        c.eats();
        c.walk();
        
    }
}
abstract class Animal{
    String color;
    Animal(){
        color="brown";
        System.out.println("Animal constructor called...");
    }
    void eats(){
        System.out.println("animals eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor called...");
    }
    void changecolor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called...");
    }
}
class Chiken extends Animal{
    void changecolor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}