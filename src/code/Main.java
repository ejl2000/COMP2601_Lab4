import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * The main class for executing the program.
 *
 * @author Emma Lee, Nicholas Farrell, Walter Chu
 * @version 2024
 */
public class Main
{
    public static final int USER_COMMAND;
    public static final int USER_NUM;

    public static final String CONCAT;
    public static final String REPEAT;
    public static final String NTH;
    public static final String REVERSE;
    
    public static final String STRING_INIT;
    public static final String SORTED_WORDS_LABEL;

    static
    {
        USER_COMMAND = 0;
        USER_NUM     = 1;

        CONCAT  = "concat";
        REPEAT  = "repeat";
        NTH     = "nth";
        REVERSE = "reverse";

        STRING_INIT        = "";
        SORTED_WORDS_LABEL = "Sorted words: ";
    }

    public static void main(final String[] args)
    {
        // 3a
        final String userCommand;
        final int    userNum;

        final List<String> words;

        Dictionary dict;
        Wordable wordy;

        userCommand = args[USER_COMMAND];
        userNum     = Integer.parseInt(args[USER_NUM]);

        dict        = new Dictionary();
        words       = dict.getWordsList();
        wordy       = null;

        final StringBuilder result;
        result = new StringBuilder();

        // 3b
        if(userCommand.equalsIgnoreCase(CONCAT))
        {
            wordy = (cmd, num) -> String.join(STRING_INIT, words);
        }

        // 3c
        if(userCommand.equalsIgnoreCase(REPEAT))
        {
            wordy = (cmd, num) -> {
                for (final String word : words)
                {
                    result.append(word.repeat(num));
                }
                return result.toString();
            };
        }

        // 3c continued...
        if(userCommand.equalsIgnoreCase(NTH))
        {
            wordy = (cmd, num) -> words.get(num);
        }

        // 3d
        if(userCommand.equalsIgnoreCase(REVERSE))
        {
            wordy = (cmd, num) -> {

                for(final String word : words)
                {
                    result.append(new StringBuilder(word).reverse());
                }
                return result.toString();
            };
        }

        // 3e: print the String returned by Wordable...
        System.out.println("PART 3e:");
        if(wordy != null)
        {
            System.out.println(dict.getWords(userCommand,userNum,wordy));
        }
        // ...then use method reference to print the entire list of words
        final Consumer<String> printWord;

        printWord = Dictionary::printWord;

        for (final String word: words)
        {
            printWord.accept(word);
        }

        // 3f
        System.out.println("PART 3f:");
        String reversed;

        for(final String word: words)
        {
            reversed = Dictionary.reverseString(word);
            printWord.accept(reversed);
        }

        // 3g
        System.out.println("PART 3g:");
        words.sort(Dictionary::alphabeticalOrder);
        System.out.println(SORTED_WORDS_LABEL + Arrays.toString(words.toArray()));

        // 3h
        System.out.println("PART 3h:");
        for(final String word: words)
        {
            if(Dictionary.isLengthAboveFive(word))
            {
                printWord.accept(word);
            }
        }
    }
}