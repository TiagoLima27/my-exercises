package io.codeforall.bootcamp.exceptions;

/**
 * Created by pantoninho on 22/05/16.
 */
public class NotEnoughPermissionsException extends FileException {

    public NotEnoughPermissionsException() {
        super("Not enough permissions!");
    }
}
