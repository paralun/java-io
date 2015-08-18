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

public class FilePath {

    public static void main(String[] args) {
        try {
            String fileName = "newFile1.txt";
            String workingDirectory = System.getProperty("user.dir");
            
            File file = new File(workingDirectory, fileName);
            System.out.println("File Path : " + file.getAbsolutePath());
            
            if(file.createNewFile()){
                System.out.println("File di buat");
            }else{
                System.out.println("File sudah ada");
            }
        } catch (IOException ex) {
            Logger.getLogger(FilePath.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

// Reference : http://www.mkyong.com/
