public class low2 {
    public static void main(String[] args) {
        String s="new bmw car";
        int size=s.length();
        int i=0;char c=0;String z="";
        while(i!=size){
            if(s.charAt(i)!=0){
                c=(char)(s.charAt(i)-32);
                z=z+c;
                i++;
            }
            
        }
        System.out.print(z);
    }
    
}
