public class reversestring {
    public static void main(String[] args) {
        String s="abcdefghijk";
        int l=s.length();
        System.out.println(l);
       String b="";
        for(int i=s.length()-1;i>=0;i--){
            b+=s.charAt(i);

        }
        System.out.print(b);
    }
    
}
