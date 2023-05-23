package com.example.term_project_java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Pane pane=new Pane();
        Scene scene = new Scene(fxmlLoader.load(),320,240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
    public abstract class PublicTransport{
        protected double price;
        protected int no_of_tickets;
        protected String ticket_ID;
        protected ArrayList<String> ticket_class= new ArrayList<>();
        protected double distance;
        protected double route_time;
        protected String destination;
        protected abstract String getroute();
        protected abstract String getduration();

        protected boolean extraluggage()
        {
return false;
        }

    }

}
 class Ferry
{
    protected int FerryID;
    protected String Starting_Station;
    protected double FerrySpeed;
    protected double LoadTime;

    protected Boolean onWater()
    {
        return true;

    }


}
