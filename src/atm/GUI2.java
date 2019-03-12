/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import static javafx.scene.input.DataFormat.URL;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Hussen
 */

public class GUI2 {
    Scene scene;
    int j=0;
    Stage stage;
    ATMGUI gui3;
GUI g=new GUI();
ATM atm = new ATM();
    public GUI2() {
    }
    

    public GUI2(Stage stage) {
        this.stage = stage;
    }

     public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Scene getScene() {
        return scene;
    }

    public void page2 () {
//    Label usernameLabel=new Label("username");
//    Label passwordLabel=new Label("password");
//    TextField usernamefield=new TextField();
//    PasswordField passwordfield=new PasswordField();
Button next = new Button("next");
Button Balance = new Button("Balance");
Button pervious = new Button("pervious");
    Button withdraw = new Button("withdraw");
    Button Deposit = new Button("deposit");
    Button quit =new Button ("quit");
    Label Balance2=new Label();
    GridPane grid =new GridPane();
   grid.add(Deposit,0,0);
   grid.add(withdraw,1,0);
    grid.add(Balance,0,1);
   grid.add(pervious,0,2);
    grid.add(next,1,2);
    grid.add(Balance2,1,1);
    grid.add(quit,0,4);
    Balance.setOnAction((ActionEvent event) -> {
        Balance2.setText(atm.balanceinquiry());
    });
    withdraw.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            gui3=new ATMGUI(); 
            gui3.page3(1,scene,stage,atm);
            stage.setScene(gui3.getScene());
        }
    });
   Deposit.setOnAction((ActionEvent event) -> {
           gui3=new ATMGUI();
     gui3.page3(0,scene,stage,atm);
     stage.setScene(gui3.getScene());
   });
  next.setOnAction((ActionEvent event) -> {
       // if (atm.pervious()!=null) {
            Balance2.setText(atm.next());
       // } else { Balance2.setText("eror");
      //  }
    });
    pervious.setOnAction((ActionEvent event) -> {
       // if (atm.pervious()!=null) {
            Balance2.setText(atm.pervious());
       // } else { Balance2.setText("eror");
      //  }
    });
    quit.setOnAction((ActionEvent event) -> {
        try {
            g.start(stage);
            stage.
                    setScene(g.getScene());
        } catch (Exception ex) {
            Logger.getLogger(GUI2.class.getName()).log(Level.SEVERE, null, ex);
        }
    });
    scene=new Scene(grid,300,300);
   
    
}

    public void setGu(ATMGUI gui3) {
        this.gui3 = gui3;
    }
}
    

