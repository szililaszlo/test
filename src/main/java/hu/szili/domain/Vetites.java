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
    @JoinColumn(name = "film_id",nullable=false)
    private Integer filmId;
    private String kezdes;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Film> filmek = new HashSet<>();

    private Vetites() {

    }

    public Vetites(Integer filmId, String kezdes) {
        this.filmId = filmId;
        this.kezdes = kezdes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getKezdes() {
        return kezdes;
    }

    public void setKezdes(String kezdes) {
        this.kezdes = kezdes;
    }
}
