/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nEW u
 */
public class Index2 extends javax.swing.JFrame {

    /**
     * Creates new form Index2
     */
    private static String action="";
    private static double num1=0;
    private static double num2=0;
    private static double result=0;
    public Index2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textfild = new javax.swing.JTextField();
        but1 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        buut4 = new javax.swing.JButton();
        but5 = new javax.swing.JButton();
        but6 = new javax.swing.JButton();
        but7 = new javax.swing.JButton();
        but8 = new javax.swing.JButton();
        but9 = new javax.swing.JButton();
        butzero = new javax.swing.JButton();
        butdot = new javax.swing.JButton();
        butclear = new javax.swing.JButton();
        butplus = new javax.swing.JButton();
        butminus = new javax.swing.JButton();
        butmul = new javax.swing.JButton();
        butdiv = new javax.swing.JButton();
        butsqr = new javax.swing.JButton();
        butq = new javax.swing.JButton();
        butcut = new javax.swing.JButton();
        butequal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 5));

        textfild.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        textfild.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 5));

        but1.setBackground(new java.awt.Color(153, 51, 255));
        but1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        but1.setText("1");
        but1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });

        but2.setBackground(new java.awt.Color(153, 51, 255));
        but2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        but2.setText("2");
        but2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });

        but3.setBackground(new java.awt.Color(153, 51, 255));
        but3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        but3.setText("3");
        but3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });

        buut4.setBackground(new java.awt.Color(153, 51, 255));
        buut4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        buut4.setText("4");
        buut4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        buut4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buut4ActionPerformed(evt);
            }
        });

        but5.setBackground(new java.awt.Color(153, 51, 255));
        but5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        but5.setText("5");
        but5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        but5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but5ActionPerformed(evt);
            }
        });

        but6.setBackground(new java.awt.Color(153, 51, 255));
        but6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        but6.setText("6");
        but6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        but6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but6ActionPerformed(evt);
            }
        });

        but7.setBackground(new java.awt.Color(153, 51, 255));
        but7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        but7.setText("7");
        but7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        but7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but7ActionPerformed(evt);
            }
        });

        but8.setBackground(new java.awt.Color(153, 51, 255));
        but8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        but8.setText("8");
        but8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        but8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but8ActionPerformed(evt);
            }
        });

        but9.setBackground(new java.awt.Color(153, 51, 255));
        but9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        but9.setText("9");
        but9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        but9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but9ActionPerformed(evt);
            }
        });

        butzero.setBackground(new java.awt.Color(153, 51, 255));
        butzero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        butzero.setText("0");
        butzero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        butzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butzeroActionPerformed(evt);
            }
        });

        butdot.setBackground(new java.awt.Color(153, 51, 255));
        butdot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        butdot.setText(".");
        butdot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        butdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butdotActionPerformed(evt);
            }
        });

        butclear.setBackground(new java.awt.Color(153, 51, 255));
        butclear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        butclear.setText("CE");
        butclear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        butclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butclearActionPerformed(evt);
            }
        });

        butplus.setBackground(new java.awt.Color(153, 51, 255));
        butplus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        butplus.setText("+");
        butplus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        butplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butplusActionPerformed(evt);
            }
        });

        butminus.setBackground(new java.awt.Color(153, 51, 255));
        butminus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        butminus.setText("-");
        butminus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        butminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butminusActionPerformed(evt);
            }
        });

        butmul.setBackground(new java.awt.Color(153, 51, 255));
        butmul.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        butmul.setText("*");
        butmul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        butmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butmulActionPerformed(evt);
            }
        });

        butdiv.setBackground(new java.awt.Color(153, 51, 255));
        butdiv.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        butdiv.setText("/");
        butdiv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        butdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butdivActionPerformed(evt);
            }
        });

        butsqr.setBackground(new java.awt.Color(153, 51, 255));
        butsqr.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        butsqr.setText("<html>\nx<sup>2</sup>\n</html>");
        butsqr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        butsqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butsqrActionPerformed(evt);
            }
        });

        butq.setBackground(new java.awt.Color(153, 51, 255));
        butq.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        butq.setText("<html>\nx<sup>3</sup>\n</html>");
        butq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        butq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butqActionPerformed(evt);
            }
        });

        butcut.setBackground(new java.awt.Color(153, 51, 255));
        butcut.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        butcut.setText("X");
        butcut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        butcut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butcutActionPerformed(evt);
            }
        });

        butequal.setBackground(new java.awt.Color(153, 51, 255));
        butequal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        butequal.setText("=");
        butequal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        butequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butequalActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 0, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CALCULATOR");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butplus, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(butsqr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                    .addComponent(butzero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buut4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(but7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(butq, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(butcut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(butdot, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(butclear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(but8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(but9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(but5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(but6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(butdiv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(butmul, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(butminus, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(butequal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(textfild, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(textfild, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butplus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buut4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butminus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(but9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butmul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(but7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(but8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(butdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butclear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(butzero, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(butdot, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(butcut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butsqr, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butq, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(butequal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        // TODO add your handling code here:
        String str=textfild.getText()+but1.getText();
        textfild.setText(str);
    }//GEN-LAST:event_but1ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
        // TODO add your handling code here:
        String str=textfild.getText()+but2.getText();
        textfild.setText(str);
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
        // TODO add your handling code here:
        String str=textfild.getText()+but3.getText();
        textfild.setText(str);
    }//GEN-LAST:event_but3ActionPerformed

    private void buut4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buut4ActionPerformed
        // TODO add your handling code here:
        String str=textfild.getText()+buut4.getText();
        textfild.setText(str);
    }//GEN-LAST:event_buut4ActionPerformed

    private void but5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but5ActionPerformed
        // TODO add your handling code here:
        String str=textfild.getText()+but5.getText();
        textfild.setText(str);
    }//GEN-LAST:event_but5ActionPerformed

    private void but6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but6ActionPerformed
        // TODO add your handling code here:
        String str=textfild.getText()+but6.getText();
        textfild.setText(str);
    }//GEN-LAST:event_but6ActionPerformed

    private void but7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but7ActionPerformed
        // TODO add your handling code here:
        String str=textfild.getText()+but7.getText();
        textfild.setText(str);
    }//GEN-LAST:event_but7ActionPerformed

    private void but8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but8ActionPerformed
        // TODO add your handling code here:
        String str=textfild.getText()+but8.getText();
        textfild.setText(str);
    }//GEN-LAST:event_but8ActionPerformed

    private void but9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but9ActionPerformed
        // TODO add your handling code here:
        String str=textfild.getText()+but9.getText();
        textfild.setText(str);
    }//GEN-LAST:event_but9ActionPerformed

    private void butzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butzeroActionPerformed
        // TODO add your handling code here:
        String str=textfild.getText()+butzero.getText();
        textfild.setText(str);
    }//GEN-LAST:event_butzeroActionPerformed

    private void butdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butdotActionPerformed
        // TODO add your handling code here:
        String str=textfild.getText()+butdot.getText();
        textfild.setText(str);
    }//GEN-LAST:event_butdotActionPerformed

    private void butclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butclearActionPerformed
        // TODO add your handling code here:
     String str=butclear.getText();
     textfild.setText("");
    }//GEN-LAST:event_butclearActionPerformed

    private void butcutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butcutActionPerformed
        // TODO add your handling code here:
        String str=textfild.getText();
       str= str.substring(0,str.length()-1);
       textfild.setText(str);
    }//GEN-LAST:event_butcutActionPerformed

    private void butplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butplusActionPerformed
        // TODO add your handling code here:
        action=butplus.getText();
        num1=Double.valueOf(textfild.getText());
        textfild.setText("");
    }//GEN-LAST:event_butplusActionPerformed

    private void butminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butminusActionPerformed
        // TODO add your handling code here:
        action=butminus.getText();
        num1=Double.valueOf(textfild.getText());
        textfild.setText("");
    }//GEN-LAST:event_butminusActionPerformed

    private void butmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butmulActionPerformed
        // TODO add your handling code here:
        action=butmul.getText();
        num1=Double.valueOf(textfild.getText());
        textfild.setText("");
    }//GEN-LAST:event_butmulActionPerformed

    private void butdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butdivActionPerformed
        // TODO add your handling code here:
        action=butdiv.getText();
        num1=Double.valueOf(textfild.getText());
        textfild.setText("");
    }//GEN-LAST:event_butdivActionPerformed

    private void butequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butequalActionPerformed
        // TODO add your handling code here:
        num2=Double.valueOf(textfild.getText());
        if(action=="+")
        {
            result=(double)(num1+num2);
        }
        else if(action=="-")
        {
            result=(double)(num1-num2);
        }
        else if(action=="*")
        {
            result=(double)(num1*num2);
        }
        else if(action=="/")
        {
            result=(double)(num1/num2);
        }
        textfild.setText(String.valueOf(result));
    }//GEN-LAST:event_butequalActionPerformed

    private void butsqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butsqrActionPerformed
        // TODO add your handling code here:
        String str=textfild.getText();
        num1=Double.valueOf(str);
         double po=Math.pow(num1, 2);
         textfild.setText(String.valueOf(po));
    }//GEN-LAST:event_butsqrActionPerformed

    private void butqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butqActionPerformed
        // TODO add your handling code here:
        String str=textfild.getText();
        num1=Double.valueOf(str);
        double q=Math.pow(num1, 3);
        textfild.setText(String.valueOf(q));
    }//GEN-LAST:event_butqActionPerformed

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
            java.util.logging.Logger.getLogger(Index2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but1;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private javax.swing.JButton but5;
    private javax.swing.JButton but6;
    private javax.swing.JButton but7;
    private javax.swing.JButton but8;
    private javax.swing.JButton but9;
    private javax.swing.JButton butclear;
    private javax.swing.JButton butcut;
    private javax.swing.JButton butdiv;
    private javax.swing.JButton butdot;
    private javax.swing.JButton butequal;
    private javax.swing.JButton butminus;
    private javax.swing.JButton butmul;
    private javax.swing.JButton butplus;
    private javax.swing.JButton butq;
    private javax.swing.JButton butsqr;
    private javax.swing.JButton butzero;
    private javax.swing.JButton buut4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textfild;
    // End of variables declaration//GEN-END:variables
}
