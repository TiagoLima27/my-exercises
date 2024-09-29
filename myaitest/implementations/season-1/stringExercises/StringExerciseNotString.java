class StringExerciseNotString {

    public static void main(String[] args) {

        String word = "semicolon";

        // Check command line input
        if (args.length >= 1) {
            word = args[0];
        }

        // If the string has 3 or more chars
        // And the first three chars are equal to "not"
        if (word.length() >= 3 && word.substring(0, 3).equals("not")) {

            System.out.println(word);
        } else {

            System.out.println("not " + word);
        }

    }
}
