public class UnidadeFed {
    public String estado;
    public float valorProduto;

    //Inicio Metodos GETTERS E SETTERS

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        if (! (estado.equals("AC") || estado.equals("AL") || estado.equals("AP") || estado.equals("AM") || estado.equals("BA") || estado.equals("CE")
                || estado.equals("DF") || estado.equals("ES") || estado.equals("GO") || estado.equals("MA") || estado.equals("MT") || estado.equals("MS")
                || estado.equals("MG") || estado.equals("PA") || estado.equals("PB") || estado.equals("PR") || estado.equals("PE") || estado.equals("PI")
                || estado.equals("RJ") || estado.equals("RN") || estado.equals("RS") || estado.equals("RO") || estado.equals("RR") || estado.equals("SC")
                || estado.equals("SP") || estado.equals("SE") || estado.equals("TO"))){
            throw new IllegalArgumentException("Estado invalido");
        }
        this.estado = estado;
    }

    public float getValorProduto() {
        return valorProduto;
    }
    public void setValorProduto(float valorProduto) {
        if (valorProduto<=0.0f){
            throw new IllegalArgumentException("Valor invalido");
        }
        this.valorProduto = valorProduto;
    }
    //FIM Metodos GETTERS E SETTERS


    //INICIO METODO CALCULARIMPOSTO
    public float calcularImposto(){
        //float valor= this.valorProduto * this.;
        float imposto=0;
        float aliquota=0;
        if (this.estado.equals("AC") || this.estado.equals("AL") || this.estado.equals("ES") || this.estado.equals("GO")  || this.estado.equals("MT")
                || this.estado.equals("MS")  || this.estado.equals("PA") || this.estado.equals("RR")  || this.estado.equals("SC")){
            //imposto=getValorProduto()*0.17f;
            aliquota=0.17f;
        } else{
            if (this.estado.equals("AP") || this.estado.equals("AM")  || this.estado.equals("BA")  || this.estado.equals("CE")  || this.estado.equals("DF")
                    || this.estado.equals("MA")  || this.estado.equals("MG")  || this.estado.equals("PB")  || this.estado.equals("PR")  || this.estado.equals("PE")
                    || this.estado.equals("PI")  || this.estado.equals("RN")  || this.estado.equals("RS")  || this.estado.equals("RJ")  || this.estado.equals("SP")
                    || this.estado.equals("SE")  || this.estado.equals("TO")){
                aliquota=0.18f;
            }else {
                if (this.estado.equals("RO")){
                    aliquota=0.175f;
                }
            }
        }
        //COMO DEFINIMOS A VARIAVEL ALIQUOTA EM CADA IF, TEM QUE FAZER A CONTA NO FINAL
        imposto=aliquota*valorProduto;
        System.out.println("Imposto do Produto:"+ imposto);
        return imposto;

    }
}
