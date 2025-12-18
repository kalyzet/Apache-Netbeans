package com.haikal.notepad;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
    
    Notepad notepad;
    
    public KeyHandler(Notepad notepad){
        this.notepad = notepad;
    }
    
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    @Override
    public void keyTyped(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        if(e.isControlDown() && e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_P){
        notepad.color.changeColor("White");
        return; 
        }
        
        if(e.isControlDown() && e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_H){
        notepad.color.changeColor("Black");
        return; 
        }
        
        if(e.isControlDown() && e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_B){
        notepad.color.changeColor("Blue");
        return; 
        }
        
        if(e.isControlDown() && e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_S){
        notepad.file.saveAs();
        return; 
        }
        
        if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_S){
            notepad.file.save();
        }
        
        if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_N){
            notepad.file.newFile();
        }
        
        if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_O){
            notepad.file.open();
        }
        
        if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_Z){
            notepad.edit.undo();
        }
        
        if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_Y){
            notepad.edit.redo();
        }
        
        if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_W){
            notepad.format.wordWrap();
        }
        
        if(e.isControlDown() && e.isShiftDown() && e.getKeyCode()==KeyEvent.VK_E){
            notepad.file.exit();
        }

        if(e.isAltDown() && e.getKeyCode()==KeyEvent.VK_F){
            notepad.menuFile.doClick();
        }
     
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    
}
