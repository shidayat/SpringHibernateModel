package com.artitraining.mfauz.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;


/**
 *
 * @author Sarip
 */
@Entity
@Table
public class MutasiDetail implements Serializable {
 
    @Id @GeneratedValue
    private int id;
    
    @ManyToOne 
    @JoinColumn(name="mutasiHeaderID", nullable=false)
    private MutasiHeader mutasiHeaderID;
        
    @Column(name="Keterangan", length=45)
    private String keterangan;
    
    private BigDecimal terimaRp;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public BigDecimal getTerimaRp() {
        return terimaRp;
    }

    public void setTerimaRp(BigDecimal terimaRp) {
        this.terimaRp = terimaRp;
    }

    public MutasiHeader getMutasiHeaderID() {
        return mutasiHeaderID;
    }

    public void setMutasiHeaderID(MutasiHeader mutasiHeaderID) {
        this.mutasiHeaderID = mutasiHeaderID;
    }

}
