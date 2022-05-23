public class ExceptionHandlingFlow {

    public static void main(String[] args) {
        System.out.println(exceptionHandling());
    }

    private static int exceptionHandling() {
        try {
            System.out.println("First Comment");
            System.out.println(10/0);
            System.out.println("Second Comment");
            return 10;
        } catch (Exception e) {
            System.out.println("Third Comment");
            System.out.println(10/0);
            System.out.println("Fourth Comment");
            return 20;
        } finally {
            System.out.println("Fifth Comment");
            System.out.println(10/0);
            System.out.println("Sixth Comment");
            return 30;
        }
    }
}
