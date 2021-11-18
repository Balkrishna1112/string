public class permutation {
    public static void main(String[] args) {
        String s="abc";
        per(s,"");
    }
    static void per(String s,String ans){
         if (s.length() == 0) {
            System.out.print(ans + " ");
         
    }
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
            String ros = s.substring(0, i) +s.substring(i + 1);
            per(ros, ans + ch);
    }
    }
}
