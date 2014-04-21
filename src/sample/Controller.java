package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {

    @FXML
    private CustomForm customForm;

    @FXML
    void onButtonAction(ActionEvent event)
    {
        TestDialog testDialog = new TestDialog("My Name", "My Address", null);
        testDialog.showAndWait();

        customForm.setName(testDialog.getName());
        customForm.setAddress(testDialog.getAddress());
        customForm.setVisible(true);
    }
}
