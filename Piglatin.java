/* Program:  Pig Latin
  * File:    Piglatin.java 
  * Summary:  Converts strings into pig latin and prints out in all capitals
  * Author:   Daniel Saad
  * Date:     11/25/18
 */
import java.io.FileNotFoundException;
//Import java scanner
import java.util.Scanner;

public class Piglatin {

    public static void main(String[] args) throws FileNotFoundException {
        // Create a File instance
        java.io.File file = new java.io.File("c:\\sentance.txt");
        //Create a Scanner for File
        Scanner in = new Scanner(file);
        //While loop to input string word
        while (in.hasNext()) {
            String word = in.next();
            //If statement to translate different sounding words
            if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u") || word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O") || word.startsWith("U")) {
                //Prints orginal word with 2 tabs
                System.out.print(word + "\t" + "\t");
                //Capitalizes and prints out translated word
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

    }
}
