package telran.schema.test;

import telran.reflect.SchemaProperties.SchemaProperties;

public class schemaApp {

	public static void main(String[] args) throws Exception {
		 try {
		        PersonNormal persNorm = new PersonNormal();
		        SchemaProperties.displayFieldProperties(persNorm);
		    } catch (IllegalStateException e) {
		        System.err.println("IllegalStateException: " + e.getMessage());
		    }

		    try {
		        PersonNoId persWithoutID = new PersonNoId();
		        SchemaProperties.displayFieldProperties(persWithoutID);
		    } catch (IllegalStateException e) {
		        System.err.println("IllegalStateException: " + e.getMessage());
		    }

		    try {
		        PersonTwoId sameID = new PersonTwoId();
		        SchemaProperties.displayFieldProperties(sameID);
		    } catch (IllegalStateException e) {
		        System.err.println("IllegalStateException: " + e.getMessage());
		    }}}
