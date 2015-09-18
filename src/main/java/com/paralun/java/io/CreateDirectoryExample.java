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

public class CreateDirectoryExample {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\SwaHp\\Documents\\Maven Projects\\Direktori1");
        if(!file.exists()){
            if(file.mkdir()){
                System.out.println("Directory is created!");
            }else{
                System.out.println("Failed to create directory!");
            }
        }
        
        File file2 = new File("C:\\Users\\SwaHp\\Documents\\Maven Projects\\Direktori2\\Sub1\\Sub2");
        if(!file2.exists()){
            if(file2.mkdirs()){
                System.out.println("Multiple directories are created!");
            }else{
                System.out.println("Failed to create multiple directories!");
            }
        }
    }
    
}
