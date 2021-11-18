public class compress {
    public static void main(String[] args) {
        String str="aaaabbbcccdfgghh";
        System.out.print(com(str));
    }
    
	public static String com(String str) {
		StringBuffer sb = new StringBuffer();
		char last = str.charAt(0);
		int count = 0;
		for (int i=0; i< str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				sb.append(last + "" + count);
				count = 1;  // here count should be 1 but not 0
			}
			last = str.charAt(i);
		}
		sb.append(last + "" + count); //reflush the last part
		
		String newStr = sb.toString();
		///if (newStr.length() < str.length()) {
			return newStr;
		/*} else {
			return str;
		}
	}*/
}
}
  
 
