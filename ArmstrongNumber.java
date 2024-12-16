import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        checkArmstrongNumber(num);
    }

    public static void checkArmstrongNumber(int num) {
        int value;
        int sum = 0;
        int temp = num;
        int duplicate = num;
        int digits = 0;

        // Count the number of digits
        while (num > 0) {
            num = num / 10;
            digits++;
        }

        // Calculate the sum of each digit raised to the power of the number of digits
        while (duplicate > 0) {
            value = duplicate % 10;
            int power = returnPower(value, digits);  // Calculate power manually
            sum += power;
            duplicate = duplicate / 10;
        }

        // Check if the sum matches the original number
        if (sum == temp) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }
    }

    // Manually calculate the power without using Math.pow
    public static int returnPower(int val, int digits) {
        int result = 1;
        for (int i = 1; i <= digits; i++) {
            result = result * val;  // Multiply val by itself digits times
        }
        return result;
    }

    public static void bubbleSort(int a[]){

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
