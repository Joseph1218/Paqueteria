class DocumentoUrgente extends EnvioBase {
    // Constructor
    DocumentoUrgente(double peso) {
        super(peso);
    }

    @Override
    public double calcularCosto() {
        return peso * 1.0 + 5.0; // Costo base por peso más tarifa plana para documentos urgentes
    }
}