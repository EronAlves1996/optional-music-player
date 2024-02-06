package com.eronalve;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App {

  private static class Song {
    String title;
    String artist;
    String genre;

    public boolean isOfGenre(String genre) {
      return Optional.ofNullable(this.genre)
          .map(g -> g.equals(genre))
          .orElse(false);
    }
  }

  private static class Playlist {
    String name;
    List<Song> songs;

    List<Song> filterForGenre(String genre) {
      Function<List<Song>, Stream<Song>> toStream = List::stream;

      return Optional.ofNullable(songs)
          .map(toStream
              .andThen(s -> s
                  .filter(song -> song.isOfGenre(genre))
                  .collect(Collectors.toList())))
          .orElse(Collections.emptyList());
    }
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
