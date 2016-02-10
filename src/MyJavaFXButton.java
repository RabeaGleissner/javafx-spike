import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;


public class MyJavaFXButton implements ButtonInterface {
    private Button button;

    public MyJavaFXButton() {
        this.button = new Button();
    }

    @Override
    public void setOnAction(EventHandler<ActionEvent> value) {
       button.setOnAction(value);
    }

    public Button actualButton() {
        return button;
    }
}
