/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artitraining.mfauz.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 *
 * @author Sarip
 * 17/12/2013
 */
@Entity
@Table(name="PENGGUNA")
public class Pengguna implements Serializable {
    @Id
    @Column(name="ID_PENGGUNA",length=30,unique=true)
    private String id;

    @Column(name="NAMA_LENGKAP",length=100)
    private String namaLengkap;
    
@LazyCollection(LazyCollectionOption.FALSE)
    @ManyToMany(mappedBy="penggunas",cascade=CascadeType.ALL)
    private List<Peran> listPerans;

    @Column(name="KATA_SANDI",length=100,nullable=false)
    private String kataSandi;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date lastUpdate;
    @Column
    private String updateBy;

    //bagaimana menyambungkan pengguna dgn menu

    public List<Peran> getListPerans() {
        return listPerans;
    }

    public void setListPerans(List<Peran> listPerans) {
        this.listPerans = listPerans;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKataSandi() {
        return kataSandi;
    }

    public void setKataSandi(String kataSandi) {
        this.kataSandi = kataSandi;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
    
}
