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

// Sets buttons to disabled until the Generate Start Number is pressed.
    button1.setDisable(true);
    button2.setDisable(true);
    button3.setDisable(true);
    button4.setDisable(true);
    button5.setDisable(true);
    button6.setDisable(true);
    button7.setDisable(true);
    button8.setDisable(true);
    button9.setDisable(true);
    button10.setDisable(true);


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

    randomNumber = newRandomNumber;
    randomNumberField.setText(String.valueOf(randomNumber));
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
            alertConfirm.setTitle("Digit Disorder");
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
        messageText.setText("That number has already been used, please generate a new number.");
        } else {
            slot1.setText(String.valueOf(randomNumber));
            button1.setDisable(true);
            numList.add(randomNumber);
            System.out.println(numList);

            generateRandomNumber();

            int slot1IntValue = Integer.parseInt(slot1.getText());

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

            int slot2IntValue = Integer.parseInt(slot2.getText());

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

            int slot3IntValue = Integer.parseInt(slot3.getText());

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

    public void resetGame(){
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

    slot1.clear();
    slot2.clear();
    slot3.clear();
    slot4.clear();
    slot5.clear();
    slot6.clear();
    slot7.clear();
    slot8.clear();
    slot9.clear();
    slot10.clear();

    randomNumberField.setText("");
    generateButton.setDisable(false);
    messageText.setText("");
    numList.clear();
    }

    public void restartButtonAction(ActionEvent event) {
    resetGame();

    }

    private boolean isListInAscendingOrder(List<Integer> list) {
    for (int i = 1; i < list.size(); i++) {
        if (list.get(i) < list.get(i - 1)) {
            return false;
        }
    }
    return true;
}


}
