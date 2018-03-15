package hu.szili.controller;

import hu.szili.domain.Vetites;
import hu.szili.service.VetitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by László on 2018. 03. 14..
 */
@RestController
public class VetitesController {

    @Autowired
    VetitesService vetitesService;

    @RequestMapping(value = "/vetites",method = RequestMethod.POST)
    public Vetites addVetites(@RequestBody Vetites vetites) {
        return vetitesService.save(vetites);
    }
    @RequestMapping(value = "/vetitesek",method = RequestMethod.GET)
    public Iterable<Vetites> getAll(){
        return vetitesService.getAll();
    }
}
