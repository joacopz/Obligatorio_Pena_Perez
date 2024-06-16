package uy.edu.um.prog2.Obligatorio;

public class Song {
    public double getTempo;
    private String title;
    private String artist;
    private String country;
    private String date;
    private int rank;
    private double tempo;

    public Song(String title, String artist, String country, String date, int rank, double tempo) {
        this.title = title;
        this.artist = artist;
        this.country = country;
        this.date = date;
        this.rank = rank;
        this.tempo = tempo;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getCountry() {
        return country;
    }

    public String getDate() {
        return date;
    }

    public int getRank() {
        return rank;
    }

    public double getTempo() {
        return tempo;
    }
}
