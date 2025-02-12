package readuserinput;
// Importing some file handling classes
import java.io.*;
// Creating class ReadUserInputAndWriteToFile to read from a file and write into a file
public class ReadUserInputAndWriteToFile
{
    // Method to read data from a file
    public void readDataInFile()
    {
        try
        {
            FileReader fileReader = new FileReader("D:\\Capgemini\\Coding Question\\CG_Week_3\\FileReader_and_InputStreamReader\\writefile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch (IOException e)
        {
            System.out.println("Error is " + e.getMessage());
        }
    }

    // Method to write data into a file
    public void writeDataInFile()
    {
        // Handling IO exception
        try
        {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            FileWriter fileWriter = new FileWriter("D:\\Capgemini\\Coding Question\\CG_Week_3\\FileReader_and_InputStreamReader\\writefile.txt");

            System.out.println("Enter text and to stop writing please enter exit ");
            while(true)
            {
                String input = bufferedReader.readLine();
                if(input.equalsIgnoreCase("exit"))
                {
                    break;
                }
                fileWriter.write(input);
            }


            inputStreamReader.close();
            bufferedReader.close();
            fileWriter.close();
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
        ReadUserInputAndWriteToFile object = new ReadUserInputAndWriteToFile();
        object.writeDataInFile();
        object.readDataInFile();
    }
}
