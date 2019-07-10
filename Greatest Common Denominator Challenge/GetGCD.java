/**
 * Pulls two integers from String before submitting them to
 * GreatestCommonDivisor class. Returns GCD for said integers.
 *
 * @author Nathaniel Gjoderum-Symons
 *
 */

public class GetGCD {
    public static int GetGCD(String sentence){

        sentence = sentence.replaceAll("[^0-9]+", " ");

        String [] words = sentence.split("\\s+");

        int[] numbers = new int[2];

        for(int i=0; i < 2; i++){
            numbers[i] = Integer.parseInt(words[i+1]);
        }

        return de.vogella.algorithms.euclid.GreatestCommonDivisor.gcd(numbers[0],numbers[1]);

    }
}
