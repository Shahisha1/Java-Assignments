package Week9.Part4.NepalTourismBoard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class EmptyDataException extends DataProcessingException{
    public EmptyDataException(String message){
        super(message);
    }
}
public class UniqueVisitorCounter implements DataProcessor{
    @Override
    public List<String> process(List<String> rawData) throws DataProcessingException{
        if(rawData == null || rawData.isEmpty()){
            throw new EmptyDataException("No raw data to process! Did all tourists go missing?");
        }
        Set<String> uniqueNames = new HashSet<>();

        for(String entry : rawData){
            String name = extractName(entry);
            if(name!= null && !name.isEmpty()){
                uniqueNames.add(name.trim());
            }
        }
        return  Collections.singletonList("Unique Visitors: " + uniqueNames.size());
    }
     /
   private String extractName(String entry) {
    String name = null;

    if (entry.startsWith("Visitor: ")) {
        int start = "Visitor: ".length();
        int end = entry.indexOf(",", start);
        if (end != -1) {
            name = entry.substring(start, end).trim();
        }
    } else if (entry.startsWith("Guest: ")) {
        int start = "Guest: ".length();
        int end = entry.indexOf(",", start);
        if (end != -1) {
            name = entry.substring(start, end).trim();
        }
    }

    return name;
}

public static void main(String[] args) {
    DataProcessor processor = new UniqueVisitorCounter();

    
    try {
        List<String> emptyList = new ArrayList<>();
        processor.process(emptyList);
    } catch (DataProcessingException e) {
        System.out.println(" Error: " + e.getMessage());
    }

    
        try {
            List<String> visitorData = Arrays.asList(
            "Visitor: Louis DePoint Du Lac, USA",
            "Guest: Lestat De Lioncourt, UK",
            "Visitor: Daniel Malloy, USA",
            "Guest: Sita Sherma, NP",
            "Visitor: James Marriott, UK"
        );

        List<String> result = processor.process(visitorData);
        System.out.println(" Processing Result: " + result.get(0));
    } catch (DataProcessingException e) {
        System.out.println(" Error: " + e.getMessage());
        }
}
}