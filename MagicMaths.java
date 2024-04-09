/*
 * Author: Sotiris Stylianou (G20967429)
 * Email: sstylianou2@uclan.ac.uk
 * Description: The program outputs expected value for each value that the user inputs
 * To compile the program: javac MagicMaths.java
 * To run the program: java Program 5
 */

public class MagicMaths {
    public static void main(String[] args) {
        int number=0,num = Integer.parseInt(args[0]);
        int hyphens=num*2+5;
        if (num>9 || num<1)
            System.out.println("Please enter a number between 1 and 9 and let maths work their magic!");                /* Program outputs this if your number is less than 1 or bigger than 9 */

        else {
            for (int i=1; i<=num; i++) {
                for (int j = 1; j < num + 1 - i; j++)
                    System.out.print(" ");                                                                              /* Program prints the spaces */
                number=(number*10)+i;                                                                                   /* Program finds the first number */
                System.out.println(number + " x 8 + " + i + " = " + ((number *8)+i));                                   /* Program prints each line */
            }
            for (int i=0; i<hyphens; i++)                                                                                   /* Program prints the hyphens */
                System.out.print("-");
        }
    }
}