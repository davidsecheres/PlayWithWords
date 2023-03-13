package com.playwithwords;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class CountWordsHandler implements EventHandler<ActionEvent> {
    private TextField buttonHandlerParagraph;

    public CountWordsHandler(TextField buttonHandlerParagraph) {
        this.buttonHandlerParagraph = buttonHandlerParagraph;
    }

    private void countWords(TextField paragraph){
        String text = paragraph.getText();
        String [] str = text.split("\\s+");
        int countWords = str.length;
        System.out.println("Number of words: " + countWords);
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        countWords(buttonHandlerParagraph);
    }
}
