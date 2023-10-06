import java.util.Scanner;
public class Main {
    public static void SumOfTheNumber_UserInArrayElement() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size Of Array");
        int Size = input.nextInt();
        System.out.println("Enter the Array Elements");
        int arr[] = new int[Size];
        // sum assign value
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //get in the array elements
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            //Sum Of The arrays
            sum = sum + arr[i];

        }
        //print the sum values
        System.out.println(sum);

    }

    public static void main(String[] args) {
        SumOfTheNumber_UserInArrayElement();


    }
}