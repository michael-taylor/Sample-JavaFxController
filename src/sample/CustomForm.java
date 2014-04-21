package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CustomForm extends GridPane implements Initializable
{
    @FXML
    private Label chosenNameText;

    @FXML
    private Label chosenAddressText;

    public CustomForm()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CustomForm.fxml"));
        fxmlLoader.setController(this);
        fxmlLoader.setRoot(this);

        try
        {
            fxmlLoader.load();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        // Initialize Label values here
        chosenNameText.setText("");
        chosenAddressText.setText("");
    }

    public void setName(String name)
    {
        chosenNameText.setText(name);
    }

    public void setAddress(String address)
    {
        chosenAddressText.setText(address);
    }
}
