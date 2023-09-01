package testecalculos.calculo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class Calculos {

    private double media;

    public List<Integer> numeros = new ArrayList<>();

    // Calcular a média
    public double calculaMedia (){

        int soma = 0;

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);


        for (int i = 0; i<numeros.size(); i++){
            soma += numeros.get(i);
        }

        setMedia(soma/ numeros.size());

        return soma / numeros.size();
    }

    // Calcular mediana
    public double calculaMediana (){

        numeros.add(5);
        numeros.add(5);
        numeros.add(5);
        numeros.add(5);
        numeros.add(5);

        Collections.sort(numeros);

        if (numeros.size() % 2 == 0){
            double direita = numeros.size() / 2;
            double esquerda = direita - 1;
            return (direita + esquerda) / 2;
        }else{
            double resultado = numeros.size() / 2;
            int posicao = (int) resultado;

            return numeros.get(posicao);
        }
    }

    // Calcular desvio padrão
    public double calculaDesvPad (){

        double soma = 0;
        double soma1 = 0;

        numeros.add(3);
        numeros.add(6);
        numeros.add(8);
        numeros.add(10);
        numeros.add(12);

        for (int i = 0; i<numeros.size(); i++){
            soma1 += numeros.get(i);
        }

        double media = soma1 / numeros.size();

        for (int i = 0; i<numeros.size(); i++){
            double aux = (numeros.get(i) - media);
            double resultado = aux * aux;
            soma += resultado;
        }

        double resultado = soma/numeros.size();

        return Math.sqrt(resultado);
    }

    // Calcular a soma de todos os valores
    public double calculaTotal(){

        double total = 0;

        numeros.add(5);
        numeros.add(5);
        numeros.add(5);
        numeros.add(5);
        numeros.add(5);

        for (int i= 0; i < numeros.size(); i++){
            total += numeros.get(i);
        }

        return total;
    }

    // Calcular valor máximo
    public double calculaMax (){
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        int valorMax = Collections.max(numeros);

        return valorMax;
    }

    // Calcular valor mínimo
    public double calculaMin(){
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        int valorMin = Collections.min(numeros);

        return valorMin;
    }


}
