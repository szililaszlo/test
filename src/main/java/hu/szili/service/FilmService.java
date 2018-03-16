package hu.szili.service;

import hu.szili.domain.Film;
import hu.szili.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by László on 2018. 03. 12..
 */
@Service
public class FilmService {

    @Autowired
    FilmRepository filmRepository;

    public List<Film> allFilm(){
        return filmRepository.findAll();
    }

    public Film updateFilm(int id, Film film){
        Film oldfilm = filmRepository.findById(id);
        oldfilm.setCim(film.getCim());
        oldfilm.setHossz(film.getHossz());
        return filmRepository.save(oldfilm);
    }

    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }

    public Iterable<Film> saveAllFilm(Iterable<Film> films) {
        return filmRepository.saveAll(films);
    }

    public Film addVetites(int id, Film film) {
        Film oldFilm = filmRepository.findById(id);
        oldFilm.setVetitesek(film.getVetitesek());
        return filmRepository.save(oldFilm);
    }

}
