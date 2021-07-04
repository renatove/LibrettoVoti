/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.librettovoti;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import it.polito.tdp.librettovoti.model.Libretto;
import it.polito.tdp.librettovoti.model.Voto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	/**
	 *  implementa il model
	 */
	private Libretto model;
	
	public void setModel(Libretto model) {
		this.model = model;
	}

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtEsame"
    private TextField txtEsame; // Value injected by FXMLLoader

    @FXML // fx:id="txtVoto"
    private TextField txtVoto; // Value injected by FXMLLoader

    @FXML // fx:id="txtData"
    private TextField txtData; // Value injected by FXMLLoader

    @FXML // fx:id="rLode"
    private RadioButton rLode; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML
    void btnInserisci(ActionEvent event) {
    	// leggi e controlla l'informazione
    	String nomeEsame = txtEsame.getText();
    	int votoInt = Integer.parseInt(txtVoto.getText());
    	LocalDate data = LocalDate.parse(txtData.getText());
    	boolean conLode = rLode.isSelected();
    	
    	// esegui l'operazione (inserisci)
    	Voto voto = new Voto(nomeEsame,votoInt,conLode,data);
    	model.add(voto);
    	
    	// aggiorna i risultati (notifica)
    	txtResult.setText(model.toString());
    	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtEsame != null : "fx:id=\"txtEsame\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtData != null : "fx:id=\"txtData\" was not injected: check your FXML file 'Scene.fxml'.";
        assert rLode != null : "fx:id=\"rLode\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}

