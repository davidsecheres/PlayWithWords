module com.wordcounter.wordcounter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.playwithwords to javafx.fxml;
    exports com.playwithwords;
}