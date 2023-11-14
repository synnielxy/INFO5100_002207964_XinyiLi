package com.example.calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {

    private TextField display;

    @Override
    public void start(Stage primaryStage) {
        display = new TextField();
        display.setEditable(false);
        display.setAlignment(Pos.CENTER_RIGHT);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(10));
        grid.setHgap(5);
        grid.setVgap(5);

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (int i = 0; i < buttons.length; i++) {
            Button btn = new Button(buttons[i]);
            btn.setOnAction(this::processButtonPress);
            grid.add(btn, i % 4, (i / 4) + 1);
        }

        grid.add(display, 0, 0, 4, 1);

        Scene scene = new Scene(grid, 200, 250);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void processButtonPress(javafx.event.ActionEvent event) {
        String buttonText = ((Button) event.getSource()).getText();
        String currentText = display.getText();

        switch (buttonText) {
            case "C":
                display.setText("");
                break;
            case "=":
                calculateResult();
                break;
            default:
                display.setText(currentText + buttonText);
                break;
        }
    }

    private void calculateResult() {
        try {
            String[] tokens = display.getText().split("([+\\-*/])");
            double firstNumber = Double.parseDouble(tokens[0]);
            double secondNumber = Double.parseDouble(tokens[1]);
            char operator = display.getText().charAt(tokens[0].length());
            double result = 0;

            switch (operator) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    result = firstNumber / secondNumber;
                    break;
            }

            display.setText(String.valueOf(result));
        } catch (Exception e) {
            display.setText("Error");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
