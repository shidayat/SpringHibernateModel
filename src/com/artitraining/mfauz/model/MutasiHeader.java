package com.artitraining.mfauz.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.Cascade;


/**
 *
 * @author Sarip
 */
@Entity
@Table
public class MutasiHeader implements Serializable {
 
    @Id @GeneratedValue
    private int id;
    
    @ManyToOne 
    @JoinColumn(name="PersonID", nullable=false)
    private Person personId;

    @OneToMany(mappedBy = "mutasiHeaderID", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<MutasiDetail> listMutasiDetail;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="Tanggal")
    private Date tanggal;
    
    @Column(name="YYYYMMLapor")
    private String yyyyMMLapor;
    
    private BigDecimal totalTerimaRp;

    public List<MutasiDetail> getListMutasiDetail() {
        return listMutasiDetail;
    }

    public void setListMutasiDetail(List<MutasiDetail> listMutasiDetail) {
        this.listMutasiDetail = listMutasiDetail;
    }

    public BigDecimal getTotalTerimaRp() {
        return totalTerimaRp;
    }

    public void setTotalTerimaRp(BigDecimal totalTerimaRp) {
        this.totalTerimaRp = totalTerimaRp;
    }

    public String getYyyyMMLapor() {
        return yyyyMMLapor;
    }

    public void setYyyyMMLapor(String yyyyMMLapor) {
        this.yyyyMMLapor = yyyyMMLapor;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }


}
