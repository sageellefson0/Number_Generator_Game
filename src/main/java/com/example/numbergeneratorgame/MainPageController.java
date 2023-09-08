package com.example.numbergeneratorgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.*;


public class MainPageController implements Initializable {

    public Text randomNumberField;
    public TextField slot1;
    public Text messageText;


    //buttons
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button button10;

    //textfields
    public TextField slot5;
    public TextField slot2;
    public TextField slot4;
    public TextField slot8;
    public TextField slot7;
    public TextField slot6;
    public TextField slot3;
    public TextField slot9;
    public TextField slot10;

    //other buttons
    public Button exitButton;
    public Button generateButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    List<Integer> numList = new ArrayList<>();


/** Variable for the random number. */
    private int randomNumber;


    public void generateRandomNumber() {

    if (numList.size() >= 1000) {
        randomNumberField.setText("You have run out of original numbers! Please close and reopen the application.");
        return;
    }
    Random rand = new Random();
    int newRandomNumber;
    do {
        newRandomNumber = rand.nextInt(1000) + 1;
    } while (numList.contains(newRandomNumber));
    if (areAllSlotsFilled()) {
        randomNumberField.setText(""); // Set to an empty value
    } else {
        randomNumberField.setText(String.valueOf(randomNumber));
    }
}

private boolean areAllSlotsFilled() {
    return !slot1.getText().isEmpty() &&
           !slot2.getText().isEmpty() &&
           !slot3.getText().isEmpty() &&
           !slot4.getText().isEmpty() &&
           !slot5.getText().isEmpty() &&
           !slot6.getText().isEmpty() &&
           !slot7.getText().isEmpty() &&
           !slot8.getText().isEmpty() &&
           !slot9.getText().isEmpty() &&
           !slot10.getText().isEmpty();
}



    @FXML
    public void generateButtonAction(ActionEvent event) {
    generateRandomNumber();

    button1.setDisable(false);
    button2.setDisable(false);
    button3.setDisable(false);
    button4.setDisable(false);
    button5.setDisable(false);
    button6.setDisable(false);
    button7.setDisable(false);
    button8.setDisable(false);
    button9.setDisable(false);
    button10.setDisable(false);

    generateButton.setDisable(true);
    }


    public void exitButtonAction(ActionEvent event) {
            Alert alertConfirm = new Alert(Alert.AlertType.CONFIRMATION);
            alertConfirm.setTitle("Number Generator ");
            alertConfirm.setHeaderText(null);
            alertConfirm.setContentText("Are you sure you would like to exit the game? You will lose all progress.");
            Optional<ButtonType> result = alertConfirm.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
            System.exit(0);
            }

    }

    @FXML
    public void button1Action(ActionEvent event) {

      if (numList.contains(randomNumber))
        {
                System.out.println("That number was already used, please generate a new number.");
        }
        else {
          slot1.setText(String.valueOf(randomNumber));
          button1.setDisable(true);
          numList.add(randomNumber);
          System.out.println(numList);

          generateRandomNumber();
      }
    }

    @FXML
    public void button2Action(ActionEvent event) {

        if (numList.contains(randomNumber))
        {
        messageText.setText("That number has already been used, please generate a new number.");
        } else {
            slot2.setText(String.valueOf(randomNumber));
            button2.setDisable(true);
            numList.add(randomNumber);
            System.out.println(numList);

            generateRandomNumber();

        }
    }


    public void button3Action(ActionEvent event) {
    if (numList.contains(randomNumber))
        {
        messageText.setText("That number has already been used, please generate a new number.");
        } else {
            slot3.setText(String.valueOf(randomNumber));
            button3.setDisable(true);
            numList.add(randomNumber);
            System.out.println(numList);

            generateRandomNumber();

        }
    }

    public void button4Action(ActionEvent event) {
       if (numList.contains(randomNumber))
        {
        messageText.setText("That number has already been used, please generate a new number.");
        } else {
            slot4.setText(String.valueOf(randomNumber));
            button4.setDisable(true);
            numList.add(randomNumber);
            System.out.println(numList);

            generateRandomNumber();

        }
    }

    public void button5Action(ActionEvent event) {
        if (numList.contains(randomNumber))
        {
        messageText.setText("That number has already been used, please generate a new number.");
        } else {
            slot5.setText(String.valueOf(randomNumber));
            button5.setDisable(true);
            numList.add(randomNumber);
            System.out.println(numList);

            generateRandomNumber();

        }
    }

    public void button6Action(ActionEvent event) {
        if (numList.contains(randomNumber))
        {
        messageText.setText("That number has already been used, please generate a new number.");
        } else {
            slot6.setText(String.valueOf(randomNumber));
            button6.setDisable(true);
            numList.add(randomNumber);
            System.out.println(numList);

            generateRandomNumber();

        }
    }

    public void button7Action(ActionEvent event) {
        if (numList.contains(randomNumber))
        {
        messageText.setText("That number has already been used, please generate a new number.");
        } else {
            slot7.setText(String.valueOf(randomNumber));
            button7.setDisable(true);
            numList.add(randomNumber);
            System.out.println(numList);

            generateRandomNumber();

        }
    }

    public void button8Action(ActionEvent event) {
        if (numList.contains(randomNumber))
        {
        messageText.setText("That number has already been used, please generate a new number.");
        } else {
            slot8.setText(String.valueOf(randomNumber));
            button8.setDisable(true);
            numList.add(randomNumber);
            System.out.println(numList);

            generateRandomNumber();

        }
    }

    public void button9Action(ActionEvent event) {
        if (numList.contains(randomNumber))
        {
        messageText.setText("That number has already been used, please generate a new number.");
        } else {
            slot9.setText(String.valueOf(randomNumber));
            button9.setDisable(true);
            numList.add(randomNumber);
            System.out.println(numList);

            generateRandomNumber();

        }
    }

    public void button10Action(ActionEvent event) {
        if (numList.contains(randomNumber))
        {
        messageText.setText("That number has already been used, please generate a new number.");
        } else {
            slot10.setText(String.valueOf(randomNumber));
            button10.setDisable(true);
            numList.add(randomNumber);
            System.out.println(numList);

            generateRandomNumber();

        }
    }
}
