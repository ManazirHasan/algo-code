package algo;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

public class AlgoTest {

    public static void main(String[] args) {
        System.out.println("------Hello World----------");
        //findSumOfTwoNumUsingSort(); //done
        //findSumOfTwoNumUsingHashTable();// done
        //mergeTwoIntArrayIntoListWithSortedValue(); //done
        validateSubSequenceofGivenAaryFromMainArray();

        List<String> names = new  ArrayList<>();



    }

    private static void validateSubSequenceofGivenAaryFromMainArray() {
        Integer[] mainIntArry = new Integer[]{0,2,3,5,8,12,25};
        Integer[] subSeqIntArry = new Integer[]{3,8};
        int i=0;
        int j= mainIntArry.length-1;
        int x=0;
        while (i<=j && j>=subSeqIntArry.length && x<=subSeqIntArry.length-1){
            if(mainIntArry[i]==subSeqIntArry[x]){
                System.out.println("Value match at "+subSeqIntArry[x]);
                x++;
            }
            i++;
        }
        if(x>=subSeqIntArry.length){
            System.out.println("Sub seq exist");           
        }else {
            System.out.println("Sub seq nt exist");
        }
    }

    private static void findSumOfTwoNumUsingSort() {
        Integer[] intAry = new Integer[]{0,2,3,5,8,12};
        int sum=7;
        int j=intAry.length-1;
        Arrays.sort(intAry);
        for(int i=0;i<=j;){
            if(intAry[i]+intAry[j]> sum){
                j--;
            }else if(intAry[i]+intAry[j]< sum){
                i++;
            }else if(intAry[i]+intAry[j]== sum){
                System.out.println("sum of two number "+intAry[i]+"[ ]"+intAry[j]);
                break;
            }

        }
    }
    private static void findSumOfTwoNumUsingHashTable() {
        Integer[] intAry = new Integer[]{0,2,3,5,8,12};
        int sum=7;
        Hashtable<Integer, String> hashTable1 = new Hashtable<>();
        for (Integer i : intAry) {
            if (hashTable1.isEmpty()) {
                hashTable1.put(i, "False");
            } else if (!hashTable1.isEmpty() && !hashTable1.containsKey(sum - i)) {
                hashTable1.put(i, "False");
            } else if (!hashTable1.isEmpty() && hashTable1.containsKey(sum - i)) {
                hashTable1.put(i, "True");
                System.out.println(" Sum of two numbers " + i + "[ ]" + (sum - i));
                break;
            }
        }
    }


    private static void mergeTwoIntArrayIntoListWithSortedValue() {
        Integer[] intAry1 = new Integer[]{0,12,3,10,8,-1};
        Integer[] intAry12 = new Integer[]{7,2,1,5,4,3};
        Arrays.sort(intAry1);
        Arrays.sort(intAry12);
        List<Integer> intList1= Arrays.asList(intAry1);
        List<Integer> integerList2= Arrays.asList(intAry12);
        Set<Integer> sortedIntSet =new HashSet<>(intList1);
        sortedIntSet.addAll(integerList2);
        List<Integer> mergeList= new ArrayList<>(sortedIntSet);
        mergeList.stream().forEach(System.out::print);
    }

}
