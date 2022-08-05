package enumpractice.com;


public class IcecreamParlor1 {

	public enum Icecream {

		Chocolate(5,80),Vanilla(2,50),Strawberry(4,50);

		int price,Quantity;

		Icecream(){}

		Icecream(int a,int b){

			price=a;
			Quantity=b;
		}
		public void getPrice() {

			int bill=Quantity*price;

			System.out.println("Quanity : "+Quantity+"\n price : "+price);
			System.out.println("Your Total Bill : "+bill);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub


			Icecream obj =Icecream.Chocolate;

			switch (obj) {

			case Chocolate:
				obj.getPrice();
				break;

			case Vanilla:
				obj.getPrice();
				break;

			case Strawberry:
				obj.getPrice();

			}

		}
	}
}
