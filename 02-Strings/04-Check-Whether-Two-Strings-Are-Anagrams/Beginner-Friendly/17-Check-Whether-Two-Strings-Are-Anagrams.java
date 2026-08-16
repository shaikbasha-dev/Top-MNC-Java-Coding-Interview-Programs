class CheckWhetherTwoStringsAreAnagrams {
    public static void main(String[] args) {
        String first = "listen";
        String second = "silent";

        if (first.length() != second.length()) {
            System.out.println("Are Anagrams = false");
            return;
        }

        int[] frequency = new int[256];

        for (int i = 0; i < first.length(); i++) {
            frequency[first.charAt(i)]++;
            frequency[second.charAt(i)]--;
        }

        boolean areAnagrams = true;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                areAnagrams = false;
                break;
            }
        }

        System.out.println("Are Anagrams = " + areAnagrams);
    }
}
