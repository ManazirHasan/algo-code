package algo.string;

public class TestString {

    public static void main(String[] args) {
        System.out.println("-------hello---------");
        String str="Hello";
        //stringBuilder
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        System.out.println(rev);
        char[] test =str.toCharArray();
        reverse(test,0,str.length()-1);
        System.out.println(test);
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
