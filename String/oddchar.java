public class oddchar {
    public static void main(String[] args) {
        String str="anhsgdh";
        //char []arr=str.toCharArray();
        int i=0;
        while(i<str.length()){
            if((i+1)%2!=0)
            System.out.print(str.charAt(i));
            i++;
        }

        }

    }
    

