package algo.fb.palindrome;

class Main {
    
    public static void main(String[] args) {
        isPalindrome("ADCCBA");
    }

    // http://www.careercup.com/question?id=5085545090777088
    static boolean isPalindrome(String s) {
        int s1Index = 0;
        int s2Index = s.length() - 1;
        while (s1Index <= s2Index) {
            while (!Character.isLetter(s.charAt(s1Index))) {
                s1Index++;
                if (s1Index == s2Index) {
                    return true;
                }
            }
            while (!Character.isLetter(s.charAt(s2Index))) {
                s2Index--;
            }
            if (Character.toLowerCase(s.charAt(s1Index)) == Character.toLowerCase(s
                    .charAt(s2Index))) {
                s1Index++;
                s2Index--;
            } else {
                return false;
            }
        }
        return true;
    }
}
