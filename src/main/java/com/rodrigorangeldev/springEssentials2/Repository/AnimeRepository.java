package com.rodrigorangeldev.springEssentials2.Repository;

import com.rodrigorangeldev.springEssentials2.Domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimeRepository extends JpaRepository<Anime, Long> {

    public List<Anime> findByName(String name);
}
