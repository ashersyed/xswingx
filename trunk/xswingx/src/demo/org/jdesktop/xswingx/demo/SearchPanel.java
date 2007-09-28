/*
 * SearchPanel.java
 *
 * Created on April 10, 2007, 6:51 PM
 */

package org.jdesktop.xswingx.demo;

import java.awt.Color;
import java.awt.Insets;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.text.DefaultFormatterFactory;

import org.jdesktop.xswingx.JXSearchField;
import org.jdesktop.xswingx.RecentSearches;

/**
 *
 * @author  peterw
 */
public class SearchPanel extends javax.swing.JPanel {
    private final DefaultFormatterFactory ff = new DefaultFormatterFactory(new InsetsFormatter());
    private boolean change = false;
    private OpaqueHandler opaqueHandler = new OpaqueHandler();
    
    /** Creates new form SearchPanel */
    public SearchPanel() {
        initComponents();
        searchField.addFocusListener(opaqueHandler);
        searchField.addMouseListener(opaqueHandler);
        
        change = true;
        rbMac.setSelected(searchField.isMacLayoutStyle());
        rbVista.setSelected(searchField.isVistaLayoutStyle());
        spnDelay.setValue(searchField.getInstantSearchDelay());
        change = false;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        styleGroup = new javax.swing.ButtonGroup();
        borderGroup = new javax.swing.ButtonGroup();
        modeGroup = new javax.swing.ButtonGroup();
        searchField = new org.jdesktop.xswingx.JXSearchField();
        jXTitledSeparator1 = new org.jdesktop.swingx.JXTitledSeparator();
        rbMac = new javax.swing.JRadioButton();
        rbVista = new javax.swing.JRadioButton();
        jXTitledSeparator2 = new org.jdesktop.swingx.JXTitledSeparator();
        rbDefaultBorder = new javax.swing.JRadioButton();
        rbLineBorder = new javax.swing.JRadioButton();
        slBorderThickness = new javax.swing.JSlider();
        jXTitledSeparator3 = new org.jdesktop.swingx.JXTitledSeparator();
        txtPromptField = new org.jdesktop.xswingx.JXPromptField();
        jXTitledSeparator4 = new org.jdesktop.swingx.JXTitledSeparator();
        txtMargin = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBtnMargin = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnResetMargins = new javax.swing.JButton();
        jXTitledSeparator5 = new org.jdesktop.swingx.JXTitledSeparator();
        cbFixedSize = new javax.swing.JCheckBox();
        spnColumns = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jXTitledSeparator6 = new org.jdesktop.swingx.JXTitledSeparator();
        btnSearchIcon = new javax.swing.JButton();
        btnResetIcons = new javax.swing.JButton();
        jXTitledSeparator7 = new org.jdesktop.swingx.JXTitledSeparator();
        jLabel6 = new javax.swing.JLabel();
        lblSearchText = new javax.swing.JLabel();
        cbOpaqueWhenFocused = new javax.swing.JCheckBox();
        cbPopup = new javax.swing.JCheckBox();
        rbInstant = new javax.swing.JRadioButton();
        rbRegular = new javax.swing.JRadioButton();
        cbPopupButton = new javax.swing.JCheckBox();
        btnResetStyle = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        spnDelay = new javax.swing.JSpinner();

        styleGroup.add(rbMac);
        styleGroup.add(rbVista);
        borderGroup.add(rbDefaultBorder);
        borderGroup.add(rbLineBorder);
        modeGroup.add(rbInstant);
        modeGroup.add(rbRegular);

        searchField.setColumns(15);
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                searchFieldPropertyChange(evt);
            }
        });

        jXTitledSeparator1.setTitle("Style");

        rbMac.setText("Mac");
        rbMac.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rbMac.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rbMac.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                layoutStyleChanged(evt);
            }
        });

        rbVista.setText("Vista");
        rbVista.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rbVista.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rbVista.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                layoutStyleChanged(evt);
            }
        });

        jXTitledSeparator2.setTitle("Border");

        rbDefaultBorder.setSelected(true);
        rbDefaultBorder.setText("Default");
        rbDefaultBorder.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rbDefaultBorder.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rbDefaultBorder.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                borderChanged(evt);
            }
        });

        rbLineBorder.setText("Line");
        rbLineBorder.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rbLineBorder.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rbLineBorder.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                borderChanged(evt);
            }
        });

        slBorderThickness.setMaximum(10);
        slBorderThickness.setMinorTickSpacing(1);
        slBorderThickness.setPaintTicks(true);
        slBorderThickness.setSnapToTicks(true);
        slBorderThickness.setToolTipText("Change thickness");
        slBorderThickness.setValue(1);
        slBorderThickness.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                borderChanged(evt);
            }
        });

        jXTitledSeparator3.setTitle("Prompt");

        txtPromptField.setPrompt("Enter Search Prompt");
        txtPromptField.setText(searchField.getPrompt());
        txtPromptField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                promptMayChanged(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                promptMayChanged(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                promptMayChanged(evt);
            }
        });

        jXTitledSeparator4.setTitle("Margins");

        txtMargin.setFormatterFactory(ff);
        txtMargin.setValue(searchField.getMargin());
        txtMargin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                marginChanged(evt);
            }
        });

        jLabel1.setText("Text Margin:");

        jLabel2.setText("Outer Margin:");

        txtBtnMargin.setFormatterFactory(ff);
        txtBtnMargin.setValue(searchField.getOuterMargin());
        txtBtnMargin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                btnMarginChanged(evt);
            }
        });

        jLabel3.setForeground(java.awt.SystemColor.textInactiveText);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Hit 'Escape' to clear search text.");

        jLabel4.setForeground(java.awt.SystemColor.textInactiveText);
        jLabel4.setText("top, left, bottom, right");

        btnResetMargins.setText("Reset to Default");
        btnResetMargins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetMarginsActionPerformed(evt);
            }
        });

        jXTitledSeparator5.setTitle("Other");

        cbFixedSize.setSelected(true);
        cbFixedSize.setText("Fixed Size:");
        cbFixedSize.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        cbFixedSize.setMargin(new java.awt.Insets(0, 0, 0, 0));
        cbFixedSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                columnsChanged(evt);
            }
        });

        spnColumns.setValue(15);
        spnColumns.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                columnsChanged(evt);
            }
        });

        jLabel5.setText("Columns");

        jXTitledSeparator6.setTitle("Icons");

        btnSearchIcon.setText("Change Search Icon...");
        btnSearchIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIconActionPerformed(evt);
            }
        });

        btnResetIcons.setText("Reset to Default");
        btnResetIcons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetIconsActionPerformed(evt);
            }
        });

        jXTitledSeparator7.setTitle("Search Mode");

        jLabel6.setText("Searching for:");

        lblSearchText.setText("nothing yet");

        cbOpaqueWhenFocused.setText("Only Opaque when Focused");
        cbOpaqueWhenFocused.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        cbOpaqueWhenFocused.setMargin(new java.awt.Insets(0, 0, 0, 0));
        cbOpaqueWhenFocused.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbOpaqueWhenFocusedStateChanged(evt);
            }
        });

        cbPopup.setText("With Popup Menu (Recent Searches)");
        cbPopup.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        cbPopup.setMargin(new java.awt.Insets(0, 0, 0, 0));
        cbPopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPopupActionPerformed(evt);
            }
        });

        rbInstant.setSelected(searchField.isInstantSearchMode());
        rbInstant.setText("Instant");
        rbInstant.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rbInstant.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rbInstant.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                searchModeChanged(evt);
            }
        });

        rbRegular.setSelected(searchField.isRegularSearchMode());
        rbRegular.setText("Regular");
        rbRegular.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rbRegular.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rbRegular.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                searchModeChanged(evt);
            }
        });

        cbPopupButton.setSelected(searchField.isUseSeperatePopupButton());
        cbPopupButton.setText("Use Seperate Popup Buton");
        cbPopupButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        cbPopupButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        cbPopupButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbPopupButtonStateChanged(evt);
            }
        });

        btnResetStyle.setText("Reset to Default");
        btnResetStyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetStyleActionPerformed(evt);
            }
        });

        jLabel7.setText("Milliseconds delay.");

        spnDelay.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnDelayStateChanged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jXTitledSeparator7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(searchField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                    .add(jXTitledSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(17, 17, 17)
                                        .add(cbPopupButton))
                                    .add(cbPopup))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 166, Short.MAX_VALUE)
                                .add(btnResetStyle))
                            .add(layout.createSequentialGroup()
                                .add(rbMac)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(rbVista))))
                    .add(jXTitledSeparator3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(txtPromptField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
                    .add(jXTitledSeparator2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(rbLineBorder)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(slBorderThickness, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                            .add(rbDefaultBorder)))
                    .add(layout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtBtnMargin, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                            .add(txtMargin, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jXTitledSeparator4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel4))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, btnResetMargins)
                    .add(jXTitledSeparator5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(btnSearchIcon)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 247, Short.MAX_VALUE)
                        .add(btnResetIcons))
                    .add(jXTitledSeparator6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel6)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(lblSearchText, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
                            .add(rbRegular)
                            .add(layout.createSequentialGroup()
                                .add(rbInstant)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(spnDelay, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel7))))
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(cbFixedSize)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(spnColumns, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 150, Short.MAX_VALUE)
                        .add(cbOpaqueWhenFocused)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(searchField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jXTitledSeparator7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rbRegular)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(rbInstant)
                    .add(spnDelay, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel7))
                .add(13, 13, 13)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(lblSearchText))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jXTitledSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(rbMac)
                            .add(rbVista))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cbPopup)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cbPopupButton))
                    .add(btnResetStyle))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jXTitledSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtPromptField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jXTitledSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rbDefaultBorder)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(slBorderThickness, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(rbLineBorder))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel4)
                    .add(jXTitledSeparator4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtMargin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtBtnMargin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnResetMargins)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jXTitledSeparator6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnResetIcons)
                    .add(btnSearchIcon))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jXTitledSeparator5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cbFixedSize)
                    .add(spnColumns, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5)
                    .add(cbOpaqueWhenFocused))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(new java.awt.Component[] {jLabel3, searchField}, org.jdesktop.layout.GroupLayout.VERTICAL);

        layout.linkSize(new java.awt.Component[] {rbLineBorder, slBorderThickness}, org.jdesktop.layout.GroupLayout.VERTICAL);

    }// </editor-fold>//GEN-END:initComponents

    private void spnDelayStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnDelayStateChanged
        searchField.setInstantSearchDelay((Integer)spnDelay.getValue());
    }//GEN-LAST:event_spnDelayStateChanged
    
    private void btnResetStyleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetStyleActionPerformed
        if (UIManager.getBoolean("SearchField.useSeperatePopupButton")) {
            searchField.customSetUIProperty("useSeperatePopupButton",
                    Boolean.TRUE, true);
        } else {
            searchField.customSetUIProperty("useSeperatePopupButton",
                    Boolean.FALSE, true);
        }
        
        searchField.customSetUIProperty("layoutStyle", UIManager
                .get("SearchField.layoutStyle"), true);
        searchField.customSetUIProperty("promptFontStyle", UIManager
                .get("SearchField.promptFontStyle"), true);
    }//GEN-LAST:event_btnResetStyleActionPerformed
    
    private void cbPopupButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbPopupButtonStateChanged
        searchField.setUseSeperatePopupButton(cbPopupButton.isSelected());
    }//GEN-LAST:event_cbPopupButtonStateChanged
    
    private void searchModeChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_searchModeChanged
        if(rbInstant.isSelected()){
            searchField.setSearchMode(JXSearchField.SearchMode.INSTANT);
        }else{
            searchField.setSearchMode(JXSearchField.SearchMode.REGULAR);
        }
    }//GEN-LAST:event_searchModeChanged
    
    private void cbPopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPopupActionPerformed
        if(cbPopup.isSelected()){
            new RecentSearches("search.demo").install(searchField);
        }else{
            searchField.setSearchPopupMenu(null);
        }
    }//GEN-LAST:event_cbPopupActionPerformed
    
    private void cbOpaqueWhenFocusedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbOpaqueWhenFocusedStateChanged
        opaqueHandler.setEnabled(cbOpaqueWhenFocused.isSelected());
    }//GEN-LAST:event_cbOpaqueWhenFocusedStateChanged
    
    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        lblSearchText.setText(searchField.getText());
        lblSearchText.revalidate();
        lblSearchText.repaint();
    }//GEN-LAST:event_searchFieldActionPerformed
    
    private void btnResetIconsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetIconsActionPerformed
        searchField.getSearchButton().setIcon(UIManager.getIcon("SearchField.icon"));
    }//GEN-LAST:event_btnResetIconsActionPerformed
    
    private void btnSearchIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIconActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        File f = fc.getSelectedFile();
        try{
            searchField.getSearchButton().setIcon(new ImageIcon(f.getAbsolutePath()));
            searchFieldChanged();
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_btnSearchIconActionPerformed
    
    private void columnsChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_columnsChanged
        if(cbFixedSize.isSelected()){
            searchField.setColumns((Integer)spnColumns.getValue());
        }else{
            searchField.setColumns(0);
        }
        searchFieldChanged();
    }//GEN-LAST:event_columnsChanged
    
    private void btnResetMarginsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetMarginsActionPerformed
        searchField.setMargin(UIManager.getInsets("TextField.margin"));
        searchField.setOuterMargin(UIManager.getInsets("SearchField.buttonMargin"));
    }//GEN-LAST:event_btnResetMarginsActionPerformed
    
    private void searchFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_searchFieldPropertyChange
        if(change) return;
        change = true;
        if("margin".equals(evt.getPropertyName())){
            txtMargin.setValue(searchField.getMargin());
        }
        if("buttonMargin".equals(evt.getPropertyName())){
            txtBtnMargin.setValue(searchField.getOuterMargin());
        }
        if("useSeperatePopupButton".equals(evt.getPropertyName())){
            cbPopupButton.setSelected(searchField.isUseSeperatePopupButton());
        }
        if("layoutStyle".equals(evt.getPropertyName())){
            rbMac.setSelected(searchField.isMacLayoutStyle());
            rbVista.setSelected(searchField.isVistaLayoutStyle());
        }
        if("instantSearchDelay".equals(evt.getPropertyName())){
            spnDelay.setValue(searchField.getInstantSearchDelay());
        }
        searchFieldChanged();
        change = false;
    }//GEN-LAST:event_searchFieldPropertyChange
    
    private void btnMarginChanged(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_btnMarginChanged
        if(change) return;
        if("value".equals(evt.getPropertyName())){
            searchField.setOuterMargin((Insets) txtBtnMargin.getValue());
        }
        searchFieldChanged();
    }//GEN-LAST:event_btnMarginChanged
    
    private void marginChanged(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_marginChanged
        if(change) return;
        if("value".equals(evt.getPropertyName())){
            searchField.setMargin((Insets) txtMargin.getValue());
        }
        searchFieldChanged();
    }//GEN-LAST:event_marginChanged
    
    private void promptMayChanged(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_promptMayChanged
        searchField.setPrompt(txtPromptField.getText());
        searchFieldChanged();
    }//GEN-LAST:event_promptMayChanged
    
    private void borderChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_borderChanged
        if(rbDefaultBorder.isSelected()){
            searchField.setBorder(UIManager.getBorder("TextField.border"));
        }else{
            searchField.setBorder(new LineBorder(Color.BLACK, slBorderThickness.getValue()));
        }
        searchFieldChanged();
    }//GEN-LAST:event_borderChanged
    
    private void layoutStyleChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_layoutStyleChanged
        if(change)return;
        if(rbMac.isSelected()){
            searchField.setLayoutStyle(JXSearchField.LayoutStyle.MAC);
        }else{
            searchField.setLayoutStyle(JXSearchField.LayoutStyle.VISTA);
        }
        searchFieldChanged();
    }//GEN-LAST:event_layoutStyleChanged
    
    private void searchFieldChanged() {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                validate();
                searchField.revalidate();
                searchField.repaint();
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup borderGroup;
    private javax.swing.JButton btnResetIcons;
    private javax.swing.JButton btnResetMargins;
    private javax.swing.JButton btnResetStyle;
    private javax.swing.JButton btnSearchIcon;
    private javax.swing.JCheckBox cbFixedSize;
    private javax.swing.JCheckBox cbOpaqueWhenFocused;
    private javax.swing.JCheckBox cbPopup;
    private javax.swing.JCheckBox cbPopupButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator1;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator2;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator3;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator4;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator5;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator6;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator7;
    private javax.swing.JLabel lblSearchText;
    private javax.swing.ButtonGroup modeGroup;
    private javax.swing.JRadioButton rbDefaultBorder;
    private javax.swing.JRadioButton rbInstant;
    private javax.swing.JRadioButton rbLineBorder;
    private javax.swing.JRadioButton rbMac;
    private javax.swing.JRadioButton rbRegular;
    private javax.swing.JRadioButton rbVista;
    private org.jdesktop.xswingx.JXSearchField searchField;
    private javax.swing.JSlider slBorderThickness;
    private javax.swing.JSpinner spnColumns;
    private javax.swing.JSpinner spnDelay;
    private javax.swing.ButtonGroup styleGroup;
    private javax.swing.JFormattedTextField txtBtnMargin;
    private javax.swing.JFormattedTextField txtMargin;
    private org.jdesktop.xswingx.JXPromptField txtPromptField;
    // End of variables declaration//GEN-END:variables
    
    public static class InsetsFormatter extends JFormattedTextField.AbstractFormatter{
        public Object stringToValue(String text) throws ParseException {
            String[] s = text.split(",");
            if(s.length == 4){
                return new Insets(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]));
            }
            return null;
        }
        
        public String valueToString(Object value) throws ParseException {
            if(value == null) return null;
            
            Insets i = (Insets) value;
            
            return i.top+","+i.left+","+i.bottom+","+i.right;
        }
    }
    
    class OpaqueHandler implements MouseListener, FocusListener{
        private boolean enabled;
        private boolean mousein;
        
        public void mouseClicked(MouseEvent e) {
        }
        
        public void mousePressed(MouseEvent e) {
        }
        
        public void mouseReleased(MouseEvent e) {
        }
        
        public void mouseEntered(MouseEvent e) {
            mousein = true;
            update();
        }
        
        public void mouseExited(MouseEvent e) {
            mousein = false;
            update();
        }
        
        public void focusGained(FocusEvent e) {
            update();
        }
        
        public void focusLost(FocusEvent e) {
            update();
        }
        
        public void update(){
            searchField.setOpaque(!isEnabled() || (searchField.isFocusOwner() || mousein));
        }
        
        public boolean isEnabled() {
            return enabled;
        }
        
        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
            update();
        }
    }
}
