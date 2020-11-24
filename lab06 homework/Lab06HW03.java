package lab06;
import java.util.Scanner;

public class Lab06HW03 {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }
        int sumRow = 0, sumCol = 0, sumRD = 0, sumLD = 0;
        
        for (int i = 0; i < 3; i++) {
            sumRow = 0;
            
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "\t");
                sumRow += arr[i][j];
            }
            System.out.print("\t" + sumRow + "\n");
        }
        System.out.println("\n");
        
        for (int i = 0; i < 3; i++) {
            sumCol = 0;
            
            for (int j = 0; j < 3; j++) {

                if ((i + j) == 2) {
                    sumRD += arr[j][i];
                }
                if (i == j) {
                    sumLD += arr[i][j];
                }
                sumCol += arr[j][i];
            }

            System.out.print(sumCol + "\t");
        }
        System.out.println("\t" + sumLD + "\n\nSum of Right Diagonal: " + sumRD);
    }
}


