package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    public TextField firstNumber;
    @FXML
    private TextField secondNumber;
    @FXML
    private Text firstErrorField;
    @FXML
    private Text secondErrorField;
    @FXML
    private Text result;
    @FXML
    private Button compute;

    @FXML
    public void initialize(){
        compute.setDisable(true);
    }
    @FXML
    public void handleKeyReleased(KeyEvent e){
        try {
            String text = ((TextField)e.getSource()).getText();
            validateNumber(text,e);
        }catch (Exception exception){

        }
    }
    protected void validateNumber(String text, KeyEvent e){
        try{
            Integer.parseInt(text);
            if (e.getSource().equals(firstNumber)){
                firstErrorField.setText("");
            }else {
                if (text.equals("0")){
                    secondErrorField.setText("Can't divide by 0");
                }else if(text.equals("13")){
                    throw new Exception("Unlucky");
                }
                else{
                    secondErrorField.setText("");
                }
            }
        }catch (Exception exception){
            if (e.getSource().equals(firstNumber)){
                if (!text.isEmpty()){
                    firstErrorField.setText("Please enter a valid number");

                    firstErrorField.setFill(Color.RED);
                }else {
                    firstErrorField.setText(" ");
                }
            }else {
                if (!text.isEmpty()){
                    if (text.equals("13")){
                        secondErrorField.setText(exception.getMessage());
                    }else{
                        secondErrorField.setText("Please enter a valid number");
                    }
                    secondErrorField.setFill(Color.RED);
                }else {
                    secondErrorField.setText(" ");
                }
            }
            result.setText("?");
        }
        compute.setDisable(!firstErrorField.getText().isEmpty() || !secondErrorField.getText().isEmpty() || firstNumber.getText().isEmpty() || secondNumber.getText().isEmpty());
    }
    public void onComputeClicked(){
        result.setText(String.valueOf(((double)Integer.parseInt(firstNumber.getText()) / Integer.parseInt(secondNumber.getText()))));
    }

}