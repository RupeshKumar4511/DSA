//package DSA.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Deletion{

    
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = { 10, 20, 30, 40, 50 };
        Scanner in = new Scanner(System.in);

        System.out.println("enter the element to be deleted");
        int elementToDelete = in.nextInt();
        delete(numbers, elementToDelete);
        in.close();

    }



    // Delete an element at a specific position (requires shifting)
    public static void delete(int[] numbers, int elementToDelete) {

        for (int i = 0, j = 0; i < numbers.length - 1; i++, j++) {
            if (numbers[i] == elementToDelete) {
                j++;
            } 
            else if (numbers[numbers.length - 1] == elementToDelete) // point to be remember
            {
              numbers[numbers.length-1]= 0;
            }
            numbers[i] = numbers[j];
        }

        System.out.println(Arrays.toString(numbers));

    }
}


