package jogo2;

public class InventarioCheioException extends RuntimeException {
    public InventarioCheioException() {
        super("Reserva invalida.");
    }
}