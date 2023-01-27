public class IMC {

    private double masa;
    private double estatura;
    private double imc;

    public IMC(double masa, double estatura) {
        this.masa = masa;
        this.estatura = estatura;
        this.imc = masa/Math.pow(estatura,2);
    }

    public String generarDiagnostico(){

        StringBuilder diagnostico = new StringBuilder();

        diagnostico.append("\n\t || Tu índice de masa corporal es: "+String.format("%.2f",imc));

        if(imc<16.0){
            diagnostico.append("\n\t || Tu IMC indica delgadez severa");
        }else if(imc<17.0){
            diagnostico.append("\n\t || Tu IMC indica delgadez moderada");
        }else if(imc<18.5){
            diagnostico.append("\n\t || Tu IMC indica delgadez leve");
        }else if(imc<25.0){
            diagnostico.append("\n\t || Tu IMC indica normalidad");
        }else if(imc<30){
            diagnostico.append("\n\t || Tu IMC indica preobesidad");
        }else if(imc<35){
            diagnostico.append("\n\t || Tu IMC indica obesidad leve");
        }else if(imc<40){
            diagnostico.append("\n\t || Tu IMC indica obesidad media");
        }else{
            diagnostico.append("\n\t || Tu IMC indica obesidad mórbida");
        }

        diagnostico.append("\n\t || Sigue las indicaciones de tu médico");

        return diagnostico.toString();
    }

}
