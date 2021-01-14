package de.dumbuya;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

// A program that implements a playlist for songs
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        // Setup Albums
        Album album = new Album("Everyday Life", "Coldplay");
        album.addSong("Sunrise", 2.31);
        album.addSong("Church", 3.50);
        album.addSong("Daddy", 4.58);
        albums.add(album);

        album = new Album("Strut", "Lenny Kravitz");
        album.addSong("The Chamber", 4.57);
        album.addSong("New York City", 6.23);
        album.addSong("Strut", 3.10);
        albums.add(album);

        album = new Album("Rare", "Selena Gomez");
        album.addSong("Boyfriend", 2.41);
        album.addSong("Rare", 3.41);
        album.addSong("She", 2.53);
        albums.add(album);

        // Setup for playlist
        LinkedList<Song> playlist = new LinkedList<>();
        albums.get(0).addToPlayList("Sunrise", playlist);
        albums.get(0).addToPlayList("Boyfriend", playlist);
        albums.get(0).addToPlayList("Daddy", playlist);
        albums.get(1).addToPlayList(1, playlist);
        albums.get(1).addToPlayList(2, playlist);
        albums.get(1).addToPlayList(55, playlist); // No trak
        albums.get(2).addToPlayList(1, playlist);

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;

                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next());
                    } else {
                        System.out.println("Reached end of the playlist.");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("Reached the beginning of the playlist.");
                        goingForward = true;
                    }
                    break;

                case 3:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                            goingForward = false;
                        } else {
                            System.out.println("We are the start of the playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                            goingForward = true;
                        } else {
                            System.out.println("Reached the end of the playlist");
                        }
                    }
                    break;

                case 4:
                    showPlaylist(playlist);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }

        }

    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - Quit the playlist\n" +
                "1 - Skip Forward\n" +
                "2 - Skip Back\n" +
                "3 - Replay Current Song\n" +
                "4 - Show Playlist\n" +
                "5 - Print Menu\n" +
                "6 - Remove song from playlist");
    }

    private static void showPlaylist(LinkedList<Song> playlist) {
        System.out.println("======================================");
        for (Song currentSong : playlist) {
            System.out.println(currentSong.getTitle() + ": " + currentSong.getDuration());
        }
        System.out.println("======================================");
    }
}
