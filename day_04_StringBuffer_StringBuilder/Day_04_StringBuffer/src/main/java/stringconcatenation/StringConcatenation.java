package stringconcatenation;

// Creating class StringConcatenation to concatenate String using StringBuffer
public class StringConcatenation
{
    // Method to concatenate String
    public static String concatenateStrings(String[] str)
    {
        StringBuffer result = new StringBuffer();

        for(int i=0;i<str.length;i++)
        {
            result.append(str[i]);
        }
        return result.toString();
    }

    // Main Method
    public static void main(String[] args)
    {
        String[] sentence = { "String", "Builder", "and", "String", "Buffer" };
        System.out.println("Concatenated string is " + concatenateStrings(sentence));
    }
}
