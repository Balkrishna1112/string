public class peli {
    public static void main(String[] args) {
        String str="asdfufdsa";
        int n=str.length();
        String str1="";
        for(int i=n-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        if(str1.equals(str)){
            System.out.print("pelidrom");
        }
        else{
        System.out.print(" no pelidrom");
    }
    
}
}
