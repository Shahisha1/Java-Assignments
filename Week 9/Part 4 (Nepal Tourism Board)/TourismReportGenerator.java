package Week9.Part4.NepalTourismBoard;

import java.util.ArrayList;
import java.util.List;

public class TourismReportGenerator {
    static void generateOverallReport(List<TouristDataSource> dataSources, DataProcessor processor) {
        System.out.println("Generating overall tourism report...");
        
        for (TouristDataSource dataSource : dataSources) {
            List<String> rawData = null;

            //to get the actual data 
            try {
                rawData = dataSource.fetchData();
            } catch (DataSourceAccessException e) {
                System.out.println("Could not fetch data from " + dataSource.sourceName + ": " + e.getMessage() + ". Skipping this source.");
                if (e.getCause() != null) {
                    System.out.println(" Reason: " + e.getCause().getMessage());
                }
                System.out.println(" Data handling from " + dataSource.sourceName + " completed.\n");
                continue; // move to next data source
            }

            // thsi block prrocesses the actual data from above for the report generation
            try {
                List<String> result = processor.process(rawData);
                for (String output : result) {
                    System.out.println(" Report from " + dataSource.sourceName + ": " + output);
                }
            } catch (DataProcessingException e) {
                System.out.println(" Error processing data from " + dataSource.sourceName + ": " + e.getMessage() + ". Skipping this data.");
            } finally {
                System.out.println(" Data handling from " + dataSource.sourceName + " completed.\n");
            }
        }

        System.out.println("Overall tourism report generation completed.");
    }
// main
    public static void main(String[] args) {
        // Prepare data sources
        List<TouristDataSource> sources = new ArrayList<>();
        sources.add(new AirportArrivalsDataSource());
        sources.add(new HotelRegistrationsDataSource());

        DataProcessor processor = new UniqueVisitorCounter();

            // generating the overall report by method calling
        generateOverallReport(sources, processor);
    }
}