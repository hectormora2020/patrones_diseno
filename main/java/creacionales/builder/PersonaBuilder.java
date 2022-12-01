package creacionales.builder;

public class PersonaBuilder {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    private String estadoCivil;



    // Datos obligatorios
    public PersonaBuilder( String nombre, String apellidoPaterno, String apellidoMaterno ) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }

    public PersonaBuilder setEstadoCivil( String estadoCivil ) {
        this.estadoCivil = estadoCivil;
        return this;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public Persona construir() {
        return new Persona(this);
    }
}
