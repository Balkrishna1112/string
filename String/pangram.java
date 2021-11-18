//import java.util.Scanner;
import java.util.Arrays;
public class pangram {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
       // System.out.print("enter string please");
        String str="defghijklpqrstuvwxyzmnoabc";
        String s1="abcdefghijklmnopqrstuvwxyz";
        char[] arr=str.toCharArray();
        char[] arr1=s1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
   if(s1.length()==str.length()){
      
        //boolean result = Arrays.equals(arr, arr1);

     // if(result){
       if(Arrays.equals(arr1,arr)){
            System.out.print(" yes pangram");   
        }
        else{
        System.out.println("no pangram");
        }
    }
    else
    System.out.println("no pangram");
    System.out.println(str.length());
    System.out.println(s1.length());
    }
    
}
