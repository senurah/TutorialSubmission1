module com.example.w4newproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.w4newproject to javafx.fxml;
    exports com.example.w4newproject;
}