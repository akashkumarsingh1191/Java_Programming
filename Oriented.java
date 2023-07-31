

public class Oriented{
    public static void main(String args[]){
        // Pen p1=new Pen();
        // p1.setColor("Blue");
        // System.out.println("Pen color is " +p1.getColor());
        // p1.setTip(5);
        // System.out.println("Pen tip is " +p1.getTip());
        // p1.setColor("Pink");
        // System.out.println("Pen color is " +p1.getColor());
        // p1.setTip(2);
        // System.out.println("Pen tip is " +p1.getTip());

        // Student s1=new Student();
        // s1.setName("Akash");
        // System.out.println("Student name is :"+s1.getName());
        // s1.setRoll(13);
        // System.out.println("Student rollno is :"+s1.getRoll());
        // Student s2=new Student();
        // s2.setName("Ajay");
        // System.out.println("Student name is :"+s2.getName());
        // s2.setRoll(11);
        // System.out.println("Student rollno is :"+s2.getRoll());
        // Student s3=new Student();
        // s3.setName("Aakash");
        // System.out.println("Student name is :"+s3.getName());
        // s3.setRoll(02);
        // System.out.println("Student rollno is "+s3.getRoll());
        // Dog Sharadha=new Dog();
        // Sharadha.legs=4;
        // Sharadha.eat();
        // System.out.println(Sharadha.legs);
        Animal fs=new Animal();
        fs.eat();


    }
}
// class Pen{
//     private String color;
//     private int tip;
//     String getColor() {
//         return this.color;
//     }
//     int getTip() {
//         return this.tip;
//     }
//     void setColor(String color) {
//         this.color = color;
//     }
//     void setTip(int tip) {
//         this.tip = tip;
//     }

// }
// class Student{
//     String name;
//     int roll;
//     void setName(String name) {
//         this.name = name;
//     }
//     void setRoll(int roll) {
//         this.roll = roll;
//     }
//     String getName() {
//         return this.name;
//     }
//     int getRoll() {
//         return this.roll;
//     }

    

// derived class /child class
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }

// base class/ parent class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void walk(){
        System.out.println("swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}