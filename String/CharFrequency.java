package String;
class CharFrequency {
    public static void main(String[] args) {
        String str = "programming";
        int[] freq = new int[256]; // ASCII range

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c]++;
            System.out.println(freq[c]);
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
    }
}
