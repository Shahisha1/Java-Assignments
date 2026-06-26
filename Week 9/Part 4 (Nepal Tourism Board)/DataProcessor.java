package Week9.Part4.NepalTourismBoard;

import java.util.List;

class DataProcessingException extends Exception{
    public DataProcessingException(String message){
        super(message);
    }
}
public interface DataProcessor {
abstract List<String> process(List<String> rawData) throws DataProcessingException;
} 