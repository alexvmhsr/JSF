/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.distribuidas.elecciones.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Pancho
 */
@Entity
@Table(name = "candidato_propuesta")

public class CandidatoPropuesta implements Serializable {
    
    @Id    
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_CANDIDATO", nullable = false, length = 10)
    private String codigo;
   
    @NotNull
    @Size(min = 1, max = 1500)
    @Column(name = "MOTIVACION", nullable = false, length = 1500)
    private String motivacion;
    
    @NotNull
    @Size(min = 1, max = 2000)
    @Column(name = "HISTORIA_ESTUDIOS", nullable = false, length = 2000)
    private String historiaEstudios;
    
    @NotNull
    @Size(min = 1, max = 2500)
    @Column(name = "HISTORIA_LABORAL", nullable = false, length = 2500)
    private String historiaLaboral;
   
    @Size(max = 2000)
    @Column(name = "COMPROMISO", length = 2000)
    private String compromiso;
    
    @Size(max = 1500)
    @Column(name = "TEXTO_LIBRE", length = 1500)
    private String textoLibre;      
    
    @JoinColumn(name = "COD_CANDIDATO", referencedColumnName = "COD_CANDIDATO", insertable = false, updatable = false)
    @OneToOne
    private Candidato candidato;

    public CandidatoPropuesta() {
    }

    public CandidatoPropuesta(String codCandidato) {
        this.codigo = codCandidato;
    }    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMotivacion() {
        return motivacion;
    }

    public void setMotivacion(String motivacion) {
        this.motivacion = motivacion;
    }

    public String getHistoriaEstudios() {
        return historiaEstudios;
    }

    public void setHistoriaEstudios(String historiaEstudios) {
        this.historiaEstudios = historiaEstudios;
    }

    public String getHistoriaLaboral() {
        return historiaLaboral;
    }

    public void setHistoriaLaboral(String historiaLaboral) {
        this.historiaLaboral = historiaLaboral;
    }

    public String getCompromiso() {
        return compromiso;
    }

    public void setCompromiso(String compromiso) {
        this.compromiso = compromiso;
    }

    public String getTextoLibre() {
        return textoLibre;
    }

    public void setTextoLibre(String textoLibre) {
        this.textoLibre = textoLibre;
    }    

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CandidatoPropuesta)) {
            return false;
        }
        CandidatoPropuesta other = (CandidatoPropuesta) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.elecciones.modelo.CandidatoPropuesta[ codCandidato=" + codigo + " ]";
    }

}
