/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Journal;
import entity.Person;
import entity.Subject;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class JournalProvider {
    private Scanner scanner = new Scanner(System.in);
    public Journal createGrade(List<Person> listPersons, List<Subject> listSubjects){
        Journal grade = new Journal();
        System.out.println("------- Поставить оценку -------");
        System.out.println("Список студентов:");
        for(int i=0;i<listPersons.size();i++){
            if(listPersons.get(i).getStatus() == 1){
                System.out.printf("%d. Имя: %s. Фамилия: %s%n"
                        ,i+1
                        ,listPersons.get(i).getName()
                        ,listPersons.get(i).getLastname()
                );
            }
        }
        System.out.println("Список предметов:");
        for(int i=0;i<listSubjects.size();i++){
            System.out.printf("%d. Предмет: %s Учитель: %s %s%n"
                    ,i+1
                    ,listSubjects.get(i).getName()
                    ,listSubjects.get(i).getTeacher().getName()
                    ,listSubjects.get(i).getTeacher().getLastname()
            );
        }
        System.out.print("Выберите номер студента: ");
        int numStudent = scanner.nextInt();
        System.out.print("Выберите номер предмета: ");
        int numSubject = scanner.nextInt();
        grade.setStudent(listPersons.get(numStudent - 1));
        grade.setSubject(listSubjects.get(numSubject - 1));
        System.out.println("Поставьте оценку: ");
        grade.setGrade(new Integer(scanner.nextInt()));
        grade.setDate(new Date());
        return grade;
    }
    
    public void changeGrade(List<Journal> journal){
        System.out.println("------- Исправить оценку -------");
        System.out.println("Журнал оценок:");
        boolean flag = false;
        for(int i=0;i<journal.size();i++){
            System.out.printf("%d. Имя студента: %s %s. Предмет: %s Оценка: %s%n"
                    ,i+1
                    ,journal.get(i).getStudent().getName()
                    ,journal.get(i).getStudent().getLastname()
                    ,journal.get(i).getSubject().getName()
                    ,journal.get(i).getGrade()
            );
            flag = true;
            }
            
        if(flag){
            System.out.print("Выберите номер записи в журнале: ");
            int numGrade = scanner.nextInt();
            System.out.print("Установите новую оценку: ");
            int newGrade = scanner.nextInt();
            journal.get(numGrade - 1).setGrade(newGrade);
            System.out.println("Оценка исправлена");
        }else{
            System.out.println("Оценок нет.");
        }
    }
}
