package creacionales.builder;

public class MainPersona {

    public static void main( String args[]) {

        Persona juan = new PersonaBuilder( "Juan", "Perez", "Ortiz")
                .setEstadoCivil("casado").construir();

        System.out.println( juan.toString() );

    }
}
