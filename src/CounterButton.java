import javafx.scene.control.Label;

public class CounterButton {
    private int counter = 1;
    private Label label;

    public CounterButton(Label label) {
        this.label = label;
    }

    public void updateCounter() {
        label.setText("" + counter + "");
        counter++;
    }

}
