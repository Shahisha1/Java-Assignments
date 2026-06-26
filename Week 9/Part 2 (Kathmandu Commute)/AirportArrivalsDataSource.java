import java.util.*;

class ConnectionLostException extends DataSourceAccessException {

    public ConnectionLostException(String message) {
        super(message);
    }
}

public class AirportArrivalsDataSource extends TouristDataSource {

    public AirportArrivalsDataSource() {
        super("Tribhuvan Airport Arrivals");
    }

    @Override
    public List<String> fetchData() throws DataSourceAccessException {
        if (sourceName.contains("Tribhuvan") && Math.random() < 0.3) {
            throw new ConnectionLostException("Airport data connection lost! Maybe a pigeon sat on the antenna?");
        }

        
        List<String> arrivals = new ArrayList<>();
        arrivals.add("Visitor: Louis DePoint Du lac, USA");
        arrivals.add("Visitor: Lestat De Lioncourt, France");
        arrivals.add("Visitor: Armand, India");
        return arrivals;
    }

    public static void main(String[] args) {
        TouristDataSource dataSource = new AirportArrivalsDataSource();

        try {
            List<String> visitors = dataSource.fetchData();
            System.out.println(" Airport Arrivals Data:");
            for (String visitor : visitors) {
                System.out.println(visitor);
            }
        } catch (DataSourceAccessException e) {
            System.out.println(" Failed to fetch data: " + e.getMessage());
        }
    }
}
