module barnes.jacob.matrices {
    requires javafx.controls;
    requires javafx.fxml;


    opens barnes.jacob.matrices to javafx.fxml;
    exports barnes.jacob.matrices;
}