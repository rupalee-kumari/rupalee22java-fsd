public class ArrayImplementation {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        // Add elements to the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Print the elements of the array
        System.out.println("Elements of the array:");
        for (int i =  0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}

