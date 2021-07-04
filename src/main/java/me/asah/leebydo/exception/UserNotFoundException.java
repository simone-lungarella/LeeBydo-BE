package me.asah.leebydo.exception;

/**
 * Runtime Exception che gestisce l'eccezione di utente non trovato.
 * 
 * @author Simone Lungarella
 */
public class UserNotFoundException extends RuntimeException {

    /**
     * Costruttore con messaggio.
     * 
     * @param message Messaggio dell'errore.
     */
    public UserNotFoundException(String message) {
        super(message);
    }

}
