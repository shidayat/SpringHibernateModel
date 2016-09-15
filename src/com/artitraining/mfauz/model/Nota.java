
package com.artitraining.mfauz.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 *_
 * @author Sarip
 */

@Entity
@Table(name="nota")
public class Nota implements Serializable {
    @Id @GeneratedValue
    private int id;
    @Column(name="kodetetap", length=15)        
    private String kodeTetap;
    
    private String polaTgl;
    
    private Integer lastnumber;
    
    private Integer banyakDigit;
    
    @Column(name="nota_jadi", length=30)      
    private String notajadi;
    
    @Column(name="transaksi", length=60)
    private String jenisTrans;

    public String getJenisTrans() {
        return jenisTrans;
    }

    public void setJenisTrans(String jenisTrans) {
        this.jenisTrans = jenisTrans;
    }

    public String getPolaTgl() {
        return polaTgl;
    }

    public void setPolaTgl(String polaTgl) {
        this.polaTgl = polaTgl;
    }

    public String getKodeTetap() {
        return kodeTetap;
    }

    public void setKodeTetap(String kodetetap) {
        this.kodeTetap = kodetetap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getLastnumber() {
        return lastnumber;
    }

    public void setLastnumber(Integer lastnumber) {
        this.lastnumber = lastnumber;
    }

    public Integer getBanyakDigit() {
        return banyakDigit;
    }

    public void setBanyakDigit(Integer banyakDigit) {
        this.banyakDigit = banyakDigit;
    }

    public String getNotajadi() {
        return notajadi;
    }

    public void setNotajadi(String notajadi) {
        this.notajadi = notajadi;
    }
}
