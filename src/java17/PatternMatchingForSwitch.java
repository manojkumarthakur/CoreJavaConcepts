package java17;

/* Edit -> Configuration
Modify Options -> Add Vm options
Enter --enable-preview
* Java Enhancement Proposal in technology(JEP )
Fully released in JDK 21
Pattern Matching for switch (JEP 406 - Preview, JEP 420 - Second Preview, JEP 433 - Third Preview, JEP 441 - Finalized in Java 21):
*
Limitation:
1. Cannot use switch on Generic type (List <T>, Set <T>)
2. Only works for reference types (Integer, String etc. ), not primitives (int, char)
3. Preview feature, must enable with --enable-preview flag
*/
public class PatternMatchingForSwitch {
    public static void main(String[] args) {
        // JDK 17
        Object obj = "Hello";
//        String result = checkType(obj);
        String result = checkTypeJDK17(obj);
        System.out.println(result); // Output: String: Hello

    }
    static String checkType(Object obj){
        if(obj instanceof String){
            String str = (String) obj; //Must cast manually
            return "String " + str;
        } else if (obj instanceof Integer) {
            Integer i = (Integer) obj; //Must cast manually
            return "Integer " + i;
        }
        return "Unknown type";
    }
    static String checkTypeJDK17(Object obj){
        String result = switch (obj) {
            case String s -> "String: " + s;
            case Integer i -> "Integer: " + i;
            case Double d -> "Double: " + d;
            default -> "Unknown type";
        };
        return result;
    }
}
