import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarMulherAbaixoDoPeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(19.0f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("F");
        assertEquals("abaixo", pessoa.verificaIMC());
    }

    @Test
    void deveRetornarMulherNoPesoNormal(){
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(25.7f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("F");
        assertEquals("peso normal", pessoa.verificaIMC());
    }

    @Test
    void deveRetornarMulherMarginalmenteAcima(){
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(27.2f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("F");
        assertEquals("marginalmente", pessoa.verificaIMC());
    }

    @Test
    void deveRetornarMulherAcimaPeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(32.2f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("F");
        assertEquals("acima", pessoa.verificaIMC());
    }

    @Test
    void deveRetornarMulherObesa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(32.4f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("F");
        assertEquals("obesa", pessoa.verificaIMC());
    }

//    homem homem homem homem homem

    @Test
    void deveRetornarHomemAbaixoPeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(20.6f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("M");
        assertEquals("abaixo", pessoa.verificaIMC());
    }

    @Test
    void deveRetornarHomemNoPesoNormal(){
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(26.3f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("M");
        assertEquals("peso normal", pessoa.verificaIMC());
    }

    @Test
    void deveRetornarHomemrMarginalmenteAcima(){
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(27.7f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("M");
        assertEquals("marginalmente", pessoa.verificaIMC());
    }

    @Test
    void deveRetornarHomemAcimaPeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(31.0f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("M");
        assertEquals("acima", pessoa.verificaIMC());
    }

    @Test
    void deveRetornarHomemObeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(31.3f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("M");
        assertEquals("obeso", pessoa.verificaIMC());
    }



}