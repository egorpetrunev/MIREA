package com.company;

public class Palindrome {
        public boolean palindrome(String str) {
            char firstChar, lastChar;
            String anstr;
            boolean flag = false;
            String fin = "";
            // Базовый случай
            if (str.length() <= 1) {
                flag = true;
            } else {
                firstChar = str.toCharArray()[0];
                lastChar = str.toCharArray()[str.length() - 1];
                anstr = str.substring(1, str.length() - 1);
                // Шаг рекурсии / рекурсивное условие
                if (firstChar == lastChar && palindrome(anstr)) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
            return flag;
        }
}
