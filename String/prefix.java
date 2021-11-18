public class prefix {
    public static void main(String[] args) {
    String str="hgfty";
    String s1="hgkfty";
    String s2="";
  //  for(int i=0;i<arr.length;)
      int i=0,j=0;  
      while(i<str.length()&&j<s1.length()){
    if(str.charAt(i)==s1.charAt(j)){
    s2+=str.charAt(i);
    i++;j++;
    }

    else{
System.out.print("no prefix");
break;
    }
  
    System.out.print(s2);
        }
    }
    
}
