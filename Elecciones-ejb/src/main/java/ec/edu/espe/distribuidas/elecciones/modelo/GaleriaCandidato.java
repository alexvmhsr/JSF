/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.distribuidas.elecciones.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Pancho
 */
@Entity
@Table(name = "galeria_candidato")

public class GaleriaCandidato implements Serializable {
    
    @EmbeddedId
    private GaleriaCandidatoPK galeriaCandidatoPK;
    
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "URL_IMAGEN", nullable = false, length = 255)
    private String urlImagen;
    
    @Size(max = 500)
    @Column(name = "DESCRIPCION", length = 500)
    private String descripcion;
   
    @Column(name = "MEGUSTA", nullable = false)
    private Integer megusta;
    
    @NotNull
    @Size(max = 3)
    @Column(name = "ESTADO", length = 3)
    private String estado;
    // Es fk, no estoy seguro si van las propiedades
    @Column(name = "COD_CANDIDATO")
    private String codigoCandidato;
    
    @JoinColumn(name = "COD_CANDIDATO", referencedColumnName = "COD_CANDIDATO", insertable = false, updatable = false)
    @ManyToOne
    private Candidato candidato;

    public GaleriaCandidato() {
    }

    public GaleriaCandidato(GaleriaCandidatoPK galeriaCandidatoPK) {
        this.galeriaCandidatoPK = galeriaCandidatoPK;
    }    

    public GaleriaCandidatoPK getGaleriaCandidatoPK() {
        return galeriaCandidatoPK;
    }

    public void setGaleriaCandidatoPK(GaleriaCandidatoPK galeriaCandidatoPK) {
        this.galeriaCandidatoPK = galeriaCandidatoPK;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMegusta() {
        return megusta;
    }

    public void setMegusta(int megusta) {
        this.megusta = megusta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public String getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(String codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }        

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (galeriaCandidatoPK != null ? galeriaCandidatoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GaleriaCandidato)) {
            return false;
        }
        GaleriaCandidato other = (GaleriaCandidato) object;
        if ((this.galeriaCandidatoPK == null && other.galeriaCandidatoPK != null) || (this.galeriaCandidatoPK != null && !this.galeriaCandidatoPK.equals(other.galeriaCandidatoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.elecciones.modelo.GaleriaCandidato[ galeriaCandidatoPK=" + galeriaCandidatoPK + " ]";
    }

}
