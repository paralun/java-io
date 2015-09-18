/*
 * __________                     .__                
 * \______   \_____ ____________  |  |  __ __  ____  
 *  |     ___/\__  \\_  __ \__  \ |  | |  |  \/    \ 
 *  |    |     / __ \|  | \// __ \|  |_|  |  /   |  \
 *  |____|    (____  /__|  (____  /____/____/|___|  /
 * 
 */
package com.paralun.java.io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\SwaHp\\Documents\\NetBeansProjects\\testing.txt");
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        
        try{
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);
            
            while(dis.available() != 0){
                System.out.println(dis.readLine());
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
		fis.close();
		bis.close();
		dis.close();
            } catch (IOException ex) {
		ex.printStackTrace();
            }
        }
    }
    
}
