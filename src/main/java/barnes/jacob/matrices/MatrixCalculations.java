package barnes.jacob.matrices;

import java.util.Arrays;

public class MatrixCalculations {

    /**Method for solving systems of linear equations of the form Ax = b
     * @param a The M x N matrix to be solved
     * @param b Product of A(x)
     *
     * @return the values of all variables in the matrix A
    */
    public static Matrix GaussElimination(Matrix a, Matrix b){
        String s = "";
        //if dimensions agree may proceed
        if(a.getN().equals(b.getM())) {
            Matrix augmented = createAugmentedMatrix(a, b);
            if(augmented.getDataIndex(0,0) == 0) {
                //no solution
                return new Matrix();
            }
            System.out.println("Solving system of linear equations...");
            System.out.println(augmented);
            for(int i = 0; i < augmented.getM(); i++) {
                Double scalar = 0.0;
                //if last row, no need to reduce anything below it
                if(i != augmented.getM() - 1) {
                    //must cycle through each row under the current row and reduce
                    for(int k = i + 1; k < augmented.getM(); k++) {
                        scalar = -(augmented.getDataIndex(k, i)) / (augmented.getDataIndex(i, i));
                        //cycles through each variable of the row to reduce
                        for (int j = 0; j < augmented.getN(); j++) {
                            augmented.setDataIndex(k, j,
                                    augmented.getDataIndex(k, j) + (scalar * (augmented.getDataIndex(i, j))));
                        }
                    }
                }
                //if the current diagonal is not equal to 1, divide.
                if(augmented.getDataIndex(i, i) != 1) {
                    scalar = 1 / (augmented.getDataIndex(i, i));
                    for(int k = 0; k < augmented.getN(); k++) {
                        augmented.setDataIndex(i, k, (scalar * augmented.getDataIndex(i, k)));
                    }
                }

                System.out.println("Step completed, updated matrix:");
                System.out.println(augmented);
            }

            Double inputData[][] = new Double[augmented.getN() - 1][1];
            for(Double[]row : inputData) {
                Arrays.fill(row, 0.0);
            }

            for(int i = augmented.getN() - 2; i >= 0; i--) {
                Double sum = augmented.getDataIndex(i, augmented.getN() - 1);
                for(int j = 0; j < augmented.getN() - 1; j++){
                    sum -= augmented.getDataIndex(i, j) * inputData[j][0];
                }
                inputData[i][0] = sum;
            }

            return new Matrix(inputData);
        } else {
            s += "Cannot perform Gaussian Elimination. Please ensure matrices have compatible dimensions.";
            return new Matrix();
        }
    }

    private static Matrix createAugmentedMatrix(Matrix a, Matrix b){
        Double[][] input = new Double[a.getM()][a.getN() + 1];
        for(int i = 0; i < a.getM(); i++) {
            for(int j = 0; j < a.getN(); j++ ) {
                input[i][j] = a.getDataIndex(i, j);
            }
            input[i][input[i].length - 1] = b.getDataIndex(i, 0);
        }
        return new Matrix(input);
    }
}
