/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.safe.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nacho
 */
@Entity
@Table(name = "SSF_FICHAMEDICAATENCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SsfFichamedicaatencion.findAll", query = "SELECT s FROM SsfFichamedicaatencion s")
    , @NamedQuery(name = "SsfFichamedicaatencion.findById", query = "SELECT s FROM SsfFichamedicaatencion s WHERE s.id = :id")})
public class SsfFichamedicaatencion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;

    public SsfFichamedicaatencion() {
    }

    public SsfFichamedicaatencion(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SsfFichamedicaatencion)) {
            return false;
        }
        SsfFichamedicaatencion other = (SsfFichamedicaatencion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.safe.entity.SsfFichamedicaatencion[ id=" + id + " ]";
    }
    
}
