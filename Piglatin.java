/* Program:  Pig Latin
  * File:    Piglatin.java 
  * Summary:  Converts strings into pig latin and prints out in all capitals
  * Author:   Daniel Saad
  * Date:     11/25/18
 */

//import scanner class
import java.util.Scanner;

public class Piglatin {

    public static void main(String[] args) {
        //initiate a scanner class
        Scanner in = new Scanner(System.in);
        //initiate a string variable
        String sentance;
        //do-while loop that can be ended by user
        do {
            //initiate a array for seperating words.
            String[] words;
            System.out.print("Enter a sentance to be translated: ");
            sentance = in.nextLine();
            //seperate and enter word into array
            words = sentance.split(" ");
            //For loop to perform conversion
            for (String word : words) {
                //if-else statements to determine which conversion to use by using the first letters
                if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u") || word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O") || word.startsWith("U")) {
                    //Outprint orginal word follow by some spacing.
                    System.out.print(word + "\t" + "\t");
                    //Outprint converted word in all caps.
                    System.out.println(word.toUpperCase() + "WAY");
                } else if (word.startsWith("st") || word.startsWith("ch") || word.startsWith("th") || word.startsWith("sh") || word.startsWith("Ch") || word.startsWith("Th") || word.startsWith("Sh")) {
                    System.out.print(word + "\t" + "\t");
                    System.out.println(word.substring(2).toUpperCase() + word.substring(0, 2).toUpperCase() + "AY");
                } else {
                    System.out.print(word + "\t" + "\t");
                    System.out.print(word.substring(1).toUpperCase() + word.substring(0, 1).toUpperCase() + "AY");
                    System.out.printf("%n");
                }
            }
            System.out.println();
            //While ends if user enters stop
        } while (!sentance.equals("stop"));
    }
}
