package com.rodrigorangeldev.springEssentials2.Controller;

import com.rodrigorangeldev.springEssentials2.Domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {

    @GetMapping
    public List<Anime> list(){
        return List.of(new Anime("DBZ"), new Anime("CDZ"));
    }
}
