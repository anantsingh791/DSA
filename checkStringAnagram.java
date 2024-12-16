import java.util.HashMap;

public class checkStringAnagram {
    public static void main(String[] args) {
//        checkAnagram("qwwrrt","wwqrrt");
//        checkValidAnagram("qwwrrv","wwqrrt");
        anagram("abcd","dabb");
    }

    public static void checkAnagram(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();

        String st1 [] = s1.split("");
        String st2 [] = s2.split("");

        if(s1.length()!=s2.length()){
            System.out.println("Not Anagram");
            return;
        }
        else {
            for(int i=0;i<s1.length();i++){
                map.put(st1[i],map.getOrDefault(st1[i],0)+1);
                map.put(st2[i],map.getOrDefault(st2[i],0)+1);
            }

            for(String key : map.keySet()){
                if(map.get(key)%2!=0){
                    System.out.println("Not Anagram");
                    return;
                }
            }
        }
        System.out.println("Anagram");
    }


    static void checkValidAnagram(String str1, String str2){

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        if(str1.length()!=str2.length()){
            System.out.println("Not Anagram");
            return;
        }

        for(int i=0;i<str1.length();i++){
            map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
            map2.put(str2.charAt(i),map2.getOrDefault(str2.charAt(i),0)+1);
        }

        for(char key : map1.keySet()){
            if(!map2.containsKey(key) || !map1.get(key).equals(map2.get(key))){
                System.out.println("Invalid");
                return;
            }
        }
        System.out.println("Valid Anagram");
    }

    static void anagram(String s1, String s2){
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        if(s1.length()!=s2.length()){
            System.out.println("Not Anagram");
            return;
        }

        for(int i=0;i<s1.length();i++ ){

            map1.put(s1.charAt(i),map1.getOrDefault(i,0)+1);
            map2.put(s2.charAt(i),map2.getOrDefault(i,0)+1);

        }

        for(char c : s1.toCharArray()){
            if(!map1.get(c).equals(map2.get(c))){
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.println("String is an anagram");


    }
}
