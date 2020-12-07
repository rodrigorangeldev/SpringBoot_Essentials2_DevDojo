package com.rodrigorangeldev.springEssentials2.service;

import com.rodrigorangeldev.springEssentials2.Domain.Anime;
import com.rodrigorangeldev.springEssentials2.Exception.BadRequestException;
import com.rodrigorangeldev.springEssentials2.Repository.AnimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService {

//    private static List<Anime> animes;
//
//    static {
//        animes = new ArrayList<>(List.of(new Anime(1L,"DBZ"), new Anime(2L,"CDZ")));
//    }

    private final AnimeRepository animeRepository;


    public List<Anime> listAll(){

        return animeRepository.findAll();
    }

    public List<Anime> findByName(String name){

        return animeRepository.findByName(name);
    }

    public Anime findById(long id){
        return animeRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Anime not found"));
    }

    @Transactional
    public Anime save(String animeName) {

        var anime = new Anime();
            anime.setName(animeName);

        return animeRepository.save(anime);
    }

    public void delete(long id) {

        animeRepository.delete(findById(id));
    }

    public void update(Anime anime) {

        Anime savedAnime = findById(anime.getId());
        savedAnime.setName(anime.getName());
        savedAnime.setId(anime.getId());

        animeRepository.save(savedAnime);



    }
}
