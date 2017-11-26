/*
Nome: Alanis Bianchini
Nome: Bruno Milano Pedroso da Silva      RA: 21009643
Nome: Erik Kaue paroline jose dos santos RA: 20960545
Nome: Matheus Marques                    RA: 20981531
Nome: Milena                             RA: 20956610
Nome: Wurdolf                            RA: 20974511
*/
package whatsapp;

import java.io.Serializable;

public class Mensagem implements Serializable{
    private String telEmissor;//Nome ou telefone do emissor
    private String mensagem; //Mensagem
    private String statusMensagem; //Status da mensagem
    private String dataHora;//Data e hora

    public Mensagem(String telEmissor, String mensagem, String dataHora) { //Construtor da classe mensagem
        this.telEmissor = telEmissor;
        this.mensagem = mensagem;
        this.dataHora = dataHora;
    }

    //Metodos get e set
    public String getTelEmissor() {
        return telEmissor;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getStatusMensagem() {
        return statusMensagem;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setStatusMensagem(String statusMensagem) {
        this.statusMensagem = statusMensagem;
    }
    
    
}
