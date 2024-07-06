/**
 
 */

package view;

import controller.EspecialidadeController;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import model.Especialidade;
import model.Validacao;
import tables.EspecialidadeTable;

public class Especialidades extends javax.swing.JFrame {
    EspecialidadeTable tableModelEspecialidades;
    EspecialidadeController ec;
    /**
     * Creates new form Especialidades
     */
    public Especialidades() {
        initComponents();
        
        this.ec = new EspecialidadeController();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Gerenciamento de especialidades");
        this.setIconImage(new ImageIcon(getClass().getResource("/images/icons/portfolio.png")).getImage());

        scrollEspecialidades.setBorder(BorderFactory.createEmptyBorder());
        scrollEspecialidades.getViewport().setBackground(new ColorUIResource(247,247,247));

        bNovoEspecialidade.setModel(new FixedButtonModel());
        bNovoEspecialidade.setBorder(BorderFactory.createEtchedBorder(0));
        
        bEditarEspecialidade.setModel(new FixedButtonModel());
        bEditarEspecialidade.setBorder(BorderFactory.createEtchedBorder(0));
        
        bRemoverEspecialidade.setModel(new FixedButtonModel());
        bRemoverEspecialidade.setBorder(BorderFactory.createEtchedBorder(0));
      
        tableModelEspecialidades = new EspecialidadeTable();
        List<Especialidade> especialidades = this.ec.especialidades();
        if(especialidades!=null)
            tableModelEspecialidades.addLista(especialidades);
        tableEspecialidades.setModel(tableModelEspecialidades);
        tableEspecialidades.setShowVerticalLines(false);
        tableEspecialidades.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(5);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(400);
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(5);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(400);
        
        UIManager.put("OptionPane.background",new ColorUIResource(255,255,255));
        UIManager.put("Panel.background",new ColorUIResource(255,255,255));
        UIManager.put("Button.background", Color.WHITE);
        UIManager.put("Button.focus", new ColorUIResource(new Color(0,0,0,0)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        scrollEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        navbar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        bNovoEspecialidade = new javax.swing.JButton();
        bRemoverEspecialidade = new javax.swing.JButton();
        bEditarEspecialidade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(920, 640));
        setMinimumSize(new java.awt.Dimension(920, 640));
        setResizable(false);

        background.setBackground(new java.awt.Color(247, 247, 247));

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableEspecialidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableEspecialidadesMousePressed(evt);
            }
        });
        scrollEspecialidades.setViewportView(tableEspecialidades);

        navbar.setBackground(new java.awt.Color(247, 247, 247));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setText("Nome");

        bNovoEspecialidade.setBackground(new java.awt.Color(0, 102, 52));
        bNovoEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bNovoEspecialidade.setForeground(new java.awt.Color(255, 255, 255));
        bNovoEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/plus-black-symbol.png"))); // NOI18N
        bNovoEspecialidade.setBorder(null);
        bNovoEspecialidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bNovoEspecialidade.setDoubleBuffered(true);
        bNovoEspecialidade.setFocusPainted(false);
        bNovoEspecialidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bNovoEspecialidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bNovoEspecialidadeFocusLost(evt);
            }
        });
        bNovoEspecialidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bNovoEspecialidadeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bNovoEspecialidadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bNovoEspecialidadeMouseExited(evt);
            }
        });
        bNovoEspecialidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bNovoEspecialidadeKeyPressed(evt);
            }
        });

        bRemoverEspecialidade.setBackground(new java.awt.Color(0, 102, 52));
        bRemoverEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bRemoverEspecialidade.setForeground(new java.awt.Color(255, 255, 255));
        bRemoverEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/trash.png"))); // NOI18N
        bRemoverEspecialidade.setBorder(null);
        bRemoverEspecialidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bRemoverEspecialidade.setDoubleBuffered(true);
        bRemoverEspecialidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bRemoverEspecialidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bRemoverEspecialidadeFocusLost(evt);
            }
        });
        bRemoverEspecialidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bRemoverEspecialidadeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bRemoverEspecialidadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bRemoverEspecialidadeMouseExited(evt);
            }
        });
        bRemoverEspecialidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bRemoverEspecialidadeKeyPressed(evt);
            }
        });

        bEditarEspecialidade.setBackground(new java.awt.Color(0, 102, 52));
        bEditarEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        bEditarEspecialidade.setForeground(new java.awt.Color(255, 255, 255));
        bEditarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit.png"))); // NOI18N
        bEditarEspecialidade.setBorder(null);
        bEditarEspecialidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bEditarEspecialidade.setDoubleBuffered(true);
        bEditarEspecialidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bEditarEspecialidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bEditarEspecialidadeFocusLost(evt);
            }
        });
        bEditarEspecialidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bEditarEspecialidadeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bEditarEspecialidadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bEditarEspecialidadeMouseExited(evt);
            }
        });
        bEditarEspecialidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bEditarEspecialidadeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bNovoEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEditarEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRemoverEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bNovoEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bRemoverEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bEditarEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollEspecialidades, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(navbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollEspecialidades, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(background, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNovoEspecialidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bNovoEspecialidadeMouseClicked
        this.cadastrar();
    }//GEN-LAST:event_bNovoEspecialidadeMouseClicked

    private void bNovoEspecialidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bNovoEspecialidadeMouseEntered
        bNovoEspecialidade.setBackground(Color.decode("#008542"));
    }//GEN-LAST:event_bNovoEspecialidadeMouseEntered

    private void bNovoEspecialidadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bNovoEspecialidadeMouseExited
        bNovoEspecialidade.setBackground(Color.decode("#006634"));
    }//GEN-LAST:event_bNovoEspecialidadeMouseExited

    private void bRemoverEspecialidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRemoverEspecialidadeMouseClicked
        this.remover();
    }//GEN-LAST:event_bRemoverEspecialidadeMouseClicked

    private void bRemoverEspecialidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRemoverEspecialidadeMouseEntered
        bRemoverEspecialidade.setBackground(Color.decode("#008542"));
    }//GEN-LAST:event_bRemoverEspecialidadeMouseEntered

    private void bRemoverEspecialidadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRemoverEspecialidadeMouseExited
        bRemoverEspecialidade.setBackground(Color.decode("#006634"));
    }//GEN-LAST:event_bRemoverEspecialidadeMouseExited

    private void tableEspecialidadesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEspecialidadesMousePressed
        int row = this.tableEspecialidades.getSelectedRow();
        if (row > -1) {
            Especialidade e = this.tableModelEspecialidades.getEspecialidade(row);
            if (e!=null) {
                tNome.setText(e.getNome());
            }
        }
    }//GEN-LAST:event_tableEspecialidadesMousePressed

    private void bEditarEspecialidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEditarEspecialidadeMouseClicked
        this.editar();
    }//GEN-LAST:event_bEditarEspecialidadeMouseClicked

    private void bEditarEspecialidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEditarEspecialidadeMouseEntered
        bEditarEspecialidade.setBackground(Color.decode("#008542"));
    }//GEN-LAST:event_bEditarEspecialidadeMouseEntered

    private void bEditarEspecialidadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEditarEspecialidadeMouseExited
        bEditarEspecialidade.setBackground(Color.decode("#006634"));
    }//GEN-LAST:event_bEditarEspecialidadeMouseExited

    private void bNovoEspecialidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bNovoEspecialidadeFocusGained
        bNovoEspecialidade.setBackground(Color.decode("#008542"));
    }//GEN-LAST:event_bNovoEspecialidadeFocusGained

    private void bNovoEspecialidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bNovoEspecialidadeFocusLost
        bNovoEspecialidade.setBackground(Color.decode("#006634"));
    }//GEN-LAST:event_bNovoEspecialidadeFocusLost

    private void bEditarEspecialidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bEditarEspecialidadeFocusGained
        bEditarEspecialidade.setBackground(Color.decode("#008542"));
    }//GEN-LAST:event_bEditarEspecialidadeFocusGained

    private void bEditarEspecialidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bEditarEspecialidadeFocusLost
        bEditarEspecialidade.setBackground(Color.decode("#006634"));
    }//GEN-LAST:event_bEditarEspecialidadeFocusLost

    private void bRemoverEspecialidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bRemoverEspecialidadeFocusGained
        bRemoverEspecialidade.setBackground(Color.decode("#008542"));
    }//GEN-LAST:event_bRemoverEspecialidadeFocusGained

    private void bRemoverEspecialidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bRemoverEspecialidadeFocusLost
        bRemoverEspecialidade.setBackground(Color.decode("#006634"));
    }//GEN-LAST:event_bRemoverEspecialidadeFocusLost

    private void bNovoEspecialidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bNovoEspecialidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.cadastrar();
        }
    }//GEN-LAST:event_bNovoEspecialidadeKeyPressed

    private void bEditarEspecialidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bEditarEspecialidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.editar();
        }
    }//GEN-LAST:event_bEditarEspecialidadeKeyPressed

    private void bRemoverEspecialidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bRemoverEspecialidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.remover();
        }
    }//GEN-LAST:event_bRemoverEspecialidadeKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Especialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Especialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Especialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Especialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Especialidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEditarEspecialidade;
    private javax.swing.JButton bNovoEspecialidade;
    private javax.swing.JButton bRemoverEspecialidade;
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel navbar;
    private javax.swing.JScrollPane scrollEspecialidades;
    private javax.swing.JTextField tNome;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void cadastrar() {
        String nome = tNome.getText();
        if (Validacao.isEmpty(nome)) {
            JOptionPane.showMessageDialog(null, "O campo Nome é obrigatório.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return ;
        }
        Especialidade e = new Especialidade();
        e.setNome(nome);
        if (this.ec.cadastrar(e)) {
            tNome.setText("");
            List<Especialidade> lista = ec.especialidades();
            if(lista!=null)
                this.tableModelEspecialidades.addLista(lista);
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao realizar a atualização dos dados. Tente novamente mais tarde ou contate o Administrador do sistema", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        tNome.requestFocusInWindow();
    }
    
    private void editar() {
        String nome = tNome.getText();
        if (Validacao.isEmpty(nome)) {
            JOptionPane.showMessageDialog(null, "O campo Nome é obrigatório.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return ;
        }
        
        int row = this.tableEspecialidades.getSelectedRow();
        if (row > -1) {
            Especialidade e = this.tableModelEspecialidades.getEspecialidade(row);
            e.setNome(nome);
            if (this.ec.editar(e)) {
                tNome.setText("");
                List<Especialidade> lista = ec.especialidades();
                if(lista!=null)
                    this.tableModelEspecialidades.addLista(lista);
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao realizar a atualização dos dados. Tente novamente mais tarde ou contate o Administrador do sistema", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma especialidade da tabela", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        tNome.requestFocusInWindow();
    }

    private void remover() {
        int row = this.tableEspecialidades.getSelectedRow();
        if(row > -1) {
            Especialidade e = this.tableModelEspecialidades.getEspecialidade(row);
            if (e == null) {
                JOptionPane.showMessageDialog(null, "Por favor, selecione uma especialidade da tabela.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Object[] options = { "Sim", "Não" };
                int resp = JOptionPane.showOptionDialog(null, "Deseja realmente excluir esta especialidade?", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE , null, options, options[0]);
                if (resp == 0) {
                    if (this.ec.remover(e)) {
                        tNome.setText("");
                        List<Especialidade> lista = this.ec.especialidades();
                        if(lista != null) {
                            this.tableModelEspecialidades.addLista(lista);
                        }
                    } else {
                       JOptionPane.showMessageDialog(null, "Ocorreu um erro ao realizar a exclusão da especiaidade. Tente novamente mais tarde ou contate o Administrador do sistema", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma especialidade da tabela", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        tNome.requestFocusInWindow();
    }
}
