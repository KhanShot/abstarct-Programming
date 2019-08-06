import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.security.sasl.SaslClient;
import java.awt.*;
import java.beans.EventHandler;

public class Test extends Application{
//C:\Users\User\Desktop\a\aba.mp3
    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        String path = "C:\\Users\\User\\Desktop\\LESSONS\\java development\\AudioClip\\src\\sounds\\do.wav";
        Do NoteDo = new Do(path,1,1,100);
        Re re = new Re("C:\\Users\\User\\Desktop\\LESSONS\\java development\\AudioClip\\src\\sounds\\re.wav",5,1,100);
        Mi NoteMi = new Mi("C:\\Users\\User\\Desktop\\LESSONS\\java development\\AudioClip\\src\\sounds\\mi.wav",1,1,100);
        Fa fa = new Fa("C:\\Users\\User\\Desktop\\LESSONS\\java development\\AudioClip\\src\\sounds\\fa.wav",1,1,100);
        Sol sol = new Sol("C:\\Users\\User\\Desktop\\LESSONS\\java development\\AudioClip\\src\\sounds\\sol.wav",1,1,100);
        La la = new La("C:\\Users\\User\\Desktop\\LESSONS\\java development\\AudioClip\\src\\sounds\\la.wav",1,1,100);
        SI si = new SI("C:\\Users\\User\\Desktop\\LESSONS\\java development\\AudioClip\\src\\sounds\\si.wav",1,1,100);
        Composite co = new Composite();



        GridPane pane= new GridPane();
        Scene scene = new Scene(pane,600,600);
        primaryStage.setScene(scene);

        javafx.scene.control.Button bado = new javafx.scene.control.Button("Do");
        javafx.scene.control.Button bare = new javafx.scene.control.Button("Re");
        javafx.scene.control.Button bami = new javafx.scene.control.Button("Mi");
        javafx.scene.control.Button bafa = new javafx.scene.control.Button("Fa");
        javafx.scene.control.Button baso = new javafx.scene.control.Button("Sol");
        javafx.scene.control.Button bala = new javafx.scene.control.Button("La");
        javafx.scene.control.Button basi = new javafx.scene.control.Button("Si");
        javafx.scene.control.Button play = new javafx.scene.control.Button("Play");

        bado.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                co.add(NoteDo);
            }
        });
        bare.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                co.add(re);
            }
        });
        bami.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                co.add(NoteMi);
            }
        });
        bafa.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                co.add(fa);
            }
        });
        baso.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                co.add(sol);
            }
        });
        bala.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                co.add(la);
            }
        });
        basi.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                co.add(si);
            }
        });
        play.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                co.Play();
            }
        });
        pane.add(bado,0,0);
        pane.add(bare,0,1);
        pane.add(bami,0,2);
        pane.add(bafa,0,4);
        pane.add(baso,0,5);
        pane.add(bala,0,6);
        pane.add(basi,0,7);
        pane.add(play,5,5);
        primaryStage.show();
    }
}
