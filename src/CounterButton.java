public class CounterButton {
    private int counter = 1;
    private LabelInterface label;

    public CounterButton(LabelInterface label) {
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
