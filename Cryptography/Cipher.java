import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Enter in text and have the text encrypted to a txt file
 * 
 * @author Ryan Regier
 * @version 4/2/18
 */
public class Cipher
{
    private static String fin = "";
    public static void main()
    {
        String text = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string of text to be encrytped!");
        text = scan.nextLine();
        encrypt(text);
        createTextFile(fin);
    }

    public static void encrypt(String txt)
    {
        String str = txt.toUpperCase();
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'A')
            {
                fin += " 1 ";
            }
            if(str.charAt(i) == 'B')
            {
                fin += " 2 ";
            }
            if(str.charAt(i) == 'C')
            {
                fin += " 3 ";
            }
            if(str.charAt(i) == 'D')
            {
                fin += " 4 ";
            }
            if(str.charAt(i) == 'E')
            {
                fin += " 5 ";
            }
            if(str.charAt(i) == 'F')
            {
                fin += " 6 ";
            }
            if(str.charAt(i) == 'G')
            {
                fin += " 7 ";
            }
            if(str.charAt(i) == 'H')
            {
                fin += " 8 ";
            }
            if(str.charAt(i) == 'I')
            {
                fin += " 9 ";
            }
            if(str.charAt(i) == 'J')
            {
                fin += " 10 ";
            }
            if(str.charAt(i) == 'K')
            {
                fin += " 11 ";
            }
            if(str.charAt(i) == 'L')
            {
                fin += " 12 ";
            }
            if(str.charAt(i) == 'M')
            {
                fin += " 13 ";
            }
            if(str.charAt(i) == 'N')
            {
                fin += " 14 ";
            }
            if(str.charAt(i) == 'O')
            {
                fin += " 15 ";
            }
            if(str.charAt(i) == 'P')
            {
                fin += " 16 ";
            }
            if(str.charAt(i) == 'Q')
            {
                fin += " 17 ";
            }
            if(str.charAt(i) == 'R')
            {
                fin += " 18 ";
            }
            if(str.charAt(i) == 'S')
            {
                fin += " 19 ";
            }
            if(str.charAt(i) == 'T')
            {
                fin += " 20 ";
            }
            if(str.charAt(i) == 'U')
            {
                fin += " 21 ";
            }
            if(str.charAt(i) == 'V')
            {
                fin += " 22 ";
            }
            if(str.charAt(i) == 'W')
            {
                fin += " 23 ";
            }
            if(str.charAt(i) == 'X')
            {
                fin += " 24 ";
            }
            if(str.charAt(i) == 'Y')
            {
                fin += " 25 ";
            }
            if(str.charAt(i) == 'Z')
            {
                fin += " 26 ";
            }
        }
    }

    public static void createTextFile(String txt)
    {
        try
        {
            BufferedWriter writer = new BufferedWriter( new FileWriter("text.txt"));
            writer.write(txt);
            // do stuff 
            writer.close();
        }catch (IOException e)
        {
            System.out.println("File I/O error!");
        }

    }
}
