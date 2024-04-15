module com.example.magic_8_ball {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires java.desktop;

    opens com.example.magic_8_ball to javafx.fxml;
    exports com.example.magic_8_ball;
    exports Magic_8_ball_2;
    opens Magic_8_ball_2 to javafx.fxml;
}