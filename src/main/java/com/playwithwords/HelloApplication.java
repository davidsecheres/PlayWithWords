package com.playwithwords;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label textLabel=new Label("Please enter your text");

        TextField inputText=new TextField();

        Button countButton=new Button("Count words");
        countButton.setOnAction(new CountWordsHandler(inputText));

        GridPane gridPane=new GridPane();

        //Setting size for pane
        gridPane.setMinSize(500,300);

        //Setting the grid alignment
        gridPane.setAlignment(Pos.BASELINE_LEFT);

        //Arranging all the nodes in the grid
        gridPane.add(textLabel,0,0);
        gridPane.add(inputText,0,1);


        gridPane.add(countButton,2,7);
        countButton.setStyle(
                "-fx-background-color:darkslateblue; -fx-text-fill: white;"
        );
        textLabel.setStyle("-fx-font:normal bold 30px 'serif' ");
      inputText.setMinSize(500,300);
//       inputText.setMinWidth(370);
//       inputText.setMaxWidth(370);
//       inputText.setMinHeight(250);
        inputText.setAlignment(Pos.TOP_LEFT);

        gridPane.setStyle("-fx-background-color:BEIGE;");

        Scene scene=new Scene(gridPane);


        stage.setTitle("Play With Words");

        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}