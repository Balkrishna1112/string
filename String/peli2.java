public class peli2 {
    public static void main(String[] args) {
        String str="abcghgcba";
        if(ispeli(str)){
            System.out.print("it is a pelidrom");
        }
        else
        System.out.print("it is not a pelidrom");
    
    }
    static boolean ispeli(String s1){
        int i=0;
        int j=s1.length()-1;
        while(i<j){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}

