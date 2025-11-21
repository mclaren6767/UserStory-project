import java.util.Scanner;

public class UserStory {

  private song[] songList;

  public UserStory (String yearsFile, String songFile, String artistFile, String streamsFile, String grammyWinnerFile, String genreFile){
    this.songList = createSongs(yearsFile, songFile, artistFile, streamsFile, grammyWinnerFile, genreFile);
  }
// Prints out the file using a toString
  public song[] createSongs(String yearsFile, String songFile, String artistFile, String streamsFile, String grammyWinnerFile, String genreFile){
    int[] years = FileReader.toIntArray(yearsFile);
    String[] songs = FileReader.toStringArray(songFile);
    String[] artists = FileReader.toStringArray(artistFile);
    double[] streams = FileReader.toDoubleArray(streamsFile);
    String[] grammyWinner = FileReader.toStringArray(grammyWinnerFile);
    String[] genres = FileReader.toStringArray(genreFile);
    song[] songArray = new song[years.length];

    for (int i = 0; i<years.length; i++){
      songArray[i] = new song(years[i], songs[i], artists[i], streams[i], grammyWinner[i], genres[i]);
    }
    return songArray;
  }
// Finds the max and returns the grammy winner prediciton based off of the max streams
  public song getSongWithMostStream() {
    
    song max = songList[0];
    for (song value : songList){
      if (value.getStreams() > max.getStreams()){
        max=value;
      }
    }
    return max;
    
  }

// User interaction that allows user to access either streams or genres.
  public void seeStatistic(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Which data column do you want to see?\n\n1) Streams\n2) Genres\n\nChoose a number 1-2: ");
    int input = scanner.nextInt();
    System.out.println();

    if (input == 1){
      for (song value : songList){
        System.out.println(value.getStreams());
      }
    }

    if (input == 2){
      for (song value : songList){
        System.out.println(value.getGenres());
      }
    }
  }
// ToString that returns the song value within the songList.
  public String toString(){
    String result = "";

    for (song value : songList){
      result+= value+  "\n";
    }

    return result;
  }

}
