public abstract class Vehiculo {
    private Motor motor;
    private Marca marca;
    

    public Motor obtenerMotor() {
        return motor;
    }

    public void modificarMotor(Motor motor) {
        this.motor = motor;
    }

    public Marca obtenerMarca() {
        return marca;
    }

    public void modificarMarca(Marca marca) {
        this.marca = marca;
    }

    public abstract void intercambiarMotor(Motor motor);
}
