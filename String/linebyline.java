public class linebyline {
    public static void main(String[] args) {
        String s="abc is a new dog";
        int i=0;
        while(i<s.length()){
     if(s.charAt(i)==' '){
         System.out.println();
     }
     else{
          System.out.print(s.charAt(i));
          
        }
        i++;
     }
    }
    
}
