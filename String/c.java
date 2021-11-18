public class c {
    public static void main(String[] args) {
        String s="aaabbbdddhhj";
        System.out.print(com(s));
    }
    static String com(String s){
        StringBuffer sb=new StringBuffer();
char la=s.charAt(0);
int c=0;
for(int i=0;i<s.length();i++){
    if(s.charAt(i)==la){
        c++;
    }
    else{
    sb.append(la+c);
    c=1;
}
la= s.charAt(i);
}

sb.append(la+c);
 String st=sb.toString();
return st;

    }
    
}
