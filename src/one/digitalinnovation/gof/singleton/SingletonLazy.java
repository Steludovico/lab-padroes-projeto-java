package one.digitalinnovation.gof.singleton;

import one.digitalinnovation.gof.config.AppConfig;

/**
 * Singleton "pregui�oso".
 * 
 * @author falvojr
 */
public class SingletonLazy {

	private static AppConfig instancia;

    private SingletonLazy() {
        super();
    }

    public static AppConfig getInstancia() {
        if (instancia == null) {
            instancia = new AppConfig();
        }
        return instancia;
	}
}
