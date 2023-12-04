package de.ait.homework54;

import java.util.ArrayList;

public class MusicLibrary {
    private String name;
    private String artist;
    private MusicGenre musicGenre;

    static ArrayList<MusicLibrary> listofMusikLibrary = new ArrayList<>();

    public MusicLibrary(String name, String artist, MusicGenre musicGenre) {
        this.name = name;
        this.artist = artist;
        this.musicGenre = musicGenre;
        listofMusikLibrary.add(this);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public MusicGenre getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(MusicGenre musicGenre) {
        this.musicGenre = musicGenre;
    }

    @Override
    public String toString() {
        return " [" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", musicGenre=" + musicGenre +
                ']';
    }

   static public String getAlbumsByGenre(MusicGenre findMusicGenre){
        String furReturn="";
        for (MusicLibrary music:listofMusikLibrary){
            if(findMusicGenre.name().equals(music.getMusicGenre().name())){
                furReturn= furReturn + music.toString();
            }}
       System.out.println(furReturn);
            if (furReturn.equals("")){
                System.out.println("Не найден альбом жанра "+findMusicGenre.name());
                return null;
            }
            System.out.println(furReturn);
            return furReturn;
    }


}
