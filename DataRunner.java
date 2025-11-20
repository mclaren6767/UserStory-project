import java.util.Scanner;

public class DataRunner {
public static void main(String[] args) {

  UserStory songs = new UserStory("year.txt","song.txt", "artist.txt","streams.txt","winner.txt", "genre.txt");
// Prints out the list based off of the dataset
  System.out.println(songs);

  songs.seeStatistic();
// Prints out the song with the most streams aka the grammy winner
  System.out.println();
  System.out.println(songs.getSongWithMostStream());
  
}
}