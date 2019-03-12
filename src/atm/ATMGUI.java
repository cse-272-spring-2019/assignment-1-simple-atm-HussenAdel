/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import static java.lang.Double.parseDouble;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 *
 * @author Adel
 */
public class ATMGUI {
    GUI2 gui;
 Scene scene;
 Stage stage;
 //GUI g=new GUI();
 public ATMGUI(Stage stage)
 {
     this.stage=stage;
 }

//    ATMGUI(Stage primaryStage) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public void setGui(GUI2 gui) {
        this.gui = gui;
  }

    public ATMGUI() {
    }

    public Scene getScene() {
        return scene;
    }
    
  public void page3 (int m,Scene scene2,Stage stage2,ATM atm)
  {  
    TextField text=new TextField();
    Button a = new Button("1");
    Button b = new Button("2");
    Button c = new Button("3");
    Button d = new Button("4");
    Button e = new Button("5");
    Button f = new Button("6");
    Button g = new Button("7");
    Button h = new Button("8");
    Button i = new Button("9");
    Button aa =new Button("0");
    Button submit =new Button("submit");
    GridPane grid = new GridPane();
    GridPane grid1 = new GridPane();
    GridPane grid2 = new GridPane();
    grid1.add(text,0,0);
    grid.add(a, 0, 1);
    grid.add(b, 1, 1);
    grid.add(c, 2, 1);
    grid.add(d, 0, 2);
    grid.add(e, 1, 2);
    grid.add(f, 2, 2);
    grid.add(g, 0, 3);
    grid.add(h, 1,3);
    grid.add(i, 2, 3);
    grid.add(aa, 1, 4);
    grid.add(submit, 2, 4);
    grid2.add(grid1, 0, 0);
    grid2.add(grid,0,1);
    a.setOnAction((ActionEvent event) -> {
        String s= text.getText()+a.getText();
        text.setText(s);
    });
        b.setOnAction((ActionEvent event) -> {
        String s= text.getText()+b.getText();
        text.setText(s);
        });
        c.setOnAction((ActionEvent event) -> {
        String s= text.getText()+c.getText();
        text.setText(s);
        });
        d.setOnAction((ActionEvent event) -> {
        String s= text.getText()+d.getText();
        text.setText(s);
        });
        e.setOnAction((ActionEvent event) -> {
        String s= text.getText()+e.getText();
        text.setText(s);
        });
        f.setOnAction((ActionEvent event) -> {
        String s= text.getText()+f.getText();
        text.setText(s);
        });
        g.setOnAction((ActionEvent event) -> {
        String s= text.getText()+g.getText();
        text.setText(s);
        });
        h.setOnAction((ActionEvent event) -> {
        String s= text.getText()+h.getText();
        text.setText(s);
        });
        i.setOnAction((ActionEvent event) -> {
        String s= text.getText()+i.getText();
        text.setText(s);
        });
        aa.setOnAction((ActionEvent event) -> {
        String s= text.getText()+aa.getText();
        text.setText(s);
        });
        submit.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            String money=text.getText();
            System.out.println(money);
            gui=new GUI2(stage);
            gui.page2();
            if ((m)==1)
            {
                atm.withdraw(parseDouble(money));
            } else
                atm.deposit(parseDouble(money));
            stage2.setScene(scene2);
        }
    });

     scene=new Scene(grid2,300,300);
    
}
}
