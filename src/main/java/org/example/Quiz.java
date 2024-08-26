package org.example;

import org.example.Preguntas;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
 private List<Preguntas> preguntas;
 private int puntaje;

 public Quiz() {
     preguntas = new ArrayList<>();
     puntaje = 0;
 }

 public void agregarPregunta(Preguntas pregunta) {
     preguntas.add(pregunta);
 }

 public void evaluarPregunta(int indicePregunta, int respuestaUsuario) {
     if(preguntas.get(indicePregunta).getRespuestaCorrecta() == respuestaUsuario) {
         puntaje++;
     }
 }

 public void mostrarPuntaje() {
     System.out.println("Su puntaje es: " + puntaje);
 }

}
