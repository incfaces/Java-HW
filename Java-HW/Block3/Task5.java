package Block3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 5. Определить структуру объекта Employee (сотрудник), хранящий информацию: фамилия, имя, должность, зарплата.
 * Разработать программу, которая хранит информацию обо всех сотрудниках фирмы/ Реализовать:
 * --  заполнение контейнера данными с клавиатуры;
 * --  вывод информации о сотрудниках на экран;
 * --  поиск сотрудников, состоящих на заданной должности;
 * --  сортировку списка сотрудников по полю фамилия и по полю зарплата.﻿
 * Разработать программу, демонстрирующую работу с созданным классом и проверяющую корректность работы класса Employee
 *
 * BBB,SSS,QA,120
 BBB,WWW,QA,119
 FFF,GGG,QA,300
 TTT,GGG,QA,250

 Employee{firstName='BBB', lastName='WWW', position='QA', salary=119}
 Employee{firstName='BBB', lastName='SSS', position='QA', salary=120}
 Employee{firstName='FFF', lastName='GGG', position='QA', salary=300}
 Employee{firstName='TTT', lastName='GGG', position='QA', salary=250}
 */

public class Task5 {
   public static List<Employee> findPos(List<Employee> list, String pos){
       List<Employee> list2 = new ArrayList<>();
       for (int i=0; i<list.size(); i++){
           if (list.get(i).position.equals(pos)){
               list2.add(list.get(i));
           }
       }
       return list2;
   }
    static List<Employee> list = new ArrayList<>();

    public static void main(String[] args) {

        list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значения через запятую:");
        while (true) {
            String str = scan.nextLine();
            if (str.equals("exit")) {
                break;
            }
            if (str.equals("sort")){
                Collections.sort(list, new EmployeeComparator());
                break;
            }
            if (str.equals("find")){
                System.out.println("Введите должность");
                String str2 = scan.nextLine();
                List<Employee> list2 = findPos(list, str2);
                for (int i=0; i<list2.size(); i++){
                    System.out.println(list2.get(i));
                }
                System.out.println("_______________");
                break;
            }
            String[] values = str.split(",");
            Employee employee = new Employee();
            employee.firstName = values[0];
            employee.lastName = values[1];
            employee.position = values[2];
            employee.salary = Integer.valueOf(values[3]);
            list.add(employee);
        }

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }



}
class Employee {
    public String firstName;
    public String lastName;
    public String position;
    public int salary;


    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int x = o1.firstName.compareTo(o2.firstName);
        if (x==0){
            return o1.salary - o2.salary;
        }
        return x;
    }
}
