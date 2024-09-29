class ClosestNeighbours {

    public static void main(String[] args) {

        int[] numbers = {0, 5, 1209, 6, 2, 111, 112, 33};

        // Initialize variables
        int difference = Math.abs((numbers[0] - numbers[1]));
        int minDifference = difference;
        int[] neighbours = {numbers[0], numbers[1]};

        for (int i = 1; i < numbers.length - 1; i++) {

            difference = Math.abs((numbers[i] - numbers[i + 1]));

            if (difference <= minDifference) {
                minDifference = difference;
                neighbours[0] = numbers[i];
                neighbours[1] = numbers[i + 1];
            }
        }

        // Print the elements of the resulting array
        System.out.println("The closest neighbours are: " + neighbours[0] + "," + neighbours[1]);

    }
}
