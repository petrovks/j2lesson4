package geekbrains.j2lesson4;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField tfield = new TextField();
    @FXML
    TextArea textArea = new TextArea();

    public void btnSendOn() {
        if (!tfield.getText().isEmpty()) {
            textArea.appendText(tfield.getText() + "\n");
            tfield.clear();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.NONE, "Пустое сообщение", ButtonType.CLOSE);
            alert.showAndWait();
        }
    }
}
