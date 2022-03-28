import me.dio.mockito.exemplos.ApiDosCorreios;
import me.dio.mockito.exemplos.CadastrarPessoa;
import me.dio.mockito.exemplos.DadosLocalizacao;
import me.dio.mockito.exemplos.Pessoa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro() {
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Patos de Minas", "Rua 2", "Apto", "Centro");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("7986767")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Willyan", "72672637", LocalDate.now(), "7986767");

        assertEquals("Willyan", pessoa.getNome());
        assertEquals("72672637", pessoa.getDocumento());
        assertEquals("MG", pessoa.getEndereco().getUf());
        assertEquals("Apto", pessoa.getEndereco().getComplemento());
    }
}
