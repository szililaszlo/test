package hu.szili.repository;

import hu.szili.domain.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by László on 2018. 03. 12..
 */
@Repository
public interface FilmRepository extends CrudRepository<Film,Integer>{

    public List<Film> findAll();
    public Film findById(int id);
    //public List<Film> saveAll(List<Film> films);

  /*  @Query(value = "select * from story where title = ?1 limit 1", nativeQuery = true)
	@Query(value = "select * from story where title = :title limit 1", nativeQuery = true)
    @Query(value = "select s from Story s where s.title = :title")
    Story findByTitle(@Param("title") String title);
*/
}
