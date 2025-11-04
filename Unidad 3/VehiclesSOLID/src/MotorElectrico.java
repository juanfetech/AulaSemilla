public class MotorElectrico extends Motor {

    public MotorElectrico(){
        this.modificarTipoCombustible(TipoCombustible.ELECTRICO);
    }

    @Override
    public void encenderMotor() {
        System.out.println("Encendiendo motor...");
        System.out.println("Motor Electrico encendido...");
    }

    @Override
    public void apagarMotor() {
        System.out.println("Apagando motor...");
        System.out.println("Motor Electrico apagado...");
    }
}
