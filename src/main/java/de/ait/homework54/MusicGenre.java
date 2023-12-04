package de.ait.homework54;

public enum MusicGenre {
    POP("Popular and mainstream music"),
    ROCK("Guitar-driven energetic music"),
    JAZZ("Improvised, rhythmic, expressive sounds."),
    CLASSICAL("Orchestral, intricate, timeless compositions."),
    ELECTRONIC("Synthesized beats, futuristic, danceable rhythms."),
    HIPHOP("Urban, rhythmic, lyrical storytelling");

    private final String description;

    MusicGenre(String description){
        this.description= description;
    }

    public String getDescription(){
        return description;
    }

}
