package searchingspecificword;

// Creating class SearchSpecificWord to check whether a specific word in present in string or not
public class SearchSpecificWord
{
    // Method to find specific word
    public static String findWord(String sentence,String word)
    {
        String[] words = sentence.split(" ");
        // Traversing each word of string array
        for(int i=0;i< words.length;i++)
        {
            if(words[i].equals(word))
            {
                return sentence;
            }
        }
        return "Not Found";
    }

    // Main method
    public static void main(String[] args)
    {
        String sentence = "Linear search is the simplest searching algorithm";
        String word = "simplest";

        // Calling findWord method and displaying the result
        String result = findWord(sentence,word);
        System.out.println(result);
    }
}
