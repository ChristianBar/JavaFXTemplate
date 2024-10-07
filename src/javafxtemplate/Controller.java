package javafxtemplate;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    private Label helloLabel;

    public void initialize() {
        helloLabel.setText("Hello JavaFX!");
    }
}
