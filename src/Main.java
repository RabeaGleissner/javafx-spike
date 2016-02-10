
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        MyJavaFXButton button = new MyJavaFXButton();
        button.actualButton().setText("Click here");
        MyJavaFXLabel label = new MyJavaFXLabel();
        CounterButton counterButton = new CounterButton(label);
        ActionSetter actionSetter = new ActionSetter(counterButton);
        actionSetter.addClickHandler(button);

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.add(button.actualButton(), 1,1);
        root.add(label.actualLabel(), 1,3);

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
