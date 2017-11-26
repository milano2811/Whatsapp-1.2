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
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Conversa implements Serializable{
    private ArrayList<Mensagem> conversa = new ArrayList<>(); //ArrayList que armazena todas as mensagens de um contato
    private String contato; // Telefone ou nome do contato
    private String statusContato; //Implementado de modo diferente
    private String dataHoraOnlineContato;//pode ser alterado o tipo
    
    
    public Conversa() {
        
    }

    public Conversa(String contato) {
    this.contato = contato;
    }
    
    public void adicionarMensagem(String emissor, String mensagem){ //Adiciona mensagem ao ArrayList conversa
        int ultMsg = 0; //Variavel que armazena a posição da mensagem
        
        conversa.add(new Mensagem(emissor, mensagem, horaLocal())); //Adiciona nova mensagem
        
        ultMsg = conversa.size()-1; //grava a posição da ultima mensagem
        conversa.get(ultMsg).setStatusMensagem("Enviando"); //Altera o status da mensagem para enviando
        try { 
            Thread.sleep(300); //delay de envio
        } catch (InterruptedException ex) { //tratamento de erro do delay
            Logger.getLogger(Conversa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conversa.get(ultMsg).setStatusMensagem("Enviado"); //Altera o status da mensagem para enviado
        try {
            Thread.sleep(300); //Delay de recebimento
        } catch (InterruptedException ex) { //tratamento de erro do delay
            Logger.getLogger(Conversa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conversa.get(ultMsg).setStatusMensagem("Recebido"); //Altera o Status para Recebido
        
    }  
    
    public ArrayList<Mensagem> buscarMensagens(String palavra){ // Busca e retorna todas as mensagens encontradas na forma de um ArrayList
        ArrayList<Mensagem> mensagensEncontradas = new ArrayList<>();
        for (Mensagem msg : conversa) {
            if (msg.getMensagem().contains(palavra)) { //Armazena no ArrayList somente as mensagens encontradas
                mensagensEncontradas.add(msg);
            }
        }
        
        return mensagensEncontradas;
    }
    
    public ArrayList<Mensagem> mostrarMensagens(){ // Retorna um arrayList de mensagens 
        ArrayList<Mensagem> mensagens = new ArrayList<>();
        for (Mensagem msg : conversa) { //Adiciona as mensagens 
            mensagens.add(msg);
        }
        
        return mensagens;
    }

    
    
    public String getMensagens(){ //Metodo de criação da formatação das mensagens da conversa
        StringBuilder sb = new StringBuilder();
        if (conversa.size() > 0) {
            for (Mensagem mensagem : conversa) {
            sb.append(mensagem.getMensagem());
            sb.append("\n");
            sb.append("    ");
            sb.append(mensagem.getTelEmissor());
            sb.append(" - ");
            sb.append(mensagem.getDataHora());
            sb.append(" - ");
            sb.append(mensagem.getStatusMensagem());
            sb.append("\n");
            }
        }
        return sb.toString();
    }
    
    private String horaLocal(){ //Metodo de formatação da data e hora da mensagem
        int dia, mes, ano;
        int hora, minuto, segundo;
        String horario;
        
        dia = LocalDateTime.now().getDayOfMonth();
        mes = LocalDateTime.now().getMonth().getValue();
        ano = LocalDateTime.now().getYear();
        
        hora = LocalDateTime.now().getHour();
        minuto = LocalDateTime.now().getMinute();
        segundo = LocalDateTime.now().getSecond();
        
        horario = dia + "/" + mes + "/" + ano + " - " + hora + ":" + minuto + ":" + segundo;
        
        return horario;
    }
    
    
    //Metodos get e set
    public ArrayList<Mensagem> getConversa(){
        return conversa;
    }

    public void setDataHoraOnlineContato(String dataHoraOnlineContato) {
        this.dataHoraOnlineContato = dataHoraOnlineContato;
    }

    public String getDataHoraOnlineContato() {
        return dataHoraOnlineContato;
    }
    
    public String getContato() {
        return contato;
    }
    
}
