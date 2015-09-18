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
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteFileExample {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        File file;
        String content = "This is the text content lanjutan";
        
        try{
            file = new File("C:\\Users\\SwaHp\\Documents\\Maven Projects\\newfile.txt");
            fos = new FileOutputStream(file);
            
            if(!file.exists()){
                file.createNewFile();
            }
            
            byte[] contentInBytes = content.getBytes();
            
            fos.write(contentInBytes);
            fos.flush();
            fos.close();
            System.out.println("Done");
        }catch(IOException e){
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(WriteFileExample.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
