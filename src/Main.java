
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button();
        button.setText("Click here");
        Label label = new Label();
        CounterButton counterButton = new CounterButton(label);
        button.setOnAction(e -> counterButton.updateCounter());

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        label.setAlignment(Pos.CENTER);
        root.add(button, 1,1);
        root.add(label, 1,3);

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
