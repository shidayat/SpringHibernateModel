
package com.artitraining.mfauz.service;

import com.artitraining.mfauz.model.JenisMutasi;
import com.artitraining.mfauz.model.Menu;
import com.artitraining.mfauz.model.Mutasi;
import com.artitraining.mfauz.model.Nota;
import com.artitraining.mfauz.model.Person;
import com.artitraining.mfauz.model.report.PerOrang;
import java.util.Date;
import java.util.List;
import net.sf.jasperreports.engine.JasperPrint;

/**

 *
 * @author SARIP
 */
public interface AppService {
    
    public String halo(String nama);
     
    public Integer maximumMenuLevel();
    public void saveJual(Mutasi mutasi);
    
    
    public void savePerson(Person person);
    public void deletePerson(Person person);
    public List<Person> findAllPerson();
    public List<Person> findPersonByKode(String kode);
    public List<Person> findPersonListNama(String nama);
    public Person findPersonByNama(String nama);
    public Person findPersonByKodeId(int kode);
       

    public List<Mutasi> findAllMutasi();
    
    
    public void saveMenu(Menu menu);
    public void save(List<Menu> menus);
    public void deleteMenu(Menu m);    
    public void delete(List<Menu> menus);

    public void saveJenisMutasi(JenisMutasi jenisMu);
    public List<JenisMutasi> findJenisMutasi(String jenisMut);
    public List<JenisMutasi> findAllJenisMutasi();
    
    public Date tanggalServer();

    public List<Menu> findAllMenu();
    
    public void saveNota(Nota nota);
    public Nota findNotaAkhir(String jenisTransaksi);
    public List<Nota> findAllNota();
    
    public void saveReceipt(Person person,
                            JenisMutasi jenisMutasi,
                            Mutasi mutasi,
                            Nota nota);
     
    public void savePayment(JenisMutasi jenisMutasi,
                            Mutasi mutasi, 
                            Nota nota
                            );
    public List<PerOrang> repoPerOrang(String nama);

    public JasperPrint getReportPerOrang(String nama);
    public JasperPrint getTrialBalances(int bulan, int tahun);
    
    
}
