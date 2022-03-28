package me.dio.mockito.exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.mockito.Mockito;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {

    @Mock
    private List<String> letras;

    @Test
    void adicionarItemNaLista() {
        Mockito.when(letras.get(0)).thenReturn("B");

        Assertions.assertEquals("B", letras.get(0));
    }
}
