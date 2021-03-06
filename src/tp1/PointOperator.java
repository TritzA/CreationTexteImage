package tp1;

import java.util.*;

public final class PointOperator {

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void translate(Double[] vector, Double[] translateVector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] += translateVector[i];
        }
    }

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void rotate(Double[] vector, Double[][] rotationMatrix) {
        Double[] resultat = new Double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            resultat[i] = 0.;
            for (int j = 0; j < vector.length; j++) {
                resultat[i] += rotationMatrix[i][j] * vector[j];
            }
        }

        for (int i = 0; i < vector.length; i++) {
            vector[i] = resultat[i];
        }
    }

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void divide(Double[] vector, Double divider) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] /= divider;
        }
    }

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void multiply(Double[] vector, Double multiplier) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] *= multiplier;
        }
    }

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void add(Double[] vector, Double adder) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] += adder;
        }
    }
}