public class Oriented3 {
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
        King k=new King();
        k.moves();
        Pawn p=new Pawn();
        p.moves();
        Rook r=new Rook();
        r.moves();
        Knight kn=new Knight();
        kn.moves();
        Bishop b=new Bishop();
        b.moves();
        Bear B=new Bear();
        B.eats();
    }
}
// creating a interface using 'interface 'keyword.
interface ChessPlayer{
    // by default public ,abstract . we cannot write implemention because we write abstraction.   
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,digional(in all 4 direction)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagional(by 1 step)");
    }
}
class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("up(by 1 step) and cut diagionally (by 1 step)");
    }
}
class Bishop implements ChessPlayer{
    public void moves(){
        System.out.println("Create 'L' shape (by 3 box) in all direction");
    }
}
class Knight implements ChessPlayer{
    public void moves(){
        System.out.println("moves diagionally in their color box");
    }
}
interface Herbivours{
    void eats();
}
interface Carnivoure{
    void eats();
}
class Bear implements Herbivours,Carnivoure{
    public void eats(){
        System.out.println("Eats both grass and meats..");
    }
} 