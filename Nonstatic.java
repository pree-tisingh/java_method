class VowelCheck{

    public static void main(String[] args) {
        VowelCheck v = new VowelCheck();
        char check = 'A';  
        if (v.isVowel(check)) {
            System.out.println(check + " is a vowel.");
        } else {
            System.out.println(check + " is not a vowel.");
        }
    }

    public boolean isVowel(char ch) {
        char x = Character.toLowerCase(ch);
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
    }
}
