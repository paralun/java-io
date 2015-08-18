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

public class CreateFile {

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\SwaHp\\Documents\\Maven Projects\\newfile.txt");
            if(file.createNewFile()){
                System.out.println("File di buat");
            }else{
                System.out.println("File sudah ada");
            }
        } catch (IOException ex) {
            Logger.getLogger(CreateFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

// Reference : http://www.mkyong.com/
