
package Strings.quetions;

public class countvowels {

    public static int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    };

    public static void main(String[] args) {
        // String str = "AEIOU";
        // System.out.println(countVowels(str));
        String str = "ApnaCollege".replace("l", "");
        System.out.println(str);
    }
}