public class ActionSetter implements ActionSetterInterface {

    private CounterButton counterButton;

    public ActionSetter(CounterButton counterButton) {
        this.counterButton = counterButton;
    }

    @Override
    public void addClickHandler(ButtonInterface button) {
        button.setOnAction(event -> counterButton.updateCounter());
    }

}

interface ActionSetterInterface {
    public void addClickHandler(ButtonInterface button);
}
