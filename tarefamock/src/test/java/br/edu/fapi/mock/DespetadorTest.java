package br.edu.fapi.mock;

import br.fapi.edu.mock.Despertador;
import org.junit.Before;
import org.junit.Test;
import org.mockito.stubbing.OngoingStubbing;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
        Date date = new Date();

        OngoingStubbing<Boolean> booleanOngoingStubbing = when(despertador.passouDoTempo(any(Date.class))).thenReturn(true);

        assertTrue(despertador.antesDoTempo(date));
    }

    @Test
    public void testPassouTempoFalse(){
        Date date = new Date();

        when(despertador.passouDoTempo(any(Date.class))).thenReturn(false);

        assertFalse(despertador.antesDoTempo(date));
    }

    @Test
    public void testAntesTempoTrue(){
        Date date = new Date();

        when(despertador.antesDoTempo(any(Date.class))).thenReturn(true);

        assertTrue(despertador.antesDoTempo(date));
    }


    @Test
    public void testAntesTempoFalse(){
        Date date = new Date();

        when(despertador.antesDoTempo(any(Date.class))).thenReturn(false);

        assertFalse(despertador.antesDoTempo(date));
    }

    @Test
    public void testeTrocarTempo(){
        Date date = new Date();

        assertFalse(despertador.antesDoTempo(date));
    }
}
