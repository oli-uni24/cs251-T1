public class RevisionMethods {

    //constructor to run methods
    public RevisionMethods() {
        // Example usage of the methods
        System.out.println("Is 10 a multiple of 2? " + isMultiple(10, 2));
        System.out.println("Is 10 a multiple of 3? " + isMultiple(10, 3));
    }

    public static boolean isMultiple(long n, long m) {
        // Check if n is a multiple of m
        return n % m == 0;
    }

    // returns true if and only if i is odd
    // not use multiplication, modulus or division operators
    public static boolean isOdd(int i) {
        return (i & 1) == 1;
    }


}
