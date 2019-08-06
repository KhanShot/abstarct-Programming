import  java.util.Date;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.*;

public class Main extends Application{
    public static void main(String[] args) {
        Application.launch(String.valueOf(args));
        Pay pay = new Pay();
        Payable pb;
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Payable pb = null;

        GridPane pane = new GridPane();
        primaryStage.setTitle("Online SHop");
        Scene scene = new Scene(pane, 480,320);
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.setPadding(new Insets(35,35,30,45));
        pane.setHgap(20);
        pane.setVgap(15);

        Label sel = new Label("Please, choose product");
        pane.add(sel, 0,0,2,1);

        CheckBox s1 = new CheckBox("Mother Board  - $400");
        CheckBox s2 = new CheckBox("CPU           - $200");
        CheckBox s3 = new CheckBox("HDD           - $100");
        CheckBox s4 = new CheckBox("Memory        - $95");
        CheckBox s5 = new CheckBox("Printer       - $150");

        pane.add(s1, 1,3);
        pane.add(s2, 1, 4);
        pane.add(s3, 1,5);
        pane.add(s4, 1,6);
        pane.add(s5,1,7);
        Stage stage = new Stage();
        Button ok = new Button("ok");
        ok.setPrefSize(90,5);
        pane.add(ok, 3,9);
        ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                GridPane pane1 = new GridPane();
                pane1.setPadding(new Insets(30,30,30,30));
                Scene scene1 = new Scene(pane1, 320,200);
                stage.setScene(scene1);
                stage.show();
                stage.isAlwaysOnTop();
                Button yes = new Button("Yes");
                Button no = new Button("Back");
                Label qwe = new Label("Are you Sure?");
                pane1.add(qwe, 0,0);
                pane1.add(yes,1,1);
                pane1.add(no,4,1);
                no.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        stage.close();
                    }
                });
                yes.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        int total = 0;
                        GridPane pa = new GridPane();
                        Scene sca = new Scene(pa, 480,320);
                        if(s1.isSelected())
                            total += 400;
                        if(s2.isSelected())
                            total+= 200;
                        if(s3.isSelected())
                            total +=100;
                        if(s4.isSelected())
                            total += 95;
                        if(s5.isSelected())
                            total +=150;
                        String tat = ""+ total;
                        Label la= new Label("total price: " + tat);
                        primaryStage.setScene(sca);
                        primaryStage.show();
                        pa.add(la,1,3);
                        stage.close();

                        String pay = pb.pay();
                        Label label = new Label(pay);
                        pa.add(label,2,4);
                    }
                });
            }
        });
    }
}
