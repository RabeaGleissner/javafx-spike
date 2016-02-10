import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LabelUpdaterTest {

    @Test
    public void incrementsCounter() {
        LabelUpdater labelUpdater = new LabelUpdater(new MyFakeLabel());
        labelUpdater.updateCounter();
        assertEquals(2, labelUpdater.getCounter());
    }

    @Test
    public void updatesLabel() {
        MyFakeLabel myFakeLabel = new MyFakeLabel();
        LabelUpdater labelUpdater = new LabelUpdater(myFakeLabel);
        labelUpdater.updateCounter();
        assertEquals("1", myFakeLabel.updatedText());
    }
}
