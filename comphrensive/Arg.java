public class Arg {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Exactly two numbers are required!");
            return;
        }

        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            System.out.println(a + " + " + b + " = "  + (a+b));
            System.out.println(a + " x " + b + " = "  + (a*b));
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid Input type!");
        }
    }
}
