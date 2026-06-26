package Week9.Part2.KathmanduCommute;

class NavigationFailedException extends Exception{
    public NavigationFailedException(String message){
        super(message);
    }
}

public interface NavigationService {
    void navigate(String startPoint, String endPoint, RouteValidator validator) 
    throws NavigationFailedException;
} 