package com.ash.java8.lambdaexpression.annonymusinnerclass;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee() {
            @Override
            public int getLessSalary() {
                return 9;
            }

            @Override
            public String getName() {
                return "Ash";
            }

        };
        System.out.println(employee.getClass());
        System.out.println(employee.getLessSalary());

        App app = new App();
        System.out.println(app.getClass());


    }
}
