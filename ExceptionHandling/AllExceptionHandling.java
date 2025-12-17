class Test {
    static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Age is below 18, not allowed");
        }
        System.out.println("Age is valid");
    }
}

class AllExceptionHandling {
    public static void main(String[] args) {
        try {
            Test.checkAge(16);   // ✅ FIX HERE
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes");
        }

        System.out.println("Program continues...");
    }
}
