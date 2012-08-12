/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Spiel.View;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;

/**
 *
 * @author lukas
 */
public class Menu extends javax.swing.JPanel implements KeyListener {
MainFrame mainfr;
    public Menu(MainFrame mainfr) {
        initComponents();
        this.mainfr=mainfr;
        addKeyListener(this);
    }
//TODO vernünftiges Menü machen
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        newGameButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        saveGameButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setForeground(new java.awt.Color(255, 255, 255));
        setNextFocusableComponent(newGameButton);

        newGameButton.setText("New Game");
        newGameButton.setBorder(null);
        newGameButton.setBorderPainted(false);
        buttonGroup1.add(newGameButton);
        newGameButton.setSelected(true);
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });
        newGameButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newGameButtonKeyPressed(evt);
            }
        });

        loadButton.setText("Load Game");
        buttonGroup1.add(loadButton);
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        helpButton.setText("Help");
        buttonGroup1.add(helpButton);

        saveGameButton.setText("Save Game");
        buttonGroup1.add(saveGameButton);
        saveGameButton.setEnabled(false);
        saveGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveGameButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        buttonGroup1.add(exitButton);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(helpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveGameButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(newGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loadButton)
                .addGap(2, 2, 2)
                .addComponent(saveGameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        
        mainfr.openGameFrame();
        mainfr.getGame().resumeThread();


    }//GEN-LAST:event_newGameButtonActionPerformed

    private void newGameButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newGameButtonKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
            mainfr.openGameFrame();
            
        }
        
    }//GEN-LAST:event_newGameButtonKeyPressed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
     mainfr.getGame().load();
        mainfr.openGameFrame();
        
    }//GEN-LAST:event_loadButtonActionPerformed

    private void saveGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveGameButtonActionPerformed
      mainfr.getGame().save();
      mainfr.getGamepanel().requestFocus();
    }//GEN-LAST:event_saveGameButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed


   public void setNewGameButtonText(String text) {
        this.newGameButton.setText(text);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton newGameButton;
    private javax.swing.JButton saveGameButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
switch (e.getKeyCode()) {
            case KeyEvent.VK_ESCAPE:
                mainfr.openGameMenu();
                break;
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public JButton getHelpButton() {
        return helpButton;
    }

    public JButton getLoadButton() {
        return loadButton;
    }

    public MainFrame getMainfr() {
        return mainfr;
    }

    public JButton getNewGameButton() {
        return newGameButton;
    }

    public JButton getSaveGameButton() {
        return saveGameButton;
    }


}

