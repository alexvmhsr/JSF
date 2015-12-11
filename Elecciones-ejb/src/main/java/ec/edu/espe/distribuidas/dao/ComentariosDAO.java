/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.dao;

import ec.edu.espe.distribuidas.dao.ex.DefaultGenericDAOImple;
import ec.edu.espe.distribuidas.elecciones.modelo.Comentarios;
import ec.edu.espe.distribuidas.elecciones.modelo.Sede;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author PabloA
 */

@LocalBean
@Stateless
public class ComentariosDAO extends DefaultGenericDAOImple<Comentarios, String>{

    public ComentariosDAO() {
        
        super(Comentarios.class);
    }
    
    
}
