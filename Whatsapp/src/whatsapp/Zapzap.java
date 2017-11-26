/*
Nome: Alanis Bianchini
Nome: Bruno Milano Pedroso da Silva      RA: 21009643
Nome: Erik Kaue paroline jose dos santos RA: 20960545
Nome: Matheus Marques                    RA: 20981531
Nome: Milena                             RA: 20956610
Nome: Wurdolf                            RA: 20974511
*/
package whatsapp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Zapzap extends javax.swing.JFrame {

    //caso não exista arquivo whatsapp
    static Whatsapp nov = new Whatsapp(); //Cria a classe Whatsapp que sera a base do app
    DefaultListModel conteudoListCont = new DefaultListModel(); //Cria a lista que ira armazenar o conteudo do Jlist

    public Zapzap() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupMensagem = new javax.swing.ButtonGroup();
        panelContatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listContatos = new javax.swing.JList<>();
        panelInformacoesUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelOpcoes = new javax.swing.JPanel();
        textPesquisar = new javax.swing.JTextField();
        buttonPesquisar = new javax.swing.JButton();
        buttonNovoContato = new javax.swing.JButton();
        panelinformacoesContato = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelMensagem = new javax.swing.JPanel();
        buttonEnviar = new javax.swing.JButton();
        textMensagem = new javax.swing.JTextField();
        rbVoce = new javax.swing.JRadioButton();
        rbContato = new javax.swing.JRadioButton();
        panelConversa = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        atConversa = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                janelaFechando(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                janelaAberta(evt);
            }
        });

        panelContatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        listContatos.setModel(conteudoListCont);
        listContatos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listContatosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listContatos);
        listContatos.getAccessibleContext().setAccessibleName("listContatos");

        javax.swing.GroupLayout panelContatosLayout = new javax.swing.GroupLayout(panelContatos);
        panelContatos.setLayout(panelContatosLayout);
        panelContatosLayout.setHorizontalGroup(
            panelContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelContatosLayout.setVerticalGroup(
            panelContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        panelInformacoesUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelInformacoesUsuario.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Fulano");

        jLabel2.setText("Online");

        javax.swing.GroupLayout panelInformacoesUsuarioLayout = new javax.swing.GroupLayout(panelInformacoesUsuario);
        panelInformacoesUsuario.setLayout(panelInformacoesUsuarioLayout);
        panelInformacoesUsuarioLayout.setHorizontalGroup(
            panelInformacoesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacoesUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformacoesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelInformacoesUsuarioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))))
        );
        panelInformacoesUsuarioLayout.setVerticalGroup(
            panelInformacoesUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacoesUsuarioLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        panelOpcoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.setActionCommand("jPesquisar");
        buttonPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPesquisarMouseClicked(evt);
            }
        });

        buttonNovoContato.setText("Novo Contato");
        buttonNovoContato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNovoContatoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelOpcoesLayout = new javax.swing.GroupLayout(panelOpcoes);
        panelOpcoes.setLayout(panelOpcoesLayout);
        panelOpcoesLayout.setHorizontalGroup(
            panelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textPesquisar)
                    .addGroup(panelOpcoesLayout.createSequentialGroup()
                        .addComponent(buttonPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonNovoContato)))
                .addContainerGap())
        );
        panelOpcoesLayout.setVerticalGroup(
            panelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPesquisar)
                    .addComponent(buttonNovoContato))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textPesquisar.getAccessibleContext().setAccessibleName("textPesquisar");
        buttonPesquisar.getAccessibleContext().setAccessibleName("buttonPesquisar");
        buttonNovoContato.getAccessibleContext().setAccessibleName("buttonNovoContato");

        panelinformacoesContato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Contato");

        jLabel4.setText("Status");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout panelinformacoesContatoLayout = new javax.swing.GroupLayout(panelinformacoesContato);
        panelinformacoesContato.setLayout(panelinformacoesContatoLayout);
        panelinformacoesContatoLayout.setHorizontalGroup(
            panelinformacoesContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinformacoesContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelinformacoesContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelinformacoesContatoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelinformacoesContatoLayout.setVerticalGroup(
            panelinformacoesContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinformacoesContatoLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMensagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonEnviar.setText("Enviar");
        buttonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnviarActionPerformed(evt);
            }
        });

        groupMensagem.add(rbVoce);
        rbVoce.setText("Você");

        groupMensagem.add(rbContato);
        rbContato.setLabel("Contato");

        javax.swing.GroupLayout panelMensagemLayout = new javax.swing.GroupLayout(panelMensagem);
        panelMensagem.setLayout(panelMensagemLayout);
        panelMensagemLayout.setHorizontalGroup(
            panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textMensagem)
                    .addGroup(panelMensagemLayout.createSequentialGroup()
                        .addComponent(rbVoce)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbContato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(buttonEnviar)))
                .addContainerGap())
        );
        panelMensagemLayout.setVerticalGroup(
            panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEnviar)
                    .addComponent(rbVoce)
                    .addComponent(rbContato))
                .addContainerGap())
        );

        buttonEnviar.getAccessibleContext().setAccessibleName("buttonEnviar");
        textMensagem.getAccessibleContext().setAccessibleName("textMensagem");
        rbVoce.getAccessibleContext().setAccessibleName("rbVoce");
        rbContato.getAccessibleContext().setAccessibleName("rbContato");

        panelConversa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        atConversa.setEditable(false);
        atConversa.setColumns(20);
        atConversa.setRows(5);
        jScrollPane2.setViewportView(atConversa);
        atConversa.getAccessibleContext().setAccessibleName("atConversa");

        javax.swing.GroupLayout panelConversaLayout = new javax.swing.GroupLayout(panelConversa);
        panelConversa.setLayout(panelConversaLayout);
        panelConversaLayout.setHorizontalGroup(
            panelConversaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConversaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        panelConversaLayout.setVerticalGroup(
            panelConversaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConversaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelContatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInformacoesUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelinformacoesContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelConversa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelInformacoesUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelinformacoesContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelContatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelConversa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelContatos.getAccessibleContext().setAccessibleName("panelContatos");
        panelInformacoesUsuario.getAccessibleContext().setAccessibleName("panelInformacoesUsuario");
        panelOpcoes.getAccessibleContext().setAccessibleName("panelOpcoes");
        panelOpcoes.getAccessibleContext().setAccessibleDescription("");
        panelinformacoesContato.getAccessibleContext().setAccessibleName("panelInformacoesContato");
        panelMensagem.getAccessibleContext().setAccessibleName("panelMensagem");
        panelConversa.getAccessibleContext().setAccessibleName("panelConversa");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNovoContatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNovoContatoMouseClicked
        String teste = ""; //String de verificação de campo textPesquisar
        teste = textPesquisar.getText(); 
        
        if (teste.isEmpty()) { //Teste de campo vazio
            JOptionPane.showMessageDialog(this, "Campo em branco...");
        } else {

            if (teste.charAt(0) == ' ') { //Teste de primeiro caracter vazio 
                JOptionPane.showMessageDialog(this, "Não inicie o contato com espaço");
                textPesquisar.setText("");

            } else {
                boolean verificadorContato = true; //Variavel do verificador de redundancia de contato

                for (int i = 0; i < nov.getTodasConversas().size(); i++) { //Estrutura do verificador de redundancia
                    if (nov.getTodasConversas().get(i).getContato().equalsIgnoreCase(textPesquisar.getText())) {
                        verificadorContato = false;
                    }
                }

                if (verificadorContato) {
                    nov.novaConversa(textPesquisar.getText()); //Adiciona nova conversa ao ArrayList todasConversas
                    Conversa c = new Conversa(textPesquisar.getText()); // Cria Objeto conversa para ser adicionado a lista do JList
                    conteudoListCont.addElement(c.getContato()); //Adiciona elemento ao JList
                    textPesquisar.setText("");

                } else { //Mensagem de erro de contato existente
                    JOptionPane.showMessageDialog(this, "Contato ja existe");
                    textPesquisar.setText("");
                }

            }
        }
    }//GEN-LAST:event_buttonNovoContatoMouseClicked

    private void listContatosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listContatosValueChanged
        int indiceLista = listContatos.getSelectedIndex(); // Armazena a posição do elemento da lista a ser manipulado 
        atConversa.setText(nov.mostrarMensagens(indiceLista)); // Exibe todas as conversas com o contato
        jLabel3.setText(nov.getTodasConversas().get(indiceLista).getContato()); // Altera o campo Nome do contato na interface
        jLabel4.setText("Offline - ultima vez online: "
                + nov.getTodasConversas().get(indiceLista).getDataHoraOnlineContato()); // Altera o campo com Status na interface

    }//GEN-LAST:event_listContatosValueChanged

    private void buttonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnviarActionPerformed
        String teste; //String de verificação de campo textPesquisar
        int indiceLista; // Variavel que armazena a posição do elemento da lista a ser manipulado
        teste = textMensagem.getText();
        if (listContatos.getSelectedIndex() >= 0) {
            indiceLista = listContatos.getSelectedIndex(); 

            if (teste.isEmpty()) { //Teste de campo vazio
                JOptionPane.showMessageDialog(this, "Por favor, digite a sua mensagem");

            } else if (rbVoce.isSelected()) { //RadioButton do Usuario

                if (nov.getTodasConversas().get(indiceLista).getConversa().size() > 0) { //Estrutura para setar todas as mensagens anteriores como lidas
                    for (int i = 0; i < nov.getTodasConversas().get(indiceLista).getConversa().size(); i++) {
                        nov.getTodasConversas().get(indiceLista).getConversa().get(i).setStatusMensagem("Lido");
                    }
                }

                nov.enviarMensagem(textMensagem.getText(), indiceLista); //Usuario envia mensagem para o contato
                nov.setStatusUsuario("Online"); //Altera status do usuario para online
                jLabel2.setText(nov.getStatusUsuario()); //Altera o status do usuario na interface para Online
                nov.getTodasConversas().get(indiceLista).setDataHoraOnlineContato(nov.horaLocal()); //Altera o horario que o contato esteve online pela ultima vez
                jLabel4.setText("Offline - ultima vez online: "
                        + nov.getTodasConversas().get(indiceLista).getDataHoraOnlineContato()); //Altera o status do contato na interface para Offline

            } else if (rbContato.isSelected()) { //RadioButton do Contato

                if (nov.getTodasConversas().get(indiceLista).getConversa().size() > 0) { //Estrutura para setar todas as mensagens anteriores como lidas
                    for (int i = 0; i < nov.getTodasConversas().get(indiceLista).getConversa().size(); i++) {
                        nov.getTodasConversas().get(indiceLista).getConversa().get(i).setStatusMensagem("Lido");
                    }
                }

                nov.receberMensagem(textMensagem.getText(), indiceLista); //Contato envia mensagem para o usuario
                nov.setStatusUsuario("Offline"); //Altera status do usuario para offline
                nov.setHoraUsuarioOnline(nov.horaLocal()); //Altera o horario que o usuario esteve online pela ultima vez
                jLabel2.setText(nov.getStatusUsuario() + " - ultima vez online: "
                        + nov.getHoraUsuarioOnline()); //Altera o status do usuario na interface
                jLabel4.setText("Online"); //Altera o status do contato na interface para Online

            } else { //Mensagem de erro de não seleção de emissor da mensagem
                JOptionPane.showMessageDialog(this, "Selecione a pessoa a enviar essa mensagem");

            }

            atConversa.setText(nov.getTodasConversas().get(indiceLista).getMensagens()); //Atualiza mensagens trocadas com este contato

        } else { // Mensagem de erro de não seleção de conversa
            JOptionPane.showMessageDialog(this, "Selecione com quem você irá conversar");

        }

        textMensagem.setText("");


    }//GEN-LAST:event_buttonEnviarActionPerformed

    private void buttonPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPesquisarMouseClicked

        String teste = ""; //String de verificação de campo textPesquisar
        teste = textPesquisar.getText();
        if (teste.isEmpty()) { //Teste de campo vazio
            JOptionPane.showMessageDialog(this, "Campo em branco...");

        } else {

            if (teste.charAt(0) == ' ') { //Teste de primeiro caracter vazio 
                JOptionPane.showMessageDialog(this, "Não inicie a pesquisa com espaço");
                textPesquisar.setText("");

            } else { // Estrutura de pesquisa de mensagens

                atConversa.setText(nov.pesquisarMensagem(textPesquisar.getText())); // Pesquisa mensagens a partir de uma palavra-chave
                textPesquisar.setText("");
            }
        }

    }//GEN-LAST:event_buttonPesquisarMouseClicked

    private void janelaFechando(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_janelaFechando
        try {
            FileOutputStream fos = new FileOutputStream("whatsapp.txt"); //Criação do arquivo que armazenara os dados da classe Whatsapp

            try {
                try (ObjectOutputStream oos = new ObjectOutputStream(fos)) { //Criação do objeto ObjectOutputStream que gravara os dados
                    oos.writeObject(nov); //Gravação dos dados da Classe Whatsapp
                    oos.flush(); // Envia os dados para a gravação no arquivo
                    oos.close(); //Termina o processo de gravação
                }
            } catch (IOException ex) { //Erro de gravação
                JOptionPane.showMessageDialog(null, "Falha de gravação");
            }
        } catch (FileNotFoundException ex) { //Erro de gravação
            JOptionPane.showMessageDialog(null, "Falha de gravação");
        }

    }//GEN-LAST:event_janelaFechando

    private void janelaAberta(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_janelaAberta
        if (nov.getTodasConversas().size() > 0) { //Carrega todas as conersas para o JList listContatos
            for (int i = 0; i < nov.getTodasConversas().size(); i++) {
                conteudoListCont.addElement(nov.getTodasConversas().get(i).getContato());
            }
        }

    }//GEN-LAST:event_janelaAberta

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        int escolha; //variavel de manipulaçao do menu

        try {
            FileInputStream fis = new FileInputStream("whatsapp.txt"); //Seleciona o arquivo que sera lido
            ObjectInputStream ois = new ObjectInputStream(fis); // Cria o objeto ObjectInputStream que lera os dados
            nov = (Whatsapp) ois.readObject(); //carrega os dados no objeto nov (Whatsapp)
            ois.close(); //Termina a operação de leitura
        } catch (FileNotFoundException fnf) { //Tratamento de erro de arquivo de dados não encontrado
            JOptionPane.showMessageDialog(null, "Arquivo de origem não encontrado...Procurando por backup");
            try {
                BufferedReader bf2 = new BufferedReader(new FileReader("backup.txt"));
            } catch (FileNotFoundException fnf2) {
                do {
                    escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Problema em leitura do backup..." // Escolha de opção de como proceder
                            + "\nVocê deseja executar o programa sem seus contatos?"
                            + "\n1-Sim" //Executar sem o arquivo de texto
                            + "\n2-Não(encerrar programa)")); //Encerrar o programa
                    if (escolha == 2) {
                        System.exit(0);
                    }

                } while (escolha != 1);
            }
        }

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Zapzap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zapzap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zapzap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zapzap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Zapzap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atConversa;
    private javax.swing.JButton buttonEnviar;
    private javax.swing.JButton buttonNovoContato;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.ButtonGroup groupMensagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listContatos;
    private javax.swing.JPanel panelContatos;
    private javax.swing.JPanel panelConversa;
    private javax.swing.JPanel panelInformacoesUsuario;
    private javax.swing.JPanel panelMensagem;
    private javax.swing.JPanel panelOpcoes;
    private javax.swing.JPanel panelinformacoesContato;
    private javax.swing.JRadioButton rbContato;
    private javax.swing.JRadioButton rbVoce;
    private javax.swing.JTextField textMensagem;
    private javax.swing.JTextField textPesquisar;
    // End of variables declaration//GEN-END:variables
}
