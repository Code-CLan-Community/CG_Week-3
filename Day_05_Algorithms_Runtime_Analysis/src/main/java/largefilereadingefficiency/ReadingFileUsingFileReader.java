package largefilereadingefficiency;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Creating class ReadingFileUsingFileReader to read file using FileReader Class
public class ReadingFileUsingFileReader
{
    // Method to read file
    public long readingFile(String filepath)
    {
        long startTime = System.nanoTime();
        // Handling IO exception
        try
        {
            FileReader fileReader = new FileReader(filepath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                //Only reading file, printing nothing
            }

            fileReader.close();
            bufferedReader.close();
        }
        catch (IOException e)
        {
            System.out.println("Error due to " + e.getMessage());
        }
        long endTime = System.nanoTime();

        return (endTime - startTime);
    }
}
