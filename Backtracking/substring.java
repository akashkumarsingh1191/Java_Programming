public class substring{
    public static void findSubset(String str,String ans,int i){
        // BAse Case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        // Yes Choice
        findSubset(str, ans+str.charAt(i), i+1);
        // No Choice
        findSubset(str, ans, i+1);
    }

    public static void findPermu(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String NewStr=str.substring(0, i)+str.substring(i+1);
            findPermu(NewStr, ans+curr);
        }
    }
    public static void main(String args[]){
        String str="abc";
        // findSubset(str, "", 0);
        findPermu(str, "");

    }
}