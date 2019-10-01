/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Person;
import entity.Subject;
import entity.Journal;
import interfaces.Saver;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaverToBase implements Saver{
    EntityManager em;
    EntityTransaction tx;

    public SaverToBase() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySchool");
        this.em = emf.createEntityManager();
        this.tx = em.getTransaction();
    }

    @Override
    public void savePersons(List<Person> listPersons) {
        for(Person person : listPersons){
            tx.begin();
                em.persist(person);
            tx.commit();
        }
    }

    @Override
    public void saveSubjects(List<Subject> listSubjects) {
        for(Subject subject : listSubjects){
            tx.begin();
                em.persist(subject);
            tx.commit();
        }
    }

    @Override
    public void saveJournal(List<Journal> listJournal) {
        tx.begin();
        for(Journal journal : listJournal){
            if(journal.getId() == null){
                em.persist(journal);
            }
        }
        tx.commit();
    }

    @Override
    public List<Person> loadListPersons() {
        return em.createQuery("SELECT p FROM Person p")
                .getResultList();
    }

    @Override
    public List<Subject> loadListSubjects() {
        return em.createQuery("SELECT s FROM Subject s")
                .getResultList();
    }

    @Override
    public List<Journal> loadJournal() {
        return em.createQuery("SELECT j FROM Journal j")
                .getResultList();
    }
    
}
