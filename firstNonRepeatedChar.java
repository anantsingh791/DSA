import java.net.Inet4Address;
import java.util.HashMap;

public class firstNonRepeatedChar {
    public static void main(String[] args) {
        char ch = returnFirstNonRepeatedChar("s");
        if(ch!='n'){
            System.out.println(ch +" "+"is the first non repeated char");
        }
        else {
            System.out.println("All chars are repeated");
        }
        char c = returnVal("aabbccdgdsqqg");
        System.out.println(c);
    }
    static char returnFirstNonRepeatedChar(String str){
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char c : str.toCharArray()){
            if(map.get(c)==1){
                return c;
            }
        }

        return 'n';

    }

    static char returnVal(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : str.toCharArray()){
            if(map.get(c)==1){
                return c;
            }
        }
        return 'n';
    }


}
