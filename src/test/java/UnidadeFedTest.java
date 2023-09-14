import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnidadeFedTest {

    UnidadeFed unidadeFed;

    @BeforeEach
    void setUp(){
        unidadeFed = new UnidadeFed();
    }

    @Test
    void deveRetornarValorValido(){
        unidadeFed.setValorProduto(1.0f);
        assertEquals(1.0f, unidadeFed.getValorProduto());
    }

    @Test
    void deveRetornarValorInvalido(){
        try {
            unidadeFed.setValorProduto(0.0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarEstadoValido(){
        unidadeFed.setEstado("AM");
        assertEquals("AM", unidadeFed.getEstado());
    }
    @Test
    void deveRetornarEstadoInvalido(){
        try {
            unidadeFed.setEstado("EU");
        }catch (IllegalArgumentException e){
            assertEquals("Estado invalido", e.getMessage());
        }
    }
    // FIM TEST NO ESTADO

    //INICIO TEST ALIQUOTA 18
    @Test
    void deveRetornarAliquota18AP(){
        unidadeFed.setEstado("AP");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota18MA(){
        unidadeFed.setEstado("MA");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota18PI(){
        unidadeFed.setEstado("PI");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota18SE(){
        unidadeFed.setEstado("SE");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota18AM(){
        unidadeFed.setEstado("AM");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota18MG(){
        unidadeFed.setEstado("MG");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota18RN(){
        unidadeFed.setEstado("RN");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota18TO(){
        unidadeFed.setEstado("TO");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota18BA(){
        unidadeFed.setEstado("BA");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota18PB(){
        unidadeFed.setEstado("PB");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota18RS(){
        unidadeFed.setEstado("RS");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota18CE(){
        unidadeFed.setEstado("CE");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota18PR(){
        unidadeFed.setEstado("PR");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota18RJ(){
        unidadeFed.setEstado("RJ");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota18DF(){
        unidadeFed.setEstado("DF");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota18PE(){
        unidadeFed.setEstado("PE");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota18SP(){
        unidadeFed.setEstado("SP");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(18.0f,unidadeFed.calcularImposto());
    }
    //FIM TEST ALIQUOTA 18

    //INICIO TEST ALIQUOTA 18
    @Test
    void deveRetornarAliquota17AC(){
        unidadeFed.setEstado("AC");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(17.0f, unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota17MS(){
        unidadeFed.setEstado("MS");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(17.0f, unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota17AL(){
        unidadeFed.setEstado("AL");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(17.0f, unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota17PA(){
        unidadeFed.setEstado("PA");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(17.0f, unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota17ES(){
        unidadeFed.setEstado("ES");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(17.0f, unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota17RR(){
        unidadeFed.setEstado("RR");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(17.0f, unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota17GO(){
        unidadeFed.setEstado("GO");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(17.0f, unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota17SC(){
        unidadeFed.setEstado("SC");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(17.0f, unidadeFed.calcularImposto());
    }
    @Test
    void deveRetornarAliquota17MT(){
        unidadeFed.setEstado("MT");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(17.0f, unidadeFed.calcularImposto());
    }
    //FIM TEST ALIQUOTA 17

    //INICIO TEST ALIQUOTA 17,5
    @Test
    void deveRetornarAliquota17_5(){
        unidadeFed.setEstado("RO");
        unidadeFed.setValorProduto(100.0f);
        assertEquals(17.5f, unidadeFed.calcularImposto());
    }

}