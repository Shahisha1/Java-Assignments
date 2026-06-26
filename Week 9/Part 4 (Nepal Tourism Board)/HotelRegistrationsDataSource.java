package Week9.Part4.NepalTourismBoard;

import java.util.ArrayList;
import java.util.List;

class AuthenticationFailedException extends DataSourceAccessException {
    public AuthenticationFailedException(String message) {
        super(message);
    }
}

public class HotelRegistrationsDataSource extends TouristDataSource{
    public HotelRegistrationsDataSource(){
        super("Kathmandu Hotels Registrations");
    }
     @Override
    public List<String> fetchData() throws DataSourceAccessException {
        if (sourceName.contains("Hotels") && Math.random() < 0.2) {
            throw new AuthenticationFailedException("Hotel API authentication failed! Did someone forget the password again?");
        }

        List<String> registrations = new ArrayList<>();
        registrations.add("Hotel: Yak & Yeti, Guest: Sita Sharma, NP");
        registrations.add("Hotel: Annapurna, Guest: Alice Smith, AU");
        registrations.add("Hotel: Dwarika's, Guest: Cho Chang, CN");
        return registrations;
    }

    public static void main(String[] args) {
        TouristDataSource dataSource = new HotelRegistrationsDataSource();

        try{
            List<String> hotelGuests = dataSource.fetchData();
            System.out.println(" Hotel Registrations Data:");
            for(String guest : hotelGuests){
                System.out.println(guest);
            }
        }catch(DataSourceAccessException e){
            System.out.println(" Failed to fetch hotel data: " + e.getMessage());
        }
    }
}