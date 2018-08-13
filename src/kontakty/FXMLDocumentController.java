/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontakty;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author 3104316
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML private ListView<String> lista;
    @FXML private Button dodaj;
    @FXML private Button usun;
    @FXML private TextField imie;
    @FXML private TextField tel;
    @FXML private TextField nazwisko;
    private ObservableList<String> listaKontaktow;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       int i = lista.getSelectionModel().getSelectedIndex();
       listaKontaktow.remove(i);
    }
    @FXML
    private void handleButtonAction2(ActionEvent event) { 
        listaKontaktow.add(imie.getText() + " "  + nazwisko.getText() + " "+ tel.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Jacek 987654123");
        arrayList.add("Marek 665411322");
        arrayList.add("Ala 604413211");
        arrayList.add("Krystian 981001354");
        
        listaKontaktow = FXCollections.observableArrayList(arrayList);
        lista.setItems(listaKontaktow);
        
    }    
    
}
