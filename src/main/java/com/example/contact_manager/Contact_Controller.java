package com.example.contact_manager;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;







public class Contact_Controller {

    @FXML
    private TextField nameInput;

    @FXML
    private TextField phoneInput;

    @FXML
    private TextField emailInput;


    @FXML
    private ListView<Contact> contactListView;

    @FXML
    protected  void addContact(){
        String name = nameInput.getText().trim();
        String phone = phoneInput.getText().trim();
        String email = emailInput.getText().trim();



        if(!name.isEmpty() && !phone.isEmpty() && !email.isEmpty()){
            Contact newContact = new Contact(name, phone, email);
            contactListView.getItems().add(newContact);
            nameInput.clear();
            phoneInput.clear();
            emailInput.clear();
        }
    }


    @FXML
    protected void deleteContact(){
        Contact selectedContact  = contactListView.getSelectionModel().getSelectedItem();
        if(selectedContact != null){
            contactListView.getItems().remove(selectedContact);
        }
    }


}
