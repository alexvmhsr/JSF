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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Pancho
 */
@Entity
@Table(name = "colaborador")
public class Colaborador implements Serializable {

    @Id
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "EMAIL", nullable = false, length = 128)
    private String email;

    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "CLAVE", nullable = false, length = 128)
    private String clave;

    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ESTADO", nullable = false, length = 3)
    private String estado;

    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "TIPO", nullable = false, length = 3)
    private String tipo;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;

    @Column(name = "PRIMER_INGRESO", nullable = false)
    private boolean primerIngreso;
    // Es fk, no estoy seguro si van las propiedades
    @Column(name = "COD_CANDIDATO")
    private String codigoCandidato;

    @JoinColumn(name = "COD_CANDIDATO", referencedColumnName = "COD_CANDIDATO", insertable = false, updatable = false)
    @ManyToOne
    private Candidato candidato;
    @Transient
    private String claveOriginal;

    public Colaborador() {
    }

    public Colaborador(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTipoCompleto() {
        String tipoTmp = this.tipo;
        if (tipoTmp.equals("OTR")) {
            tipoTmp = "Colaborador";
        } else if (tipoTmp.equals("CAN")) {
            tipoTmp = "Candidato";
        } else {
            tipoTmp = "Sin Tipo";
        }
        return tipoTmp;
    }

    public String getEstadoCompleto() {
        String estadoTmp = this.estado;
        if (estadoTmp.equals("ACT")) {
            estadoTmp = "Activo";
        } else if (estadoTmp.equals("INA")) {
            estadoTmp = "Inactivo";
        } else if (estadoTmp.equals("CAM")) {
            estadoTmp = "Cambio de clave Pendiente";
        }
        return estadoTmp;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getClaveOriginal() {
        return claveOriginal;
    }

    public void setClaveOriginal(String claveOriginal) {
        this.claveOriginal = claveOriginal;
    }

    public boolean isPrimerIngreso() {
        return primerIngreso;
    }

    public void setPrimerIngreso(boolean primerIngreso) {
        this.primerIngreso = primerIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colaborador)) {
            return false;
        }
        Colaborador other = (Colaborador) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "con email: " + email + " ";
    }

}
