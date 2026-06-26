package Week9.Part4.NepalTourismBoard;

import java.util.List;

class DataSourceAccessException extends Exception{
    public DataSourceAccessException(String message){
        super(message);
    }
}
abstract class TouristDataSource {
    protected String sourceName;
    public TouristDataSource(String sourceName){
        this.sourceName = sourceName;
    }
    
    public abstract List<String> fetchData() throws DataSourceAccessException;
}