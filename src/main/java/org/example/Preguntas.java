package org.example;

import java.util.List;

public class Preguntas {
    private String pregunta;
    private List<String> respuestas;
    private int respuestaCorrecta;

    public Preguntas(String pregunta, List<String> respuesta, int respuestaCorrecta) {
        this.pregunta = pregunta;
        this.respuestas = respuesta;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public Preguntas(String pregunta) {
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void mostrarPregunta() {
        System.out.println(pregunta);
        for (String respuesta : respuestas) {
            System.out.println(respuestas.indexOf(respuesta) + "," + respuesta);
        }
    }
}
