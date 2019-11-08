package CollectionsInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Patients
{
	public String PatName;
	public int MRN;
	
	Patients(int mrn,String PatientName)
	{
		MRN = mrn;
		PatName = PatientName;
	}	
	public String toString() 
	{ 
		return this.MRN + " " + this.PatName;
	} 
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Patients))
			return false;
		Patients patients = (Patients) obj;
		return this.MRN == patients.MRN;
	}

}

class sortPatName implements Comparator<Patients>
{
	public int compare(Patients a, Patients b)
	{
		return a.PatName.compareTo(b.PatName);
	}
}

class sortByMRN implements Comparator<Patients>
{
	public int compare(Patients a,Patients b)
	{
		return a.MRN - b.MRN;
	}
}

public class ComparatorInterface_Test {

	public static void main(String[] args) 
	{
		ArrayList patList = new ArrayList();
		patList.add(new Patients(1,"Larry"));	
		patList.add(new Patients(6,"Zen"));
		patList.add(new Patients(2,"Alice"));
		
		
		  System.out.println("The unsorted list: ");
		  System.out.println(patList);
		  
		 // for(int i=0;i<patList.size();i++) System.out.println(patList.get(i));
		 
		
		/*
		 * System.out.println("The sorted list based on MRN: ");
		 * Collections.sort(patList, new sortByMRN()); for(int i=0;i<patList.size();i++)
		 * System.out.println(patList.get(i));
		 * 
		 * System.out.println("The sorted list based on PatientName: ");
		 * Collections.sort(patList, new sortPatName()); for(int
		 * i=0;i<patList.size();i++) System.out.println(patList.get(i));
		 */
	}
}
