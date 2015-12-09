/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.persist.common.servicio;

import com.persist.common.exception.ValidacionException;
import ec.edu.espe.distribuidas.dao.SedeDAO;
import ec.edu.espe.distribuidas.elecciones.modelo.Sede;
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
public class SedeSevicio {

    @EJB
    private SedeDAO sedeDAO;

    public List<Sede> ObtenerTodas() {
        return this.sedeDAO.findAll();
    }

    public Sede ObtenerporID(String Codigo) {
        return this.sedeDAO.findById(Codigo, false);
    }

    public void CrearSede(Sede sede) throws ValidacionException{
        Sede sedeTmp = this.ObtenerporID(sede.getCodigo());
        if (sedeTmp == null) {
            this.sedeDAO.insert(sedeTmp);
        } else {
            new ValidacionException("El Codigo "+sede.getCodigo()+" ya existe");
        }

    }
    
    public void ActualizarSede (Sede sede){
        this.sedeDAO.update(sede);
    }
    
    public void EliminarSede(String codigoSede){
        try {
            Sede sedeTmp = this.ObtenerporID(codigoSede);
            this.sedeDAO.remove(sedeTmp);
        } catch (Exception e) {
            new ValidacionException("La sede esta asociada a un cadidato");
        }
    }
}
