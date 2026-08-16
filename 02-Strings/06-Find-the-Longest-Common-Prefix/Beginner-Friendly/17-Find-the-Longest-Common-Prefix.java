class FindtheLongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        String firstWord = words[0];
        String longestCommonPrefix = "";

        for (int i = 0; i < firstWord.length(); i++) {
            char currentCharacter = firstWord.charAt(i);
            boolean matchesAll = true;

            for (int j = 1; j < words.length; j++) {
                if (i >= words[j].length() || words[j].charAt(i) != currentCharacter) {
                    matchesAll = false;
                    break;
                }
            }

            if (!matchesAll) {
                break;
            }

            longestCommonPrefix = longestCommonPrefix + currentCharacter;
        }

        System.out.println("Longest Common Prefix = " + longestCommonPrefix);
    }
}
