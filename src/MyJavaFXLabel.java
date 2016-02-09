import javafx.scene.control.Label;

class MyJavaFXLabel implements LabelInterface {
    private Label label;

    public MyJavaFXLabel() {
        this.label = new Label();
    }

    @Override
    public void setText(String text) {
        label.setText(text);
    }

    public Label actualLabel() {
        return label;
    }
}
