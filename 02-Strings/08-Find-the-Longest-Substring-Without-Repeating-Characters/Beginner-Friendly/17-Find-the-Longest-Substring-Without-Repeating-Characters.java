class FindtheLongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String text = "abcabcbb";
        int maximumLength = 0;

        for (int start = 0; start < text.length(); start++) {
            boolean[] seen = new boolean[256];

            for (int end = start; end < text.length(); end++) {
                char currentCharacter = text.charAt(end);

                if (seen[currentCharacter]) {
                    break;
                }

                seen[currentCharacter] = true;
                int currentLength = end - start + 1;

                if (currentLength > maximumLength) {
                    maximumLength = currentLength;
                }
            }
        }

        System.out.println("Length = " + maximumLength);
    }
}
