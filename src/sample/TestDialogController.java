package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TestDialogController extends Stage
{
    @FXML
    private TextField addressTextBox;

    @FXML
    private Button okButton;

    @FXML
    private TextField nameTextBox;

    public TestDialogController(String defaultName, String defaultAddress, Parent parent)
    {
        setTitle("This is a test dialog");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TestDialog.fxml"));
        fxmlLoader.setController(this);

        try
        {
            setScene(new Scene((Parent) fxmlLoader.load()));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        nameTextBox.setText(defaultName);
        addressTextBox.setText(defaultAddress);
    }

    @FXML
    void onOkButtonAction(ActionEvent event)
    {
        close();
    }
}
