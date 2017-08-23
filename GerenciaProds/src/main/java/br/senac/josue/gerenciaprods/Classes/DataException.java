/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.josue.gerenciaprods.Classes;

/**
 *
 * @author rafael.rsilva22
 */
public class DataException extends Exception {

    public DataException(String message) {
        super(message);
    }

    //Construtor que permite informar uma mensagem de erro e uma exception base
    public DataException(String message, Throwable cause) {
        super(message, cause);
    }

    //Construtor que permite informar uma exception base
    public DataException(Throwable cause) {
        super(cause);
    }
}
