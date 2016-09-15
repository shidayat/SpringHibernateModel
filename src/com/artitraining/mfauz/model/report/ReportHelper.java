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

//Perhatikan NAMA field dan Type nya di iReport harus sama dgn variable di class ReportHelper
//yang ini gak di mapping hibernate karena tak perlu dibuat tabel
public class ReportHelper {
    private String namaBarang;
    private BigDecimal qty;
    private String unit;
    private BigDecimal total;
    private String nota;
    private String tanggal;

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
