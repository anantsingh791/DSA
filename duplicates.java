import java.util.ArrayList;
import java.util.Collections;

public class duplicates {
    static int Largest = 0;

    public static void main(String[] args) {
//       boolean flag = duplicate();
//        System.out.println(flag);
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
        reverseList(list);
    }
    private static boolean duplicate(){
        int a [] = {10,20,30,40};
        boolean flag = false;

        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    flag = true;
                    break;
                }
            }
        }

        return flag;

    }

    private static void reverseList(ArrayList<Integer> list){
        int temp=0;
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }

        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Second Largest Element is :: "+ list.get(list.size()-2));
    }
}
