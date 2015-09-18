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
import java.io.FileWriter;

public class TulisFile {

    public static void main(String[] args) throws Exception{
        File file = new File("input" + File.separator + "tulisFile.txt");
        FileWriter fw = new FileWriter(file);
        fw.write("Halo Halo");
        fw.close();
    }
    
}
