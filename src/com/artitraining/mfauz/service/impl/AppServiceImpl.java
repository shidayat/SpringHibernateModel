
package com.artitraining.mfauz.service.impl;

import com.artitraining.mfauz.model.JenisMutasi;
import com.artitraining.mfauz.model.Menu;
import com.artitraining.mfauz.model.Mutasi;
import com.artitraining.mfauz.model.Nota;
import com.artitraining.mfauz.model.Person;
import com.artitraining.mfauz.model.report.PerOrang;
import com.artitraining.mfauz.service.AppService;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.transform.Transformers;
import org.joda.time.DateTime;

/**
 *
 * @author Sarip
 */

@Service("appService")  //inject otomatis. akan dibuatkan bean baru dari component-scan spring
@Transactional(readOnly=true)
public class AppServiceImpl implements AppService{

    @Autowired private SessionFactory sessionFactory;

      //untuk menampilkan log error pada AppserviceImpl
    private static final Logger log= Logger.getLogger(AppServiceImpl.class);
       
         
   @Override
    public String halo(String nama) {
        log.info("Client :- "+nama+ "- sedang akses ke server");
        return "Halo, "+nama;
    }

    
    @Override
    public Integer maximumMenuLevel(){
        return (Integer) sessionFactory.getCurrentSession()
                .createQuery("select max(menuLevel) from Menu")
                .uniqueResult();
    }
    
    @Transactional(isolation=Isolation.SERIALIZABLE)   
    @Override
    public void saveJenisMutasi(JenisMutasi jenisMu){
         sessionFactory.getCurrentSession()
                .saveOrUpdate(jenisMu);
                        
    }
    
    @Override
    public List<JenisMutasi> findJenisMutasi(String jenisMut){
        return   sessionFactory.getCurrentSession()
                 .createQuery("from JenisMutasi jm"
                 +" WHERE jm.jenisMutasi LIKE :criteria ")
                .setParameter("criteria", "%"+jenisMut+"%")
                .list();
    }
    
    @Override
    public List<JenisMutasi> findAllJenisMutasi(){
      return   sessionFactory.getCurrentSession()
                 .createQuery("from JenisMutasi jm")
                 .list();
    }   
       
    @Transactional(isolation=Isolation.SERIALIZABLE)
    @Override   
    public void saveMenu(Menu menu){
        sessionFactory.getCurrentSession().saveOrUpdate(menu);
    }
    
    @Transactional(isolation=Isolation.SERIALIZABLE)
    @Override   
    public void save(List<Menu> menus){
        for(Menu menu : menus){
            sessionFactory.getCurrentSession().save(menu);
        }
    
    }
        
    @Transactional(isolation=Isolation.SERIALIZABLE)
    @Override   
    public void deleteMenu(Menu m){
    sessionFactory.getCurrentSession().delete(m);
    }
    
    @Transactional(isolation=Isolation.SERIALIZABLE)
    @Override   
    public void delete(List<Menu> menus){
        for(Menu menu : menus){
            sessionFactory.getCurrentSession().delete(menu);
        }
    
    }
     
    @Override
    public List<Menu> findAllMenu(){
       return sessionFactory.getCurrentSession()
             .createQuery("from Menu m")
             .list();
     }
    
    @Transactional(isolation=Isolation.SERIALIZABLE)
    @Override
    public void saveNota(Nota nota) {
         sessionFactory.getCurrentSession().saveOrUpdate(nota);
    }    
    
    @Override
    public Nota findNotaAkhir(String jenisTransaksi) {
          return (Nota) sessionFactory.getCurrentSession()
                .createQuery("from Nota n"
                 + " where n.jenisTrans = :jenisTransaksi" )
                .setParameter("jenisTransaksi", jenisTransaksi)
                .uniqueResult();
    }
    
    
    @Override
    public List<Nota> findAllNota() {
   
     return sessionFactory.getCurrentSession()
         .createQuery("from Nota n ")
             .list();
         
}   

    @Transactional(isolation = Isolation.SERIALIZABLE)
    @Override
    public void saveReceipt(Person person,
                            JenisMutasi jenisMutasi,
                            Mutasi mutasi,
                            Nota nota
                            ){
           sessionFactory.getCurrentSession()
                   .saveOrUpdate(person);
           sessionFactory.getCurrentSession()
                   .saveOrUpdate(jenisMutasi);
           sessionFactory.getCurrentSession()
                   .saveOrUpdate(mutasi);
           sessionFactory.getCurrentSession()
                   .update(nota);
    }
    
    @Transactional(isolation = Isolation.SERIALIZABLE)
    @Override   
    public void savePayment(JenisMutasi jenisMutasi,
                            Mutasi mutasi,
                            Nota nota
                            ){
           sessionFactory.getCurrentSession()
                   .saveOrUpdate(jenisMutasi);
           sessionFactory.getCurrentSession()
                   .saveOrUpdate(mutasi);
           sessionFactory.getCurrentSession()
                   .update(nota);        
    }
    
    @Override
    public Date tanggalServer(){
        return new Date();    
    }
    
    @Transactional(isolation=Isolation.SERIALIZABLE)
    @Override
    public void saveJual(Mutasi mutasistok) {
        sessionFactory.getCurrentSession().saveOrUpdate(mutasistok);
    }
    
 
    @Override
    public List<Mutasi> findAllMutasi() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Mutasi mu ")
                .list();
    }
    
    @Transactional(isolation=Isolation.SERIALIZABLE)
    @Override
    public void savePerson(Person person) {
        sessionFactory.getCurrentSession().saveOrUpdate(person);
    }
    @Transactional(isolation=Isolation.SERIALIZABLE)
    @Override
    public void deletePerson(Person person) {
        sessionFactory.getCurrentSession().delete(person);
    }

    @Override
    public List<Person> findAllPerson() {
            return sessionFactory.getCurrentSession()
                .createQuery("from Person person")
                .list();
    }

    @Override
    public Person findPersonByNama(String nama) {
        return (Person) sessionFactory
                .getCurrentSession()
                .createQuery("from Person p "
                + "where p.nama = :criteria " //titik dua harus nempel ke criteria
                ) 
                .setParameter("criteria", nama)
                .uniqueResult();
    }

    @Override
    public List<Person> findPersonByKode(String kode) {
       return  sessionFactory
                .getCurrentSession()
                .createQuery("from Person p "
                + " where p.personId like :criteria" 
                + " order by p.personId asc")
                .setParameter("criteria", "%" +kode+ "%")
                .list();
    }

    @Override
    public List<Person> findPersonListNama(String nama) {
        return  sessionFactory
                .getCurrentSession()
                .createQuery("from Person p "
                + " where p.nama like :criteria" 
                + " order by p.nama asc")
                .setParameter("criteria", "%" +nama+ "%")
                .list();
    }
    
    
    //untuk solusi HibernateLazyInitializeException
//    @Override
//    public Peran berdasarId(String id){
//        Peran peran = (Peran) sessionFactory.getCurrentSession().get(Peran.class, id);
////        Hibernate.initialize(peran.getMenus());
////        Hibernate.initialize(peran.getPenggunas());
//        return peran;
//    }
    
    @Override
    public List<PerOrang> repoPerOrang(String nama){
         String hql  = " select " ;
               hql += " p.personId as Id, ";
               hql += " p.nama as nama, ";
               hql += " p.komitmen as komitmen, ";
               hql += " p.tanggalKomitmen as tanggalAwal, ";
               hql += " p.komitmenTahunIni as komitmenTahunIni, ";
               hql += " p.pembayaranTahunIni as pembayaranTahunIni, ";
               
               hql += " m.tanggal as tanggal,";
               hql += " m.terimaRp as setorRp ";
               hql += " FROM Person p, Mutasi m  ";                   
               hql += " WHERE  p.personId = m.personId_personId AND m.jenisMutasiId.namaMutasi ='ILTIZAMAT' ";
               hql += " ORDER BY m.tanggal, m.nota ";
          
        return  sessionFactory.getCurrentSession()
            .createQuery(hql)
            .setResultTransformer(Transformers.aliasToBean(PerOrang.class))                
            .setParameter("nama", nama)
            .list();       
    
    }
    
    @Override
    public JasperPrint getReportPerOrang(String nama){
     
   try{
          List<PerOrang> lisPer = repoPerOrang(nama);  
          InputStream inputStream = AppServiceImpl.class.getResourceAsStream("/reports/"
                     + "PerOr.jasper");
            Map<String, Object> mapi = new HashMap<String, Object>();
                    mapi.put("nama", nama); 
            return JasperFillManager.fillReport(inputStream, mapi, 
                    new JRBeanCollectionDataSource(lisPer));
            
       }catch(JRException ex){
//           ex.printStackTrace();
            log.error("error generate Per Orang", ex);
          return null;            
       }

    }    

    @Override
    public JasperPrint getTrialBalances(int bulan, int tahun) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person findPersonByKodeId(int kode) {
           return  (Person) sessionFactory
                .getCurrentSession()
                .createQuery("from Person p "
                + " where p.personId = :criteria" 
                )
                .setParameter("criteria", kode)
                .uniqueResult();
    }

  
    
    
}
