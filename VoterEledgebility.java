public class VoterEledgebility {
        public static void main(String[] args) {
            int age = 20;
            boolean isCitizen = true;

            if (age >= 18 && isCitizen) {
                System.out.println("They are Eligible to vote.");
            } else {
                System.out.println("They are Not eligible to vote.");
            }
        }
}
