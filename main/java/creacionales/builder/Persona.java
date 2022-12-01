package creacionales.builder;

public class Persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;

    private String calle;
    private String codigoPostal;
    private String municipio;
    private String estadoCivil;

    public Persona( String nombre, String apellidoPaterno, String apellidoMaterno ) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public Persona( PersonaBuilder builder ) {
        this.nombre = builder.getNombre();
        this.apellidoPaterno = builder.getApellidoPaterno();
        this.apellidoMaterno = builder.getApellidoMaterno();
        this.estadoCivil = builder.getEstadoCivil();
    }
/*
    public Persona( String nombre, String apellidoPaterno, String apellidoMaterno, int edad ) {
        this(nombre, apellidoPaterno, apellidoMaterno);
        this.edad = edad;
    }

    public Persona( String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String codigoPostal ) {
        this(nombre, apellidoPaterno, apellidoMaterno, edad);
        this.codigoPostal = codigoPostal;
    }

    public Persona( String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String codigoPostal, String municipio ) {
        this(nombre, apellidoPaterno, apellidoMaterno, edad, codigoPostal);
        this.municipio = municipio;
    }

    public Persona( String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String codigoPostal, String municipio, String estado) {
        this(nombre, apellidoPaterno, apellidoMaterno, edad, codigoPostal, municipio);
        this.estado = estado;
    }*/

    @Override
    public String toString() {

        return "Nombre: " + this.nombre + ", Paterno: " + this.apellidoPaterno + ", Materno: " + this.apellidoMaterno + ", Estado Civil: " + this.estadoCivil;
    } // ./toString()


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre( String nombre ) {
        this.nombre = nombre;
    }
}
