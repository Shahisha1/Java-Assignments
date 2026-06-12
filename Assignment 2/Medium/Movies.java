public class Movies {
    public static void main(String[] args) {
        Movie mov1 = new Movie("Project Hail Mary", "English", 5);
        Movie mov2 = new Movie("Your Name", "Japanese", 4.5);
        Movie mov3 = new Movie("DJ", "Hindi", 4.5);

        mov1.displayMovieDetails();
        mov2.displayMovieDetails();
        mov3.displayMovieDetails();
    }
}

class Movie{
    String name;
    String language;
    double rating;

    public Movie(String name, String lang, double rate){
        this.name = name;
        this.language = lang;
        this.rating = rate;
    }

    public void displayMovieDetails(){
        System.out.println("Movie Name: " + this.name);
        System.out.println("Language: " + this.language);
        System.out.println("Rating: " + this.rating);
    }
}