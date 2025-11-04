public class Marca {
    private String descripcion;
    private String nombre;

    public Marca() {
    }

    public Marca(String nombre){
        this.nombre = nombre;
    }

    public String obtenerDescripcion() {
        return descripcion;
    }

    public void modificarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void modificarNombre(String nombre) {
        this.nombre = nombre;
    }

}
