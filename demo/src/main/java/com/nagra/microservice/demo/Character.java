package com.nagra.microservice.demo;



import jakarta.persistence.*;



@Entity
@Table(name = "characters")
public class Character {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "character_id")
    @Id
    private Long character_id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "ID", referencedColumnName = "TV_SHOW_ID")

    //@Column(name = "TV_SHOW_ID")
    private TVShow ID;

    // constructors, getters, and setters

    public Character() {}

    public Character(Long character_id, String name, String description, TVShow ID) {
        this.character_id = character_id;
        this.name = name;
        this.description = description;
        this.ID = ID ;
    }

    public Long getId() {

        return character_id;
    }

    public void setId(Long character_id) {

        this.character_id = character_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public TVShow getTvShowId() {

        return ID;
    }

    public void setTvShowId(TVShow ID) {

        this.ID = ID;
    }
}