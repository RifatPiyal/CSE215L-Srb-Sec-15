
package lab05;
import java.util.Scanner;

public class Lab05HW01 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input a string: ");
        String str = input.nextLine();

        int numVowel = countVowels(str);
        System.out.println("number of vowels in the sentence: " + numVowel);
    }


    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}

