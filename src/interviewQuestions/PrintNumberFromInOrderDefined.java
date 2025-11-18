package interviewQuestions;
//given array of number return only 1s 2s 3s and it should follow this oder {1,3,2}

import java.util.*;

public class PrintNumberFromInOrderDefined {
    //Self
    public static void printInOrder(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        System.out.println(map);
        System.out.println();
        for (int i = 0; i < map.get(1); i++) {
            System.out.print(1);
        }
        for (int i = 0; i < map.get(3); i++) {
            System.out.print(3);
        }
        for (int i = 0; i < map.get(2); i++) {
            System.out.print(2);
        }


    }

    public static List<Integer> filterAndOrder(int[] inputArray) {
        List<Integer> filteredList = new ArrayList<>();
        for(int a : inputArray) {
            if(a==1 || a==2 || a==3)
                filteredList.add(a);
        }
        Collections.sort(filteredList, (a, b) -> {
            if (a == b) { // if the  numbers are same then return 0
                return 0;
            }
            if (a == 1) { // if the first number is small then return -1
                return -1; // 1 comes before everything else
            }
            if (b == 1) { // if the second number is small then return 1
                return 1; // 1 comes before everything else
            }
            if (a == 3) {
                return -1; // 3 comes before 2
            }
            if (b == 3) {
                return 1; // 3 comes before 2
            }
            return 0; // 2 comes last,
        });

        return filteredList;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,2,3,1,4,5,6,7,8,1,3};
//        printInOrder(arr);
        System.out.println(filterAndOrder(arr));

    }


}
