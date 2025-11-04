public class VehiculoElectrico extends Vehiculo {

    @Override
    public void intercambiarMotor(Motor motor) {
         if (motor.obtenerTipoCombustible() == TipoCombustible.ELECTRICO) {
            this.modificarMotor(motor);
            System.out.println("Motor se cambio de forma exitosa");
            this.obtenerMotor().encenderMotor();
            this.obtenerMotor().apagarMotor();
        } else {
            System.out.println("No se permite realizar dicho intercambio por que solo se acepta motores a Gasolina");
        }
    }

}
