package strings;

public class AllStringTypes {
    public static void main(String[] args) {
        // String , slowest, creates new memory all the time.
        String first = "InterviewBit";
        String second = new String("InterviewBit");
// StringBuffer is thread safe, used in multi threading , speed between string and StringBuilder
        StringBuffer third = new StringBuffer("InterviewBit");
// StringBuilder, thread unsafe , fastest, single thread application
        StringBuilder fourth = new StringBuilder("InterviewBit");

    }
}
