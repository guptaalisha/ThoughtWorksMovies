package com.thoughtworks;
import java.util.*;

class Movie{
    private String title;
    private String studio;
    private String rating;
    Movie(String title, String studio, String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    Movie(String title, String studio){
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }
    public String getTitle(){
        return this.title;
    }
    public static ArrayList<Movie> getPG(Movie[] movie){
        ArrayList<Movie> pgMovies = new ArrayList<Movie>();
        for(int i=0;i<movie.length;i++)
            if(movie[i].rating.contains("PG"))
                pgMovies.add(movie[i]);
        return pgMovies;
    }
}
public class Main {

    public static void main(String[] args) {
    Movie movies[] = new Movie[3];
	movies[0] = new Movie("Casino Royale","Eon Productions","PG-13");
	movies[1] = new Movie("Inception","Legendry Pictures","PG-13");
    movies[2] = new Movie("Interstellar","Paramount Pictures","A");
    ArrayList<Movie> pgMovies = new ArrayList<Movie>();
    pgMovies = Movie.getPG(movies);
    System.out.println("List of PG movies are: ");
    for(int i=0;i<pgMovies.size();i++)
        System.out.println(pgMovies.get(i).getTitle());
    }
}
