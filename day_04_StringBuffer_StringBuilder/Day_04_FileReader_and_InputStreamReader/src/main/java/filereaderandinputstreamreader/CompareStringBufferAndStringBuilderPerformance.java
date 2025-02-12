package filereaderandinputstreamreader;

// Creating class CompareStringBufferAndStringBuilder to compare performance of StringBuffer and StringBuilder
public class CompareStringBufferAndStringBuilderPerformance
{
        // Method to measure the time taken by StringBuilder to complete the concatenation
        public long concatenateStringsUsingBuffer()
        {
            String str = "hello";
            StringBuffer result = new StringBuffer();
            long bufferStartTime = System.nanoTime();

            for(int i=0;i<1000000;i++)
            {
                result.append(str);
            }

            long bufferEndTime = System.nanoTime();
            return (bufferEndTime - bufferStartTime);
        }

        // Method to measure the time taken by StringBuilder to complete the concatenation
        public long concatenateStringsUsingBuilder()
        {
            String str = "hello";
            StringBuilder result = new StringBuilder();
            long builderStartTime = System.nanoTime();

            for(int i=0;i<1000000;i++)
            {
                result.append(str);
            }
            long builderEndTime = System.nanoTime();
            return (builderEndTime - builderStartTime);
        }
}

