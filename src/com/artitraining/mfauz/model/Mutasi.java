package com.artitraining.mfauz.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;


/**
 *
 * @author Sarip
 */
@Entity
@Table(name="MUTASI")
public class Mutasi implements Serializable {
 
    @Id @GeneratedValue
    private int id;
    
    @ManyToOne
    private JenisMutasi jenisMutasiId;
    
    @ManyToOne 
    private Person personId;
        
    @Column(name="Keterangan", length=45)
    private String keterangan;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="Tanggal")
    private Date tanggal;

    @Column(name="Nota", length = 15)
    private String nota;
    
    @Column(name="PeriodeLapor")
    private String periodeLapor;
   
    private BigDecimal terimaRp;
    private BigDecimal keluarRp;

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

    public BigDecimal getKeluarRp() {
        return keluarRp;
    }

    public void setKeluarRp(BigDecimal keluarRp) {
        this.keluarRp = keluarRp;
    }

    public JenisMutasi getJenisMutasiId() {
        return jenisMutasiId;
    }

    public void setJenisMutasiId(JenisMutasi jenisMutasiId) {
        this.jenisMutasiId = jenisMutasiId;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getPeriodeLapor() {
        return periodeLapor;
    }

    public void setPeriodeLapor(String periodeLapor) {
        this.periodeLapor = periodeLapor;
    }

}
