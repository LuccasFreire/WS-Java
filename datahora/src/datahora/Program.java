package datahora;

import java.text.Format;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.parse("2023-04-26T22:30:20Z");
		LocalDate d04 = LocalDate.parse("2022-01-10");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/yyyy/MM");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("yyyy/dd/MM HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("yyyy/dd/MM")));
		System.out.println("d02 = " + d02.format(fmt2));
		System.out.println("d03 = " + fmt3.format(d03));
	}

}
