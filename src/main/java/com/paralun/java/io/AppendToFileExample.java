/*
 * __________                     .__                
 * \______   \_____ ____________  |  |  __ __  ____  
 *  |     ___/\__  \\_  __ \__  \ |  | |  |  \/    \ 
 *  |    |     / __ \|  | \// __ \|  |_|  |  /   |  \
 *  |____|    (____  /__|  (____  /____/____/|___|  /
 * 
 */
package com.paralun.java.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {

    public static void main(String[] args) {
        try{
            String data = " This content will append to the end of the file";
            File file = new File("C:\\Users\\SwaHp\\Documents\\Maven Projects\\newfile.txt");
            
            if(!file.exists()){
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
            System.out.println("Done");
        }catch(IOException e){
            
        }
    }
    
}
