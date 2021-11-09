module com.example.aventurasdemarcoyluis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aventurasdemarcoyluis to javafx.fxml;
    exports com.example.aventurasdemarcoyluis;
    exports com.example.aventurasdemarcoyluis.model;
    opens com.example.aventurasdemarcoyluis.model to javafx.fxml;
    exports com.example.aventurasdemarcoyluis.model.characters;
    opens com.example.aventurasdemarcoyluis.model.characters to javafx.fxml;
    exports com.example.aventurasdemarcoyluis.model.items;
    opens com.example.aventurasdemarcoyluis.model.items to javafx.fxml;
    exports com.example.aventurasdemarcoyluis.model.characters.enemies;
    opens com.example.aventurasdemarcoyluis.model.characters.enemies to javafx.fxml;
    exports com.example.aventurasdemarcoyluis.model.characters.principal_characters;
    opens com.example.aventurasdemarcoyluis.model.characters.principal_characters to javafx.fxml;
}