/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gymapp;

/**
 *
 * @author Fernando T.
 */
import java.util.Scanner;

import java.util.Scanner;

public class AcademiaApp {
    private ExercicioFactory exerciseFactory;

    public AcademiaApp(ExercicioFactory factory) {
        this.exerciseFactory = factory;
    }

    public void performCardioExercise() {
        CardioExercicio cardio = exerciseFactory.createCardioExercise();
        cardio.perform();
    }

    public void performStrengthExercise() {
        ExercicioForça strength = exerciseFactory.createStrengthExercise();
        strength.perform();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo à Academia!");
        System.out.println("Escolha a categoria de exercício:");
        System.out.println("1 - Corrida");
        System.out.println("2 - Musculação");
        
        int choice = scanner.nextInt();
        AcademiaApp app;

        switch (choice) {
            case 1: // Corrida
                app = new AcademiaApp(new CorridaFactory());
                break;
            case 2: // Musculação
                app = new AcademiaApp(new FabricaDePesoFactory());
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        System.out.println("Escolha o tipo de exercício:");
        System.out.println("1 - Velocidade");
        System.out.println("2 - Resistência");
        
        int exerciseType = scanner.nextInt();

        if (exerciseType == 1) {
            app.performCardioExercise();
        } else if (exerciseType == 2) {
            app.performStrengthExercise();
        } else {
            System.out.println("Tipo de exercício inválido!");
        }

        scanner.close();
    }
}
