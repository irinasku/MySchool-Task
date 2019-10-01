/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Journal;
import entity.Person;
import entity.Subject;
import java.util.List;

public interface Saver {
    public void savePersons(List<Person> listPersons);
    public void saveSubjects(List<Subject> listSubjects);
    public void saveJournal(List<Journal> listJournals);
    public List<Person> loadListPersons();
    public List<Subject> loadListSubjects();
    public List<Journal> loadJournal();
}
