public class sumofstring {
    public static void main(String[] args) {
        String str="12374";
        
        int sum=0;
        for(int i=0;i<str.length();i++){
            sum+=(int)(str.charAt(i));
        }
        System.out.print(sum);
    }
    
}
