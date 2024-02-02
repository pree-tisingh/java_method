class VowelCheck{

    public static void main(String[] args) {
        char check = 'a';
        if (isVowel(check)) {
            System.out.println(check + " is a vowel.");
        } else {
            System.out.println(check + " is not a vowel.");
        }
    }

   
    public static boolean isVowel(char ch) {
        char x = Character.toLowerCase(ch);
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
    }
}
