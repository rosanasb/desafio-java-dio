package one.digitalinnovation.gof.singleton;

/**
 * Singleton "lazy"
 */
public class SingletonLazy {
	private static SingletonLazy instancia;
	//garante que ninguem fora dessa classe consegue alterar.
	private SingletonLazy() {
		super();
	}
	//esse metodo expoe de maneira publica
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
