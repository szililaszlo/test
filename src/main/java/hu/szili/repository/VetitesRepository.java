package hu.szili.repository;

import hu.szili.domain.Vetites;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by László on 2018. 03. 14..
 */
@Repository
public interface VetitesRepository extends CrudRepository<Vetites,Integer>{

}
