package one.digitalinnovation.gof;

import one.digitalinnovation.gof.singleton.*;
import one.digitalinnovation.gof.strategy.*;
import one.digitalinnovation.gof.facade.*;

public class Test {
	public static void main(String[] args) {
		
		//Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//Strategy
		
		Behavior normal = new NormalBehavior();
		Behavior defensive = new DefensiveBehavior();
		Behavior aggressive = new AggressiveBehavior();
		
		Robot robot = new Robot();
		robot.setBehavior(normal);
		
		robot.mover();
		
		robot.setBehavior(defensive);
		
		robot.mover();
		
		robot.setBehavior(aggressive);
		
		robot.mover();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrateClient("Leticia", "80420000");
	}
}
