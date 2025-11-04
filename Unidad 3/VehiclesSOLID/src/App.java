public class App {
    public static void main(String[] args) throws Exception {

        // 1. Creación de las Marcas.
        Marca toyota = new Marca("Toyota");
        Marca mercedez = new Marca("Mercedez");
        Marca bmw = new Marca("BMW");

        // 2. Creación de los primeros motores.
        Motor motorElectricoBMW = new MotorElectrico();
        Motor motorHibridoMercedez = new MotorHibrido();
        Motor motorGasolinaToyota = new MotorGasolina();

        motorElectricoBMW.modificarMarca(bmw);
        motorHibridoMercedez.modificarMarca(mercedez);
        motorElectricoBMW.modificarMarca(toyota);

        // 3. Creación de los segundos motores.
        Motor motorElectricoToyota = new MotorElectrico();
        Motor motorHibridoBMW = new MotorHibrido();
        Motor motorGasolinaMercedez = new MotorGasolina();

        motorElectricoToyota.modificarMarca(toyota);
        motorHibridoBMW.modificarMarca(bmw);
        motorGasolinaMercedez.modificarMarca(mercedez);

        // 4. Implementación de SOLID
        Vehiculo vehiculoElectrico = new VehiculoElectrico();
        Vehiculo vehiculoHibrido = new VehiculoHibrido();
        Vehiculo vehiculoGasolina = new VehiculoGasolina();

        vehiculoElectrico.intercambiarMotor(motorElectricoBMW);
        vehiculoHibrido.intercambiarMotor(motorHibridoMercedez);
        vehiculoGasolina.intercambiarMotor(motorGasolinaToyota);

        System.out.println("------------------------------");
        System.out.println("Segundo Intercambio de motores");
        System.out.println("------------------------------");

        vehiculoElectrico.intercambiarMotor(motorGasolinaMercedez);
        vehiculoHibrido.intercambiarMotor(motorHibridoBMW);
        vehiculoGasolina.intercambiarMotor(motorGasolinaMercedez);

    }
}
