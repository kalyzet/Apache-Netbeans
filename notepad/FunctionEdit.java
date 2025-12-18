package com.haikal.notepad;

public class FunctionEdit {
    Notepad notepad;
    public FunctionEdit(Notepad notepad){
        this.notepad = notepad;
    }
    public void undo(){
        notepad.um.undo();
    }
    public void redo(){
        notepad.um.redo();
    }
}
