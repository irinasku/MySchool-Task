/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Person;
import java.util.Scanner;

public class PersonProvider {
    public Person createStudent(){
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("------- Запись нового студента -------");
        person.setStatus(1);
        System.out.println("Имя студента: ");
        person.setName(scanner.nextLine());
        System.out.println("Фамилия студента: ");
        person.setLastname(scanner.nextLine());
        System.out.println("Введите дату рождения.День");
        person.setBirthday(new Integer(scanner.nextLine()));
        System.out.println("Месяц: ");
        person.setBirthmonth(new Integer(scanner.nextLine()));
        System.out.println("Год: ");
        person.setBirthyear(new Integer(scanner.nextLine()));
        System.out.println("Для подтверждения записи нажмите \"y\"");
        System.out.println("Для отмены записи нажмите любой другой символ");
        String flag = scanner.next();
        if("y".equals(flag)){
            return person;
        }
        return null;
    }
    
    public Person createTeacher(){
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("------- Запись нового учителя -------");
        person.setStatus(2);
        System.out.println("Имя учителя: ");
        person.setName(scanner.nextLine());
        System.out.println("Фамилия учителя: ");
        person.setLastname(scanner.nextLine());
        System.out.println("Введите дату рождения.\nДень: ");
        person.setBirthday(new Integer(scanner.nextLine()));
        System.out.println("Месяц: ");
        person.setBirthmonth(new Integer(scanner.nextLine()));
        System.out.println("Год: ");
        person.setBirthyear(new Integer(scanner.nextLine()));
        System.out.println("Для подтверждения нажмите \"y\"");
        System.out.println("Для отмены нажмите любой другой символ");
        String flag = scanner.next();
        if("y".equals(flag)){
            return person;
        }
        return null;
    }
}
