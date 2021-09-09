package com.nostratech;

import static java.lang.System.out;

/**
 * @author Yusuf K. Setiawan
 * @since 2021/09/09
 **/

public class Main {
    public static void main(String[] args) {

        out.println(Palindrome.isPalindrome("word")); //false

        out.println(Palindrome.isPalindrome("asddsa")); //true

        out.println(Palindrome.isPalindrome("3515")); //false

        out.println(Palindrome.isPalindrome("2222")); //true

        out.println(Palindrome.isPalindrome("motor")); //false

        out.println(Palindrome.isPalindrome("kayak")); //true

        out.println(Palindrome.isPalindrome("rotor")); //true

        out.println(Palindrome.isPalindrome("racecar")); //true

    }
}
