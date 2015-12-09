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
@Table(name = "pregunta_respuesta")

public class PreguntaRespuesta implements Serializable {
    
    @EmbeddedId
    private PreguntaRespuestaPK preguntaRespuestaPK;
    
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "PREGUNTA", nullable = false, length = 500)
    private String pregunta;
    
    @Size(max = 500)
    @Column(name = "RESPUESTA", length = 500)
    private String respuesta;
    
    @Column(name = "MEGUSTA")
    private Integer megusta;
    
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ESTADO", nullable = false, length = 3)
    private String estado;
    //Es fk, no estoy seguro si van las propiedades
    @Column(name = "COD_CANDIDATO")
    private String codigoCandidato;
    
    @JoinColumn(name = "COD_CANDIDATO", referencedColumnName = "COD_CANDIDATO", insertable = false, updatable = false)
    @ManyToOne
    private Candidato candidato;

    public PreguntaRespuesta() {
    }

    public PreguntaRespuesta(PreguntaRespuestaPK preguntaRepuestaPK) {
        this.preguntaRespuestaPK = preguntaRepuestaPK;
    }   

    public PreguntaRespuestaPK getPreguntaRespuestaPK() {
        return preguntaRespuestaPK;
    }

    public void setPreguntaRespuestaPK(PreguntaRespuestaPK preguntaRespuestaPK) {
        this.preguntaRespuestaPK = preguntaRespuestaPK;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Integer getMegusta() {
        return megusta;
    }

    public void setMegusta(Integer megusta) {
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
        hash += (preguntaRespuestaPK != null ? preguntaRespuestaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreguntaRespuesta)) {
            return false;
        }
        PreguntaRespuesta other = (PreguntaRespuesta) object;
        if ((this.preguntaRespuestaPK == null && other.preguntaRespuestaPK != null) || (this.preguntaRespuestaPK != null && !this.preguntaRespuestaPK.equals(other.preguntaRespuestaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.elecciones.modelo.PreguntaRepuesta[ preguntaRepuestaPK=" + preguntaRespuestaPK + " ]";
    }

}
