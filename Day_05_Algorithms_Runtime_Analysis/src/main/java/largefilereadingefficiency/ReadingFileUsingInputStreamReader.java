package largefilereadingefficiency;

import java.io.*;
import java.nio.charset.StandardCharsets;
// Creating class ReadingFileUsingInputStreamReader to read file using InputStreamReader Class
public class ReadingFileUsingInputStreamReader
{
    // Method to read file
    public long readingFile(String filepath)
    {
        long startTime = System.nanoTime();
        // Handling IO exception
        try
        {
            FileInputStream fileInputStream = new FileInputStream(filepath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                //Only reading file, printing nothing
            }

            fileInputStream.close();
            inputStreamReader.close();
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
