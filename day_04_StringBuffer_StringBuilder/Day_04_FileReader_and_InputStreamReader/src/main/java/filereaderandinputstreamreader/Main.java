package filereaderandinputstreamreader;
// Creating Main class
public class Main
{
    // Main Method
    public static void main(String[] args)
    {
        // Creating class object and calling their methods
        CompareStringBufferAndStringBuilderPerformance compare1 = new CompareStringBufferAndStringBuilderPerformance();
        System.out.println("\nTime taken by StringBuffer to concatenate string is " + compare1.concatenateStringsUsingBuffer());
        System.out.println("Time taken by StringBuilder to concatenate string is " + compare1.concatenateStringsUsingBuilder());

        // Creating class object and calling their methods
        CompareFileReaderAndInputStreamReaderPerformance compare2 = new CompareFileReaderAndInputStreamReaderPerformance();
        long startTimeOfFileReader = System.nanoTime();
        System.out.println("\nFileReader Word Count is " + compare2.countWordUsingFileReader());
        long endTimeOfFileReader = System.nanoTime();
        System.out.println("And Time taken by FileReader is " + (endTimeOfFileReader - startTimeOfFileReader));

        long startTimeOfInputStreamReader = System.nanoTime();
        System.out.println("\nInputStreamReader Word Count is " + compare2.countWordUsingInputStreamReader());
        long endTimeOfInputStreamReader = System.nanoTime();
        System.out.println("And Time taken by InputStreamReader is " + (endTimeOfInputStreamReader - startTimeOfInputStreamReader));
    }
}
