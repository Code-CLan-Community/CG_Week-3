package reversestring;

// Creating class ReverseStringUsingStringBuilder to reverse a string using StringBuilder reverse method
public class ReverseStringUsingStringBuilder
{
    // Method to reverse a string
    public static String reverseString(String str)
    {
        StringBuilder string = new StringBuilder();
        string.append(str);
        string.reverse();
        return string.toString();
    }

    // Main Method
    public static void main(String[] args)
    {
        String originalString = "Hello";
        System.out.println("Original String is " + originalString);

        // Calling reverse method and display result
        String reversedString = reverseString(originalString);
        System.out.println("Reversed String is " + reversedString);
    }
}