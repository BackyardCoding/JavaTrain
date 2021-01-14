package de.dumbuya;

import java.util.ArrayList;
import java.util.LinkedList;
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String songName, double duration) {
        return this.songs.add(new Song(songName,duration));
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song songToAdd = songs.findSong(trackNumber);
        if (songToAdd != null) {
            playlist.add(songToAdd);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song findSong = songs.findSong(title);
        if (findSong != null) {
            playList.add(findSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private static class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String songName) {
            for (Song findSong : this.songs) {
                if (findSong.getTitle().equals(songName)) {
                    return findSong;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index >= 0) && (songs.size() > index)) {
                return songs.get(index);
            }
            return null;
        }

    }
}
