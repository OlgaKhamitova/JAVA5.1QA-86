package org.example.java51qa86;

import org.example.java51qa86.services.VacationService;

public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();
        int savings = 0;
        int income = 100000;
        int expense = 60000;
        int vacationMonthTotal = service.calculate(savings, income, expense);
        System.out.println("Количество месяцев отпуска " + vacationMonthTotal);
    }
}