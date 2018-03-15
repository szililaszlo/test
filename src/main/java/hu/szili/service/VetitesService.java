package hu.szili.service;

import hu.szili.domain.Vetites;
import hu.szili.repository.VetitesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by László on 2018. 03. 14..
 */
@Service
public class VetitesService {

    @Autowired
    VetitesRepository vetitesRepository;

    public Vetites save(Vetites vetites) {
        return vetitesRepository.save(vetites);
    }

    public Iterable<Vetites> getAll() {

        Iterable<Vetites> vetitesek = vetitesRepository.findAll();
        /*for(Vetites p: vetitesek)
            p.
*/
        return vetitesek;
    }
}
