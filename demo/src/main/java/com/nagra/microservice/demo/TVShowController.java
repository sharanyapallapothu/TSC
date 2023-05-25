package com.nagra.microservice.demo;

import com.nagra.microservice.demo.Character;
import com.nagra.microservice.demo.TVShow;
import com.nagra.microservice.demo.CharacterRepository;
import com.nagra.microservice.demo.TVShowRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;



@RestController
@RequestMapping("/api/v1/shows")
public class TVShowController {

    @Autowired
    private TVShowRepository tvShowRepository;

    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping
    public List<TVShow> getAllTvShows() {
        return tvShowRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TVShow> getTvShowById(@PathVariable(value = "id") Long ID) {
        Optional<TVShow> optionalTvShow = tvShowRepository.findById(ID);
        if (optionalTvShow.isPresent()) {
            TVShow tvShow = optionalTvShow.get();
            return ResponseEntity.ok().body(tvShow);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}/characters")
    public ResponseEntity<Set<Character>> getCharactersByTvShowId(@PathVariable(value = "id") TVShow ID) {
        Set<Character> characters = new HashSet<>(characterRepository.findByID(ID));
        if (characters.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(characters);


    }

  /* @PostMapping
    public ResponseEntity<TVShow> createTvShow(@RequestBody TVShow tvShow) {
        TVShow createdTvShow = tvShowRepository.save(tvShow);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTvShow);
    }

    @PostMapping("/{tvShowId}/characters")
    public ResponseEntity<Character> createCharacter(
            @PathVariable Long tvShowId,
            @RequestBody Character character
    ) {
        Optional<TVShow> optionalTvShow = tvShowRepository.findById(tvShowId);
        if (optionalTvShow.isPresent()) {
            TVShow tvShow = optionalTvShow.get();
            character.setTvShowId(tvShow); // Set the TV show ID in the character object
            Character createdCharacter = characterRepository.save(character);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdCharacter);
        } else {
            return ResponseEntity.notFound().build();


        }

    }*/
}