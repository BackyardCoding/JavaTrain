package de.dumbuya;

import de.dumbuya.Datamodel.Contact;
import de.dumbuya.Datamodel.ContactData;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Optional;

public class Controller {
    @FXML
    private BorderPane mainBorderPane;
    @FXML
    private TableView<Contact> contactsTable;
    private ContactData data;

    public void initialize() {
        data = new ContactData();
        data.loadContacts();
        contactsTable.setItems(data.getContacts());

    }
    @FXML
    public void showCreateNewContactDialog() {
        Dialog<ButtonType> dialog = new Dialog<ButtonType>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Add New Contact");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("contactDialog.fxml"));

        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch(IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK) {
            DialogController contactController = fxmlLoader.getController();
            Contact newContact = contactController.createContact();
            data.addContact(newContact);
            data.saveContacts();
        }
    }

    @FXML
    public void showEditContactDialog() {
        Contact selectedContact = contactsTable.getSelectionModel().getSelectedItem();
        Dialog<ButtonType> dialog = new Dialog<ButtonType>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Edit Contact");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("contactDialog.fxml"));

        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch(IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        DialogController dialogController = fxmlLoader.getController();
        dialogController.editContact(selectedContact);

        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {

            dialogController.updateContact(selectedContact);
            data.saveContacts();
        }
    }

    @FXML
    public void showDeleteContactDialog() {
        Contact selectedContact = contactsTable.getSelectionModel().getSelectedItem();
        deleteContact(selectedContact);
    }

    private void deleteContact(Contact contact) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(" Delete selected contact");
        alert.setHeaderText("Delete " + contact.getFirstName() + " " + contact.getLastName());
        alert.setContentText("Are you sure? Press OK to confirm or Cancel to abort");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.isPresent() && (result.get() == ButtonType.OK)) {
            contactsTable.getItems().remove(contact);
        }
    }
    @FXML
    public void handleExit() {
        Platform.exit();
    }
}
