package abstract_practice;

abstract class Machine
{
	void rotate()
	{
		System.out.println("Rorate Machine");
	}
	abstract protected void crush();
}
abstract class Mixer extends Machine 
{
	abstract protected void crush();
	public void blend()
	{
		System.out.println("blend of Fruits");
	}
} 
class Juicer extends Machine 
{
	public void crush()
	{
		System.out.println("Crush Fruits");
	}
	public void filter()
	{
		System.out.println("Filter Juice");
	}
}

public class Juice {

	public static void main(String[] args) {
		Juicer j = new Juicer();
		j.crush();
		j.rotate();
		j.filter();
		System.out.println();
		Machine m = new Juicer();
		m.crush();
		m.rotate();
		
		System.out.println();
		//Mixer mi = new Mixer(); //We Cannot Create Object of abstract class 
		//mi.rotate();
		//mi.blend();
		//mi.crush();

	}

}