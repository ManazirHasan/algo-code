package algo;

import java.util.*;


public class TestZomoso {

    public static void main(String[] args) {

        List<String> aryList = new ArrayList<>();
        aryList.add("Test");
        int x = fibonicci(6);
        System.out.println(x);
        //0,1,1,2,3,5,8

        String str = "MADAK";
        char[] ch =str.toCharArray();
        String y  =  pallindrom(ch);
        System.out.println(y);

        Integer[] z = new Integer[]{2,3,1,4,6};

        //sort z
        //n,n+1
        List<Integer> zInt = Arrays.asList(z);
        zInt.sort(Comparator.naturalOrder());
        int lent = zInt.size();
        Integer[] xsorted = zInt.toArray(new Integer[zInt.size()-1]);
        Map map = new HashMap();
        int i=0;
        while (i<lent-1){
            if(xsorted[i] == xsorted[i+1]){
                //System.out.println("duplicate exist");
                return;
            }
            i++;
        }

    }

    private static String pallindrom(char[] ch) {
        int i=0;
        int j=ch.length-1;
        while(i<=j) {

           if(i<j){
                return "no a palindrom";
           }
            i++;
            j--;
        }
        if(i>=j){
            return "palindrom";
        }
        return null;
    }

    static int fibonicci(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else{

            int x =  fibonicci(n - 1) + fibonicci(n - 2);
            return x;
        }
       // return 0;
    }
}

