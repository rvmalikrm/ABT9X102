package Dec2025;

public class Lab18Dec2025_hashSet {
    public static void main(String[] args) {
        // Create a HashSet to store unique integers
        java.util.HashSet<Integer> numberSet = new java.util.HashSet<>();

        // Add some integers to the HashSet
        numberSet.add(10);
        numberSet.add(20);
        numberSet.add(30);
        numberSet.add(20); // Duplicate, will not be added

        // Display the contents of the HashSet
        System.out.println("HashSet contents: " + numberSet);

        // Check if a specific integer is present
        int searchNumber = 20;
        if (numberSet.contains(searchNumber)) {
            System.out.println(searchNumber + " is present in the HashSet.");
        } else {
            System.out.println(searchNumber + " is not present in the HashSet.");
        }

        // Remove an integer from the HashSet
        numberSet.remove(10);
        System.out.println("HashSet after removing 10: " + numberSet);
    }
}
