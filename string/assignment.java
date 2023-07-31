package string;
import java.lang.String.*;
public class assignment {
    public static int lowercase(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        // String str="shradha";
        String str="ShradhaDiddi";
        String str1="ApnaCollege";
        String str2="ShradhaDidi";
        System.out.println(str.equals(str1)+" "+str.equals(str2));
        // System.out.println(lowercase(str));
    }
}
