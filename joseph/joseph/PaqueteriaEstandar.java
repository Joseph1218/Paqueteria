class PaqueteEstandar extends EnvioBase {
    // Constructor
    PaqueteEstandar(double peso) {
        super(peso);
    }

    @Override
    public double calcularCosto() {
        return peso * 0.5; // Costo base por peso para paquetes estándar
    }
}
