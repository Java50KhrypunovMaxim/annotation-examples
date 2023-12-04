package telran.schema.test;

import telran.reflect.ID;
import telran.reflect.Index;

public class PersonNormal {
	@ID
	public int id = 100100;
	@Index
	public String name = "Max Khrypunov";
	@Index
	public String department = "QA";
}
