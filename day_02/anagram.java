
public class anagram {

    public static boolean anagramString (String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charInString = new int[26];

        for (int i = 0; i < str1.length(); i++) {

            charInString[str1.charAt(i)-'a']++;
            charInString[str2.charAt(i)-'a']--;

        }

        for (int i = 0; i < charInString.length; i++) {
            if(charInString[i] != 0){
                return false;
            }
        }

        return true;
    }

    
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        boolean ans = anagramString(str1.toLowerCase(), str2.toLowerCase());

        System.out.println(ans);

        int[] arr = {0,1,3,7,5};
        int k = 2;

        
    }
}
