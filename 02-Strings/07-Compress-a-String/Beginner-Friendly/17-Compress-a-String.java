class CompressaString {
    public static void main(String[] args) {
        String text = "aaabbc";
        String compressed = "";

        int count = 1;

        for (int i = 1; i <= text.length(); i++) {
            if (i < text.length() && text.charAt(i) == text.charAt(i - 1)) {
                count++;
            } else {
                compressed = compressed + text.charAt(i - 1) + count;
                count = 1;
            }
        }

        System.out.println("Compressed String = " + compressed);
    }
}
