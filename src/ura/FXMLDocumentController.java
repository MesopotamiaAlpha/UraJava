
package ura;



import atendi.atendiTec;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    public Label LblMensagem;
    public Button BtnBotao;
    public TextField lblCaixa;
    public Label lblUltima;
    
    @FXML
    public void clicouBotao (ActionEvent event) {
        LblMensagem.setText("Nao aconteceu nada");
        
    }
    
    
    public void ultimaOpcao (ActionEvent event){
                
        int teste;
        teste = Integer.parseInt(lblCaixa.getText());
        lblUltima.setText("Ultima opção escolhida: " + teste);
        switch (teste){
                case 1:
                       teste = 0;
                       LblMensagem.setText("Atendimento tecnico");
                       atendimentoTecnico();
                    break;
                case 2:
                    System.out.println("Opção 2");
                    break;
                default:
                    LblMensagem.setText("Opção invalida");
        }
    }

    public void atendimentoTecnico (){
        LblMensagem.setText("Desligue e ligue seu modem \n Problema resolvido?");
//nesta linha erro de no lbl caixa ja ter uma valor setao,entao ele passa direto
        lblCaixa.setText(null);
        int teste2;
        teste2 = Integer.parseInt(lblCaixa.getText());
        switch (teste2){
            case 1:
                LblMensagem.setText("Atendimento concluido \n obrigado");
                break;
            default:
                LblMensagem.setText("Continuação do atendimento");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LblMensagem.setText("Olá! Escolha seu atendimento! \n 1= Suporte técnico \n 2= Financeiro \n 3= Compras \n Digite sua opção na caixa abaixo");
        
        
    }
}    
