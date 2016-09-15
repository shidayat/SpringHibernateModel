/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artitraining.mfauz.model.report;

import java.math.BigDecimal;


/**
 * 03/05/2014
 * @author S.Hidayat
 */
public class LabaRugi {
    private String subGrupGL;
    private String namaCostCenter;
    private String namaGL;
    private BigDecimal plannedLRBulanIni;
    private BigDecimal plannedLRTahunIni;
    private BigDecimal actualLRBulanIni;
    private BigDecimal actualLRTahunIni;

    public String getNamaGL() {
        return namaGL;
    }

    public void setNamaGL(String namaGL) {
        this.namaGL = namaGL;
    }

    public String getSubGrupGL() {
        return subGrupGL;
    }

    public void setSubGrupGL(String subGrupGL) {
        this.subGrupGL = subGrupGL;
    }


    public String getNamaCostCenter() {
        return namaCostCenter;
    }

    public void setNamaCostCenter(String namaCostCenter) {
        this.namaCostCenter = namaCostCenter;
    }

    public BigDecimal getPlannedLRBulanIni() {
        return plannedLRBulanIni;
    }

    public void setPlannedLRBulanIni(BigDecimal plannedLRBulanIni) {
        this.plannedLRBulanIni = plannedLRBulanIni;
    }

    public BigDecimal getPlannedLRTahunIni() {
        return plannedLRTahunIni;
    }

    public void setPlannedLRTahunIni(BigDecimal plannedLRTahunIni) {
        this.plannedLRTahunIni = plannedLRTahunIni;
    }

    public BigDecimal getActualLRBulanIni() {
        return actualLRBulanIni;
    }

    public void setActualLRBulanIni(BigDecimal actualLRBulanIni) {
        this.actualLRBulanIni = actualLRBulanIni;
    }

    public BigDecimal getActualLRTahunIni() {
        return actualLRTahunIni;
    }

    public void setActualLRTahunIni(BigDecimal actualLRTahunIni) {
        this.actualLRTahunIni = actualLRTahunIni;
    }


}
