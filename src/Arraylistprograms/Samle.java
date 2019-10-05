package Arraylistprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Samle {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
al.add("yaswu");
al.add("lukky");
al.add("vikky");
System.out.println(al);
al.remove(1);
System.out.println(al.size());
//Iterator it =al.iterator();
//while(it.hasNext()){
	//System.out.println(it.next());
for(int i=0;i<al.size();i++)
	System.out.println(al.get(i));
}

}


