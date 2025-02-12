package readafilelinebyline;
// Importing some file handling classes
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Creating class ReadFileLineByLineUsingFileReader to read file line by line using FileReader
public class ReadFileLineByLineUsingFileReader
{
    // Method to read data from a file
    public void readFile()
    {
        // Handling IO exception
        try
        {
            FileReader fileReader = new FileReader("D:\\Capgemini\\Coding Question\\CG_Week_3\\FileReader_and_InputStreamReader\\file.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }

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
        ReadFileLineByLineUsingFileReader read = new ReadFileLineByLineUsingFileReader();
        read.readFile();
    }
}
