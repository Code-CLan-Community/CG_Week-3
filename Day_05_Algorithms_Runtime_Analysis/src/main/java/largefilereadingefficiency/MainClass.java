package largefilereadingefficiency;
// Creating main class
public class MainClass
{
    // Main method
    public static void main(String[] args)
    {
        // Storing path of file in filepath variable
        String filepath = "D:\\Capgemini\\Coding Question\\CG_Week_3\\Day_04_FileReader_and_InputStreamReader\\file.txt";

        // Creating objects of classes
        ReadingFileUsingFileReader read1 = new ReadingFileUsingFileReader();
        ReadingFileUsingInputStreamReader read2 = new ReadingFileUsingInputStreamReader();

        // Calling methods of the class and displaying the result
        System.out.println("Time taken by FileReader to read file " + read1.readingFile(filepath));
        System.out.println("Time taken by InputStreamReader to read file " + read2.readingFile(filepath));
    }
}
