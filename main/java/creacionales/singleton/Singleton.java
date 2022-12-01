package creacionales.singleton;

public class Singleton {

    private String value;
    private static Singleton _instance;

    public String getValue() {
        return this.value;
    }

    public void setValue( String value ) {
        this.value = value;
    }

    private Singleton( String value ) {
        this.value = value;
    }

    public static Singleton getInstance( String value ) {

        if( _instance == null ) {
            _instance = new Singleton(value);
        }

        _instance.value = value;
        return _instance;
    }

    public void imprime() {
        System.out.println("X: " + value );
    }

}
