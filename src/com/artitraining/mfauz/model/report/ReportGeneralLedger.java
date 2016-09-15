/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artitraining.mfauz.model.report;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sarip
 */

public class ReportGeneralLedger {
    
    private String akunGL;
    private String namaGL;
    private Date tanggal;
    private String refNo;
    private String keterangan;
    private BigDecimal debit;
    private BigDecimal kredit;
    private BigDecimal saldoAwalTahun; 
    private BigDecimal mutasiTahunIni;
    private BigDecimal mutasiBulanIni;
    private BigDecimal saldoAkhir;
    private BigDecimal mutasiDK;

    public String getAkunGL() {
        return akunGL;
    }

    public void setAkunGL(String akunGL) {
        this.akunGL = akunGL;
    }

    public BigDecimal getDebit() {
        return debit;
    }

    public void setDebit(BigDecimal debit) {
        this.debit = debit;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public BigDecimal getKredit() {
        return kredit;
    }

    public void setKredit(BigDecimal kredit) {
        this.kredit = kredit;
    }

    public BigDecimal getMutasiBulanIni() {
        return mutasiBulanIni;
    }

    public void setMutasiBulanIni(BigDecimal mutasiBulanIni) {
        this.mutasiBulanIni = mutasiBulanIni;
    }

    public BigDecimal getMutasiTahunIni() {
        return mutasiTahunIni;
    }

    public void setMutasiTahunIni(BigDecimal mutasiTahunIni) {
        this.mutasiTahunIni = mutasiTahunIni;
    }

    public String getNamaGL() {
        return namaGL;
    }

    public void setNamaGL(String namaGL) {
        this.namaGL = namaGL;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public BigDecimal getMutasiDK() {
        return mutasiDK;
    }

    public void setMutasiDK(BigDecimal saldo) {
        this.mutasiDK = saldo;
    }

    public BigDecimal getSaldoAkhir() {
        return saldoAkhir;
    }

    public void setSaldoAkhir(BigDecimal saldoAkhir) {
        this.saldoAkhir = saldoAkhir;
    }

    public BigDecimal getSaldoAwalTahun() {
        return saldoAwalTahun;
    }

    public void setSaldoAwalTahun(BigDecimal saldoAwalTahun) {
        this.saldoAwalTahun = saldoAwalTahun;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    
}
