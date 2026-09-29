class ArrayPractice {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Audi", "Rolls Royce"};
        System.out.println("Second car: " + cars[1]);
        System.out.println("Number of cars: " + cars.length);

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);

        int[] values = {12, 5, 7, 89, 34};
        int minimum = values[0];
        int maximum = values[0];
        for (int value : values) {
            if (value > maximum) {
                maximum = value;
            }
            if (value < minimum) {
                minimum = value;
            }
        }
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);

        int[] reversed = {1, 2, 3, 4, 5};
        for (int left = 0, right = reversed.length - 1; left < right; left++, right--) {
            int temp = reversed[left];
            reversed[left] = reversed[right];
            reversed[right] = temp;
        }
        System.out.println("Reversed: " + java.util.Arrays.toString(reversed));

        int[] palindrome = {1, 2, 3, 2, 1};
        boolean isPalindrome = true;
        for (int left = 0, right = palindrome.length - 1; left < right; left++, right--) {
            if (palindrome[left] != palindrome[right]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is palindrome: " + isPalindrome);

        int[] occurrences = {1, 2, 2, 3, 2};
        int target = 2;
        int count = 0;
        for (int value : occurrences) {
            if (value == target) {
                count++;
            }
        }
        System.out.println(target + " appears " + count + " times");

        int[] scores = {10, 5, 8, 20, 15};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int score : scores) {
            if (score > largest) {
                secondLargest = largest;
                largest = score;
            } else if (score > secondLargest && score != largest) {
                secondLargest = score;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest value.");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }

        int[] duplicateValues = {1, 2, 2, 3, 3, 4};
        int[] uniqueValues = new int[duplicateValues.length];
        int uniqueCount = 0;
        for (int value : duplicateValues) {
            boolean alreadyAdded = false;
            for (int i = 0; i < uniqueCount; i++) {
                if (uniqueValues[i] == value) {
                    alreadyAdded = true;
                    break;
                }
            }
            if (!alreadyAdded) {
                uniqueValues[uniqueCount] = value;
                uniqueCount++;
            }
        }

        int[] result = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueValues[i];
        }
        System.out.println("Without duplicates: " + java.util.Arrays.toString(result));
    }
}
