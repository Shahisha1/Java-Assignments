public class Arg {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Exactly two numbers are required!");
            return;
        }

        try {
            int c = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            System.out.println(c + " + " + b + " = " + (c + b));
            System.out.println(a + " x " + b + " = " + (c * b));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Input type!");
        }
    }
}
