class CheckWhetheraStringCanFormaPalindrome {
    public static void main(String[] args) {
        String text = "carrace";
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);
            frequency[currentCharacter]++;
        }

        int oddFrequencyCount = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] % 2 != 0) {
                oddFrequencyCount++;
            }
        }

        if (oddFrequencyCount <= 1) {
            System.out.println("Can Form Palindrome = true");
        } else {
            System.out.println("Can Form Palindrome = false");
        }
    }
}
