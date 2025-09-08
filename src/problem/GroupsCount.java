package problem;

public class GroupsCount {
    public static void main(String[] args) {
        String str = "aabaccddsfffdd";
        char[] ch = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() -1; i++) {
            if(ch[i] == ch[i+1]){
                count++;
                continue;
            }
            sb.append(count);
            sb.append(ch[i]);
            count = 1;
        }

        sb.append(String.valueOf(count));
        sb.append(str.charAt(str.length()-1));

        System.out.println(sb.toString());
    }
}
