package collection.set.enumset;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/*
Java EnumSet class is the specialized Set implementation for use with enum types. It inherits AbstractSet class and implements the Set interface.
* public abstract class EnumSet<E extends Enum<E>> extends AbstractSet<E> implements Cloneable, Serializable
 *
*
* */
enum days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumSetOf {

    public static void main(String[] args) {
//        of()
        Set<days> set = EnumSet.of(days.MONDAY, days.SATURDAY, days.THURSDAY);
        Iterator<days> itr = set.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        Set<days> setAll = EnumSet.allOf(days.class);
        System.out.println(setAll);
//allOf() and noneOf()
        Set<days> setNone = EnumSet.noneOf(days.class);
        System.out.println("Initial setNone" + setNone);

        setNone.add(days.SATURDAY);
        setNone.add(days.MONDAY);
        System.out.println(setNone);
        System.out.println("After adding setNone" + setNone);

    }
}
