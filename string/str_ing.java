package string;
import java.lang.String.*;
public class str_ing {
    public static float ShortestPath(String path){
        
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='E'){
                x++;
            }
            else{
                x--;
            }
        }
    }
    public static void main(String args[]){
        String path="WNEENESENNN";
    }    
}
