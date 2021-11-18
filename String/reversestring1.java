import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class reversestring1 {
	public static void main (String[] args) {
              Scanner sc=new Scanner(System.in);
			          String str=sc.next();
			          char arr[]=str.toCharArray();
			          int i=0,j=str.length()-1;
			          while(i<j){
			              char temp=arr[i];
			              arr[i]=arr[j];
			              arr[j]=temp;
			              i++;
			              j--;
			          }
			          for(char e:arr){
			              System.out.print(e);
			          }
	}
}

