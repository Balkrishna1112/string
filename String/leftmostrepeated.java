public class leftmostrepeated {
    public static void main(String[] args) {
        String str="gejhg";
        int n=str.length();
        char [] arr=str.toCharArray();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]);
                    break;
                }
               
             
            }
            System.out.print("-1");
        }

    }
    
}
