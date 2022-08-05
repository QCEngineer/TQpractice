package recursionPractice;

public class REcurrsionExample {

	static 	int cnt=1;
	
	public void display()
	{
		if(cnt<=5)
		{
			System.out.println("Hello " + cnt);
			cnt++;
			display();
		}
	}
	public void display(int cnt)
	{
		if(cnt<=5)
		{
			System.out.println("Hello " + cnt);
			cnt++;
			display(cnt);
		}
	}
	//find sum of first 5 num 1+2+3+4+5
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		REcurrsionExample o = new REcurrsionExample();
		o.display(1);
	}

}

