package com.rodrigorangeldev.springEssentials2.Repository;

import com.rodrigorangeldev.springEssentials2.Domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
