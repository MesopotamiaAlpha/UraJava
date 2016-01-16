
package atendi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import ura.FXMLDocumentController;


public class atendiTec implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    FXMLDocumentController importado = new FXMLDocumentController();
    importado.lblUltima.setText("AAAAA");
    }    

    public String atendimento() {
        int resposta;
        return "Desligue e ligue seu modem.\n Problema resolvido? 1=Sim 2=Não\n";

    }
    
}
