public class VowelCount {
    public static void main(String[] args) {
        String str = "aman";
        int vowels = 0;
        for (int x = 0; x <= str.length() - 1; x++) {
            String temp = String.valueOf(str.charAt(x));
            boolean check = temp.equalsIgnoreCase("a") || temp.equalsIgnoreCase("e") || temp.equalsIgnoreCase("i")
                    || temp.equalsIgnoreCase("o") || temp.equalsIgnoreCase("u");
            if (check) {
                vowels++;
            }
        }

        System.out.printf("There are %d Vowels in String '%s'",vowels,str);
    }
}