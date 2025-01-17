package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double areaCalculator() {
        return (double) (firstLeg * secondLeg * 0.5);
    }

    public void draw() {
        System.out.println("Figure: triangle, area: "
                + this.areaCalculator()
                + " sq.units, firstLeg: "
                + this.getFirstLeg()
                + " units, secondLeg: "
                + this.getSecondLeg()
                + " units, color: "
                + this.getColor());
    }
}
