package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Quiz quiz = new Quiz();
     List<String> respuestas1 = new ArrayList<String>();
     respuestas1.add("Negro");
     respuestas1.add("Verde");
     respuestas1.add("Azul");
     respuestas1.add("Blanco");
     Preguntas pregunta1 =
             new Preguntas("De que color es el caballo blanco de San Martin?", respuestas1,  3);
     quiz.agregarPregunta(pregunta1);

     pregunta1.mostrarPregunta();


    }
}