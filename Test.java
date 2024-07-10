public class Test
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("This is new context");
		Singleton ins1=Singleton.getInstance();
		Singleton ins2=Singleton.getInstance();
		System.out.println("has code of Singleton class will not be changed: "+ins1.hashcode()+"--"+ins2.hashcode());
		System.out.println("has code of Singleton class will not be changed & will be equal: "+ins1.equals(ins2));
	}
}

class Singleton{
	private static volatile Singleton instance;
	private Singleton() {
	}
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized(Singleton.class){
				if(instance==null)
					instance= new Singleton();
			}
		}
		return instance;
	}
}
