public class ActionSetter implements ActionSetterInterface {

    private LabelUpdater labelUpdater;

    public ActionSetter(LabelUpdater labelUpdater) {
        this.labelUpdater = labelUpdater;
    }

    @Override
    public void addClickHandler(ButtonInterface button) {
        button.setOnAction(event -> labelUpdater.updateCounter());
    }

}

interface ActionSetterInterface {
    public void addClickHandler(ButtonInterface button);
}
