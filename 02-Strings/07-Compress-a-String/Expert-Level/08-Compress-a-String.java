class CompressaString {
    public static void main(String[] args) {
        String text = "aaabbc";
        StringBuilder compressed = new StringBuilder();

        for (int i = 0; i < text.length();) {
            int j = i + 1;
            while (j < text.length() && text.charAt(j) == text.charAt(i)) j++;
            compressed.append(text.charAt(i)).append(j - i);
            i = j;
        }

        System.out.println("Compressed String = " + compressed);
    }
}
