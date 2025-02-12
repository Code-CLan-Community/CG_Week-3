package filereaderandinputstreamreader;
// Importing some file handling classes
import java.io.*;
import java.nio.charset.StandardCharsets;

// Creating class CompareFileReaderAndInputStreamReaderPerformance to compare the execution time of FileReader and InputStreamReader
public class CompareFileReaderAndInputStreamReaderPerformance
{
    // Method to count word in a file using InputStreamReader
    public int countWordUsingFileReader()
    {
        int wordCount = 0;
        // Handling IO exception
        try
        {
            FileReader fileReader = new FileReader("D:\\Capgemini\\Coding Question\\CG_Week_3\\FileReader_and_InputStreamReader\\file.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                String[] words = line.split(" ");
                wordCount = words.length;
            }
        }
        catch (IOException e)
        {
            System.out.println("Error is "+ e.getMessage());
        }
        return wordCount;
    }

    // Method to count word in a file using InputStreamReader
    public int countWordUsingInputStreamReader()
    {
        int wordCount = 0;
        // Handling IO exception
        try
        {
            FileInputStream fileInputStream = new FileInputStream("D:\\Capgemini\\Coding Question\\CG_Week_3\\FileReader_and_InputStreamReader\\file.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                String[] words = line.split(" ");
                wordCount = words.length;
            }

            fileInputStream.close();
            inputStreamReader.close();
            bufferedReader.close();
        }
        catch (IOException e)
        {
            System.out.println("Error is "+ e.getMessage());
        }
        return wordCount;
    }
}
