public class longestCommonPrefix {
    public static void main(String[] args) {
        returnLongestCommonPrefix("rlow", "fwoe", "tlog");
        String ans = "as";
        ans = "test";
        System.out.println();
        System.out.println(ans);

    }

    static void returnLongestCommonPrefix(String str1, String str2, String str3) {
        int min = Math.min(Math.min(str1.length(), str2.length()), str3.length());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < min; i++) {
            if (str1.charAt(i) == str2.charAt(i) && str1.charAt(i) == str3.charAt(i)) {
                sb.append(str1.charAt(i));
            }
        }
        if (sb.isEmpty()) {
            System.out.println("No common prefix");
        }
        System.out.println();
        System.out.println(sb);
    }
}



