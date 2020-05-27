package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
   public void start(Stage primaryStage) throws Exception{

    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));//布局文件
        primaryStage.setTitle("javafx计算器");
       primaryStage.setScene(new Scene(root));
       primaryStage.show();
      primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.jpg"))); //添加icon

      primaryStage.setAlwaysOnTop(true); //上级显示
      primaryStage.setResizable(false); //进制最大化
    }

    public static void main(String[] args) {
       launch(args);

    }
}
