package barnes.jacob.matrices;

public class Matrix {

    private Double[][] data;
    private Integer m;
    private Integer n;

    //initialize matrix with no parameters
    public Matrix(){
        this.setM(0);
        this.setN(0);
        this.populateDataField(null, false);
    }
    //initialize MxN empty matrix
    public Matrix(Integer m, Integer n) {
        this.setM(m);
        this.setN(n);
        this.populateDataField(null, false);
    }

    //initialize matrix from user input data
    public Matrix(Double[][] inputData) {
        this.setM(inputData.length);
        this.setN(inputData[0].length);
        this.populateDataField(inputData, false);
    }

    //constructor for initializing an mxm identity matrix
    public Matrix(int m) {
        this.setM(m);
        this.setN(m);
        this.populateDataField(null, true);
    }

    private void populateDataField(Double[][] inputData, boolean identityMatrix) {
        this.data = new Double[getM()][getN()];

        for(int i = 0; i < this.getM(); i++) {
            for(int j = 0; j < this.getN(); j++) {
                if(inputData == null && !identityMatrix) {
                    this.data[i][j] = Double.valueOf(0);
                } else if (!identityMatrix) {
                    this.data[i][j] = inputData[i][j];
                } else {
                    if(i == j) {
                        this.data[i][j] = Double.valueOf(1);
                    } else {
                        this.data[i][j] = Double.valueOf(0);
                    }
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

    public Double getDataIndex(Integer m, Integer n){
        return this.data[m][n];
    }
    public void setDataIndex(Integer m, Integer n, Double d) {
        this.data[m][n] = d;
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
