package com.haikal.notepad;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FunctionFile {
    Notepad notepad;
    String fileName;
    String fileAddress;
    
    public FunctionFile(Notepad notepad) {
        this.notepad = notepad;
    }
    public void newFile(){
        notepad.textArea.setText("");
        notepad.window.setTitle("New");
        fileName = null;
        fileAddress = null;
    }
    public void open(){
        FileDialog fd = new FileDialog(notepad.window, "Open", FileDialog.LOAD);
        fd.setVisible(true);
        
        if(fd.getFile()!=null){
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            notepad.window.setTitle(fileName);
        }
        System.out.println("FILE ADDRESS AND FILE NAME" + fileAddress + fileName);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileAddress + fileName));
            notepad.textArea.setText("");
            
            String line = null;
            while((line = br.readLine())!=null){
                notepad.textArea.append(line + "\n");
            }
            br.close();
        } catch(Exception e) {
            System.out.println("FILE NOT OPENED!");
        }
    }
    public void save(){
        if(fileName==null){
            saveAs();
        } else {
            try {
            FileWriter fw = new FileWriter(fileAddress + fileName);
            fw.write(notepad.textArea.getText());
            notepad.window.setTitle(fileName);
            fw.close();
            } catch(Exception e) {
                System.out.println("SOMETHING WRONG!");
            }
        }
    }
    public void saveAs(){
        FileDialog fd = new FileDialog(notepad.window, "Save", FileDialog.SAVE);
        fd.setVisible(true);
        if(fd.getFile()!=null){
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            notepad.window.setTitle(fileName);
        }
        try {
            FileWriter fw = new FileWriter(fileAddress + fileName);
            fw.write(notepad.textArea.getText());
            fw.close();
    } catch(Exception e){
        System.out.println("SOMETHING WRONG!");
    }
   }
    public void exit(){
        System.exit(0);
    }
}
