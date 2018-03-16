package hu.szili.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by László on 2018. 03. 14..
 */
@Entity(name = "vetitesek")
public class Vetites {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //@JoinColumn(name = "film_id",nullable=false)
    //private Integer filmId;
    private String kezdes;

    @ManyToOne
    private Film film;

    private Vetites() {

    }

    public Vetites(String kezdes, Film film) {
        this.kezdes = kezdes;
        this.film = film;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKezdes() {
        return kezdes;
    }

    public void setKezdes(String kezdes) {
        this.kezdes = kezdes;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
