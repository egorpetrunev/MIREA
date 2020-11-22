package ru.mirea.prac10;

public class TextDocumentFactory implements  IDocumentFactory {
    @Override
    public IDocument createNew(String name) {
        IDocument document = new TextDocument(name);
        System.out.println("Создано");
        return document;
    }

    @Override
    public IDocument createOpen(String name) {
        System.out.println("Открыто");
        return new TextDocument(name);
    }
}
