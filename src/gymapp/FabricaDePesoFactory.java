/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymapp;

/**
 *
 * @author Fernando T.
 */
public class FabricaDePesoFactory implements ExercicioFactory {
    @Override
    public CardioExercicio createCardioExercise() {
        return new VelocidadeLevantamentoDePeso();
    }

    @Override
    public ExercicioForça createStrengthExercise() {
        return new FabricaDePeso();
    }
}

