module harrington.lab5colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens harrington.lab5colorchooser to javafx.fxml;
    exports harrington.lab5colorchooser;
}