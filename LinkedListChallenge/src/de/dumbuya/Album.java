package de.dumbuya;

import java.util.ArrayList;
import java.util.LinkedList;
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String songName, double duration) {
        if (findSong(songName) == null) {
            songs.add(new Song(songName, duration));
            return true;
        }
        System.out.println("Song is already on album");
        return false;
    }

    private Song findSong(String songName) {
        for (Song findSong : this.songs) {
            if (findSong.getTitle().equals(songName)) {
                return findSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songs.size())) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song findSong = findSong(title);
        if (findSong != null) {
            playList.add(findSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }
}
