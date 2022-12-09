/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarysystem;

import java.awt.Color;

/**
 *
 * @author GebreegziabherG
 */
public class MoreInfoWindow extends javax.swing.JFrame {

    /**
     * Creates new form LibraryMemberWindow
     */
    public MoreInfoWindow() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        panelLinkManageMembers = new javax.swing.JPanel();
        imgManageMembers = new javax.swing.JLabel();
        labelManageMembers = new javax.swing.JLabel();
        panelLinkManageBooks = new javax.swing.JPanel();
        imgManageBooks = new javax.swing.JLabel();
        labelManageBooks = new javax.swing.JLabel();
        panelLinkCheckoutRecords = new javax.swing.JPanel();
        imgCheckoutRecords = new javax.swing.JLabel();
        labelCheckoutRecords = new javax.swing.JLabel();
        panelLinkMoreInfo = new javax.swing.JPanel();
        imgMoreInfo = new javax.swing.JLabel();
        labelMoreInfo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnCloseWindow = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        jPanel1.setBackground(new java.awt.Color(53, 137, 224));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("  Features");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        panelLinkManageMembers.setBackground(new java.awt.Color(53, 137, 224));
        panelLinkManageMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLinkManageMembersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelLinkManageMembersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelLinkManageMembersMouseExited(evt);
            }
        });

        imgManageMembers.setBackground(new java.awt.Color(53, 137, 224));
        imgManageMembers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgManageMembers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_account_20px.png"))); // NOI18N
        imgManageMembers.setOpaque(true);
        imgManageMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgManageMembersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgManageMembersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgManageMembersMouseExited(evt);
            }
        });

        labelManageMembers.setBackground(new java.awt.Color(53, 137, 224));
        labelManageMembers.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        labelManageMembers.setForeground(new java.awt.Color(255, 255, 255));
        labelManageMembers.setText(" Manage Library Members");
        labelManageMembers.setOpaque(true);
        labelManageMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelManageMembersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelManageMembersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelManageMembersMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelLinkManageMembersLayout = new javax.swing.GroupLayout(panelLinkManageMembers);
        panelLinkManageMembers.setLayout(panelLinkManageMembersLayout);
        panelLinkManageMembersLayout.setHorizontalGroup(
            panelLinkManageMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLinkManageMembersLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(imgManageMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelManageMembers, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
        );
        panelLinkManageMembersLayout.setVerticalGroup(
            panelLinkManageMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgManageMembers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelManageMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelLinkManageBooks.setBackground(new java.awt.Color(53, 137, 224));
        panelLinkManageBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLinkManageBooksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelLinkManageBooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelLinkManageBooksMouseExited(evt);
            }
        });

        imgManageBooks.setBackground(new java.awt.Color(53, 137, 224));
        imgManageBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgManageBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_book_20px.png"))); // NOI18N
        imgManageBooks.setOpaque(true);
        imgManageBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgManageBooksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgManageBooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgManageBooksMouseExited(evt);
            }
        });

        labelManageBooks.setBackground(new java.awt.Color(53, 137, 224));
        labelManageBooks.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        labelManageBooks.setForeground(new java.awt.Color(255, 255, 255));
        labelManageBooks.setText(" Manage Books");
        labelManageBooks.setOpaque(true);
        labelManageBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelManageBooksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelManageBooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelManageBooksMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelLinkManageBooksLayout = new javax.swing.GroupLayout(panelLinkManageBooks);
        panelLinkManageBooks.setLayout(panelLinkManageBooksLayout);
        panelLinkManageBooksLayout.setHorizontalGroup(
            panelLinkManageBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLinkManageBooksLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(imgManageBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelManageBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLinkManageBooksLayout.setVerticalGroup(
            panelLinkManageBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgManageBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelManageBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelLinkCheckoutRecords.setBackground(new java.awt.Color(53, 137, 224));
        panelLinkCheckoutRecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLinkCheckoutRecordsMouseClicked(evt);
            }
        });

        imgCheckoutRecords.setBackground(new java.awt.Color(53, 137, 224));
        imgCheckoutRecords.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCheckoutRecords.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_to_do_20px.png"))); // NOI18N
        imgCheckoutRecords.setOpaque(true);
        imgCheckoutRecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgCheckoutRecordsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgCheckoutRecordsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgCheckoutRecordsMouseExited(evt);
            }
        });

        labelCheckoutRecords.setBackground(new java.awt.Color(53, 137, 224));
        labelCheckoutRecords.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        labelCheckoutRecords.setForeground(new java.awt.Color(255, 255, 255));
        labelCheckoutRecords.setText(" Checkout Records");
        labelCheckoutRecords.setOpaque(true);
        labelCheckoutRecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCheckoutRecordsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCheckoutRecordsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCheckoutRecordsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelLinkCheckoutRecordsLayout = new javax.swing.GroupLayout(panelLinkCheckoutRecords);
        panelLinkCheckoutRecords.setLayout(panelLinkCheckoutRecordsLayout);
        panelLinkCheckoutRecordsLayout.setHorizontalGroup(
            panelLinkCheckoutRecordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLinkCheckoutRecordsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(imgCheckoutRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelCheckoutRecords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLinkCheckoutRecordsLayout.setVerticalGroup(
            panelLinkCheckoutRecordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgCheckoutRecords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelCheckoutRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelLinkMoreInfo.setBackground(new java.awt.Color(60, 170, 230));

        imgMoreInfo.setBackground(new java.awt.Color(60, 170, 230));
        imgMoreInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMoreInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_info_20px.png"))); // NOI18N
        imgMoreInfo.setOpaque(true);

        labelMoreInfo.setBackground(new java.awt.Color(60, 170, 230));
        labelMoreInfo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        labelMoreInfo.setForeground(new java.awt.Color(255, 255, 255));
        labelMoreInfo.setText(" More info");
        labelMoreInfo.setOpaque(true);

        javax.swing.GroupLayout panelLinkMoreInfoLayout = new javax.swing.GroupLayout(panelLinkMoreInfo);
        panelLinkMoreInfo.setLayout(panelLinkMoreInfoLayout);
        panelLinkMoreInfoLayout.setHorizontalGroup(
            panelLinkMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLinkMoreInfoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(imgMoreInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelMoreInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLinkMoreInfoLayout.setVerticalGroup(
            panelLinkMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgMoreInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelMoreInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLinkManageMembers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelLinkManageBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelLinkCheckoutRecords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelLinkMoreInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelLinkManageMembers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLinkManageBooks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLinkCheckoutRecords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLinkMoreInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnCloseWindow.setBackground(new java.awt.Color(255, 255, 255));
        btnCloseWindow.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCloseWindow.setForeground(new java.awt.Color(51, 51, 51));
        btnCloseWindow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCloseWindow.setText("X");
        btnCloseWindow.setOpaque(true);
        btnCloseWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseWindowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseWindowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseWindowMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Library Management System");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("System version 1.0.0");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Read our terms and conditions");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnCloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnLoginExitMouseClicked

    private void btnLoginExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginExitMouseEntered
        btnCloseWindow.setFont(new java.awt.Font("Segoe UI", 1, 22));
    }//GEN-LAST:event_btnLoginExitMouseEntered

    private void btnLoginExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginExitMouseExited
        btnCloseWindow.setFont(new java.awt.Font("Segoe UI", 0, 18));
    }//GEN-LAST:event_btnLoginExitMouseExited

    private void btnCloseWindowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseWindowMouseEntered
        btnCloseWindow.setBackground(Color.red);
        btnCloseWindow.setForeground(Color.white);
    }//GEN-LAST:event_btnCloseWindowMouseEntered

    private void btnCloseWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseWindowMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseWindowMouseClicked

    private void panelLinkManageMembersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLinkManageMembersMouseEntered
        linkManageMembersMouseEntered();
    }//GEN-LAST:event_panelLinkManageMembersMouseEntered

    private void panelLinkManageMembersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLinkManageMembersMouseExited
        linkManageMembersMouseExited();
    }//GEN-LAST:event_panelLinkManageMembersMouseExited

    private void imgCheckoutRecordsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCheckoutRecordsMouseEntered
        linkCheckoutRecordsMouseEntered();
    }//GEN-LAST:event_imgCheckoutRecordsMouseEntered

    private void imgCheckoutRecordsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCheckoutRecordsMouseExited
        linkCheckoutRecordsMouseExited();
    }//GEN-LAST:event_imgCheckoutRecordsMouseExited

    private void labelCheckoutRecordsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCheckoutRecordsMouseExited
        linkCheckoutRecordsMouseExited();
    }//GEN-LAST:event_labelCheckoutRecordsMouseExited

    private void labelCheckoutRecordsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCheckoutRecordsMouseEntered
        linkCheckoutRecordsMouseEntered();
    }//GEN-LAST:event_labelCheckoutRecordsMouseEntered

    private void imgManageMembersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgManageMembersMouseEntered
        linkManageMembersMouseEntered();
    }//GEN-LAST:event_imgManageMembersMouseEntered

    private void labelManageMembersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageMembersMouseEntered
        linkManageMembersMouseEntered();
    }//GEN-LAST:event_labelManageMembersMouseEntered

    private void imgManageMembersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgManageMembersMouseExited
        linkManageMembersMouseExited();
    }//GEN-LAST:event_imgManageMembersMouseExited

    private void labelManageMembersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageMembersMouseExited
        linkManageMembersMouseExited();
    }//GEN-LAST:event_labelManageMembersMouseExited

    private void btnCloseWindowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseWindowMouseExited
        btnCloseWindow.setBackground(Color.white);
        btnCloseWindow.setForeground(Color.black);
    }//GEN-LAST:event_btnCloseWindowMouseExited

    private void panelLinkManageMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLinkManageMembersMouseClicked
        navigateToLibraryMemberWindow();
    }//GEN-LAST:event_panelLinkManageMembersMouseClicked

    private void imgManageMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgManageMembersMouseClicked
        navigateToLibraryMemberWindow();
    }//GEN-LAST:event_imgManageMembersMouseClicked

    private void labelManageMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageMembersMouseClicked
        navigateToLibraryMemberWindow();
    }//GEN-LAST:event_labelManageMembersMouseClicked

    private void panelLinkCheckoutRecordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLinkCheckoutRecordsMouseClicked
        navigateToCheckoutRecordWindow();
    }//GEN-LAST:event_panelLinkCheckoutRecordsMouseClicked

    private void imgCheckoutRecordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCheckoutRecordsMouseClicked
        navigateToCheckoutRecordWindow();
    }//GEN-LAST:event_imgCheckoutRecordsMouseClicked

    private void labelCheckoutRecordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCheckoutRecordsMouseClicked
        navigateToCheckoutRecordWindow();
    }//GEN-LAST:event_labelCheckoutRecordsMouseClicked

    private void panelLinkManageBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLinkManageBooksMouseClicked
        navigateToBookWindow();
    }//GEN-LAST:event_panelLinkManageBooksMouseClicked

    private void imgManageBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgManageBooksMouseClicked
        navigateToBookWindow();
    }//GEN-LAST:event_imgManageBooksMouseClicked

    private void labelManageBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageBooksMouseClicked
        navigateToBookWindow();
    }//GEN-LAST:event_labelManageBooksMouseClicked

    private void panelLinkManageBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLinkManageBooksMouseEntered
        linkManageBooksMouseEntered();
    }//GEN-LAST:event_panelLinkManageBooksMouseEntered

    private void panelLinkManageBooksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLinkManageBooksMouseExited
        linkManageBooksMouseExited();
    }//GEN-LAST:event_panelLinkManageBooksMouseExited

    private void imgManageBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgManageBooksMouseEntered
        linkManageBooksMouseEntered();
    }//GEN-LAST:event_imgManageBooksMouseEntered

    private void imgManageBooksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgManageBooksMouseExited
        linkManageBooksMouseExited();
    }//GEN-LAST:event_imgManageBooksMouseExited

    private void labelManageBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageBooksMouseEntered
        linkManageBooksMouseEntered();
    }//GEN-LAST:event_labelManageBooksMouseEntered

    private void labelManageBooksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManageBooksMouseExited
        linkManageBooksMouseExited();
    }//GEN-LAST:event_labelManageBooksMouseExited
    private void navigateToLibraryMemberWindow(){
        this.setVisible(false);
        LibraryMemberWindow libraryMember = new LibraryMemberWindow();
        
        FrameDragListener frameDragListener = new FrameDragListener(libraryMember);
        libraryMember.addMouseListener(frameDragListener);
        libraryMember.addMouseMotionListener(frameDragListener);
        libraryMember.setLocationRelativeTo(null);
        libraryMember.setVisible(true);
    }
    
    private void navigateToBookWindow(){
        this.setVisible(false);
        BookWindow bookWindow = new BookWindow();
        
        FrameDragListener frameDragListener = new FrameDragListener(bookWindow);
        bookWindow.addMouseListener(frameDragListener);
        bookWindow.addMouseMotionListener(frameDragListener);
        bookWindow.setLocationRelativeTo(null);
        bookWindow.setVisible(true);
    }
    
    private void navigateToCheckoutRecordWindow(){
        this.setVisible(false);
        CheckoutRecordWindow checkoutRecordWindow = new CheckoutRecordWindow();
        
        FrameDragListener frameDragListener = new FrameDragListener(checkoutRecordWindow);
        checkoutRecordWindow.addMouseListener(frameDragListener);
        checkoutRecordWindow.addMouseMotionListener(frameDragListener);
        checkoutRecordWindow.setLocationRelativeTo(null);
        checkoutRecordWindow.setVisible(true);
    }
    
    private void linkManageMembersMouseEntered(){
        panelLinkManageMembers.setBackground(new java.awt.Color(60, 170, 230));
        imgManageMembers.setBackground(new java.awt.Color(60, 170, 230));
        labelManageMembers.setBackground(new java.awt.Color(60, 170, 230));
    }
    private void linkManageMembersMouseExited(){
        panelLinkManageMembers.setBackground(new java.awt.Color(53, 137, 224));
        imgManageMembers.setBackground(new java.awt.Color(53, 137, 224));
        labelManageMembers.setBackground(new java.awt.Color(53, 137, 224));
    }
    private void linkManageBooksMouseEntered(){
        panelLinkManageBooks.setBackground(new java.awt.Color(60, 170, 230));
        imgManageBooks.setBackground(new java.awt.Color(60, 170, 230));
        labelManageBooks.setBackground(new java.awt.Color(60, 170, 230));
    }
    private void linkManageBooksMouseExited(){
        panelLinkManageBooks.setBackground(new java.awt.Color(53, 137, 224));
        imgManageBooks.setBackground(new java.awt.Color(53, 137, 224));
        labelManageBooks.setBackground(new java.awt.Color(53, 137, 224));
    }
    private void linkCheckoutRecordsMouseEntered(){
        panelLinkCheckoutRecords.setBackground(new java.awt.Color(60, 170, 230));
        imgCheckoutRecords.setBackground(new java.awt.Color(60, 170, 230));
        labelCheckoutRecords.setBackground(new java.awt.Color(60, 170, 230));
    }
    private void linkCheckoutRecordsMouseExited(){
        panelLinkCheckoutRecords.setBackground(new java.awt.Color(53, 137, 224));
        imgCheckoutRecords.setBackground(new java.awt.Color(53, 137, 224));
        labelCheckoutRecords.setBackground(new java.awt.Color(53, 137, 224));
    }
    private void linkMoreInfoMouseEntered(){
        panelLinkMoreInfo.setBackground(new java.awt.Color(60, 170, 230));
        imgMoreInfo.setBackground(new java.awt.Color(60, 170, 230));
        labelMoreInfo.setBackground(new java.awt.Color(60, 170, 230));
    }
    private void linkMoreInfoMouseExited(){
        panelLinkMoreInfo.setBackground(new java.awt.Color(53, 137, 224));
        imgMoreInfo.setBackground(new java.awt.Color(53, 137, 224));
        labelMoreInfo.setBackground(new java.awt.Color(53, 137, 224));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCloseWindow;
    private javax.swing.JLabel imgCheckoutRecords;
    private javax.swing.JLabel imgManageBooks;
    private javax.swing.JLabel imgManageMembers;
    private javax.swing.JLabel imgMoreInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelCheckoutRecords;
    private javax.swing.JLabel labelManageBooks;
    private javax.swing.JLabel labelManageMembers;
    private javax.swing.JLabel labelMoreInfo;
    private javax.swing.JPanel panelLinkCheckoutRecords;
    private javax.swing.JPanel panelLinkManageBooks;
    private javax.swing.JPanel panelLinkManageMembers;
    private javax.swing.JPanel panelLinkMoreInfo;
    // End of variables declaration//GEN-END:variables
}
