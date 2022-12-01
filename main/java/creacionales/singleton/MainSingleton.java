package creacionales.singleton;

public class MainSingleton  {

    public static void main( String args []) {

        Singleton ejemplo = Singleton.getInstance ("X");
        Singleton ejemplo2 = Singleton.getInstance("SJADHKAJSH");

        ejemplo.imprime();
        ejemplo2.imprime();

    }
}
