class StringExerciseMissingChar {

    public static void main(String[] args) {

        String word = "Robocop";
        int characterIndex = 3;

        // Check command line input
        if (args.length >= 2) {
            word = args[0];
            characterIndex = Integer.parseInt(args[1]);
        }

        // Robocop
        // 0123456

        // Cut all the chars till the character index, excluding it
        // "Rob"
        String front = word.substring(0, characterIndex);

        // Cut all chars beginning at character index plus one
        // "cop"
        String back = word.substring(characterIndex + 1);

        System.out.println(front + back);

    }
}
