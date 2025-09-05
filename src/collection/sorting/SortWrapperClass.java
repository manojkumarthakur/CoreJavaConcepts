package collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortWrapperClass {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(Integer.valueOf(10));
        al.add(Integer.valueOf(30));
        al.add(20);//internally will be converted into objects as Integer.valueOf(230)

        Collections.sort(al);
//        Collections.sort(al, Collections.reverseOrder());

        System.out.println(al);
    }
}
