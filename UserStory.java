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
    String[] streams = FileReader.toStringArray(streamsFile);
    String[] grammyWinner = FileReader.toStringArray(grammyWinnerFile);
    String[] genres = FileReader.toStringArray(genreFile);
    song[] songArray = new song[years.length];

    for (int i = 0; i<years.length; i++){
      songArray[i] = new song(years[i], songs[i], artists[i], streams[i], grammyWinner[i], genres[i]);
    }
    return songArray;
  }

  public song getSongWithMostStream() {
    // 1. Set a song to be the max
    song max = songList[0];
    // 2. Traverse the songList

    // 3. Get the streams of the current song

    // 4. Compare the streams of the current song to the streams of the max

    // 5. Check the current streams is bigger than the max

    // 6. If true, set the max to be the current song

    // 7. Return the max
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
