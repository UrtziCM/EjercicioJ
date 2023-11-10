module EjercicioI {
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.controls;
	requires javafx.base;
	requires java.sql;
	requires java.desktop;
	opens controllers to javafx.fxml, javafx.base;
	opens application to javafx.fxml, javafx.graphics, javafx.base;

}