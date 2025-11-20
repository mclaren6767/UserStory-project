import java.util.Scanner;

public class UserStory {

  private song[] songList;

  public UserStory (String yearsFile, String songFile, String artistFile, String streamsFile, String grammyWinnerFile, String genreFile){
    this.songList = createSongs(yearsFile, songFile, artistFile, streamsFile, grammyWinnerFile, genreFile);
  }

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

  public double getSongWithMostStream() {
    // 1. Set a song to be the max
    double max = songList[0].getStreams();

    for (song value : songList){
      if (value.getStreams()>max){
        max = value.getStreams();
      }
    }
    return max;
  }


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

  public String toString(){
    String result = "";

    for (song value : songList){
      result+= value+  "\n";
    }

    return result;
  }

}
