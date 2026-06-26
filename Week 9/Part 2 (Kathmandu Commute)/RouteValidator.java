package Week9.Part2.KathmanduCommute;


class InvalidRouteException extends Exception {
    public InvalidRouteException(String message) {
        super(message);
    }
}

public interface RouteValidator {
    boolean isValidCommuteRoute(String origin, Staring destination, double distanceKm)
    throws InvalidRouteException;
}