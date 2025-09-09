package com.mycompany.tvseriesmanager;
public class Main {
    public static void main(String[] args) {
        Series seriesApp = new Series();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int choice;

        do {
            System.out.println("SERIES MENU");
            System.out.println("1. Add series");
            System.out.println("2. View series by year");
            System.out.println("3. Search series");
            System.out.println("4. Update series");
            System.out.println("5. Delete series");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> seriesApp.addSeries();
                case 2 -> seriesApp.viewSeriesByYear();
                case 3 -> seriesApp.searchSeries();
                case 4 -> seriesApp.updateSeries();
                case 5 -> seriesApp.deleteSeries();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}