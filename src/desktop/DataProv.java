package desktop;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.testng.annotations.DataProvider;


public class DataProv {
	public static Random rnd = new Random ();
	
	@DataProvider (name = "groupDate")
	public static Iterator<Object[]> createDataProv (){
		List<Object[]> list = new ArrayList<Object[]>();
		for (int i = 0; i<1; i ++){
			list.add(new Object[]{
					"D"+rnd.nextInt(),
					"G"+rnd.nextInt(),
					"H"+rnd.nextInt(),
					"asd@"+rnd.nextInt()+".com"});
				}
		return list.iterator();
	}

}