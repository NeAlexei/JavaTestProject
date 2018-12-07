package com.company;
import kinomo.employee.Employee;
import kinomo.manage.Manage;

public class Main {

    public static void main(String[] args) {
        Employee employee01 = new Employee(1, "Vasia", "Delacoccov", "firefighter",3.7, 557.38);
        Employee employee02 = new Employee(2, "John", "Suchodristchev", "engineer",2.1, 352.41);
        Employee employee03 = new Employee(3, "Nick", "Vziatko", "driver", 7.3, 380.76);
        Employee employee04 = new Employee(4, "Mascara", "Igilov", "firefighter", 2.8, 348.15);
        Employee employee05 = new Employee(5, "Valera", "Alvarez", "engineer", 3.4, 402.15);
        Employee employee06 = new Employee(6, "Valdemar", "Henselt", "driver", 3.7,170.64 );
        Employee employee07 = new Employee(7, "Lambert", "Taylor", "driver",0.6,450.07);
        Employee employee08 = new Employee(8, "Egan", "Vreemde", "firefighter", 10.5, 415.32 );
        Employee employee09 = new Employee(9, "Ethe", "Loantil", "driver", 0.7, 65.08);
        Employee employee10 = new Employee(10, "Blooper", "Gog", "engineer", 2.4, 297.07);

        Manage manage = new Manage(employee01);

        //заполнение массива работниками
        System.out.println("-------SALARY BEFORE UPDATE-------");
        manage.addEmployee(employee01, 0);
        System.out.println("Vasia's job position is: " + manage.getEmployee(0).getPosition() + ";" + " Salary BEFORE update = " + manage.getEmployee(0).getSalary());
        manage.addEmployee(employee02, 1);
        System.out.println("John's job position is: " + manage.getEmployee(1).getPosition() + ";" + " Salary BEFORE update = " + manage.getEmployee(1).getSalary());
        manage.addEmployee(employee03, 2);
        System.out.println("Nick's job position is: " + manage.getEmployee(2).getPosition() + ";" + " Salary BEFORE update = " + manage.getEmployee(2).getSalary());
        manage.addEmployee(employee04, 3);
        System.out.println("Mascara's job position is: " + manage.getEmployee(3).getPosition() + ";" + " Salary BEFORE update = " + manage.getEmployee(3).getSalary());
        manage.addEmployee(employee05, 4);
        System.out.println("Valera's job position is: " + manage.getEmployee(4).getPosition() + ";" + " Salary BEFORE update = " + manage.getEmployee(4).getSalary());
        manage.addEmployee(employee06, 5);
        System.out.println("Valdemar's job position is: " + manage.getEmployee(5).getPosition() + ";" + " Salary BEFORE update = " + manage.getEmployee(5).getSalary());
        manage.addEmployee(employee07, 6);
        System.out.println("Lambert's job position is: " + manage.getEmployee(6).getPosition() + ";" + " Salary BEFORE update = " + manage.getEmployee(6).getSalary());
        manage.addEmployee(employee08, 7);
        System.out.println("Egan's job position is: " + manage.getEmployee(7).getPosition() + ";" + " Salary BEFORE update = " + manage.getEmployee(7).getSalary());
        manage.addEmployee(employee09, 8);
        System.out.println("Ethe's job position is: " + manage.getEmployee(8).getPosition() + ";" + " Salary BEFORE update = " + manage.getEmployee(8).getSalary());
        manage.addEmployee(employee10, 9);
        System.out.println("Blooper's job position is: " + manage.getEmployee(9).getPosition() + ";" + " Salary BEFORE update = " + manage.getEmployee(9).getSalary() + "\n");

        //вызываем метод установки зп работникам в зависимости от должности
        System.out.println("-------SALARY AFTER UPDATE ACCORDING TO POSITION-------");
        manage.setPositionSalary();
        System.out.println("Vasia's salary AFTER update = " + manage.getEmployee(0).getSalary());
        manage.setPositionSalary(); //вызываем метод установки зп работникам в зависимости от должности
        System.out.println("John's salary AFTER update = " + manage.getEmployee(1).getSalary());
        manage.setPositionSalary(); //вызываем метод установки зп работникам в зависимости от должности
        System.out.println("Nick's salary AFTER update = " + manage.getEmployee(2).getSalary());
        manage.setPositionSalary(); //вызываем метод установки зп работникам в зависимости от должности
        System.out.println("Mascara's salary AFTER update = " + manage.getEmployee(3).getSalary());
        manage.setPositionSalary(); //вызываем метод установки зп работникам в зависимости от должности
        System.out.println("Valera's salary AFTER update = " + manage.getEmployee(4).getSalary());
        manage.setPositionSalary(); //вызываем метод установки зп работникам в зависимости от должности
        System.out.println("Valdemar's salary AFTER update = " + manage.getEmployee(5).getSalary());
        manage.setPositionSalary(); //вызываем метод установки зп работникам в зависимости от должности
        System.out.println("Lambert's salary AFTER update = " + manage.getEmployee(6).getSalary());
        manage.setPositionSalary(); //вызываем метод установки зп работникам в зависимости от должности
        System.out.println("Egan's salary AFTER update = " + manage.getEmployee(7).getSalary());
        manage.setPositionSalary(); //вызываем метод установки зп работникам в зависимости от должности
        System.out.println("Ethe's salary AFTER update = " + manage.getEmployee(8).getSalary());
        manage.setPositionSalary(); //вызываем метод установки зп работникам в зависимости от должности
        System.out.println("Blooper's salary AFTER update = " + manage.getEmployee(9).getSalary() + "\n");
        System.out.println("-------SHOWS ALL EMPLOYEE WITH THE SAME POSITION-------"); //метод, в который передается позиция и выводятся все сотрудники с указанной должностью
        manage.showPosition("driver");
        System.out.println("-------------------------------------------------------");
        manage.showPosition("engineer");
        System.out.println("-------------------------------------------------------");
        manage.showPosition("firefighter");
        System.out.println("-------------------------------------------------------" + "\n");
        System.out.println("-----SHOW ALL EMPLOYEERS WITH THE MIN & MAX SALARY-----");
        manage.showSotrudniki(700.00, 900.00);
    }
}