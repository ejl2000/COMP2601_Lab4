import java.util.Arrays;
import java.util.List;

/**
 * A class representing a dictionary with a list of words and utility methods.
 *
 * @author Emma Lee, Nicholas Farrell, Walter Chu
 * @version 2024
 */
public class Dictionary
{
    public static final int MIN_WORD_LENGTH = 5;
    private final List<String> words = Arrays.asList(
            "jab",
            "jabbed",
            "jabber",
            "jabbered",
            "jabbering",
            "jabbers",
            "jabberwocky",
            "jabbing",
            "jabot",
            "jabots",
            "jabs",
            "jacaranda",
            "jacarandas",
            "jacinth",
            "jack",
            "jackal",
            "jackals",
            "jackanapes",
            "jackanapeses",
            "jackass",
            "jackasses",
            "jackboot",
            "jackboots",
            "jackdaw",
            "jackdaws",
            "jacked",
            "jacket",
            "jacketed",
            "jacketing",
            "jackets",
            "jackhammer",
            "jackhammers",
            "jackie",
            "jacking",
            "jackknife",
            "jackpot",
            "jackpots",
            "jacks",
            "jackson",
            "jacksonville",
            "jaclyn",
            "jacob",
            "jacobean",
            "jacobian",
            "jacobin",
            "jacobins",
            "jacobite",
            "jacobites",
            "jacobs",
            "jacquard",
            "jacquards",
            "jacqueline",
            "jacques",
            "jactitation",
            "jactitations",
            "jactus",
            "jacuzzi",
            "jacuzzis",
            "jade",
            "jaded",
            "jadeite",
            "jadeites",
            "jades",
            "jading",
            "jaeger",
            "jaffa",
            "jag",
            "jagged",
            "jaggedly",
            "jaggedness",
            "jagger",
            "jags",
            "jaguar",
            "jaguars",
            "jai",
            "jail",
            "jailed",
            "jailer",
            "jailers",
            "jailhouse",
            "jailing",
            "jailor",
            "jailors",
            "jails",
            "jaipur",
            "jakarta",
            "jake",
            "jalopies",
            "jalopy",
            "jalousie",
            "jalousies",
            "jam",
            "jamaica",
            "jamaican",
            "jamaicans",
            "jamb",
            "jamboree",
            "jamborees",
            "jambs",
            "james",
            "jamey",
            "jamie",
            "jammed",
            "jamming",
            "jammy",
            "jams",
            "jan",
            "jane",
            "janeiro",
            "janet",
            "jangle",
            "jangled",
            "jangles",
            "jangling",
            "janice",
            "janitor",
            "janitorial",
            "janitors",
            "january",
            "januarys",
            "janus",
            "japan",
            "japanese",
            "japanned",
            "japanning",
            "japans",
            "jape",
            "japed",
            "japer",
            "japers",
            "japery",
            "japes",
            "japing",
            "japonica",
            "japonicas",
            "jar",
            "jardiniere",
            "jardinieres",
            "jarful",
            "jarfuls",
            "jargon",
            "jargons",
            "jarred",
            "jarring",
            "jarringly",
            "jarrow",
            "jars",
            "jasmine",
            "jasmines",
            "jason",
            "jasper",
            "jaspers",
            "jaundice",
            "jaundiced",
            "jaunt",
            "jaunted",
            "jauntier",
            "jauntiest",
            "jauntily",
            "jaunting",
            "jaunts",
            "jaunty",
            "java",
            "javanese",
            "javelin",
            "javelins",
            "jaw",
            "jawbone",
            "jawbones",
            "jawboning",
            "jawbreaker",
            "jawbreakers",
            "jawed",
            "jawing",
            "jaws",
            "jay",
            "jays",
            "jayvees",
            "jaywalk",
            "jaywalked",
            "jaywalker",
            "jaywalkers",
            "jaywalking",
            "jaywalks",
            "jazz",
            "jazzed",
            "jazzes",
            "jazzier",
            "jazziest",
            "jazzing",
            "jazzman",
            "jazzmen",
            "jazzy"
            );

    /**
     * Creates a string based on the given Wordable implementation.
     *
     * @param word the input word (not used in current implementation)
     * @param number the input number (not used in current implementation)
     * @param wordableObject the Wordable implementation
     * @return the resulting string from the Wordable implementation
     */
    public String getWords(final String word,
                           final int number,
                           final Wordable wordableObject)
    {
        return wordableObject.createString(word, number);
    }

    /**
     * Gets the list of words.
     *
     * @return the list of words
     */
    public List<String> getWordsList()
    {
        return words;
    }

    /**
     * Prints the stated word.
     *
     * @param word the word as a String
     */
    public static void printWord(final String word)
    {
        System.out.println(word);
    }

    /**
     * Reverses the given string.
     *
     * @param inputString the string to be reversed
     * @return the reversed string
     */
    public static String reverseString(final String inputString)
    {
        return new StringBuilder(inputString).reverse().toString();
    }

    /**
     * Comparator method for sorting words in alphabetical order.
     *
     * @param word1 the first word
     * @param word2 the second word
     * @return a negative integer, zero, or a positive integer as the first word is less than, equal to, or greater than the second word
     */
    public static int alphabeticalOrder(final String word1,
                                        final String word2)
    {
        return word1.compareTo(word2);
    }

    /**
     * Checks if the length of a word is greater than five.
     *
     * @param word the word to be checked
     * @return true if the length of the word is greater than five, false otherwise
     */
    public static boolean isLengthAboveFive(final String word)
    {
        return word.length() > MIN_WORD_LENGTH;
    }
}


