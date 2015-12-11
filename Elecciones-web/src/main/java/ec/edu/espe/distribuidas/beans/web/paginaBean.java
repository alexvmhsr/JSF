/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.beans.web;


import ec.edu.espe.distribuidas.elecciones.modelo.Sede;
import ec.edu.espe.distribuidas.servicio.SedeSevicio;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author PabloA
 */
@ManagedBean
@ViewScoped
public class paginaBean {

    /**
     * Creates a new instance of paginaBean
     */
   
     @EJB
    private SedeSevicio servicio;
    
    private List<Sede> listaSede;
            
    /**
     * Ejecuta despues de iniciar la pagina 
     */
    @PostConstruct
    public void inicializar()
    {
        listaSede = servicio.ObtenerTodas();
    }

    public List<Sede> getListaSede() {
        return listaSede;
    }

    public void setListaSede(List<Sede> listaSede) {
        this.listaSede = listaSede;
    }
}
