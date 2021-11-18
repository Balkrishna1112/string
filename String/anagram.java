import java.util.Arrays;
import java.util.Scanner;
public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1");
        String str1=sc.nextLine();
        System.out.print("enter 2");
        String str2=sc.nextLine();
        if(str1.length()==str2.length()){
        char []arr1=str1.toCharArray();
        char []arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.print("YES");
        }
        else
        System.out.print("NO"); 
    }
    else
    System.out.print("NO");
}
}
