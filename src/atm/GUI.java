/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class GUI extends Application {
    Scene scene;
    public static void main (String[] args) {
        launch(args);
    }
    @Override
public void start(Stage primaryStage) throws Exception {
    GUI2 g =new GUI2(primaryStage);
    ATMGUI gu=new ATMGUI(primaryStage);
    g.setGu(gu);
    gu.setGui(g);
    primaryStage.setTitle("ATM");
    valdiation valdation=new valdiation();
    Button Submit = new Button("Submit");
    Label passwordLabel=new Label("Cardnumber");
    PasswordField passwordfield=new PasswordField();
    Label l=new Label();
    GridPane grid =new GridPane();
    grid.add(passwordLabel, 0, 0);
     grid.add(passwordfield, 1, 0);
      grid.add(Submit, 1,2);
      grid.add(l,1,3);
    Submit.setOnAction((ActionEvent event) -> {
         String Cardnumber = passwordfield.getText();
        if (valdation.valid(Cardnumber))
        { 
            g.page2();
            primaryStage.setScene(g.getScene());
        }
        else {
            l.setText("Cardnumber incorrect");
        }
        
    });
    scene=new Scene(grid,350,350);
    primaryStage.setScene(scene);
    primaryStage.show();
    
    
/**
 *
 * @author Hussen
 */
    
}

    public GUI() {
    }

    public Scene getScene() {
        return scene;
    }
}
