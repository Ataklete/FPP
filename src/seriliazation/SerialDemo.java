package seriliazation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDemo {
	
	
	public static void main(String[] args) throws Exception {
		
      Save obj = new Save();
      obj.i = 4;
      
      File f = new File("obj.text");
      FileOutputStream fos = new FileOutputStream(f);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(obj);
      
      FileInputStream fis = new FileInputStream(f);
      ObjectInputStream ois = new ObjectInputStream(fis);
      Save obj1 = (Save) ois.readObject();
      
      System.out.println("value is obj1 " + obj1.toString() );
      
      
      
	}

}
 class Save implements Serializable {
	int i;

	@Override
	public String toString() {
		return "Save [i=" + i + "]";
	}
	
	
}
