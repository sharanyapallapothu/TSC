package com.nagra.microservice.demo;

import jakarta.persistence.*;


@Entity
@Table(name = "tv_show")
public class TVShow {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TV_SHOW_ID")
    private long TV_SHOW_ID;


    //private Long tvShowId;

    @Column(name = "title")
    private String title;

  @Column(name="synopsis")
    private String synopsis;

    @Column(name = "release_year")
    private String RELEASE_YEAR;

    // Getters and setters


    public long getTvShowId() {
        return TV_SHOW_ID;
    }

    public void setTvShowId(long TV_SHOW_ID) {
        this.TV_SHOW_ID= TV_SHOW_ID;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getSynopsis() {

        return synopsis;
    }

    public void setSynopsis(String synopsis) {

        this.synopsis = synopsis;
    }

    public String getReleaseYear() {

        return RELEASE_YEAR;
    }

    public void setReleaseYear(String releaseYear) {

        this.RELEASE_YEAR = releaseYear;
    }
}

