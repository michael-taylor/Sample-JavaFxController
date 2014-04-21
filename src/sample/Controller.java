package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label chosenNameLabel;

    @FXML
    private Label chosenNameText;

    @FXML
    private Label chosenAddressLabel;

    @FXML
    private Label chosenAddressText;

    @FXML
    void onButtonAction(ActionEvent event)
    {
        TestDialogController testDialogController = new TestDialogController("My Name", "My Address", null);
        testDialogController.showAndWait();

        chosenNameText.setText(testDialogController.getName());
        chosenAddressText.setText(testDialogController.getAddress());

        chosenNameLabel.setVisible(true);
        chosenNameText.setVisible(true);
        chosenAddressLabel.setVisible(true);
        chosenAddressText.setVisible(true);
    }
}
