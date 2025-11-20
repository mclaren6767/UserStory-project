import java.util.Scanner;

public class DataRunner {
public static void main(String[] args) {

  UserStory songs = new UserStory("year.txt","song.txt", "artist.txt","streams.txt","winner.txt",   "genre.txt");

  System.out.println(songs);

  songs.seeStatistic();
  
}
}