class CountVowelsConsonantsandSpecialCharacters {
    public static void main(String[] args) {
        String text = "Hello Java! 123";
        int vowels = 0, consonants = 0, digits = 0, special = 0;

        for (char ch : text.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) >= 0) vowels++;
            else if (Character.isLetter(ch)) consonants++;
            else if (Character.isDigit(ch)) digits++;
            else if (!Character.isWhitespace(ch)) special++;
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + special);
    }
}
