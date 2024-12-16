public class mergeStringAlternatively {
    public static void main(String[] args) {
//        mergeString("abcd", "ef");
//        mergeStringsAl("abcd", "ef");
        merge("acegh","bdf");
    }

    public static void mergeString(String s1, String s2) {
        int s = s1.length();
        int t = s2.length();
        int max = Math.max(s, t);


        String str1 [] = s1.split("");
        String str2 [] = s2.split("");
        String newString = "";

        for(int i=0;i<max;i++){

            if(i<str1.length && i<str2.length){
                newString = newString+str1[i]+str2[i];
            }
            else if(i<str1.length && i>=str2.length){
                newString = newString+str1[i];
            }
            else if(i>=str1.length && i<str2.length){
                newString = newString+str2[i];
            }
        }
        System.out.println(newString);
    }

    static void mergeStringsAl(String str1, String str2){
        int length = Math.max(str1.length(),str2.length());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<length;i++){
            if(i<str1.length()){
                sb.append(str1.charAt(i));
            }
            if(i<str2.length()){
                sb.append(str2.charAt(i));
            }
        }
        System.out.println("new"+" "+sb.toString());
    }

    static void merge(String s1, String s2){
        int length = Math.max(s1.length(),s2.length());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<length;i++){
            if(i<s1.length()){
                sb = sb.append(s1.charAt(i));
            }

            if(i<s2.length()){
                sb = sb.append(s2.charAt(i));
            }

        }
        System.out.println(sb.toString());
    }
}
