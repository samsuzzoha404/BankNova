module com.nsl.banknova {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.nsl.banknova to javafx.fxml;
    exports com.nsl.banknova;
    exports com.nsl.banknova.Controllers;
    exports com.nsl.banknova.Controllers.Admin;
    exports com.nsl.banknova.Controllers.Client;
    exports com.nsl.banknova.Models;
    exports com.nsl.banknova.Views;
}