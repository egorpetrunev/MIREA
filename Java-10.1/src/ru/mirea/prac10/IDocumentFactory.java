package ru.mirea.prac10;

public interface IDocumentFactory {
    IDocument createNew(String name);
    IDocument createOpen(String name);
}
