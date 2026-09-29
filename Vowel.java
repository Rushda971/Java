
       class Vowel {
    public static void main(String[] args) {

        String word = "Webtech";
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                vowelCount++;
            } else if (Character.isLetter(ch)) {
                consonantCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}

    

//count vowel and consonant 
