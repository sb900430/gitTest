/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pack;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author cosmo
 */
@Embeddable
public class FixedValuePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "FIXED_VALUE_ID")
    private String fixedValueId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "FIXED_VALUE_CLASS_ID")
    private String fixedValueClassId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "FIXED_VALUE_CLASS_NAME")
    private String fixedValueClassName;

    public FixedValuePK() {
    }

    public FixedValuePK(String fixedValueId, String fixedValueClassId, String fixedValueClassName) {
        this.fixedValueId = fixedValueId;
        this.fixedValueClassId = fixedValueClassId;
        this.fixedValueClassName = fixedValueClassName;
    }

    public String getFixedValueId() {
        return fixedValueId;
    }

    public void setFixedValueId(String fixedValueId) {
        this.fixedValueId = fixedValueId;
    }

    public String getFixedValueClassId() {
        return fixedValueClassId;
    }

    public void setFixedValueClassId(String fixedValueClassId) {
        this.fixedValueClassId = fixedValueClassId;
    }

    public String getFixedValueClassName() {
        return fixedValueClassName;
    }

    public void setFixedValueClassName(String fixedValueClassName) {
        this.fixedValueClassName = fixedValueClassName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fixedValueId != null ? fixedValueId.hashCode() : 0);
        hash += (fixedValueClassId != null ? fixedValueClassId.hashCode() : 0);
        hash += (fixedValueClassName != null ? fixedValueClassName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FixedValuePK)) {
            return false;
        }
        FixedValuePK other = (FixedValuePK) object;
        if ((this.fixedValueId == null && other.fixedValueId != null) || (this.fixedValueId != null && !this.fixedValueId.equals(other.fixedValueId))) {
            return false;
        }
        if ((this.fixedValueClassId == null && other.fixedValueClassId != null) || (this.fixedValueClassId != null && !this.fixedValueClassId.equals(other.fixedValueClassId))) {
            return false;
        }
        if ((this.fixedValueClassName == null && other.fixedValueClassName != null) || (this.fixedValueClassName != null && !this.fixedValueClassName.equals(other.fixedValueClassName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pack.FixedValuePK[ fixedValueId=" + fixedValueId + ", fixedValueClassId=" + fixedValueClassId + ", fixedValueClassName=" + fixedValueClassName + " ]";
    }
    
}
