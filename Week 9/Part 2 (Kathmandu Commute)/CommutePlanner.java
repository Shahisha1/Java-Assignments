package part_2;

public class CommutePlanner {

    
    public static void planMyCommute(String origin, String destination,RouteValidator validator, NavigationService navigator) {
        System.out.println("Planning your commute from " + origin + " to " + destination + "...");

        try {
            navigator.navigate(origin, destination, validator);
        } catch (NavigationFailedException e) {
            Throwable cause = e.getCause();

            if (cause instanceof SameLocationException) {
                System.out.println("Cannot plan: Origin and destination are the same!");
            } else if (cause instanceof InvalidRouteException) {
                System.out.println("Cannot plan: Invalid route details - " + cause.getMessage());
            } else {
                System.out.println("Cannot plan: GPS issue or unexpected error - " + e.getMessage());
            }
        } finally {
            System.out.println("Commute planning for " + origin + " to " + destination + " completed.");
        }
    }

    
    public static void main(String[] args) {
        RouteValidator validator = new KathmanduTrafficValidator();
        NavigationService gps = new GPSNavigationModule();

        //1st exception: same destination and origin
        planMyCommute("Baneshwor", "Baneshwor", validator, gps);

        
        planMyCommute("Thamel", "Patan", validator, gps);

        
        planMyCommute("Kalanki", "Balaju", validator, gps);

    }
}