package tp1;

public class Point2d extends AbstractPoint {
    private final Integer X = 0;
    private final Integer Y = 1;

    // TODO creer un point en 2d avec 2 donnees
    public Point2d(Double x, Double y) {
        super(new Double[]{x, y});
    }

    // TODO creer un point a partir d'un vecteur de donnees
    public Point2d(Double[] vector) {
        super(vector.clone());
    }

    public Double X() {
        return vector[X];
    }

    public Double Y() {
        return vector[Y];
    }

    // TODO appliquer la transalation sur la classe courrante et retourner la reference
    @Override
    public Point2d translate(Double[] translateVector) {
        PointOperator.translate(this.vector, translateVector);
        return this;
    }

    // TODO appliquer la transalation sur la classe courrante et retourner la reference
    public Point2d translate(Point2d translateVector) {
        PointOperator.translate(this.vector, translateVector.vector);
        return this;
    }

    // TODO appliquer la rotation sur la classe courrante et retourner la reference
    @Override
    public Point2d rotate(Double[][] rotationMatrix) {
        PointOperator.rotate(this.vector, rotationMatrix);
        return this;
    }

    // TODO appliquer la rotation sur la classe courrante et retourner la reference
    public Point2d rotate(Double angle) {
        Double[][] matriceRotation = {{Math.cos(angle), -Math.sin(angle)}, {Math.sin(angle), Math.cos(angle)}};
        PointOperator.rotate(this.vector, matriceRotation);
        return this;
    }

    // TODO appliquer la division sur la classe courrante et retourner la reference
    @Override
    public Point2d divide(Double divider) {
        PointOperator.divide(this.vector, divider);
        return this;
    }

    // TODO appliquer la multiplication sur la classe courrante et retourner la reference
    @Override
    public Point2d multiply(Double multiplier) {
        PointOperator.multiply(this.vector, multiplier);
        return this;
    }

    // TODO appliquer l'addition sur la classe courrante et retourner la reference
    @Override
    public Point2d add(Double adder) {
        PointOperator.add(this.vector, adder);
        return this;
    }

    // TODO creer un nouveau point.
    @Override
    public Point2d clone() {
        Point2d nouveau = new Point2d(this.vector);
        return nouveau;
    }
}
