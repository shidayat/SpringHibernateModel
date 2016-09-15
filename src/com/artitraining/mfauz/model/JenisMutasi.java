/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.artitraining.mfauz.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Sarip
 * 08/09/2016
 */

@Entity
@Table(name="JENISMUTASI")
public class JenisMutasi implements Serializable{
    @Id @GeneratedValue
    private int id;
    
    @Column(name="NAMAMUTASI")
    private String namaMutasi;
    
    @Column(name="PERIODE")
    private String periode;
    @Column(name="TERIMARP")
    private BigDecimal terimaRp;
    @Column(name="KELUARRP")
    private BigDecimal keluarRp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaMutasi() {
        return namaMutasi;
    }

    public void setNamaMutasi(String namaMutasi) {
        this.namaMutasi = namaMutasi;
    }


    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
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

}
