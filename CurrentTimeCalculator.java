public class CurrentTimeCalculator {
	public static void main(String[] args) {
		long currentMillis = System.currentTimeMillis();
		
		long totalSeconds = currentMillis / 1000;
		long currentSeconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long currentHours = totalHours % 24;
		
		long totalDays = totalHours / 24;
		long currentDays = totalDays % 365;
		
		long years = totalDays / 365;
		
		System.out.printf("---%10s %-5d--- \n---%10s %-5d--- \n---%10s %-5d--- \n---%10s %-5d--- \n---%10s %-5d---"
				, "Years:", years, "Days:", currentDays, "Hours:", currentHours, "Minutes:", currentMinutes, "Seconds:", currentSeconds);
	}
}