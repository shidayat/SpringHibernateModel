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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 *
 * @author Sarip
 * 17/12/2013
 */

@Entity
@Table(name="PERAN")
public class Peran implements Serializable {

    @Id
    @Column(name="ID_PERAN",length=50)  
    private String Id;

    @Column(name="DESKRIPSI_PERAN")
    private String deskripsi;

    @LazyCollection(LazyCollectionOption.FALSE)
    @ManyToMany(cascade=CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE_ORPHAN)
    @JoinTable(name="PERAN_PENGGUNA",joinColumns={@JoinColumn(name="ID_PERAN",nullable=false)},
    inverseJoinColumns={@JoinColumn(name="ID_PENGGUNA",nullable=false)})
    private List<Pengguna> penggunas;
    
@LazyCollection(LazyCollectionOption.FALSE)
    @ManyToMany(cascade=CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE_ORPHAN)
    @JoinTable(name="PERAN_MENU",joinColumns={@JoinColumn(name="ID_PERAN",nullable=false)},
    inverseJoinColumns={@JoinColumn(name="ID_MENU",nullable=false)})
    private List<Menu> menus;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date lastUpdate;
    @Column
    private String updateBy;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public List<Pengguna> getPenggunas() {
        return penggunas;
    }

    public void setPenggunas(List<Pengguna> penggunas) {
        this.penggunas = penggunas;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
 
    
}
