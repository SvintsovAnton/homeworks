package de.ait.homework54;

public class MusicLibraryTest {
    public static void main(String[] args) {

        MusicLibrary thriller = new MusicLibrary("Thriller", "Michael Jackson", MusicGenre.POP);
        MusicLibrary darkSide = new MusicLibrary("The Dark Side of the Moon", "Pink Floyd", MusicGenre.ROCK);
        MusicLibrary abbeyRoad = new MusicLibrary("Abbey Road", "The Beatles", MusicGenre.ROCK);

        MusicLibrary.getAlbumsByGenre(MusicGenre.ELECTRONIC);
       // MusicLibrary.listofMusikLibrary.add(thriller);
        //MusicLibrary.listofMusikLibrary.add(darkSide);
        //MusicLibrary.listofMusikLibrary.add(abbeyRoad);

        //System.out.println(MusicLibrary.listofMusikLibrary.size());

       // MusicLibrary.getAlbumsByGenre(MusicGenre.ROCK);

    }

}
