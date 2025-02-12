package occurrenceofwordinfile;
// Importing some file handling classes
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Creating class CountOccurrenceOfWordInFile to count a occurrence of any specific word
public class CountOccurrenceOfWordInFile
{
    // Method to count word in a file
    public void countWord()
    {
        // Handling IO exception
        try
        {
            FileReader fileReader = new FileReader("D:\\Capgemini\\Coding Question\\CG_Week_3\\FileReader_and_InputStreamReader\\file.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line,target = "files";
            int count = 0;
            while((line = bufferedReader.readLine()) != null)
            {
                String[] words = line.split(" ");
                for(int i=0;i< words.length;i++)
                {
                    if(words[i].equals(target))
                        count++;
                }
            }
            System.out.println("The occurrence of target word in a file is "+ count);

            fileReader.close();
            bufferedReader.close();
        }
        catch (IOException e)
        {
            System.out.println("Error is " + e.getMessage());
        }
    }

    // Main Method
    public static void main(String[] args)
    {
        // Creating object of the class and calling its method
       CountOccurrenceOfWordInFile counts = new CountOccurrenceOfWordInFile();
       counts.countWord();
    }
}
