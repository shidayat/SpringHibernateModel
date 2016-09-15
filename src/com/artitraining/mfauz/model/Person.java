
package com.artitraining.mfauz.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="PERSON")
public class Person implements Serializable {
    @Id @GeneratedValue
    private int personId;
    
    @Column(name="Nama", length=30, unique = true)
    private String nama;
    
    @Column(name="status", length = 15)
    private String status;
    
    private BigDecimal komitmen;
    
    @Column(name="TanggalKomitmen")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggalKomitmen;

    @Column(name="TanggalPindah")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggalPindah;
    private BigDecimal komitmenTahunIni;
    private BigDecimal hutangTahunLalu;
    private BigDecimal hutangTahunIni;
    private BigDecimal pembayaranTahunIni;
    
    private BigDecimal totalHutang;
    
    @Column(name="PW_Akses",length=200)
    private String password;
    
   @Column(name="KOTASEKTOR",length=50)
    private String kotaSektor;
    
    public BigDecimal getKomitmenTahunIni() {
        return komitmenTahunIni;
    }

    public void setKomitmenTahunIni(BigDecimal komitmenTahunIni) {
        this.komitmenTahunIni = komitmenTahunIni;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getKomitmen() {
        return komitmen;
    }

    public void setKomitmen(BigDecimal komitmen) {
        this.komitmen = komitmen;
    }

    public Date getTanggalKomitmen() {
        return tanggalKomitmen;
    }

    public void setTanggalKomitmen(Date tanggalKomitmen) {
        this.tanggalKomitmen = tanggalKomitmen;
    }

    public Date getTanggalPindah() {
        return tanggalPindah;
    }

    public void setTanggalPindah(Date tanggalPindah) {
        this.tanggalPindah = tanggalPindah;
    }

    public BigDecimal getHutangTahunLalu() {
        return hutangTahunLalu;
    }

    public void setHutangTahunLalu(BigDecimal hutangTahunLalu) {
        this.hutangTahunLalu = hutangTahunLalu;
    }

    public BigDecimal getHutangTahunIni() {
        return hutangTahunIni;
    }

    public void setHutangTahunIni(BigDecimal hutangTahunIni) {
        this.hutangTahunIni = hutangTahunIni;
    }

    public BigDecimal getPembayaranTahunIni() {
        return pembayaranTahunIni;
    }

    public void setPembayaranTahunIni(BigDecimal pembayaranTahunIni) {
        this.pembayaranTahunIni = pembayaranTahunIni;
    }

    public BigDecimal getTotalHutang() {
        return totalHutang;
    }

    public void setTotalHutang(BigDecimal totalHutang) {
        this.totalHutang = totalHutang;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getKotaSektor() {
        return kotaSektor;
    }

    public void setKotaSektor(String kotaSektor) {
        this.kotaSektor = kotaSektor;
    }

    
}
