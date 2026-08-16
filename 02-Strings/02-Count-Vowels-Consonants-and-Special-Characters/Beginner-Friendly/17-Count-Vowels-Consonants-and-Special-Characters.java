class CountVowelsConsonantsandSpecialCharacters {
    public static void main(String[] args) {
        String text = "Hello Java! 123";
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialCharacters = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);

            if (currentCharacter == 'a' || currentCharacter == 'e' ||
                currentCharacter == 'i' || currentCharacter == 'o' ||
                currentCharacter == 'u' || currentCharacter == 'A' ||
                currentCharacter == 'E' || currentCharacter == 'I' ||
                currentCharacter == 'O' || currentCharacter == 'U') {
                vowels++;
            } else if ((currentCharacter >= 'a' && currentCharacter <= 'z') ||
                       (currentCharacter >= 'A' && currentCharacter <= 'Z')) {
                consonants++;
            } else if (currentCharacter >= '0' && currentCharacter <= '9') {
                digits++;
            } else if (currentCharacter != ' ') {
                specialCharacters++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + specialCharacters);
    }
}
