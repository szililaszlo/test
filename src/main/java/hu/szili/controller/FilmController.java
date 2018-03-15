package hu.szili.controller;

import hu.szili.domain.Film;
import hu.szili.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by László on 2018. 03. 12..
 */
@RestController
public class FilmController {

    @Autowired
    FilmService filmService;

    @RequestMapping(value = "/filmek",method = RequestMethod.GET)
    public List<Film> films(){
        List<Film> films = new ArrayList<>();
        films = filmService.allFilm();
        return films;
    }

    @RequestMapping(value = "/filmek/{id}",method = RequestMethod.PUT)
    public Film saveFilm(@PathVariable(value = "id") int id, @RequestBody Film film) {
        return filmService.updateFilm(id,film);
    }

    @RequestMapping(value = "/film",method = RequestMethod.POST)
    public Film newFilm(@RequestBody Film film) {
        return filmService.saveFilm(film);
    }

    @RequestMapping(value = "/all",method = RequestMethod.PUT)
    public Iterable<Film> saveAllFilm(@RequestBody Iterable<Film> films){
        return filmService.saveAllFilm(films);
    }



}
