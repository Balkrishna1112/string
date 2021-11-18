public class deletechar {
    public static void main(String[] args) {
        String s="ABCDEAAAFGHIJK";
        char c='A';
        String z="";
   int l=s.length();
   for(int i=0;i<l;i++){
       if(s.charAt(i)==c){
           continue;
       }
       else{
          z+=s.charAt(i); 
       }
   }
   System.out.print(z);
    }
    
}
