package com.jp.calculadora;

public class CalculadoraLogica {

    public double calcular(double num1, String operador, double num2) {
        return switch (operador) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "×" -> num1 * num2;
            case "÷" -> num1 / num2;
            default -> throw new IllegalArgumentException("Operador no válido: " + operador);
        };
    }
}
