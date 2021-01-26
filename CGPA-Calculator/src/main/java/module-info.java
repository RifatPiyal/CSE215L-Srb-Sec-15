module com.mycompany.cgpa.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.cgpa.calculator to javafx.fxml;
    exports com.mycompany.cgpa.calculator;
}
