/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artitraining.mfauz.model;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 14/12/2013
 * @author Sarip
 */

@Entity
@Table(name="MENU")

public class Menu implements Serializable {

    @Id
    @Column(name="ID_MENU",length=50,unique=true)
    private String id;

    @Column(name="PANEL_CLASS",length=100)
    private String panelClass;

    @Column(name="MENU_LEVEL",nullable=false)
    private Integer menuLevel;

    @Column(name="URUTAN",nullable=false)
    private Integer urutan;

    @OneToOne
    @JoinColumn(name="ID_PARENT")
    private Menu parent;

    private transient Set<Menu> childs;

    @Temporal(TemporalType.TIME)
    @Column
    private Date lastUpdate;

    @Column
    private String updateBy;


    public Set<Menu> getChilds() {
        return childs;
    }
    
    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    
    public void setChilds(Set<Menu> childs) {
        this.childs = childs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    public String getPanelClass() {
        return panelClass;
    }

    public void setPanelClass(String panelClass) {
        this.panelClass = panelClass;
    }

    public Menu getParent() {
        return parent;
    }

    public void setParent(Menu parent) {
        this.parent = parent;
    }

    public Integer getUrutan() {
        return urutan;
    }

    public void setUrutan(Integer urutan) {
        this.urutan = urutan;
    }

      public void addChild(Menu m) {
        if(childs==null){
            childs = new TreeSet<Menu>(new Comparator<Menu>() {

                @Override
                public int compare(Menu o1, Menu o2) {
                    return o1.getUrutan().compareTo(o2.getUrutan());
                }
            });
        }
        childs.add(m);
    }

    public void removeChild(Menu m){
        if(childs!=null && !childs.isEmpty()){
            childs.remove(m);
        }
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Menu other = (Menu) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return id;
    }

}
