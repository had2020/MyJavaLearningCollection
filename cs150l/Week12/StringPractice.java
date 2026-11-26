public class StringPractice {

    public static int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = Character.toLowerCase(word.charAt(i));
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }
        }
        return count;
    }

    public static int countCharacter(String word, char target) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    public static String reverse(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result = result + word.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String word) {
        String reversed = reverse(word);
        return word.equals(reversed);
    }

    public static String removeSpaces(String phrase) {
        String result = "";
        for (int i = 0; i < phrase.length(); i++) {
            char current = phrase.charAt(i);
            if (current != ' ') {
                result = result + current;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        /* Part 3: Access Characters Using Indexes
        1.) What is the first valid index of a string: 0
        2.) What is the last valid index of a string: stringVariableName.length() - 1
        3.) What happens if you try to access an index that does not exist:
            it crashes with an index out of bounds error
        */

        /* Part 4: Use Common String Methods
        1.) What value does contains return when the text is found: true
        2.) What value does indexOf return when text is found: the index number where it starts
        3.) What does indexOf return when the text is not found: -1
        4.) Does toUpperCase change the original string: no it just makes a new one
        */

        // Part 5: Count Vowels
        System.out.println("Vowels in 'computer': " + countVowels("computer"));
        System.out.println("Vowels in 'education': " + countVowels("education"));
        System.out.println("Vowels in 'rhythm': " + countVowels("rhythm"));

        // Part 6: Count a Specific Character
        String word = "banana";
        System.out.println("Number of 'a' characters: " + countCharacter(word, 'a'));
        System.out.println("Number of 'n' characters: " + countCharacter(word, 'n'));
        System.out.println("Number of 'z' characters: " + countCharacter(word, 'z'));
        System.out.println("Number of ' ' characters in 'hello world': " + countCharacter("hello world", ' '));

        // Part 7: Reverse a String
        /*
        Why does the reverse loop begin at word.length() - 1 instead of word.length()?
        because indexing starts at 0 so word.length() is out of bounds and crashes the program
        */
        System.out.println("Reverse of 'hello': " + reverse("hello"));
        System.out.println("Reverse of 'Java': " + reverse("Java"));
        System.out.println("Reverse of 'A': " + reverse("A"));
        System.out.println("Reverse of '': " + reverse(""));

        // Part 8: Check for a Palindrome
        System.out.println("level: " + isPalindrome("level"));
        System.out.println("radar: " + isPalindrome("radar"));
        System.out.println("computer: " + isPalindrome("computer"));
        System.out.println("madam: " + isPalindrome("madam"));
        System.out.println("java: " + isPalindrome("java"));

        /* Part 9: Debug a String Program
        1.) Which character is missing from the result? the h
        2.) Why does the loop stop before reaching index zero? because i > 0 stops when i hits 0
        3.) What should the loop condition be? i >= 0
        */

        // Part 10: Final String Challenge
        System.out.println(removeSpaces("Java is fun"));
        System.out.println(removeSpaces("Hello World"));
        System.out.println(removeSpaces("NoSpaces"));
        System.out.println(removeSpaces("  leading and trailing  "));
        System.out.println(removeSpaces("CS 150 L"));
    }
}

/*
1. What is the first valid index of a String?
Answer: 0

2. What is the difference between charAt and substring?
Answer: charAt gives you just one letter and substring gives you a whole chunk of the string.

3. Why should String contents be compared using equals instead of ==?
Answer: == only checks if they are the same object in memory, equals actually checks if the text inside is the same.

4. What did the debugger help you discover in Part 9?
Answer: it showed me the loop stopped at 1 and skipped index 0 so the first letter got cut off.

5. What was the most challenging part of this lab?
Answer: not messing up the loop bounds on reverse() and getting out of bounds errors.
*/
