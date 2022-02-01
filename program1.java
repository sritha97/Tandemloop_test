public class program1 {

    private static double calculator(double a, double b, String operation) throws Exception {
        switch (operation) {
            case "Addition":
                return a + b;
            case "Subtraction":
                return a - b;
            case "Multiplication":
                return a * b;
            case "Division":
                return a / b;
            default:
                throw new Exception("Unknown Operation Error");
        }
    }

    public static void main(String[] args) {
        // Inputs
        double a = 10;
        double b = 10;
        String operation = "Division";

        // Operation
        double output;
        String result;
        try {
            output = calculator(a, b, operation);
            result = String.format("The output of operation:%s with %.1f and %s is %s", operation, a, b, output);
        } catch (Exception e) {
            result = String.format("Select Operation carefully: %s is not in the list\nAllowed Operators are Addition,Subtraction,Multiplication and Division", operation);
        }

        // Test
        System.out.println(result);
    }

}
