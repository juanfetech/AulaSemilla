public abstract class Motor implements IMotor {
    private TipoCombustible tipoCombustible;
    private int velocimetro;
    private Marca marca;

    public Marca obtenerMarca() {
        return marca;
    }

    public void modificarMarca(Marca marca) {
        this.marca = marca;
    }

    public TipoCombustible obtenerTipoCombustible() {
        return tipoCombustible;
    }

    public void modificarTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int obtenerVelocidad() {
        return velocimetro;
    }

    @Override
    public void acelerarMotor(int velocidad) {
        this.velocimetro += velocidad;
    }

    @Override
    public void frenarMotor(int velocidad) {
        var velocidadAplicada = this.velocimetro - velocidad;
        this.velocimetro = velocidadAplicada >= 0 ? velocidadAplicada : 0;
    }

    public abstract void encenderMotor();
    public abstract void apagarMotor();
}
