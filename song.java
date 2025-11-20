import java.util.Scanner;

public class song {

// MusicDataProject.java
// This project uses OOP, 1D arrays, methods, and a toString() method
// to analyze a dataset of popular songs. Multi-line comments explain
// purpose and pre/postconditions.

    // Instance variables
    private int years;                 // release year
    private String songs;              // song titles
    private String artists;            // artist names
    private String streams;              // approx stream counts
    private String grammyWinner;      // has artist won Grammy before?
    private String genres;              // genre of each song

    /**
     * Initializes arrays with default values.
     */
    public song(int years, String songs, String artists, String streams, String grammyWinner, String genres) {
     this.years = years;
     this.songs = songs;
     this.artists = artists;
     this.streams = streams;
     this.grammyWinner = grammyWinner;
     this.genres = genres;
    }


  
  public int getYears(){
    return years;
  }

  public String getSongs(){
    return songs;
  }

  public String getArtists(){
       return artists;
  }
  

  public String getStreams(){
    return streams;
  }


  
  public String getGrammyWinner(){
      return grammyWinner;
  }

  
  public String getGenres(){
    return genres;
  }


  public String toString(){
    return years + " Name: " + songs + " Artist: " + artists + " Number of Streams: " + streams + " Grammy Winner? " + grammyWinner + " Genre: " + genres;
  }


}