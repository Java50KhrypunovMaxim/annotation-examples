package telran.x;

import telran.reflect.processor.TestLibrary;

public class Xapplication {
	public static void main(String[] args) throws Exception {
		Xtest testObj = new Xtest();
		TestLibrary.launchTest(testObj);
		TestLibrary.launchBeforeEach(testObj);

	}

}

