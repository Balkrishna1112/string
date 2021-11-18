public class peli1 {
    public static void main(String[] args) {
        String str="akhjiku";
        int c=0;
        for(int i=0;i<str.length()/2;i++){
    if(str.charAt(i)!=str.charAt(str.length()-1-i)){
     c++;
    }
}
    System.out.print(c);
      
    }
    
}
