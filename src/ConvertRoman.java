public class ConvertRoman {

    //fonction qui convertit un nombre en chiffre romain
    public static String convert(int number) {
        String result = "";
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                result += symbols[i];
            }
        }
        return result;
    }
}
