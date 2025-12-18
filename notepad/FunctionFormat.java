package com.haikal.notepad;

import java.awt.Font;

public class FunctionFormat  {
    Notepad notepad;
    Font arial, comicSansMS, timesNewRoman;
    String selectedFont;
    public FunctionFormat(Notepad notepad){
        this.notepad = notepad;
    }
    public void wordWrap(){
        if(notepad.wordWrapOn==false){
            notepad.wordWrapOn=true;
            notepad.textArea.setLineWrap(true);
            notepad.textArea.setWrapStyleWord(true);
            notepad.iWrap.setText("Word Wrap: On");
        } else if(notepad.wordWrapOn==true){
            notepad.wordWrapOn=false;
            notepad.textArea.setLineWrap(false);
            notepad.textArea.setWrapStyleWord(false);
            notepad.iWrap.setText("Word Wrap: Off");
        }
    }
    
    public void createFont(int fontSize){
        arial = new Font("Arial", Font.PLAIN, fontSize);
        comicSansMS = new Font("Comic Sans MS", Font.PLAIN, fontSize);
        timesNewRoman = new Font("Times New Roman", Font.PLAIN, fontSize);
        
        setFont(selectedFont);
    }
    public void setFont(String font){
        selectedFont = font;
        switch(selectedFont){
            case "Arial":
                notepad.textArea.setFont(arial);
                break;
            case "Comic Sans MS":
                notepad.textArea.setFont(comicSansMS);
                break;
            case "Times New Roman":
                notepad.textArea.setFont(timesNewRoman);
                break;
        }
    }
}
