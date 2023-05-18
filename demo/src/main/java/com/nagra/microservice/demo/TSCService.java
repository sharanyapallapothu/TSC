package com.nagra.microservice.demo;

import com.nagra.microservice.demo.TVShow;
import com.nagra.microservice.demo.Character;
import com.nagra.microservice.demo.TVShowRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TSCService {
    private final TVShowRepository showRepository;

    public TSCService( TVShowRepository showRepository) {
        this.showRepository = showRepository;
    }

    public List<TVShow> getAllShows() {
        return showRepository.findAll();
    }

    public TVShow getShowById(Long TV_SHOW_ID) {
        return showRepository.findById(TV_SHOW_ID).orElse(null);
    }

    public List<Character> getCharactersByShowId(Long character_id) {
        // Implement logic to fetch characters for a specific show
        // using showRepository or CharacterRepository
        // Return the list of characters
        return null;
    }
}
