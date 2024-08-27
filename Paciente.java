package modelos;

public class Paciente {
    //Atributos
    private  String nomeCompleto = "";
    private  int peso = 0;
    private  float altura = 0;
    private  String sexo = "";

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) throws Exception{
        if (peso <= 0) throw new Exception("Peso invalido");
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if (altura <= 0) throw new Exception("Altura invalida");
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float calcularImc() {
        return peso / (altura * altura);
    }
    public String calcularFaixaDePeso(){
        float imc = calcularImc();
        if (imc < 20) return "Abaixo do peso ideal. ";
        if (imc <= 25) return "Peso ideal. ";
        if (imc <=30)    return "Excesso de peso.";
        else if (imc <= 35) return "Obesidade. ";
        return "Obesidade Morbida. ";
    }
    public float calcularPesoIdeal(){
        if (sexo.equalsIgnoreCase("masculino"))
            return (float) (72.7 * altura - 58);
        return (float) (62.1 * altura - 44.7);
    }

}
