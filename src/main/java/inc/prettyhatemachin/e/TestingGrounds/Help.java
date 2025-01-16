package inc.prettyhatemachin.e.TestingGrounds;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Help extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        String path = "C:\\Users\\offsp\\IdeaProjects\\RPG-Manager\\src\\main\\resources\\inc\\prettyhatemachin\\e\\App\\Help.mp4";

        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaPlayer.setAutoPlay(true);
        Group root = new Group();
        root.getChildren().add(mediaView);
        Scene scene = new Scene(root,800,450);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rick");
        mediaView.fitWidthProperty().bind(primaryStage.widthProperty());
        mediaView.fitHeightProperty().bind(primaryStage.heightProperty());
        mediaView.setPreserveRatio(true);
        primaryStage.show();


    }
    public static void main(String[] args) throws IOException {
        launch();

    }
}