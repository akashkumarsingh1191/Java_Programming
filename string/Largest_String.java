package string;
import java.lang.String.*;
public class Largest_String{
    public static String Compress(String str){
        StringBuilder newstr=new StringBuilder("");
        
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if(count>1){
                newstr.append(count);
            }
        }
        return newstr.toString();
    }
    public static String compress(String str){
        StringBuilder newstr=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if(count>1){
                newstr.append(count);
            }
        }
        return newstr.toString();
    }
    public static String to_Upper_case(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String fruits[]={"apple","Pea","mango","banana"};
        String str="aaabbrree";
        String Largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(Largest.compareToIgnoreCase(fruits[i])<0){
                Largest=fruits[i];
            }

        }
        // String str1="hello WORLD! !!";
        System.out.println(Compress(str));
        // System.out.println(to_Upper_case(str));
    }
}