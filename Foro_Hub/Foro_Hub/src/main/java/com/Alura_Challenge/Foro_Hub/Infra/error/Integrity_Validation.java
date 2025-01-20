package com.Alura_Challenge.Foro_Hub.Infra.error;


import java.io.Serial;

public class Integrity_Validation extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    public Integrity_Validation(String s){
        super(s);
    }

}

