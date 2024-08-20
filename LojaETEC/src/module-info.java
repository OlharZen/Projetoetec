module LojaETEC {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	
	opens br.com.etec.model to javafx.graphics, javafx.fxml;
}
