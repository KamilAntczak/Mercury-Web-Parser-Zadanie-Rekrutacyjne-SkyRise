package com.graphic_Interface;

import com.myexceptions.AddressExceptions;
import com.statistics.HtmlTag;
import com.web_handling.WebConnections;
import com.statistics.ContentScraper;
import com.statistics.HistoryOfParsedSites;
import com.statistics.HtmlTagsCounter;
import com.statistics.SaveChoosenStat;
import com.statistics.TopTenTagsCounter;
import com.web_handling.AddressValidator;
import com.web_handling.AddressReader;

/**
 *
 * @author Kamil
 */
public class MercuryParserGui extends javax.swing.JFrame {

    String pageJson;
    String pageContent;
    String topTenResults;
    String singleResult;
    TopTenTagsCounter topTenTags = new TopTenTagsCounter();
    HistoryOfParsedSites historyOfParse = new HistoryOfParsedSites();
    SaveChoosenStat saveChoosenStat = new SaveChoosenStat();

    public MercuryParserGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userWebsiteAddressInput = new javax.swing.JTextField();
        parseSiteButton = new javax.swing.JButton();
        sortedHtmlTagsLabel = new javax.swing.JLabel();
        webTitleLabel = new javax.swing.JLabel();
        webAddressLabel = new javax.swing.JLabel();
        saveJsonButton = new javax.swing.JButton();
        saveHtmlResults = new javax.swing.JButton();
        topTenLabel = new javax.swing.JLabel();
        saveTopTenResultsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        HistoryTextPane = new javax.swing.JTextPane();
        saveParseHistoryButton = new javax.swing.JButton();
        avgTagsPerSiteLabel = new javax.swing.JLabel();
        totalTagsLabel = new javax.swing.JLabel();
        tagsOnThisSiteLabel = new javax.swing.JLabel();
        errorMessageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mercury Web Parser Antczak Kamil");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setName("MercuryParser"); // NOI18N

        userWebsiteAddressInput.setText("http://www.example.com");
        userWebsiteAddressInput.setToolTipText("Put your URL with http://www.");
        userWebsiteAddressInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userWebsiteAddressInputActionPerformed(evt);
            }
        });

        parseSiteButton.setText("Parse WebSite");
        parseSiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parseSiteButtonActionPerformed(evt);
            }
        });

        sortedHtmlTagsLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        sortedHtmlTagsLabel.setText("Parse Results:");
        sortedHtmlTagsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        webTitleLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        webTitleLabel.setText("Title");

        webAddressLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        webAddressLabel.setText("Address");

        saveJsonButton.setText("Save Json Response");
        saveJsonButton.setToolTipText("Save whole Api Response");
        saveJsonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJsonButtonActionPerformed(evt);
            }
        });

        saveHtmlResults.setText("Save Last Result");
        saveHtmlResults.setToolTipText("Save parse results of following URL");
        saveHtmlResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveHtmlResultsActionPerformed(evt);
            }
        });

        topTenLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        topTenLabel.setText("Top Ten HTML Results");
        topTenLabel.setToolTipText("Top Ten HTML Results");

        saveTopTenResultsButton.setText("Save Top Ten");
        saveTopTenResultsButton.setToolTipText("");
        saveTopTenResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTopTenResultsButtonActionPerformed(evt);
            }
        });

        HistoryTextPane.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        HistoryTextPane.setText("History Of Parsing");
        HistoryTextPane.setToolTipText("History of Parsing");
        jScrollPane1.setViewportView(HistoryTextPane);

        saveParseHistoryButton.setText("Save History");
        saveParseHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveParseHistoryButtonActionPerformed(evt);
            }
        });

        avgTagsPerSiteLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        avgTagsPerSiteLabel.setText("Average Tags per site");
        avgTagsPerSiteLabel.setToolTipText("tags per site");

        totalTagsLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        totalTagsLabel.setText("Sum of all tags:");
        totalTagsLabel.setToolTipText("sum of all tags");

        tagsOnThisSiteLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tagsOnThisSiteLabel.setText("Tags on this site:");
        tagsOnThisSiteLabel.setToolTipText("tags on this site");

        errorMessageLabel.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        errorMessageLabel.setForeground(new java.awt.Color(240, 0, 0));
        errorMessageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMessageLabel.setToolTipText("");
        errorMessageLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                errorMessageLabelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveHtmlResults, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveJsonButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tagsOnThisSiteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalTagsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(avgTagsPerSiteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveParseHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(webAddressLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sortedHtmlTagsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(saveTopTenResultsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 547, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(topTenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(errorMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(webTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userWebsiteAddressInput)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parseSiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(userWebsiteAddressInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(parseSiteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(webTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(webAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortedHtmlTagsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveHtmlResults)
                    .addComponent(saveJsonButton)
                    .addComponent(tagsOnThisSiteLabel)
                    .addComponent(totalTagsLabel)
                    .addComponent(avgTagsPerSiteLabel)
                    .addComponent(saveParseHistoryButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(errorMessageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(topTenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveTopTenResultsButton)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void parseSiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parseSiteButtonActionPerformed

        try {
            String inputAddres = this.userWebsiteAddressInput.getText();
            String webPageAddress = AddressReader.readAddres(new AddressValidator(), inputAddres);

            try {
                WebConnections web = new WebConnections(webPageAddress);
                pageJson = web.getWebPageJson();
                ContentScraper scrap = new ContentScraper(pageJson);

                HtmlTagsCounter htmlTagsCounter = new HtmlTagsCounter();
                pageContent = scrap.getContent();
                htmlTagsCounter.scrapContent(pageContent);
                htmlTagsCounter.getTags().sort(HtmlTag::compareTo);
                singleResult = htmlTagsCounter.toString();

                topTenTags.addToStatsList(htmlTagsCounter.getTags());
                topTenTags.getTags().sort(HtmlTag::compareTo);
                topTenTags.getTopTenTags();

                historyOfParse.addToHistory(scrap.getUrl(), scrap.getTitle(), htmlTagsCounter.toString());

                this.sortedHtmlTagsLabel.setText(htmlTagsCounter.toString());
                this.webTitleLabel.setText("Title: " + scrap.getTitle());
                this.webAddressLabel.setText("Address: " + scrap.getUrl());
                this.topTenLabel.setText("Top Ten Tags: " + topTenTags.getTopTenTags());
                this.HistoryTextPane.setText(historyOfParse.toString());
                this.avgTagsPerSiteLabel.setText("Average Tags per Site: " + String.valueOf(topTenTags.getTotalTags() / historyOfParse.getSizeOfHistory()));
                this.totalTagsLabel.setText("Sum of all tags: " + topTenTags.getTotalTags());
                this.tagsOnThisSiteLabel.setText("Tags on this site: " + htmlTagsCounter.getTagsOnSingleSite());
                this.errorMessageLabel.setText("");

            } catch (Exception exception) {
                this.errorMessageLabel.setText("This site cannot be parsed");
            }
        } catch (AddressExceptions exceptionAddress) {
            this.errorMessageLabel.setText(exceptionAddress.returnAddresError());
        }

    }//GEN-LAST:event_parseSiteButtonActionPerformed

    private void userWebsiteAddressInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userWebsiteAddressInputActionPerformed

    }//GEN-LAST:event_userWebsiteAddressInputActionPerformed

    private void saveJsonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJsonButtonActionPerformed
        saveChoosenStat.saveStat(pageJson);
    }//GEN-LAST:event_saveJsonButtonActionPerformed

    private void saveHtmlResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveHtmlResultsActionPerformed

        saveChoosenStat.saveStat(singleResult);
    }//GEN-LAST:event_saveHtmlResultsActionPerformed

    private void saveTopTenResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTopTenResultsButtonActionPerformed

        saveChoosenStat.saveStat(topTenTags.getTopTenTags());
    }//GEN-LAST:event_saveTopTenResultsButtonActionPerformed

    private void saveParseHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveParseHistoryButtonActionPerformed

        saveChoosenStat.saveStat(historyOfParse.toString());
    }//GEN-LAST:event_saveParseHistoryButtonActionPerformed

    private void errorMessageLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_errorMessageLabelAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_errorMessageLabelAncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane HistoryTextPane;
    private javax.swing.JLabel avgTagsPerSiteLabel;
    private javax.swing.JLabel errorMessageLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton parseSiteButton;
    private javax.swing.JButton saveHtmlResults;
    private javax.swing.JButton saveJsonButton;
    private javax.swing.JButton saveParseHistoryButton;
    private javax.swing.JButton saveTopTenResultsButton;
    private javax.swing.JLabel sortedHtmlTagsLabel;
    private javax.swing.JLabel tagsOnThisSiteLabel;
    private javax.swing.JLabel topTenLabel;
    private javax.swing.JLabel totalTagsLabel;
    private javax.swing.JTextField userWebsiteAddressInput;
    private javax.swing.JLabel webAddressLabel;
    private javax.swing.JLabel webTitleLabel;
    // End of variables declaration//GEN-END:variables
}
