/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymapp;

/**
 *
 * @author Fernando T.
 */
public class CorridaFactory implements ExercicioFactory {
    @Override
    public CardioExercicio createCardioExercise() {
        return new CorridaRapida();
    }

    @Override
    public ExercicioForça createStrengthExercise() {
        return new CorridaResistencia();
    }
}
