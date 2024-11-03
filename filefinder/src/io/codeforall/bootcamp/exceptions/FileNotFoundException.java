package io.codeforall.bootcamp.exceptions;

/**
 * Created by pantoninho on 22/05/16.
 */
public class FileNotFoundException extends FileException {

    public FileNotFoundException() {
        super("File not found!");
    }
}
