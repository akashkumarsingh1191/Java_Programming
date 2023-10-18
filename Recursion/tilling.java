public class tilling {
    public static int till_prob(int n){
        if (n==0 || n==1){
            return 1;
        }
        // for vertical fixing

        int fnm1=till_prob(n-1);
        // for horizontal fixing

        int fnm2=till_prob(n-2);
        // total ways
        int totway=fnm1+fnm2;
        return totway;
    }

    //  Remove Duplicate in a string
    public static void removeDuplicate(String str,int idx,StringBuilder newstr,boolean map[]){
        if (idx== str.length()){
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar -'a']==true){
            // duplicate
            removeDuplicate(str, idx+1, newstr, map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicate(str, idx+1, newstr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        // int n=5;
        // System.out.print(till_prob(n));
        String str="apnnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
