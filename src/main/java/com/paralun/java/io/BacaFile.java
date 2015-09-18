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

public class BacaFile {

    public static void main(String[] args) throws Exception {
        File file = new File("input" + File.separator + "bacaFile.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String data;
        while((data = br.readLine()) != null){
            System.out.println(data);
        }
        br.close();
    }
    
}
