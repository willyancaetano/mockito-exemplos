package me.dio.mockito.exemplos;

import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

public final class GeradorDeNumeros {

    private static SplittableRandom random = new SplittableRandom();

    private GeradorDeNumeros(){
    }

    public static List<Integer> geraNumerosAleatorios(int tamanhoLista) {
        return random.ints().boxed().limit(tamanhoLista).collect(Collectors.toList());
    }

    public static List<Integer> geraNumerosAleatorios() {
        return random.ints().boxed().limit(random.nextInt(10)).collect(Collectors.toList());
    }
}
