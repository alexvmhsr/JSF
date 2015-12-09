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
@Table(name = "comentarios")

public class Comentarios implements Serializable {

    @EmbeddedId
    private ComentariosPK comentariosPK;

    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "TEXTO", nullable = false, length = 500)
    private String texto;

    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ESTADO", nullable = false, length = 3)
    private String estado;

    @JoinColumn(name = "COD_CANDIDATO", referencedColumnName = "COD_CANDIDATO", insertable = false, updatable = false)
    @ManyToOne
    private CandidatoPropuesta candidatoPropuesta;

    public Comentarios() {
    }

    public Comentarios(ComentariosPK comentariosPK) {
        this.comentariosPK = comentariosPK;
    }

    public ComentariosPK getComentariosPK() {
        return comentariosPK;
    }

    public void setComentariosPK(ComentariosPK comentariosPK) {
        this.comentariosPK = comentariosPK;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public CandidatoPropuesta getCandidatoPropuesta() {
        return candidatoPropuesta;
    }

    public void setCandidatoPropuesta(CandidatoPropuesta candidatoPropuesta) {
        this.candidatoPropuesta = candidatoPropuesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comentariosPK != null ? comentariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comentarios)) {
            return false;
        }
        Comentarios other = (Comentarios) object;
        if ((this.comentariosPK == null && other.comentariosPK != null) || (this.comentariosPK != null && !this.comentariosPK.equals(other.comentariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.elecciones.modelo.Comentarios[ comentariosPK=" + comentariosPK + " ]";
    }

}
