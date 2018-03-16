package hu.szili.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * Created by László on 2018. 03. 12..
 */
@Entity(name = "filmek")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @NotNull
    String cim;
    @NotNull
    Integer hossz;
    @JsonBackReference
    @OneToMany(mappedBy = "film")
    private Set<Vetites> vetitesek;

    private Film() {

    }

    public Film(@NotNull String cim, @NotNull Integer hossz, Set<Vetites> vetitesek) {
        this.cim = cim;
        this.hossz = hossz;
        this.vetitesek = vetitesek;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public Integer getHossz() {
        return hossz;
    }

    public void setHossz(Integer hossz) {
        this.hossz = hossz;
    }

    public Set<Vetites> getVetitesek() {
        return vetitesek;
    }

    public void setVetitesek(Set<Vetites> vetitesek) {
        this.vetitesek = vetitesek;
    }

    public Film setVetites(Vetites vetites){
       this.vetitesek.add(vetites);
       return this;
    }

}
