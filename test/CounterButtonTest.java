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
