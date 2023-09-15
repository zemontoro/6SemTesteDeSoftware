public class Pessoa {

    float peso,altura;
    String sexo;

    public float calcularIMC(){
        float imc;
        imc = this.peso / (this.altura*this.altura);
        return imc;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public String verificaIMC(){
        double imc=calcularIMC();
        if (this.sexo.equals("F")){
            if (imc<19.1f){
                return "abaixo";
            } else if (imc<25.8f) {
                return "peso normal";
            } else if (imc<27.3f) {
                return "marginalmente";
            } else if (imc<32.3f) {
                return "acima";
            } else {
                return "obesa";
            }
        } else {
            if (imc<20.7){
                return "abaixo";
            } else if (imc<26.4f) {
                return "peso normal";
            } else if (imc<27.8f) {
                return "marginalmente";
            } else if (imc<31.1f) {
                return "acima";
            }else {
                return "obeso";
            }
        }
    }

    public void setSexo(String sexo) {
        if (!sexo.equals("F") && !sexo.equals("M")){
            throw new IllegalArgumentException("Sexo deve ser F ou M");
        } else {
            this.sexo = sexo;
        }
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
//        p1.setPeso(160.85f);
        p1.setAltura(1.85f);
        p1.setSexo("F");

        String resposta;

//        double imc=p1.CalcularIMC();
//        System.out.println("Seu IMC:"+imc);



//        if (p1.sexo=="M"){
//            System.out.println("Homem");
//            if(imc<20.7f){
//                resposta="abaixo do peso";
////                System.out.println("Abaixo do Peso");
//            } else
//                if (imc<26.4f) {
//                    resposta="No peso normal";
//                    System.out.println("No peso normal");
//                    } else
//                    if (imc<27.8f) {
//                    resposta="Marginalmente acima do peso";
//                    System.out.println("Marginalmente acima do peso");
//                    } else
//                        if (imc<31.1f) {
//                        resposta="Acima do peso";
//                        System.out.println("Acima do Peso");
//                        }
//                    else{
//                        resposta="Obeso";
//                        System.out.println("Obeso");
//                        }
//            System.out.println(resposta);
//        } else
//        if (p1.sexo=="F"){
//            System.out.println("Mulher");
//            if (imc < 19.1f){
//                resposta="Abaixo do peso";
//                System.out.println("Abaixo do peso");
//            }
//            else {
//                if (imc < 25.8f){
//                    resposta="no peso normal";
//                    System.out.println("no peso normal");
//                }
//                else {
//                    if (imc < 27.3f){
//                        resposta="marginalmente acima do peso";
//                        System.out.println("Marginalmente acima do peso");
//                    }
//                    else {
//                        if (imc<32.3f){
//                            resposta="Acima do peso";
//                            System.out.println("Acima do peso");
//                        } else {
//                            System.out.println("Obesa");
//                        }
//                    }
//                }
//
//            }
//        }
        //else throw new IllegalArgumentException("Info Invalida");
    }
}
