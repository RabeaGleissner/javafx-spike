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
