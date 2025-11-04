public class MotorHibrido extends Motor{

    public MotorHibrido(){
        this.modificarTipoCombustible(TipoCombustible.HIBRIDO);
    }

    @Override
    public void encenderMotor() {
        System.out.println("Encendiendo motor...");
        System.out.println("Motor Hibrido encendido...");
    }

    @Override
    public void apagarMotor() {
        System.out.println("Apagando motor...");
        System.out.println("Motor Hibrido apagado...");
    }
}
