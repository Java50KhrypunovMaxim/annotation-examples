package telran.schema.test;

import telran.reflect.ID;
import telran.reflect.Index;
import telran.reflect.Test;

public class PersonTwoId {
	
	@ID
	public int id = 100100;
	@ID
	public int id2 = 100100;
	@Index
	public String name = "Max Khrypunov";
	@Index
	public String department = "QA";
}

