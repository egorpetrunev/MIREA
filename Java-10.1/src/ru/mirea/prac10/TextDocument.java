package ru.mirea.prac10;

import java.io.File;

public class TextDocument implements IDocument{
    private File file;
    TextDocument(String name){
        file = new File(name+ ".txt");
    }
}
