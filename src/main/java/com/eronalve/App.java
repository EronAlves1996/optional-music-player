package com.eronalve;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

  private static class Song {
    String title;
    String artist;
    String genre;
  }

  private static class Playlist {
    String name;
    List<Song> songs;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
