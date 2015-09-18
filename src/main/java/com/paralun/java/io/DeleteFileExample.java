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

public class DeleteFileExample {

    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\SwaHp\\Documents\\Maven Projects\\newfile.txt");
            if(file.delete()){
                System.out.println(file.getName() + "is delete");
            }else{
                System.out.println("Delete operation is failed.");
            }
        }catch(Exception e){
            
        }
    }
}
