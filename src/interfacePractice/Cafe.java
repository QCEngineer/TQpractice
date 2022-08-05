package interfacePractice;

interface IceCream
{
	void eat();
}
interface Juice
{
	void drink();
}
class Mastani implements IceCream,Juice
{
	public void eat()
	{
		System.out.println("Eat IceCream");
	}
	public void drink()
	{	
		System.out.println("Drink Juice");
	}	
}
public class Cafe {

	public static void main(String[] args) {
		IceCream i = new Mastani();
		i.eat();
		Juice j = new Mastani();
		j.drink();
	}

}