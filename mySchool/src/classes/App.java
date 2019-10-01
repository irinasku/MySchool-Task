/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Journal;
import entity.Person;
import entity.Subject;
import interfaces.Saver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private List<Person> listPersons = new ArrayList<>();
    private List<Subject> listSubjects = new ArrayList<>();
    private List<Journal> listJournal = new ArrayList<>();
    private Saver saver = new SaverToBase();
    
    PersonProvider personProvider = new PersonProvider();
    SubjectProvider subjectProvider = new SubjectProvider();
    JournalProvider journalProvider = new JournalProvider();
    
    public App(){
        
    listPersons.addAll(saver.loadListPersons());
    listSubjects.addAll(saver.loadListSubjects());
    listJournal.addAll(saver.loadJournal());
    }
    public void run(){
        Scanner scanner = new Scanner(System.in);
        String operation = "0";
        boolean badOperation;
        
        
        do{
            do{
                System.out.println("Выберите операцию:");
                System.out.println("0. Выход");
                System.out.println("1. Добавить студента");
                System.out.println("2. Добавить учителя");
                System.out.println("3. Добавить предмет");
                System.out.println("4. Поставить оценку");
                System.out.println("5. Изменить оценку");
                System.out.println("6. Список студентов");
                System.out.println("7. Список предметов");
                System.out.println("8. Журнал");
                
                badOperation = false;
                operation = scanner.next();
                switch (operation) {
                    case "0":
                        badOperation = false;
                        break;
                    case "1":
                        Person student = personProvider.createStudent();
                        if(student == null){
                            System.out.println("Записать студента не удалось.");
                        }else{
                            listPersons.add(student);
                            saver.savePersons(listPersons);
                            System.out.println("Студент записан.");
                        }
                        break;
                    case "2":
                        Person teacher = personProvider.createTeacher();
                        if(teacher == null){
                            System.out.println("Записать учителя не удалось.");
                        }else{
                            listPersons.add(teacher);
                            saver.savePersons(listPersons);
                            System.out.println("Учитель записан.");
                        }
                        break;
                    case "3":
                        Subject subject = subjectProvider.createSubject(listPersons);
                        if(subject == null){
                            System.out.println("Предмет добавить не удалось.");
                        }else{
                            listSubjects.add(subject);
                            saver.saveSubjects(listSubjects);
                            System.out.println("Предмет добавлен.");
                        }
                        break; 
                    case "4":
                        Journal grade = journalProvider.createGrade(listPersons, listSubjects);
                        if(grade == null){
                            System.out.println("Не удалось поставить оценку.");
                        }else{
                            listJournal.add(grade);
                            saver.saveJournal(listJournal);
                            System.out.println("Оценка выставлена.");
                        }
                        break; 
                    case "5":
                        journalProvider.changeGrade(listJournal);
                        saver.saveJournal(listJournal);
                        break;
                    case "6":
                        System.out.println("---- Список студентов ----");
                        for(Person p : listPersons){
                            if(p.getStatus() == 1){
                                System.out.println(p.toString());
                            }
                        }
                        break;
                    case "7":
                        System.out.println("---- Список предметов ----");
                        for(Subject s : listSubjects){
                            System.out.println(s.toString());
                        }
                        break;
                    case "8":
                        System.out.println("---- Журнал оценок ----");
                        for(Journal j : listJournal){
                            System.out.println(j.toString());
                        }
                        break;
                    default:
                        System.out.println("Неправильная операция!");
                        System.out.println("Выберите правильную операцию");
                        badOperation = true;
                }
            }while(badOperation);
            if(operation.equals("0"))break;
            
        }while(true);
    }
}
