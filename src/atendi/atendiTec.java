
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

    }    

    public void atendimento() {
        //neste ponto nao estou conseguindo recuperar estes dados na primeira tela
        System.out.println("Desligue e ligue seu modem.\n Problema resolvido? 1=Sim 2=Não\n");

    }
    
}
