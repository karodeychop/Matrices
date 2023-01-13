package barnes.jacob.matrices;

public class Matrix {

    private Integer[][] data;
    private Integer m;
    private Integer n;

    //initialize matrix with no parameters
    public Matrix(){
        this.setM(0);
        this.setN(0);
        this.populateDataField(null);
    }
    //initialize MxN empty matrix
    public Matrix(Integer m, Integer n) {
        this.setM(m);
        this.setN(n);
        this.populateDataField(null);
    }

    //initialize matrix from user input data
    public Matrix(Integer[][] inputData) {
        this.setM(inputData.length);
        this.setN(inputData[0].length);
        this.populateDataField(inputData);
    }

    private void populateDataField(Integer[][] inputData) {
        this.data = new Integer[getM()][getN()];

        for(int i = 0; i < this.getM(); i++) {
            for(int j = 0; j < this.getN(); j++) {
                if(inputData == null) {
                    this.data[i][j] = 0;
                } else {
                    this.data[i][j] = inputData[i][j];
                }
            }
        }
    }

    private void setM(Integer newM) {
        this.m = newM;
    }

    private void setN(Integer newN) {
        this.n = newN;
    }

    public Integer getM(){
        return this.m;
    }

    public Integer getN() {
        return this.n;
    }

    public Integer getDataIndex(Integer m, Integer n){
        return this.data[m][n];
    }

    private String printData(){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < this.getM(); i++){
            s.append("{ ");
            for(int j = 0; j < this.getN(); j++){
                s.append(this.getDataIndex(i, j));
                s.append(",");
            }
            s.append("}\n");
        }
        return s.toString();
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("This matrix is a ");
        s.append(this.getM());
        s.append("x");
        s.append(this.getN());
        s.append(" matrix.\n");
        s.append("Data:\n");
        s.append(this.printData());
        return s.toString();
    }
}
