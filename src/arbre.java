import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class arbre {
	public HashMap<Character, arbre> branches; // on each child the letter and its corresponding tree 
	
	arbre (HashMap<Character, arbre> branches) {
		this.branches = branches;
	}
	arbre () {
		this.branches = null;
	}
	
	boolean isfeuille () {
		return (this.branches == null);
	}
	
	boolean contains (char c) {
		if (this.branches==null) return false;
		return (this.branches.containsKey(c));
	}
	
	void add (String s) {
		arbre t = this;
		int n = s.length(); 
		for (int i =0;i<n;i++) {
			char c = s.charAt(i);
			
			if (t.branches==null) {
				t.branches=new HashMap<Character, arbre>();
				arbre a = new arbre();
				t.branches.put(c,a);
			}
			HashMap<Character, arbre> b = t.branches;
			if (!b.containsKey(c)){
				arbre a = new arbre();
				b.put(c,a);
			}
			t=b.get(c);
			}
		}
	
	
	void printarbre (){
		if (this.isfeuille()){  
			System.out.println("");
		}
		else{ 
			Set<Character> T = this.branches.keySet();
			Iterator<Character> it = T.iterator();
			while (it.hasNext()){
				char key= it.next();
				System.out.println(key);
				arbre sousarbre= this.branches.get(key);
				if (sousarbre!=null){
					sousarbre.printarbre();}
				}
		}
	}

	//// PERSONAL TESTS /// 
	public static void main(String[] args) {
	HashMap<Character, arbre> H1 = new HashMap();
	H1.put('a', null);
	arbre a = new arbre (H1);
	HashMap<Character, arbre> H2 = new HashMap();
	H2.put('b', null);
	arbre b = new arbre (H2);
	HashMap<Character, arbre> H3 = new HashMap();
	H3.put('a', a);
	H3.put('c', b);
	arbre c = new arbre (H3);
	arbre d = new arbre ();
	d.add("projet");
	d.add("info");
	d.add("biologie");
	d.add("adn");
	d.add("proj");
	d.printarbre();
	}
}


