module com.javafxapplicationtest.gui.mainboot {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    exports com.javafxapplicationtest.gui.mainboot;
    opens com.javafxapplicationtest.gui.controllers to javafx.fxml;
}
