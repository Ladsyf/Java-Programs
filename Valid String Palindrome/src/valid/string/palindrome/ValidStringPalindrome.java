
package valid.string.palindrome;


public class ValidStringPalindrome {

    public static void main(String[] args) {
        String str = "A man, a plan, a canal:!%# $ Panama]]]";

        System.out.print(isPalindrome(str));
    }
    static boolean isPalindrome(String s){
        boolean ans = true;
        s = s.replaceAll("[ !\"#$%&\'()*+,-./:;<=>?@~^_`\\{}]", "");
        s = s.replaceAll("\\[|\\]", "");
    
        for(int i = 0; i < (s.length()/2); i++ ){
            ans = String.valueOf(s.charAt(i)).equalsIgnoreCase(String.valueOf(s.charAt(((s.length()-1)- i))));
            if(!ans) return ans;
        }
        return ans;
    }
    
}
