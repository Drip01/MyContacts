module com.example.myContacts {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.xml;

	opens com.example.myContacts to javafx.fxml;
	opens com.example.myContacts.datamodel to javafx.fxml;
	exports com.example.myContacts;
	exports com.example.myContacts.datamodel;
}
