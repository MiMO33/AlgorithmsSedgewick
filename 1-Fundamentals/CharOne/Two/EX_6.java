package Sw.CharOne.Two;

/**
 * Created by MiMO on 2016/10/21.
 */

/*
* A string s is a circular rotation of a string t if it matches when the characters
*are circularly shifted by any number of positions; e.g., ACTGACG is a circular shift of
*TGACGAC, and vice versa. Detecting this condition is important in the study of genomic
*sequences. Write a program that checks whether two given strings s and t are circular
* shifts of one another. Hint : The solution is a one-liner with indexOf(), length(), and
*string concatenation.
*/
public class EX_6 {
    public static void main(String[]args){
        System.out.println(isCircularRotation("ACTGACG","TGACGAC"));
    }

    public static boolean isCircularRotation(String s,String t){
        return (s.length() == t.length()) && (s.concat(s).indexOf(t) >= 0);
    }
}
