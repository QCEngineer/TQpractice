package enumpractice.com;


public class EnumInSwitch {

	public enum WeekDay {

		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub


		WeekDay[] daysOfWeek = WeekDay.values();

		for (WeekDay day : daysOfWeek) {

			switch (day) {

			case MONDAY:
			case TUESDAY:
				;
			case WEDNESDAY:
			case THURSDAY:
			case FRIDAY:
				System.err.println(day+": Its Working Day");
				break;
			case SATURDAY:
			case SUNDAY:
				System.err.println(day+": Its Holiday");
				break;

			}
		}
	}
}