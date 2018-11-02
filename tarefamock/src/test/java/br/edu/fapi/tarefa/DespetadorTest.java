package br.edu.fapi.tarefa;

import br.fapi.edu.tarefa.Despertador;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class DespetadorTest{
    Despertador despertador;

    @Before
    public void setUp(){

        despertador = mock(Despertador.class);
    }

    @Test
    public void testPassouTempoTrue(){
        Date date = mock(Date.class);

        when(despertador.passouDoTempo(any(Date.class))).thenReturn(true);

        boolean eita = despertador.antesDoTempo(date);

        assertTrue(eita);
    }

    @Test
    public void testPassouTempoFalse(){
        Date date = mock(Date.class);

        when(despertador.passouDoTempo(any(Date.class))).thenReturn(false);

        assertFalse(despertador.antesDoTempo(date));
    }

    @Test
    public void testAntesTempoTrue(){
        Date date = mock(Date.class);

        when(despertador.antesDoTempo(any(Date.class))).thenReturn(true);

        assertTrue(despertador.antesDoTempo(date));
    }


    @Test
    public void testAntesTempoFalse(){
        Date date = mock(Date.class);

        when(despertador.antesDoTempo(any(Date.class))).thenReturn(false);

        assertFalse(despertador.antesDoTempo(date));
    }

    @Test
    public void testeTrocarTempo(){
        Date date = mock(Date.class);

        assertFalse(despertador.antesDoTempo(date));
    }
}
