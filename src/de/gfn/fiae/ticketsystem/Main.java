package de.gfn.fiae.ticketsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Stani
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Model.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("de/gfn/fiae/ticketsystem/style.css");
        
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Ticketsystem v0.1");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
