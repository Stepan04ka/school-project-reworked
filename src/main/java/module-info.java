module com.javafxapplicationtest.gui.mainboot {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires java.sql;

    exports com.javafxapplicationtest.gui.mainboot;
    exports com.javafxapplicationtest.gui.controllers;
    exports com.javafxapplicationtest.objects;
    
    opens com.javafxapplicationtest.gui.controllers to javafx.fxml;
    opens com.javafxapplicationtest.objects to java.sql;
}
