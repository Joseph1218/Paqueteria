class ArticuloFragil extends EnvioBase {
    // Constructor
    ArticuloFragil(double peso) {
        super(peso);
    }

    @Override
    public double calcularCosto() {
        return peso * 0.8 + 10.0; // Costo base por peso más tarifa plana por embalaje especial para artículos frágiles
    }
}
