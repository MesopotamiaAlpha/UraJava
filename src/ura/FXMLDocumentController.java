
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
                    atendiTec atendimentoTec = new atendiTec();//Aqui preciso transformar o atendimento tec em um objeto para chamar ele logo a baixo
                    LblMensagem.setText(atendimentoTec.atendimento());//Aqui eu chamo o outro pacote
                    break;
                case 2:
                    System.out.println("Opção 3");
                    break;
        }
    }

    public void atendimentoTecnico (){
        System.out.println("Atendimento técnico");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LblMensagem.setText("Olá! Escolha seu atendimento! \n 1= Suporte técnico \n 2= Financeiro \n 3= Compras \n Digite sua opção na caixa abaixo");
        
        
    }
}    
