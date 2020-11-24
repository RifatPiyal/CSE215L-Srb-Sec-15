package lab06;
import java.util.Scanner;

public class Lab06HW04 {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        int[] arr = new int[input.nextInt()];

        System.out.print("Enter the numbers: ");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        Consecutive(arr);


    }

    public static void Consecutive(int[] arr) {
        int count = 1, flag = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count == 3) {
                System.out.print(arr[i] + " ");
                i++;
                count = 1;
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("there is no consecutive orders of 3 in this array");
        }
    }

}   

