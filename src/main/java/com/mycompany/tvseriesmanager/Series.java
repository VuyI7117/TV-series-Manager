package com.mycompany.tvseriesmanager;
import java.util.ArrayList;
import java.util.Scanner;

public class Series {
    private ArrayList<SeriesModel> seriesList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addSeries() {
        System.out.print("Enter the series name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the series genre: ");
        String genre = scanner.nextLine();

        int age = validateAge();

        seriesList.add(new SeriesModel(name, genre, age));
        System.out.println("Series data saved successfully.\n");
    }

    private int validateAge() {
        int age;
        while (true) {
            System.out.print("Enter the series age restriction: ");
            String input = scanner.nextLine();
            try {
                age = Integer.parseInt(input);
                if (age >= 4 && age <= 18) {
                    return age;
                } else {
                    System.out.println("Please enter a valid age restriction between 4 and 18.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid age restriction as a number (e.g. 13).");
            }
        }
    }

    public void viewSeriesByYear() {
        System.out.println("Viewing all series:");
        for (SeriesModel s : seriesList) {
            System.out.println(s);
            System.out.println("-------------------");
        }
    }

    public void searchSeries() {
        System.out.print("Enter series name to search: ");
        String name = scanner.nextLine();
        for (SeriesModel s : seriesList) {
            if (s.seriesName.equalsIgnoreCase(name)) {
                System.out.println("Series found:\n" + s);
                return;
            }
        }
        System.out.println("No series found.");
    }

    public void updateSeries() {
        System.out.print("Enter the series slot to update (0-based index): ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index >= 0 && index < seriesList.size()) {
            System.out.print("Enter new series name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new genre: ");
            String genre = scanner.nextLine();
            int age = validateAge();
            seriesList.set(index, new SeriesModel(name, genre, age));
            System.out.println("Series slot updated successfully.");
        } else {
            System.out.println("Invalid slot.");
        }
    }

    public void deleteSeries() {
        System.out.print("Enter the series slot to delete (0-based index): ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index >= 0 && index < seriesList.size()) {
            System.out.print("Are you sure you want to delete this series slot? (Y/N): ");
            String confirm = scanner.nextLine();
            if (confirm.equalsIgnoreCase("Y")) {
                seriesList.remove(index);
                System.out.println("Series slot deleted successfully.");
            }
        } else {
            System.out.println("Invalid slot.");
        }
    }

    // Additional methods
    public void SquareSeries() {}
    public void CubeSeries() {}
    public void SuperFactorial() {}
    public void SubFactorial() {}
    public void SeriesSum() {}
    public void SeriesProduct() {}
    public void DefineSeries() {}
    public void SeriesApplication() {}
}