/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.distribuidas.elecciones.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Pancho
 */
@Embeddable
public class PreguntaRespuestaPK implements Serializable {
    
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_CANDIDATO", nullable = false, length = 10)
    private String codigoCandidato;
   
    @NotNull
    @Column(name = "SEC_PREGUNTA", nullable = false)
    private Integer secuencialPregunta;

    public PreguntaRespuestaPK() {
    }    

    public String getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(String codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }

    public Integer getSecuencialPregunta() {
        return secuencialPregunta;
    }

    public void setSecuencialPregunta(Integer secuencialPregunta) {
        this.secuencialPregunta = secuencialPregunta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoCandidato != null ? codigoCandidato.hashCode() : 0);
        hash += (int) secuencialPregunta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreguntaRespuestaPK)) {
            return false;
        }
        PreguntaRespuestaPK other = (PreguntaRespuestaPK) object;
        if ((this.codigoCandidato == null && other.codigoCandidato != null) || (this.codigoCandidato != null && !this.codigoCandidato.equals(other.codigoCandidato))) {
            return false;
        }
        if (this.secuencialPregunta != other.secuencialPregunta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.elecciones.modelo.PreguntaRepuestaPK[ codCandidato=" + codigoCandidato + ", secPregunta=" + secuencialPregunta + " ]";
    }

}
