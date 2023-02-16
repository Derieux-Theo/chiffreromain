public class ConvertRoman {

    //fonction qui convertit un nombre en chiffre romain
    public static String convert(int number) {
        String result = "";
        int[] values = {1};
        String[] symbols = {"I"};
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                result += symbols[i];
            }
        }
        return result;
    }
}
