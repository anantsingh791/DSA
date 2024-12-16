import java.net.Inet4Address;

public class longestPalindromeSubstr {

    static String palin = "";
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
//        longestPalindrome("aabgttgbhaw");
        check("aabgttgbhaw");
        check("asaastsaasq");
    }

    public static void longestPalindrome(String str){

        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                boolean ans = checkPalindrome(str,i,j);
                if(ans){
                    String current  = str.substring(i,j+1);
                    if(current.length()>max){
                        palin = current;
                        max = current.length();
                    }
                }
            }
        }
        System.out.println("Longest Palindrome Substring is :: "+palin);
    }

    public static boolean checkPalindrome(String str,int i, int j){
        while(i<j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            if(ch1 != ch2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }



    static void check(String str){
        String palin ="";
        int max = Integer.MIN_VALUE;

        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                boolean ans =  pal(str,i,j);
                if(ans){
                    String current = str.substring(i,j+1);
                    if(current.length()>palin.length()){
                        palin = current;
                        max = current.length();
                    }
                }
            }
        }

        System.out.println("Longest substring is: "+" "+palin);
    }


    static boolean pal(String str, int i,int j){

        while(i<j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);

            if(ch1!=ch2){
                return false;
            }

            i++;
            j--;

        }
        return true;
    }
}
