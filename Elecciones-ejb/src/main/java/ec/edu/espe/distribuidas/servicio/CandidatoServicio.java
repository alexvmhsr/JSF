/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.servicio;

import ec.edu.espe.distribuidas.dao.ex.Order;
import ec.edu.espe.distribuidas.dao.CandidatoDAO;
import ec.edu.espe.distribuidas.elecciones.modelo.Candidato;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author PabloA
 */

@LocalBean
@Stateless
public class CandidatoServicio {

    @EJB
    private CandidatoDAO candidatoDao;
    
    public List<Candidato> buscarPorSedeTipo(String codigoSede,String codigoTipo) {
    
        Candidato candidato = new Candidato();
        candidato.setCodigoSede(codigoSede);
        candidato.setTipoCandidato(codigoTipo);
        
        return this.candidatoDao.findO(candidato, Order.ascendente("Nombre"));
    }
    
}
