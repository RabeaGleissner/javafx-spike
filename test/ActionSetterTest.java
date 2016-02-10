import javafx.embed.swing.JFXPanel;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ActionSetterTest {
    @Before
    public void setup() {
        new JFXPanel();
    }

    @Test
    public void labelUpdatesAfterClickOnButton() {
        MyFakeLabel fakeLabel = new MyFakeLabel();
        ActionSetter actionSetter = new ActionSetter(new LabelUpdater(fakeLabel));
        MyJavaFXButton button = new MyJavaFXButton();
        actionSetter.addClickHandler(button);
        button.actualButton().fire();
        assertEquals("1", fakeLabel.updatedText());
    }
}