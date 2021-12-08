package ca.durhamcollege.oop3200_ice12;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main  extends Application
{
    public static int WIDTH = 640;
    public static int HEIGHT = 480;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle(("Hello World"));

        // Creates new controls
        Label helloLabel = new Label("Hello, World"); // Labels
        Label goodByeLabel = new Label("Good Bye!");
        Button clickMeButton = new Button("Click ME!"); // Button

        // Configure controls
        Font font = Font.font("Consolas", FontWeight.BOLD, 40); // Creates new font
        clickMeButton.setFont(font); // Adds new font to the button
        // Event Handler
        clickMeButton.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                // Output to console
                System.out.println("Click Me Button Clicked");

                // Change hello label to "clicked"
                helloLabel.setText("Clicked");
            }
        });

        // Creates new containers
        //HBox hbox = new HBox(helloLabel, goodByeLabel);
        //VBox vbox = new VBox(helloLabel, clickMeButton);
        GridPane gridPane = new GridPane();

        // Adds items to the grid pane
        gridPane.add(helloLabel, 1, 0);
        gridPane.add(goodByeLabel, 1, 1);
        gridPane.add(clickMeButton, 2, 2);

        var children = gridPane.getChildren();

        // Creates new scene
        Scene scene = new Scene(gridPane, WIDTH, HEIGHT);

        // Add scene to stage
        primaryStage.setScene(scene);

// Setting max and min heights
//       // Sets width and height of the stage
//        primaryStage.setWidth(320.0);
//        primaryStage.setHeight(480.0);
//
//        // Sets the max width and height of stage (Window doesn't auto match size)
//        primaryStage.setMaxWidth(800.0);
//        primaryStage.setMaxHeight(600.0);
//
//        // Sets the min width and height of the stage
//        primaryStage.setMinWidth(320.0);
//        primaryStage.setMinHeight(480.0);

        // Display Stage
        primaryStage.show();
    }

    public static void main(String[] args){launch(args);}
}
