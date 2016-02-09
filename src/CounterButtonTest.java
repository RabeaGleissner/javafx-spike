import javafx.scene.control.Label;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CounterButtonTest {

    @Test
    public void incrementsCounter() {
        CounterButton counterButton = new CounterButton(new MyFakeLabel());
        counterButton.updateCounter();
        assertEquals(2, counterButton.getCounter());
    }

    @Test
    public void updatesLabel() {
        MyFakeLabel myFakeLabel = new MyFakeLabel();
        CounterButton counterButton = new CounterButton(myFakeLabel);
        counterButton.updateCounter();
        assertEquals("1", myFakeLabel.updatedText());
    }
}


interface  LabelInterface {
    void setText(String s);
}

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

class MyFakeLabel implements LabelInterface {
    private String text;

    @Override
    public void setText(String s) {
        text = s;
    }

    public String updatedText() {
        return text;
    }
}