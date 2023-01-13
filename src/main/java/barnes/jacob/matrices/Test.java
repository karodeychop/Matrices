package barnes.jacob.matrices;

public class Test {

    public static void main(String[] args){
        Integer[][] identityData = {{1, 0}, {0, 1}};

        Matrix identityTest = new Matrix(identityData);
        Matrix emptyMatrixTest = new Matrix(20, 3);

        System.out.println("Identity Test:");
        System.out.println(identityTest);

        System.out.println("Empty Matrix Test:");
        System.out.println(emptyMatrixTest);
    }
}
