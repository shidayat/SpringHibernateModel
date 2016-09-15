
package com.artitraining.mfauz.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Sarip
 */

@Entity
@Table(name="period")
public class Periode implements Serializable {
    @Id @GeneratedValue
    private Long idPeriod;
    
    @Column(name="thnbulan", unique=true, length=11)
    private String tahunBulan;
    
    @Column(name="tahun", length=9)
    private String tahun;
    
    @Column(name="periodKe", length=2)
    private String periode;
    
    @Column(name="dariTgl", length=30)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dariTgl;
    
    @Column(name="sampaiTgl", length=30)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date sampaiTgl;
    
    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public Date getDariTgl() {
        return dariTgl;
    }

    public void setDariTgl(Date dariTgl) {
        this.dariTgl = dariTgl;
    }

    public Date getSampaiTgl() {
        return sampaiTgl;
    }

    public void setSampaiTgl(Date sampaiTgl) {
        this.sampaiTgl = sampaiTgl;
    }

    public Long getIdPeriod() {
        return idPeriod;
    }

    public void setIdPeriod(Long idPeriod) {
        this.idPeriod = idPeriod;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public String getTahunBulan() {
        return tahunBulan;
    }

    public void setTahunBulan(String tahunBulan) {
        this.tahunBulan = tahunBulan;
    }
    
}
