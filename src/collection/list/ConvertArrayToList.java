package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {
        //Creating Array
        String[] array={"Java","Python","PHP","C++"};
        System.out.println("Printing Array: "+ Arrays.toString(array));

        // Converting Array to List by USing Arrays.asList()
        List<String> ll = Arrays.asList(array);
        System.out.println(ll);

        //Converting Array to List by traversing
        List<String> list=new ArrayList<String>();
        for(String lang:array){
            list.add(lang);
        }
        System.out.println("Printing List: "+list);

        //Converting ArrayList to Array
        String[] arr = list.toArray(new String[list.size()]);
        System.out.println("Printing Array: "+Arrays.toString(arr));
        System.out.println("Printing List: "+list);
    }
}
