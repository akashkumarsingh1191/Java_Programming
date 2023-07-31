public class OOPs{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setColor("red");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());
        p1.setTip(6);
         System.out.println(p1.getTip());
    }
}
class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    void setColor(String newColor){
        color=newColor;
    }

    int getTip(){
        return this.tip;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

