package calcsoap;

import javax.jws.WebService;


@WebService(endpointInterface = "calcsoap.CalculadoraServidorInterface")
public class CalculadoraServidor implements CalculadoraServidorInterface {

    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public int subtracao(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    public float divisao(float num1, float num2) {
        return num1 / num2;
    }

}