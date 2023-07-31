public class Oriented1{
    public static void main(String args[]){
        Calculator cal=new Calculator();
        System.out.println(cal.sum(2,1));
        System.out.println(cal.sum((float)12.5,(float) 25.5));
        System.out.println(cal.sum(12, 13, 15));
    }
}
class Calculator{
    int sum(int num1,int num2){
        return num1+num2;
    }
    float sum(float num1,float num2){
        return num1+num2;
    }
    int sum(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    
}