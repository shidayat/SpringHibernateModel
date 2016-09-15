/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artitraining.mfauz.model.report;

import java.math.BigDecimal;

/**
 *
 * @author Sarip
 */
public class ReportTrialBalance  {
    private String akunGL;
    private String namaGL;
    private BigDecimal saldoAwalTahun;
    private BigDecimal mutasiTahunIni;
    private BigDecimal saldoAwalBulan;
    private BigDecimal mutasiBulanIni;
    private BigDecimal saldoAkhir;

    public String getAkunGL() {
        return akunGL;
    }

    public void setAkunGL(String akunGL) {
        this.akunGL = akunGL;
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

    public BigDecimal getSaldoAwalBulan() {
        return saldoAwalBulan;
    }

    public void setSaldoAwalBulan(BigDecimal saldoAwalBulan) {
        this.saldoAwalBulan = saldoAwalBulan;
    }

}
