/*
 * __________                     .__                
 * \______   \_____ ____________  |  |  __ __  ____  
 *  |     ___/\__  \\_  __ \__  \ |  | |  |  \/    \ 
 *  |    |     / __ \|  | \// __ \|  |_|  |  /   |  \
 *  |____|    (____  /__|  (____  /____/____/|___|  /
 * 
 */
package com.paralun.java.io;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileSeparator {

    public static void main(String[] args) {
        try {
            String filename = "newFile.txt";
            String workingDirectory = System.getProperty("user.dir");
            String absoluteFilePath = "";
            
            absoluteFilePath = workingDirectory + System.getProperty("file.separator") + filename;
            //absoluteFilePath = workingDirectory + File.separator + filename;
            
            System.out.println("Filepath : " + absoluteFilePath);
            
            File file = new File(absoluteFilePath);
            
            if(file.createNewFile()){
                System.out.println("File di buat");
            }else{
                System.out.println("File sudah ada");
            }
        } catch (IOException ex) {
            Logger.getLogger(FileSeparator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

// Reference : http://www.mkyong.com/
