package barnes.jacob.matrices;

public class Test {

    public static void main(String[] args){

        Integer[][] populatedData = {{1, 2, 3}, {4, 5, 6}, {7, 8 ,9}};
        Matrix identityTest = new Matrix(8);
        Matrix emptyMatrixTest = new Matrix(20, 3);

        Matrix populatedMatrixTest = new Matrix(populatedData);

        System.out.println("Identity Test:");
        System.out.println(identityTest);

        System.out.println("Empty Matrix Test:");
        System.out.println(emptyMatrixTest);

        System.out.println("Populated Matrix Test:");
        System.out.println(populatedMatrixTest);
    }
}
