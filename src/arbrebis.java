import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class arbrebis {   // structure adapted to task8 where we need to memorize the indices of g 
	public HashMap<Character, arbrebis> branches;
	public LinkedList<Integer> indices;
	
	arbrebis (HashMap<Character, arbrebis> branches, LinkedList<Integer> indices) {
		this.branches = branches;
		this.indices = indices;
	}
	
	arbrebis () {
		this.branches = null;
		this.indices =new LinkedList<Integer>();
	}
	
	boolean isfeuille () {
		return (this.branches == null);
	}
	
	boolean contains (char c) {
		if (this.branches==null) return false;
		return (this.branches.containsKey(c));
	}
	
	void add (String s, int indice) {
		arbrebis t = this;
		int n = s.length(); 
		for (int i =0;i<n;i++) {
			char c = s.charAt(i);
			if (t.branches==null) {
				t.branches=new HashMap<Character, arbrebis>();
				arbrebis a = new arbrebis();
				t.branches.put(c,a);
			}
			HashMap<Character, arbrebis> b = t.branches;
			if (!b.containsKey(c)){
				arbrebis a = new arbrebis();
				b.put(c,a);
			}
			t=b.get(c);
			if (i==n-1) {t.indices.add(indice);}
			}
		}
	
	
	void printarbre (){
		if (this.isfeuille()){ 
			for (int i :this.indices){
				System.out.println(i);
			}
			System.out.println("");
		}
		else{ 
			Set<Character> T = this.branches.keySet();
			Iterator<Character> it = T.iterator();
			while (it.hasNext()){
				char key= it.next();
				System.out.println(key);
				arbrebis sousarbre= this.branches.get(key);
				if (sousarbre!=null){
					sousarbre.printarbre();}
				}
		}
	}

	//PERSONAL TESTS//
	public static void main(String[] args) {
	LinkedList<Integer> L1 = new LinkedList<Integer>();
	L1.add(2);
	L1.add(3);
	LinkedList<Integer> L2 = new LinkedList<Integer>();
	L2.add(1);
	L2.add(3);
	HashMap<Character, arbrebis> H1 = new HashMap<Character, arbrebis>();
	H1.put('a', null);
	arbrebis a = new arbrebis (H1,L1);
	HashMap<Character, arbrebis> H2 = new HashMap<Character, arbrebis>();
	H2.put('b', null);
	arbrebis b = new arbrebis (H2,L2);
	HashMap<Character, arbrebis>H3 = new HashMap<Character, arbrebis>();
	H3.put('a', a);
	H3.put('c', b);
	arbrebis c = new arbrebis (H3,L2);
	arbrebis d = new arbrebis ();
	d.add("info",1);
	d.add("biologie",6);
	d.add("adn",11);
	d.add("adndna",11);
	d.add("projet",12);
	d.printarbre();
	
	
		}
	}




