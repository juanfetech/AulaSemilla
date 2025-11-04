public class MotorGasolina extends Motor{

    public MotorGasolina(){
        this.modificarTipoCombustible(TipoCombustible.GASOLINA);
    }

    @Override
    public void encenderMotor() {
        System.out.println("Encendiendo motor...");
        System.out.println("Motor de Gasolina encendido...");
    }

    @Override
    public void apagarMotor() {
        System.out.println("Apagando motor...");
        System.out.println("Motor de Gasolina apagado...");
    }
}
