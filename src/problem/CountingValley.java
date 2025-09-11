package problem;
/*
https://prepinsta.com/wipro-coding-questions/
* Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. During his last hike, he took exactly n steps. For every step he took, he noted if it was an uphill or a downhill step. Gary’s hikes start and end at sea level. We define the following terms:

A mountain is a non-empty sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
A valley is a non-empty sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
Given Gary’s sequence of up and down steps during his last hike, find and print the number of valleys he walked through.*/
public class CountingValley {
    public static int countingValley(int n, String path){
        int valley =0;
        int level =0;
        for (int i = 0; i < path.length(); i++) {
            char[] ch = path.toCharArray();
            if(ch[i] == 'U')
                level++;
            else if (ch[i] == 'D') {
                if(level == 1){
                    valley++; // just came down to sea level -> valley ended
                }
                level--;
            }
        }
        return valley;
    }

    //ChatGPT
    public static int countValleys(String s) {
        int level = 0, valleys = 0;
        for (char step : s.toCharArray()) {
            if (step == 'U') {
                level++;
                if (level == 0)
                    valleys++; // just came up to sea level -> valley ended
            } else if (step == 'D') {
                level--;
            }
        }
        return valleys;
    }

    public static void main(String[] args) {
        String  str  = "UDDDUDUU";
        int n = 8;
        int result=countingValley(n,str);
        System.out.println(result);
        System.out.println(countValleys(str));
    }
}
