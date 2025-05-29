package com.example;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    Label usernamelabel;

    @FXML
    Label passwordlabel;

    @FXML
    TextField usernametextfield;

    @FXML
    TextField passwordtextfield;

    @FXML
    Button loginbutton;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public static User user;

    public void loginbuttonHandler(ActionEvent event) throws IOException{

        String uname = usernametextfield.getText();
        String pword = passwordtextfield.getText();

        user = new User(uname, pword, "", "");

        File accountsfile = new File("accounts.txt");

        if (accountsfile.createNewFile()) {
            System.out.println("File created: " + accountsfile.getName());
        } else {
            System.out.println("File already exists.");
        } 

        Scanner filescanner = new Scanner(accountsfile);

        while (filescanner.hasNextLine()) {

            String data = filescanner.nextLine();
   
            String username_from_file = data.split(",")[0];
            String password_from_file = data.split(",")[1];

            if (username_from_file.equals(user.getUsername()) && password_from_file.equals(user.getPassword())) {
                
                System.out.println("Login successful");
                
                URL fxmlLocation = getClass().getResource("/com/example/Home.fxml");
                if (fxmlLocation == null) {
                    System.out.println("FXML file not found!");
                    return;
                }
                Parent root = FXMLLoader.load(fxmlLocation);
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            }
            else
            {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setContentText("Account does not exist or password is incorrect");
            }
        }

        filescanner.close();
    }
}