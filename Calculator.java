package Calculations;

public class Calculator extends javax.swing.JFrame 
{
    
    double firstnum;
    double secondnum;
    double result;
    String operations;

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn10;
    private javax.swing.JButton jBtn11;
    private javax.swing.JButton jBtn12;
    private javax.swing.JButton jBtn13;
    private javax.swing.JButton jBtn14;
    private javax.swing.JButton jBtn16;
    private javax.swing.JButton jBtn17;
    private javax.swing.JButton jBtn18;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTxtDisplay;
    // End of variables declaration
    
    public Calculator() 
    {
        initComponents();
        jRadioButton1.setEnabled(false); //On button Disable
    }
    public void Enable()
    {
        jTxtDisplay.setEnabled(true);
        jRadioButton1.setEnabled(false); // On button disable
        jRadioButton2.setEnabled(true); //Off button enable
        
       jBtn1.setEnabled(true);
       jBtn2.setEnabled(true);
       jBtn3.setEnabled(true);
       jBtn4.setEnabled(true);
       jBtn5.setEnabled(true);
       jBtn6.setEnabled(true);
       jBtn7.setEnabled(true);
       jBtn8.setEnabled(true);
       jBtn9.setEnabled(true);
       jBtn10.setEnabled(true);
       jBtn11.setEnabled(true);
       jBtn12.setEnabled(true);
       jBtn13.setEnabled(true);
       jBtn14.setEnabled(true);
       jBtn16.setEnabled(true);
       jBtn17.setEnabled(true);
       jBtn18.setEnabled(true);
    }
    
    public void Disable()
    {
        jTxtDisplay.setEnabled(false);
        jRadioButton1.setEnabled(true); // On button enable
        jRadioButton2.setEnabled(false); //Off button disable
       jBtn1.setEnabled(false);
       jBtn2.setEnabled(false);
       jBtn3.setEnabled(false);
       jBtn4.setEnabled(false);
       jBtn5.setEnabled(false);
       jBtn6.setEnabled(false);
       jBtn7.setEnabled(false);
       jBtn8.setEnabled(false);
       jBtn9.setEnabled(false);
       jBtn10.setEnabled(false);
       jBtn11.setEnabled(false);
       jBtn12.setEnabled(false);
       jBtn13.setEnabled(false);
       jBtn14.setEnabled(false);
       jBtn16.setEnabled(false);
       jBtn17.setEnabled(false);
       jBtn18.setEnabled(false);
    }
                              
    private void initComponents() 
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTxtDisplay = new javax.swing.JTextField();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtn10 = new javax.swing.JButton();
        jBtn11 = new javax.swing.JButton();
        jBtn12 = new javax.swing.JButton();
        jBtn13 = new javax.swing.JButton();
        jBtn14 = new javax.swing.JButton();
        jBtn16 = new javax.swing.JButton();
        jBtn17 = new javax.swing.JButton();
        jBtn18 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTxtDisplay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTxtDisplay.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDisplayActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn4.setText("4");
        jBtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtn4MousePressed(evt);
            }
        });
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtn10.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn10.setText("0");
        jBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn10ActionPerformed(evt);
            }
        });

        jBtn11.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn11.setText("+");
        jBtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn11ActionPerformed(evt);
            }
        });

        jBtn12.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn12.setText("-");
        jBtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn12ActionPerformed(evt);
            }
        });

        jBtn13.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn13.setText("/");
        jBtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn13ActionPerformed(evt);
            }
        });

        jBtn14.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn14.setText("*");
        jBtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn14ActionPerformed(evt);
            }
        });

        jBtn16.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn16.setText(".");
        jBtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn16ActionPerformed(evt);
            }
        });

        jBtn17.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn17.setText("C");
        jBtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn17ActionPerformed(evt);
            }
        });

        jBtn18.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jBtn18.setText("=");
        jBtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn18ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton1.setText("On");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton2.setText("Off");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtDisplay)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxtDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtn18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }                       

    private void jTxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {
    }                                           

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jTxtDisplay.getText() + jBtn3.getText();
        jTxtDisplay.setText(EnterNumber);
    }                                     

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {              
        String EnterNumber = jTxtDisplay.getText() + jBtn1.getText();
        jTxtDisplay.setText(EnterNumber);
    }                                     

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
    String EnterNumber = jTxtDisplay.getText() + jBtn2.getText();
        jTxtDisplay.setText(EnterNumber);
    }                                     

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String EnterNumber = jTxtDisplay.getText() + jBtn4.getText();
        jTxtDisplay.setText(EnterNumber);
    }                                     

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jTxtDisplay.getText() + jBtn5.getText();
        jTxtDisplay.setText(EnterNumber);
    }                                     

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jTxtDisplay.getText() + jBtn6.getText();
        jTxtDisplay.setText(EnterNumber);
    }                                     

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jTxtDisplay.getText() + jBtn7.getText();
        jTxtDisplay.setText(EnterNumber);
    }                                     

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jTxtDisplay.getText() + jBtn8.getText();
        jTxtDisplay.setText(EnterNumber);
    }                                     

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jTxtDisplay.getText() + jBtn9.getText();
        jTxtDisplay.setText(EnterNumber);
    }                                     

    private void jBtn10ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jTxtDisplay.getText() + jBtn10.getText();
        jTxtDisplay.setText(EnterNumber);
    }                                      

    private void jBtn11ActionPerformed(java.awt.event.ActionEvent evt) {
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "+";
    }                                      

    private void jBtn12ActionPerformed(java.awt.event.ActionEvent evt) {
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "-";
    }                                      

    private void jBtn13ActionPerformed(java.awt.event.ActionEvent evt) {
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "/";
    }                                      

    private void jBtn14ActionPerformed(java.awt.event.ActionEvent evt) {
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "*";
    }                                      

    private void jBtn16ActionPerformed(java.awt.event.ActionEvent evt) {
        String EnterNumber = jTxtDisplay.getText() + jBtn16.getText();
        jTxtDisplay.setText(EnterNumber);
    }                                      

    private void jBtn17ActionPerformed(java.awt.event.ActionEvent evt) {
        jTxtDisplay.setText("");
       
    }                                      

    private void jBtn18ActionPerformed(java.awt.event.ActionEvent evt) {
        String answer;
        secondnum = Double.parseDouble(jTxtDisplay.getText());
        
        if (operations == "+")
        {
            result = firstnum + secondnum;
            answer = String.format("%.0f", result);
            jTxtDisplay.setText(answer);
        }
        else if (operations == "-")
        {
            result = firstnum - secondnum;
            answer = String.format("%.0f", result);
            jTxtDisplay.setText(answer);
        }
        else if (operations == "*")
        {
            result = firstnum * secondnum;
            answer = String.format("%.0f", result);
            jTxtDisplay.setText(answer);
        }
        
        else if (operations == "/")
        {
            result = firstnum / secondnum;
            answer = String.format("%.0f", result);
            jTxtDisplay.setText(answer);
        }
        
        else if (operations == "%")
        {
            result = firstnum % secondnum;
            answer = String.format("%.0f", result);
            jTxtDisplay.setText(answer);
        }
        
    }                                      

    private void jBtn4MousePressed(java.awt.event.MouseEvent evt) {     
    }                                  

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Enable(); //call enable method
        
    }                                             

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Disable(); //call disable method
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
                    
                   
}
