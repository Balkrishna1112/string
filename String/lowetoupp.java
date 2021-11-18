public class lowetoupp {
    public static void main(String[] args) {
        String  s="balkrishna";
        int size=s.length();
        int i=0;char c=0;String z="";
        while(i!=size){
        c=(char)(s.charAt(i)-32);
       z=z+c;
            i++;
        }
        System.out.println(z);
    }
    
}
