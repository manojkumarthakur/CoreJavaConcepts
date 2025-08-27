package problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* Merge 2 given array and sort the final array
* */
public class MergeTwoArrayAndSort {
    
    public static int[] mergeAndSort(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int i:a){
            set.add(i);
        }
        for (int i:b){
            set.add(i);
        }
        int[] finalArr = new int[set.size()];

        Iterator itr = set.iterator();
        int count =0;
        while (itr.hasNext()){
            finalArr[count] = (int)itr.next();
            count++;
        }


        for(int i = 0; i < finalArr.length-1; i++) {
            for(int j = i+1; j < finalArr.length; j++) {
                if(finalArr[i] > finalArr[j]){
                    int temp = finalArr[i];
                    finalArr[i] = finalArr[j];
                    finalArr[j] = temp;
                }
            }
        }
        return finalArr;
    }
    public static void main(String[] args) {
        int [] a = {2,3,4, 5, 6};
        int [] b = {21,32,4};
        int[] c= mergeAndSort(a, b);
        System.out.println(Arrays.toString(c));
        
    }
}
