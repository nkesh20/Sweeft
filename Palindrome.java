import java.util.Locale;

public class Palindrome {


    private static boolean isPalindromeRec(String text) {
        if(text.length() <= 1) {
            return true;
        }

        text = text.toLowerCase();

        return isPalindromeRecInternal(text);

    }

    private static boolean isPalindromeRecInternal(String text) {
        if(text.length() < 2) {
            return true;
        }

        return (text.charAt(0) == text.charAt(text.length() - 1)) && isPalindrome(text.substring(1, text.length() - 1));
    }


    private static String reverseString(String str) {
        String reversed = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }



    private static boolean isPalindrome(String text) {
        if(text.length() <= 1) {
            return true;
        }

        text = text.toLowerCase();

        String reversed = reverseString(text);
        return text.equals(reversed);
    }


    public static void main(String[] args) {
        boolean test1 = isPalindrome("anna");
        boolean test2 = isPalindrome("Anna");
        boolean test3 = isPalindrome("a");
        boolean test4 = isPalindrome("");
        boolean test5 = isPalindrome("nothing");
        boolean test6 = isPalindromeRec("anna");
        boolean test7 = isPalindromeRec("Anna");
        boolean test8 = isPalindromeRec("a");
        boolean test9 = isPalindromeRec("");
        boolean test10 = isPalindromeRec("nothing");
        boolean test11 = isPalindromeRec("absolute");

        System.out.println(test1 + " " + test2 + " " + test3 + " " + test4 + " " + test5);
        System.out.println(test6 + " " + test7 + " " + test8 + " " + test9 + " " + test10 + " " + test11);

    }


}
