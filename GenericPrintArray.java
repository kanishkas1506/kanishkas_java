public class GenericPrintArray {

    // Generic method to print any type of array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // for new line
    }

    public static void main(String[] args) {

        // String array
        String[] languages = { "Java", "Python", "C++" };

        // Integer array
        Integer[] numbers = { 1, 2, 3, 4 };

        System.out.println("String Array:");
        printArray(languages);

        System.out.println("Integer Array:");
        printArray(numbers);
    }
}

