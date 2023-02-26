package algo.string;

public class TestString {

    public static void main(String[] args) {
        System.out.println("-------hello---------");
        String str="MADAM1"; //Palindrom
        //stringBuilder
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        System.out.println(rev);
        char[] test =str.toCharArray();
        reverse(test,0,str.length()-1);
        reverseUsingStringBuilder(test);
        System.out.println(test);
    }

    private static void reverseUsingStringBuilder(char[] test) {
        System.out.println("--------------reverseUsingStringBuilder----------------");
        String str="MADAM";
        String strRev="";
        for(int i=str.length()-1;i>=0;i--)
            strRev=strRev+str.charAt(i);

        System.out.println("---------"+strRev);

        if(str.equals(new StringBuilder(str).reverse().toString()))
            System.out.println(true);
        else
            System.out.println(false);
        String str1= new String(test);

        StringBuilder sb = new StringBuilder(str1);
        String str2 = sb.reverse().toString();
        if(str1.equals(str2))
            System.out.println(true);
        else
            System.out.println(false);
        System.out.println("--------------reverseUsingStringBuilder----------------");
    }

    private static void reverse(char[] str,int i, int j) {
        if(i<j) {
            callSwap(str,i,j);
            reverse(str, ++i, --j);
        }
    }

    private static void callSwap(char[] str, int i, int j) {
        char x = str[i];
        str[i]=str[j];
        str[j]=x;

    }
}
