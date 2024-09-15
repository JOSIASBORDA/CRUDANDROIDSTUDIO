package com.example.crud.UTILS;

public class apis {
    public static final String URL_001="http://127.0.0.1:8080";
    public static AlumnosService getAlumnoService(){
        return Cliente.getCliente(URL_001).create(AlumnosService.class);
    }
}
