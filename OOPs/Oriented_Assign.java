public class Oriented_Assign{
    public static void main(String[] args) {
        Complex c=new Complex(4, 3);
        Complex d=new Complex(9, 4);
        Complex e= Complex.add(c, d);
        Complex f= Complex.diff(c, d);
        Complex g= Complex.product(c, d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
        Operation O= new Operation();
        O.add((float)4.5,(float)5.8);
    }
}
class  Complex{
    int real;
    int img;
    public Complex(int r,int i){
        real=r;
        img=i;
    }  

public static Complex add(Complex a,Complex b){
    return new Complex((a.real+b.real),(a.img+b.img));
}

public static Complex diff(Complex a,Complex b){
    return new Complex((a.real-b.real),(a.img-b.img));
}

public static Complex product(Complex a,Complex b){
    return new Complex((a.real*b.real)-(a.img*b.img),(a.real*b.real)+(a.real*b.real));
}

public void printComplex(){
    if(real==0 && img!=0){
        System.out.println(img+"i");
    }
    else if(img==0 && real!=0){
        System.out.println(real);
    }
    else{
        System.out.println(real+"+"+img+"i");
    }
}

}
class Operation{
    int num1;
    int num2;
    public Operation(){
        // num1=a;
        // num2=b;
    }

public static void add(int a,int b){
    int sum=a+b;
    System.out.println("Sum of"+a+"+"+b+"="+sum);
}

public static void add(float a,float b){
    float sum=a+b;
    System.out.println("Sum of"+a+"+"+b+"="+sum);
}

public static int diff(int a,int b){
    return (a-b);
}

public static int product(int a,int b){
    return (a*b);
}

}