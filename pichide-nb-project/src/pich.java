

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class pich extends javax.swing.JFrame {

   
    public pich() {
        initComponents();
        txtfile.setText("");
        txtpic.setText("");
        jTextArea1.setCaretPosition(0);
        
   }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtfile = new javax.swing.JTextField();
        btnfile = new javax.swing.JButton();
        txtpic = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        texlog = new javax.swing.JScrollPane();
        txtlog = new javax.swing.JTextArea();
        btnstart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PicHide");
        setIconImages(null);
        setResizable(false);

        jLabel2.setText("Select file zip, rar, 7z....");

        txtfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfileActionPerformed(evt);
            }
        });

        btnfile.setText("Browse");
        btnfile.setName("gg"); // NOI18N
        btnfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfileActionPerformed(evt);
            }
        });

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Select picture to hide file");

        txtlog.setEditable(false);
        txtlog.setBackground(new java.awt.Color(240, 240, 240));
        txtlog.setColumns(20);
        txtlog.setRows(5);
        txtlog.setCaretColor(new java.awt.Color(240, 240, 240));
        texlog.setViewportView(txtlog);

        btnstart.setText("Start");
        btnstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstartActionPerformed(evt);
            }
        });

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(texlog)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtfile, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnfile, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtpic, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btnstart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnfile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpic, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(texlog, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnstart, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Main", jPanel1);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\nFeatures\n\t•\tCan hide compressed (.zip, .rar, .7z, etc) file under a photo.\n\t•\tHardly noticeable.\n\t•\tCan view image normally.\n\t•\tPassword protection can be used.\nRequirements\n\t•\tWindows XP,Vista,7,8\n\t•\tJava virtual machine\n\t•\tCompressing software like WinRar, 7zip, WinZip\n\nHiding Step 1: Gather all files you want to hide and compress it to a single file (.zip, .rar, .7z)\n\n\t•\tWhile you compressing you can add a password for extra security.\n\t•\tFor larger files it will take few seconds. It will depend on your computer.\n\nHiding Step 2: Select a picture to hide.\n\nHiding Step 3: Click Start button. Wait until log window displays “1 file(s) copied”\n\nHiding process is finished. Now the file is hidden under the picture.It will be created on your selected file containing folder.\nWith your selected photo name and with photo extension. This can be viewed like ordinary picture. \nFor some computers want to run this as administrator. Right click the software and click “Run as administrator”.    \n\nUnhiding Step 1: Right click the picture that you hide files before.\n\nUnhiding Step 2: Click “Open With”\n\nUnhiding Step 3: Open with your favorite compressing software like WinRar, 7zip, WinZip\n\nThank you for using PicHide. Contact me if any.\n\n\nCopyright  2014: Do not sell this software. It is free to use. All right reserved. ");
        jTextArea1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Help", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 1, 52));
        jLabel5.setText("By Dilusha Bandara");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(1, 1, 52));
        jTextField1.setText("dilushait@gmail.com");
        jTextField1.setAutoscrolls(false);
        jTextField1.setBorder(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pi/flag.jpg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(1, 1, 52));
        jLabel8.setText("Contact Me");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(1, 1, 52));
        jLabel10.setText("Thank you for using PicHide");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(118, 118, 118))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("About", jPanel2);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(53, 40, 107));
        jLabel6.setText("PicHide");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(53, 40, 107));
        jLabel7.setText("Hide your files inside picture");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            JFileChooser openpic=new JFileChooser();

            //filter
            FileNameExtensionFilter filter=new FileNameExtensionFilter("images","jpg","gif","png","bmp","jpeg");
            openpic.setFileFilter(filter);
            int returnVal=openpic.showOpenDialog(null);
            File fop=openpic.getSelectedFile();
            if(returnVal==JFileChooser.APPROVE_OPTION){
                if(fop.getName().endsWith(".jpg")||fop.getName().endsWith(".gif")||fop.getName().endsWith(".bmp")||fop.getName().endsWith(".jpeg")||fop.getName().endsWith(".png")){
                    txtpic.setText(fop.getPath());
                    txtlog.setText(txtlog.getText()+"Picture Selected\n");
                }
                else{
                   txtlog.setText(txtlog.getText()+"Select only pictures with extension jpg,png,bmp or gif\n");
                }
            }
        }

        catch(HeadlessException efile){
            if(efile.getMessage()!=null)
                  txtlog.setText(txtlog.getText()+"Error while opening picture\n"+efile.getMessage()+"\n");
            }

        try{
            ImageIcon icon = new ImageIcon(txtpic.getText());
            Image img = icon.getImage();
            Image newimg = img.getScaledInstance(200,150,java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newimg);
            jLabel1.setIcon(newIcon);
        }
        catch(Exception e){
            jLabel1.setText(e.getMessage());
       }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfileActionPerformed

        try{
            JFileChooser openfile=new JFileChooser();
            openfile.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int isopend=openfile.showOpenDialog(null);

            if(isopend==JFileChooser.APPROVE_OPTION){

                File fo =openfile.getSelectedFile();
                //file size
                txtlog.setText(txtlog.getText()+"File "+fo.getName()+" is selected. With size of "+calsize(fo.length())+"\n");

                txtfile.setText(openfile.getSelectedFile().getPath());
            }

        }

        catch(HeadlessException efile){
            if(efile.getMessage()!=null)
                txtlog.setText(txtlog.getText()+"Error while opening file\n"+efile.getMessage()+"\n");
            }
    }//GEN-LAST:event_btnfileActionPerformed

    private void txtfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfileActionPerformed

    }//GEN-LAST:event_txtfileActionPerformed

    private void btnstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstartActionPerformed
        
        String tf=txtfile.getText(),ti=txtpic.getText();
        
        if(!tf.equals("")){
      
            String filePath = null;
            try{
             String absolutePath=txtfile.getText();
             filePath = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));
            }
            catch(Exception e){
                     txtlog.setText(txtlog.getText()+"Error while getting file path"+e.getMessage()+"\n");
            }
            
            
                if(!ti.equals("")){
                 
                    
                    String fullPath =txtpic.getText();
                    int index = fullPath.lastIndexOf("\\");
                    String fileName = fullPath.substring(index + 1);
                    String desimage=filePath+"\\"+fileName;
                
                try{
                    txtlog.setText(txtlog.getText()+"Copy process is starting........\nFor large files it will take few seconds to complete. It will depend on your computer.\n");
                    txtlog.setText(txtlog.getText()+"Output picture file will be in\n"+desimage+"\n");
                    Process p=Runtime.getRuntime().exec("cmd /c copy /b "+txtpic.getText()+" + "+txtfile.getText()+" "+desimage); 
                    p.waitFor(); 
                    BufferedReader reader=new BufferedReader(
                        new InputStreamReader(p.getInputStream())
                    ); 
                    String line; 
                    while((line = reader.readLine()) != null) 
                    { 
                        System.out.println(line);
                        txtlog.setText(txtlog.getText()+line+"\n");
                    } 
                    
                }
                catch(Exception e1) {
                    txtlog.setText(txtlog.getText()+"Error while copying file\n"+e1.getMessage()+"\n");
                } 
                    
                }
                
                else{
                     txtlog.setText(txtlog.getText()+"Select a picture first\n");
                }
            
            
            
            }
        else
             txtlog.setText(txtlog.getText()+"Select a file first\n");
        
        
        
    }//GEN-LAST:event_btnstartActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new pich().setVisible(true);
             
            }
        });
        
    }
    
    private String calsize(double i){
         DecimalFormat df = new DecimalFormat("#.##");
        String r = null;
        double k;
        
        if(i<1024)
           r=i+" Bytes"; 
        else if(i<1024*1024){
           k=i/1024;
           r=df.format(k)+" KB";
        }
        else if(i<1024*1024*1024){
            k=i/1024/1024;
            r=df.format(k)+" MB";
        }
        else{
            k=i/1024/1024/1024;
            r=df.format(k)+" GB";
        }     
        return r;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfile;
    private javax.swing.JButton btnstart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JScrollPane texlog;
    private javax.swing.JTextField txtfile;
    private javax.swing.JTextArea txtlog;
    private javax.swing.JTextField txtpic;
    // End of variables declaration//GEN-END:variables
}
