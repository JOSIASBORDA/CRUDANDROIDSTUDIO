package com.example.crud.UTILS;

import com.example.crud.MODEL.alumno;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
//metodos para consumir el servicio web
public interface AlumnosService {
    @GET("listar/")
    Call<List<alumno>> getAlumnos();
}

