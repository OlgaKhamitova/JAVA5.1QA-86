package org.example.java51qa86.services;

public class VacationService {
    int threshold = 150000;
    int vacationMonthTotal = 0;

    public int calculate(int savings, int income, int expense) {
        for (int month = 0; month < 12; month++) {
            if (savings >= threshold) {
                vacationMonthTotal = vacationMonthTotal + 1;
                savings = (savings - expense) / 3;
            } else {
                savings = savings + income - expense;
            }
        }
        return vacationMonthTotal;
    }
}





