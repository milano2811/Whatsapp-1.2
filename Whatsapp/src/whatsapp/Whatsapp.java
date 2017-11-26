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

public class Whatsapp implements Serializable{

    private ArrayList<Conversa> todasConversas = new ArrayList<>(); //ArrayList contendo todas as conversas
    private String nomeUsuario = "Fulano"; //Nome do Usuario
    private String telUsuario = "1234-5678"; //Telefone do Usuario
    private String statusUsuario = "Online"; //Status do Usuario
    private String horaUsuarioOnline; //Ultima vez que o usuario esteve online
    private String contato;

    public void novaConversa(String contato) { //Adiciona uma nova conversa ao ArrayList
        todasConversas.add(new Conversa(contato));
    }

    public ArrayList<Conversa> getTodasConversas() { //retorna o ArrayList todasConversas
        return todasConversas;
    }

    public void enviarMensagem(String mensagem, int indiceLista) { //Metodo de envio de mensagem do usuario    
        todasConversas.get(indiceLista).adicionarMensagem(nomeUsuario, mensagem);
    }

    public void receberMensagem(String mensagem, int indiceLista) {//Metodo de envio de mensagem do contato
        todasConversas.get(indiceLista).adicionarMensagem(todasConversas.get(indiceLista).getContato(), mensagem);
    }

    public String pesquisarMensagem(String palavra) { //metodo de pesquisa de uma mensagem a partir de uma palavra-chave
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < todasConversas.size(); i++) { //Estrutura de criação de um string contendo todas as mensagens encontradas
            for (Mensagem msg : todasConversas.get(i).buscarMensagens(palavra)) {
                sb.append(msg.getMensagem());//mensagem
                sb.append("\n");
                sb.append("    ");
                sb.append(msg.getTelEmissor());//Emissor
                sb.append(" - ");
                sb.append(msg.getDataHora());//dataHora
                sb.append("\n\n");

            }
        }
        if (sb.toString().length() == 0) { //Mensagem de nenhuma palavra encontrada
            sb.append("Não foi encontrado esta palavra");
        }
        
        return sb.toString();
    }

    public String mostrarMensagens(int indiceLista){ //Metodo que retorna todas as mensagens de uma conversa
        StringBuilder sb = new StringBuilder();
        
        if (todasConversas.get(indiceLista).mostrarMensagens().size() > 0) { //Estrutura de criação de um string contendo todas as mensagens deste contato
            for (Mensagem msg : todasConversas.get(indiceLista).mostrarMensagens()) {
            sb.append(msg.getMensagem());
            sb.append("\n");
            sb.append("    ");
            sb.append(msg.getTelEmissor());
            sb.append(" - ");
            sb.append(msg.getDataHora());
            sb.append(" - ");
            sb.append(msg.getStatusMensagem());
            sb.append("\n");
            }
        }
        return sb.toString();
    }
    
    public String horaLocal(){ //Metodo de formatação da data e hora da mensagem
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
    
    //Metodos gets e sets utilizados
    public String getNomeUsuario() {
        return nomeUsuario; 
    }

    public String getTelUsuario() {
        return telUsuario;
    }

    public String getStatusUsuario() {
        return statusUsuario;
    }

    public String getHoraUsuarioOnline() {
        return horaUsuarioOnline;
    }

    public void setStatusUsuario(String statusUsuario) {
        this.statusUsuario = statusUsuario;
    }

    public void setHoraUsuarioOnline(String horaUsuarioOnline) {
        this.horaUsuarioOnline = horaUsuarioOnline;
    }
    
    

}

