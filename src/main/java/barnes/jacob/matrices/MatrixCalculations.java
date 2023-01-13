package barnes.jacob.matrices;

public class MatrixCalculations {

    /**Method for solving systems of linear equations of the form Ax = b
     *
     *
    */
    public static Matrix GaussElimination(Matrix a, Matrix b){
        String s = "";
        //may proceed
        if(a.getN().equals(b.getM())) {
            return new Matrix();
        } else {
            s += "Cannot perform Gaussian Elimination. Please ensure matrices have compatible dimensions.";
            return new Matrix();
        }
    }

    private static Matrix createAugmentedMatrix(Matrix a, Matrix b){
        return new Matrix();
    }
}
