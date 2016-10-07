package datamodels;

/**
 * Created by Kory on 10/7/2016.
 * This may be temporary once I find a suitable api for music
 * so i can make a better data model

 */
public class Song {

    String Name;
    String Artist;

    public Song(String name, String artist) {
        Name = name;
        Artist = artist;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }
}
