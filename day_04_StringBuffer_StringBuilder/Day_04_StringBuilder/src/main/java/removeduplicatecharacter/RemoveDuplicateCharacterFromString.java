package removeduplicatecharacter;

import java.util.HashSet;
// Creating class RemoveDuplicateFromString to remove duplicate character from string using StringBuilder and HashSet
public class RemoveDuplicateCharacterFromString
{
    // Method to remove Duplicate character from a string
    public static String removeDuplicate(String str)
    {
        StringBuilder result = new StringBuilder();
        HashSet<Character> uniqueCharacter = new HashSet<>();

        for(int i=0;i<str.length();i++)
        {
            if(!uniqueCharacter.contains(str.charAt(i)))
            {
                uniqueCharacter.add(str.charAt(i));
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    // Main method
    public static void main(String[] args)
    {
        String originalString = "aabbccc";
        String newString = removeDuplicate(originalString);

        // Display the result
        System.out.println("Original String is " + originalString);
        System.out.println("Unique Character String is " + newString);
    }
}
