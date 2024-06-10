/**
 * A functional interface for creating a String based on an input string and an integer.
 *
 * @author Emma Lee, Nicholas Farrell, Walter Chu
 * @version 2024
 */
@FunctionalInterface
public interface Wordable
{
    /**
     * Creates a String based on the given input string and integer.
     *
     * @param inputString the input string
     * @param integerParameter the integer parameter
     * @return the resulting string
     */
    String createString(final String inputString,
                        final int integerParameter);
}
