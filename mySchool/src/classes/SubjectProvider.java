/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Subject;
import entity.Person;
import java.util.List;
import java.util.Scanner;

public class SubjectProvider {
    public Subject createSubject(List<Person> listPersons){
        Subject subject = new Subject();
        Scanner scanner = new Scanner(System.in);
        System.out.println("------- Создать новый предмет -------");
        System.out.println("Название предмета: ");
        subject.setName(scanner.nextLine());
        System.out.println("Список учителей:");
        for(int i=0;i<listPersons.size();i++){
            if(listPersons.get(i).getStatus() == 2){
                System.out.printf("%d. Имя: %s. Фамилия: %s%n"
                    ,i+1
                    ,listPersons.get(i).getName()
                    ,listPersons.get(i).getLastname()
                    );
            }

        }
        System.out.print("Выберите номер учителя, который будет вести предмет: ");
        int numTeacher = scanner.nextInt();
        subject.setTeacher(listPersons.get(numTeacher-1));
        return subject;
    }
}
    
