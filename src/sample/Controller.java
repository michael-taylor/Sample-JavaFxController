package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {

    @FXML
    void onButtonAction(ActionEvent event)
    {
        TestDialogController testDialogController = new TestDialogController("My Name", "My Address", null);
        testDialogController.showAndWait();
    }
}
