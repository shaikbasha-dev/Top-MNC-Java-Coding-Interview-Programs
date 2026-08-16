class FindtheFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String text = "swiss";
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char firstNonRepeating = '\0';

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                firstNonRepeating = text.charAt(i);
                break;
            }
        }

        if (firstNonRepeating != '\0') {
            System.out.println("First Non-Repeating Character = " + firstNonRepeating);
        } else {
            System.out.println("No Non-Repeating Character");
        }
    }
}
