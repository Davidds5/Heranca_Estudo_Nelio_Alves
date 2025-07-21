package Estudo06Base.application;

import Estudo06Base.entities.Company;
import Estudo06Base.entities.TaxPayer;
import Estudo06Base.entities.individual;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<TaxPayer> taxPayerList = new ArrayList<>();

        System.out.println("Enter the number of taxpayers: ");
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println("Taxpayer #" + (i + 1) + " data:");
            System.out.print("Individual or Company(i/c): ");
            char type = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if (type == 'i'){
                System.out.print("Health expenditures: ");
                double expenditures = sc.nextDouble();
                taxPayerList.add(new individual(name, anualIncome, expenditures));
            } else if (type == 'c') {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();

                taxPayerList.add(new Company(name, anualIncome, numberEmployees));
             }
            }
            System.out.println();
            System.out.println("TAXES PAID");
            for(TaxPayer taxPayer : taxPayerList){
                System.out.println(taxPayer.getName() + ": $" + taxPayer.tax());
        }
            double soma = 0.0;
            for(TaxPayer taxPayer : taxPayerList){
                soma += taxPayer.tax();
            }

            System.out.println("TOTAL TAXES: $" + String.format("%.2f", soma));
            sc.close();
    }
}
