package me.dio.mockito.exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
public class GeradorDeNumerosTeste {

    @Test
    void testaGeracaoComTamanhoDefinido() {

        MockedStatic<GeradorDeNumeros> mockedStatic = Mockito.mockStatic(GeradorDeNumeros.class);

        List<Integer> numerosGerados = List.of(1, 2, 3, 4, 5, 6, 7);

        mockedStatic.when(() -> GeradorDeNumeros.geraNumerosAleatorios(anyInt())).thenReturn(numerosGerados);

        Assertions.assertEquals(numerosGerados, GeradorDeNumeros.geraNumerosAleatorios(10));
    }

    @Test
    void testaGeracaoSemTamanhoDefinido() {

        MockedStatic<GeradorDeNumeros> mockedStatic = Mockito.mockStatic(GeradorDeNumeros.class);

        List<Integer> numerosGerados = List.of(1, 2, 3, 4, 5, 6, 7);

        mockedStatic.when(GeradorDeNumeros::geraNumerosAleatorios).thenReturn(numerosGerados);

        Assertions.assertEquals(numerosGerados, GeradorDeNumeros.geraNumerosAleatorios());
    }
}
