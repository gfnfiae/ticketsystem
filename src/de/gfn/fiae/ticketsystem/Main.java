package de.gfn.fiae.ticketsystem;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
     * Data als observable list 
     */
    private ObservableList<Veranstalltung> vData = FXCollections.observableArrayList();
    
    public Main() {
        vData.add(new Veranstalltung("Testveranstalltung Oper 1", "Buchen"));
        vData.add(new Veranstalltung("Testveranstalltung Oper 2", "Buchen"));
        vData.add(new Veranstalltung("Testveranstalltung Oper 3", "Buchen"));
    }
    
    public ObservableList<Veranstalltung> getVData() {
        return vData;
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
