/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.dao;

import com.persist.common.dao.DefaultGenericDAOImple;
import ec.edu.espe.distribuidas.elecciones.modelo.GaleriaCandidato;
import ec.edu.espe.distribuidas.elecciones.modelo.Sede;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author PabloA
 */

@LocalBean
@Stateless
public class GaleriaCandidatoDAO extends DefaultGenericDAOImple<GaleriaCandidato, String>{

    public GaleriaCandidatoDAO() {
        super(GaleriaCandidato.class);
    }
    
}
