package com.jp.calculadora;

public class CalculadoraLogica {

    public double calcular(double num1, String operador, double num2) {
        return switch (operador) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "×" -> num1 * num2;
            case "÷" -> {
                if (num2 == 0) {
                    throw new ArithmeticException("No se puede dividir por cero");
                }
                yield num1 / num2;
            }
            default -> throw new IllegalArgumentException("Operador no válido: " + operador);
        };
    }
}
