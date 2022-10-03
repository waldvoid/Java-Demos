public class Main {
    public static void main(String[] args) {
        char word = 'Ü';
        char[] hardWords = {'A', 'a', 'O', 'o', 'ı', 'ı', 'U', 'u' };
        char[] softWords = {'E', 'e', 'Ö', 'ö', 'İ', 'i', 'Ü', 'ü' };
        boolean isHardVowel = false;
        boolean isSoftVowel = false;

        for (int i = 0; i < hardWords.length; i++) {
            if (word == hardWords[i]) {
                isHardVowel = true;
                break;
            } else if(word == softWords[i]) {
                isSoftVowel = true;
                break;
            }
        }

        if (isHardVowel) {
            System.out.println(word + " is a hard vowel");
        } else if (isSoftVowel) {
            System.out.println(word + " is a soft vowel");
        } else {
            System.out.println("Please Enter a Vowel");
        }
    }
}