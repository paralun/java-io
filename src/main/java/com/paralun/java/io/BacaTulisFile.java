/*
 * __________                     .__                
 * \______   \_____ ____________  |  |  __ __  ____  
 *  |     ___/\__  \\_  __ \__  \ |  | |  |  \/    \ 
 *  |    |     / __ \|  | \// __ \|  |_|  |  /   |  \
 *  |____|    (____  /__|  (____  /____/____/|___|  /
 * 
 */
package com.paralun.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BacaTulisFile {

    public static void main(String[] args) throws Exception {
        File file = new File("input" + File.separator + "bacaFile.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        
        File fileTujuan = new File("input" + File.separator + "textCopy.txt");
        FileWriter fw = new FileWriter(fileTujuan);
        String data;
        while((data = br.readLine()) != null){
            fw.write(data);
            fw.write("\r\n");
        }
        
        fw.close();
        br.close();
    }
    
}
