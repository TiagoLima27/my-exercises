class StringExerciseFrontBack {

    public static void main(String[] args) {

        String word = "Heisenberg";

        // Check command line input
        if (args.length >= 1) {
            word = args[0];
        }

        // We need to make sure the string has more than one character
        // To reverse the front and back chars
        if (word.length() > 1) {

            // Select the middle part of the string
            // Exclude the first and the last char
            // "eisenber"
            String mid = word.substring(1, word.length() - 1);

            // Concatenate last + mid + first
            System.out.println(word.charAt(word.length() - 1) + mid + word.charAt(0));
        }
    }
}
