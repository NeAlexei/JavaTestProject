package kinomo.manage;
import kinomo.employee.Employee;

public class Manage {
    private Employee employee;

    private Employee[] empArr = new Employee[10]; //создание пустого массива "empArr" с типом данных Employee[] из 10 сотрудников

    public Manage(Employee employee) {
        this.employee = employee;
    }

    public void printExperience() {
        System.out.println("First name is: " + employee.getFirstName() + "." + " Last name is: " + employee.getLastName() + "." + " Experience is: " + employee.getExperience());
    }

    public void addEmployee(Employee employee, int index) { //создание метода, который добавляет в массив работника и его индекс
        this.empArr[index] = employee;
    }

    public Employee getEmployee(int index){
        return empArr[index];
    }

    //1. Пройти по всем элементам масива.
    //2. Взять из каждого элемента массива параметр position.
    //3. Поместить параметр position в какую-либо переменную.
    //4. Сравнить значение этой переменной с необходимыми.

    public Employee[] setPositionSalary() {         //создание метода, который будет устанавливать ЗП в зависимости от должности.
        for (int i = 0; i < empArr.length; i++) {

            Employee curEmp = empArr[i];            //выбор элемента массива, т.е. выбор i-го работника
            String jobPosition = curEmp.getPosition(); //получаем должность работника и присваиваем ее переменной position

            if ("engineer".equals(jobPosition)) {
                curEmp.setSalary(777.78);
            } else if ("driver".equals(jobPosition)) {
                curEmp.setSalary(999.97);
            } else if ("firefighter".equals(jobPosition)) {
                curEmp.setSalary(888.86);
            }
       }
        return empArr;
    }

    public void showPosition(String position) {         //метод, в который передается позиция и выводятся все сотрудники с указанной должностью
        for (int i = 0; i < empArr.length; i++) {

            Employee currentEmp = empArr[i];
            String job = currentEmp.getPosition();

            if (position.equals(job)) {
                System.out.println(currentEmp.getFirstName() + " " + currentEmp.getLastName() + " is " + currentEmp.getPosition());
            }
        }
    }

    public void showSotrudniki(double min, double max){    //метод, в который передается минимальное и максимальное значение зп и выводятся сотрудники, соответствующие данному диапазону
        for (int i = 0; i < empArr.length; i++){
            Employee currentEmp = empArr[i];
            Double bablo = currentEmp.getSalary();

            if (min<=bablo && max>=bablo){
                System.out.println(currentEmp.getFirstName() + " " + currentEmp.getLastName() + " is " + currentEmp.getSalary());
            }
        }
    }
}
