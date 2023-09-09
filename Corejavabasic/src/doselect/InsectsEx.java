package doselect;

import java.util.ArrayList;
import java.util.List;

class Insect{
	String insectName;
	int insectweight;
	public Insect(String insectname,int insectweight ) {
		super();
		this.insectName=insectname;
		this.insectweight=insectweight;
		
	}
	
	public String getInsectName() {
		return insectName;
	}
	
	public void setInsectName(String insectName) {
		this.insectName = insectName;
	}
	
	public int getInsectweight() {
		return insectweight;
	}
	
	public void setInsectweight(int insectweight) {
		this.insectweight = insectweight;
	}

	@Override
	public String toString() {
		return "Insect [insectName=" + insectName + ", insectweight=" + insectweight + "]";
	}
}

class Insecticides{
	public List<String> mapInsectstName(List<Insect> list){
		List<String> s=new ArrayList<>();
		for(Insect i:list) {
			s.add(i.getInsectName());
		}
		return s;
	}

	public List<Insect> getWeight(List<Insect> list){
		List<Insect> s1=new ArrayList<>();
		for(Insect i:list) {
			int weight=i.getInsectweight();
			if(weight>40 && weight<=100) {
				s1.add(i);
			}
		}
		return s1;
	}
}
	
public class InsectsEx {
	public static void main(String[] args) {
	List<Insect> l=new ArrayList<>();
	l.add(new Insect("Ant",45));
	l.add(new Insect("Cockroach",65));
	l.add(new Insect("bee",99));
	l.add(new Insect("paper Wasp",11));
	
	Insecticides i=new Insecticides();
	System.out.println(i.mapInsectstName(l));
	System.out.println(i.getWeight(l));
	

	}

}
//[Ant, Cockroach, bee, paper Wasp]
//[Insect [insectName=Ant, insectweight=45], Insect [insectName=Cockroach, insectweight=65], Insect [insectName=bee, insectweight=99]]
