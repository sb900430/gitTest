/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pack;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cosmo
 */
@Entity
@Table(name = "FIXED_VALUE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FixedValue.findAll", query = "SELECT f FROM FixedValue f")
    , @NamedQuery(name = "FixedValue.findByFixedValueId", query = "SELECT f FROM FixedValue f WHERE f.fixedValuePK.fixedValueId = :fixedValueId")
    , @NamedQuery(name = "FixedValue.findByFixedValueName", query = "SELECT f FROM FixedValue f WHERE f.fixedValueName = :fixedValueName")
    , @NamedQuery(name = "FixedValue.findByFixedValueClassId", query = "SELECT f FROM FixedValue f WHERE f.fixedValuePK.fixedValueClassId = :fixedValueClassId")
    , @NamedQuery(name = "FixedValue.findByFixedValueClassName", query = "SELECT f FROM FixedValue f WHERE f.fixedValuePK.fixedValueClassName = :fixedValueClassName")
    , @NamedQuery(name = "FixedValue.findByFixedValueFlag", query = "SELECT f FROM FixedValue f WHERE f.fixedValueFlag = :fixedValueFlag")
    , @NamedQuery(name = "FixedValue.findByStartDate", query = "SELECT f FROM FixedValue f WHERE f.startDate = :startDate")
    , @NamedQuery(name = "FixedValue.findByEndDate", query = "SELECT f FROM FixedValue f WHERE f.endDate = :endDate")
    , @NamedQuery(name = "FixedValue.findByCreateId", query = "SELECT f FROM FixedValue f WHERE f.createId = :createId")
    , @NamedQuery(name = "FixedValue.findByCreateDate", query = "SELECT f FROM FixedValue f WHERE f.createDate = :createDate")
    , @NamedQuery(name = "FixedValue.findByModifyId", query = "SELECT f FROM FixedValue f WHERE f.modifyId = :modifyId")
    , @NamedQuery(name = "FixedValue.findByModifyDate", query = "SELECT f FROM FixedValue f WHERE f.modifyDate = :modifyDate")})
public class FixedValue implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FixedValuePK fixedValuePK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "FIXED_VALUE_NAME")
    private String fixedValueName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "FIXED_VALUE_FLAG")
    private String fixedValueFlag;
    @Column(name = "START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Size(max = 10)
    @Column(name = "CREATE_ID")
    private String createId;
    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Size(max = 10)
    @Column(name = "MODIFY_ID")
    private String modifyId;
    @Column(name = "MODIFY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;

    public FixedValue() {
    }

    public FixedValue(FixedValuePK fixedValuePK) {
        this.fixedValuePK = fixedValuePK;
    }

    public FixedValue(FixedValuePK fixedValuePK, String fixedValueName, String fixedValueFlag) {
        this.fixedValuePK = fixedValuePK;
        this.fixedValueName = fixedValueName;
        this.fixedValueFlag = fixedValueFlag;
    }

    public FixedValue(String fixedValueId, String fixedValueClassId, String fixedValueClassName) {
        this.fixedValuePK = new FixedValuePK(fixedValueId, fixedValueClassId, fixedValueClassName);
    }

    public FixedValuePK getFixedValuePK() {
        return fixedValuePK;
    }

    public void setFixedValuePK(FixedValuePK fixedValuePK) {
        this.fixedValuePK = fixedValuePK;
    }

    public String getFixedValueName() {
        return fixedValueName;
    }

    public void setFixedValueName(String fixedValueName) {
        this.fixedValueName = fixedValueName;
    }

    public String getFixedValueFlag() {
        return fixedValueFlag;
    }

    public void setFixedValueFlag(String fixedValueFlag) {
        this.fixedValueFlag = fixedValueFlag;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getModifyId() {
        return modifyId;
    }

    public void setModifyId(String modifyId) {
        this.modifyId = modifyId;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fixedValuePK != null ? fixedValuePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FixedValue)) {
            return false;
        }
        FixedValue other = (FixedValue) object;
        if ((this.fixedValuePK == null && other.fixedValuePK != null) || (this.fixedValuePK != null && !this.fixedValuePK.equals(other.fixedValuePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pack.FixedValue[ fixedValuePK=" + fixedValuePK + " ]";
    }
    
}
