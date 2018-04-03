
package com.graphic_Interface;

import com.myexceptions.WrongAddressException;
import com.statistics.HtmlTag;
import com.web_handling.WebConnections;
import com.statistics.ContentScraper;
import com.statistics.HistoryOfParsedSites;
import com.statistics.HtmlTagsCounter;
import com.statistics.TopTenTagsCounter;
import com.statistics.SaveFullJsonResponse;
import com.statistics.SaveResultsJsonResponse;
import com.statistics.SaveTopTenTags;
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
    TopTenTagsCounter topTenTags = new TopTenTagsCounter();
    HistoryOfParsedSites historyOfParse = new HistoryOfParsedSites();
    
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mercury Web Parser Antczak Kamil");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setName("MercuryParser"); // NOI18N

        userWebsiteAddressInput.setToolTipText("Put your URL here");
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalTagsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(avgTagsPerSiteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveParseHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(webTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(webAddressLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sortedHtmlTagsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userWebsiteAddressInput, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parseSiteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(topTenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveTopTenResultsButton))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userWebsiteAddressInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parseSiteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(webTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(webAddressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortedHtmlTagsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveHtmlResults)
                    .addComponent(saveJsonButton)
                    .addComponent(saveParseHistoryButton)
                    .addComponent(avgTagsPerSiteLabel)
                    .addComponent(totalTagsLabel)
                    .addComponent(tagsOnThisSiteLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topTenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveTopTenResultsButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void parseSiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parseSiteButtonActionPerformed
        
        try{
        String inputAddres = this.userWebsiteAddressInput.getText();
        String webPageAddress = AddressReader.readAddres(new AddressValidator(), inputAddres);       

            try{           
                WebConnections web = new WebConnections(webPageAddress);
                pageJson = web.getWebPageJson();
                ContentScraper scrap = new ContentScraper(pageJson);

                HtmlTagsCounter htmlTagsCounter = new HtmlTagsCounter();
                pageContent = scrap.getContent();
                htmlTagsCounter.scrapContent(pageContent);
                htmlTagsCounter.getTags().sort(HtmlTag::compareTo);
                               
                topTenTags.addToStatsList(htmlTagsCounter.getTags());
                topTenTags.getTags().sort(HtmlTag::compareTo);
                topTenTags.getTopTenTags();
                
                historyOfParse.addToHistory(scrap.getUrl(), scrap.getTitle(), htmlTagsCounter.toString());
      
                this.sortedHtmlTagsLabel.setText(htmlTagsCounter.toString());
                this.webTitleLabel.setText("Title: " + scrap.getTitle());
                this.webAddressLabel.setText("Address: " + scrap.getUrl());
                this.topTenLabel.setText("Top Ten Tags: " + topTenTags.getTopTenTags());
                this.HistoryTextPane.setText(historyOfParse.toString());
                this.avgTagsPerSiteLabel.setText("Average Tags per Site: "+String.valueOf(topTenTags.getTotalTags()/historyOfParse.getSizeOfHistory()));
                this.totalTagsLabel.setText("Sum of all tags: " + topTenTags.getTotalTags());
                this.tagsOnThisSiteLabel.setText("Tags on this site: " + htmlTagsCounter.getTagsOnSingleSite());

            }
            catch(Exception exception)
            {
            }
        }
        catch(WrongAddressException exceptionAddress){
           exceptionAddress.returnError();
        }
        
    }//GEN-LAST:event_parseSiteButtonActionPerformed

    private void userWebsiteAddressInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userWebsiteAddressInputActionPerformed

    }//GEN-LAST:event_userWebsiteAddressInputActionPerformed

    private void saveJsonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJsonButtonActionPerformed

             SaveFullJsonResponse saveFullResponse = new SaveFullJsonResponse();
             saveFullResponse.saveResponse(pageJson);
    }//GEN-LAST:event_saveJsonButtonActionPerformed

    private void saveHtmlResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveHtmlResultsActionPerformed

        SaveResultsJsonResponse saveResultsJson = new SaveResultsJsonResponse();
        saveResultsJson.saveResults(pageJson);
             
    }//GEN-LAST:event_saveHtmlResultsActionPerformed

    private void saveTopTenResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTopTenResultsButtonActionPerformed

        SaveTopTenTags saveTopTen = new SaveTopTenTags();
        saveTopTen.saveTopTenResults(topTenTags.getTopTenTags());
    }//GEN-LAST:event_saveTopTenResultsButtonActionPerformed

    private void saveParseHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveParseHistoryButtonActionPerformed
        SaveTopTenTags saveTopTen = new SaveTopTenTags();
        saveTopTen.saveTopTenResults(historyOfParse.toString());
    }//GEN-LAST:event_saveParseHistoryButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane HistoryTextPane;
    private javax.swing.JLabel avgTagsPerSiteLabel;
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
