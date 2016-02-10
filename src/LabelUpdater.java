public class LabelUpdater {
    private int counter = 1;
    private LabelInterface label;

    public LabelUpdater(LabelInterface label) {
        this.label = label;
    }

    public void updateCounter() {
        label.setText("" + counter + "");
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
