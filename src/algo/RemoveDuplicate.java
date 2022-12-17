package algo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RemoveDuplicate {

    static int x ;


    public static void main(String[] args) {
        x=20;
        System.out.println(x);

        List<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(2);
        ar.add(2);
        ar.add(2);
        ar.add(2);
        ar.add(1);
        ar.sort(Comparator.naturalOrder());

        List<Integer>ar2 = new ArrayList<>();
        int i=0;
        //int j=0;
        while(i< ar.size()-1){

            if(ar.get(i)!=ar.get(i+1)){
                ar2.add(ar.get(i));
            }
            i++;
            //j++;
        }
        ar2.add(ar.get(ar.size()-1));
        System.out.println("-------------------");
        ar2.stream().forEach(System.out::println);

        String characeters= "This is my World, W";
        char[] charary = characeters.toCharArray();
        String duplicates="";
        String dupNotExist="";
        for (int x = 0; x < charary.length; x++) {
            if (!dupNotExist.contains(Character.toString(charary[x]))) {
                dupNotExist = dupNotExist.concat(Character.toString(charary[x]));
            } else if(dupNotExist.contains(Character.toString(charary[x]))){
                if(!duplicates.contains(Character.toString(charary[x])))
                    duplicates = duplicates.concat(Character.toString(charary[x]));
            }
        }
        System.out.println(duplicates);//o/ is W
    }
}
