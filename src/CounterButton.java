import javafx.scene.control.Label;

public class CounterButton {
    private int counter = 1;

    public void updateCounter(Label label) {
        label.setText("" + counter + "");
        counter++;
    }
}
