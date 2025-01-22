package EX_02;

class Person{
    private String name ;
    private int age ;

    // public Person(){
    //     this.name = null;
    //     this.age = 0;
    // }

    public Person(String name , int age){
            this.name = name;
            this.age = age;
        }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("name:"+ name);
        System.out.println("age:"+ age);
    }
}

public class Employee extends Person{
    private double salary ;

    // public Employee(){
    //     super();
    //     this.salary = 0.0;
    // }

    public Employee(String name , int age ,double salary){
        super(name,age);
        this.salary = salary ;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display(){
        super.display();
        System.out.println("sal:"+ salary);
    }

    public static void main(String[] args) {
        // Employee e = new Employee();

        Employee e = new Employee("om",21 ,2000.00);
        e.display();
        
    }
}
