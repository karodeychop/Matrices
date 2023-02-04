package barnes.jacob.matrices;

public class Test {

    public static void main(String[] args){

        Double[][] populatedData = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0 ,9.0}};
        Double[][] populateDataGauss = {{4.0, -5.0}, {2.0, -2.0}};
        Double[][] gaussBTestData = {{-6.0}, {1.0}};
        Matrix identityTest = new Matrix(8);
        Matrix emptyMatrixTest = new Matrix(20, 3);

        Matrix gaussElimTest = new Matrix(populateDataGauss);
        Matrix gaussElimB = new Matrix(gaussBTestData);

        Matrix populatedMatrixTest = new Matrix(populatedData);

        System.out.println("Identity Test:");
        System.out.println(identityTest);

        System.out.println("Empty Matrix Test:");
        System.out.println(emptyMatrixTest);

        System.out.println("Populated Matrix Test:");
        System.out.println(populatedMatrixTest);

        System.out.println("Gauss Elim Test:");
        System.out.println(MatrixCalculations.GaussElimination(gaussElimTest, gaussElimB));
    }
}
