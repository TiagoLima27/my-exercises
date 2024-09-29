package io.codeforall.bootcamp.exercise;

import java.util.Arrays;

public class Ai {
    public String name;
    public String creationDate;


    public Ai(String name, String creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] doubleArray(int[] arr) {
        return Arrays.stream(arr).map(elem -> elem * 2).toArray();
    }


    public boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public String palindromeReplace(String input) {

        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (isPalindrome(word.replaceAll("[^a-zA-Z]", ""))) {
                result.append("palindrome ");
            } else {
                result.append(word + " ");
            }
        }

        return result.toString().trim();
    }

    public int factorialIterative(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public String emailValidator() {
        return "^[a-zA-Z0-9._%+#-]+@[a-zA-Z0-9.-]+[a-zA-Z]{2,}$";
    }
}




