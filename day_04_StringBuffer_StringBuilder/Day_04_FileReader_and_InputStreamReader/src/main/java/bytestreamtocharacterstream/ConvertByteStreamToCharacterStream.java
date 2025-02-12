package bytestreamtocharacterstream;

// Importing some file handling classes
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// Creating class ConvertByteStreamToCharacterStream to read data from file using InputStreamReader
public class ConvertByteStreamToCharacterStream
{
    // Method to read data from the file
    public void readData()
    {
        // Handling IO exception
        try
        {
            String charsetName = "UTF-8";
            FileInputStream fileInputStream = new FileInputStream("D:\\Capgemini\\Coding Question\\CG_Week_3\\FileReader_and_InputStreamReader\\file.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, charsetName);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }

            fileInputStream.close();
            inputStreamReader.close();
            bufferedReader.close();
        }
        catch (IOException e)
        {
            System.out.println("Error is " + e.getMessage());
        }
    }
    // Main method
    public static void main(String[] args)
    {
        ConvertByteStreamToCharacterStream read = new ConvertByteStreamToCharacterStream();
        read.readData();
    }
}
