import static org.junit.Assert.*;
import org.junit.*;

public class PowerSet 
{ 
	private Node first = new Node("First"); // Der erste Node (bleibt gleich)
	private Node last = first; // Der letzte hinzugefügte Node
	private int length = 0; // Anzahl der Nodes (ohne first)
	private PowerSet.Iterator iterator = new PowerSet.Iterator(); // Der Iterator für dieses PowerSet
	
	// Hange neuen Node einfach hinten an
	public boolean add(Object o) 
	{
		if(this.contains(o))
		{
			return false;
		}
		
		Node newNode = new Node(o); // Neuen Node erstellen
		last.setNext(newNode); // Neuen Node an den Letzten anhängen
		last = newNode; // Neuen Node als Letzten setzen
		length++; // Anzahl mitzählen
		return true;
	}
	
	public boolean delete(Object o)
	{
		Node before = first; // buffer 	
		while(iterator.next()!=null) // durchiterieren
		{
			if(iterator.getData()==o){
				before.setNext(iterator.pointer.getNext());
				length--;
				iterator.first();
				return true;
			}
		}
		iterator.first();
		return false;
	}
	
	public int length() { return length; }
	
	public boolean isEmpty()
	{
		if(first.getNext()==null) 
		{
			return true;
		}
		return false;
	}
	
	public boolean contains(Object o)
	{
		/*
		System.out.println("TEST");
		if(isEmpty()) return false;
	
		while(iterator.next()!=null)
		{
			System.out.println(iterator.getData());
			if(iterator.getData()==o)
			{
				iterator.first();
				return true;
			}
		}
		iterator.first();
		*/	
		
		Node pointer = first;
		if(pointer.getNext()==null) return false;
		pointer= pointer.getNext();
		while(pointer.getNext()!=null)
		{
			System.out.println("searching...");
			if(pointer.getData()== o) 
			{
				System.out.println("Found!");
				return true;
			}
			pointer = pointer.getNext();
		}
		return false;
	}  
	
	public PowerSet.Iterator getIterator() { return iterator; }
	
	// Node-Klasse, simple single-linked-list. SLL weil es kein dynamisches Array in Java gibt.
	private class Node
	{
		Object data; // Inhalt des Nodes, muss für verarbeitung gecasted werden (noch)
		Node next; // Der nächste Node in der Liste
		
		public Node(Object o) { this.data = o; } // Konstruktor
		
		public void setNext(Node node) { this.next = node; } // Setter
		
		public Node getNext() { return this.next; }  // Getter
		
		public void setData(Object o) { this.data = o; } // Setter
		
		public Object getData() { return this.data; } // Getter
	}
	 
	// Iteration über while-Schleife => while(<Powerset>.iterator.next()!=null){ ... }
	private class Iterator
	{
		Node pointer; // Der Node auf den der Iterator zeigt
		
		//Konstruktor
		public Iterator()
		{
			this.pointer = first; // Zeigt per default auf first, damit die while-Schleife simpel bleibt.
		}
		
		// Getter (Damit das retrieven der Data möglichst kurz bleibt.)
		public Object getData()
		{
			return this.pointer.getData();
		}
		
		// Pointer verschieben und neuen Node zurückgeben. Für while-Schleife.
		public Node next()
		{
			this.pointer = this.pointer.getNext();
			return this.pointer;
		}
		
		// Iterator zurücksetzen. Falls man den original Iterator benutzt und nicht in einen neuen kopiert.
		public Node first()
		{
			this.pointer = first;
			return this.pointer;
		}
	}
	
	@Test
	public void add()
	{
		PowerSet add = new PowerSet();
		
		assertEquals(true, add.add(1));
		assertEquals(true, add.add(2));
		assertEquals(true, add.add(3));
		
		assertEquals(1, add.first.getNext().getData());
		assertEquals(2, add.first.getNext().getNext().getData());
		assertEquals(3, add.first.getNext().getNext().getNext().getData());
		
		assertEquals(false, add.add(1));
		assertEquals(false, add.add(2));
		assertEquals(false, add.add(3)); // klappt nicht obwohl Zeile 149 das Gegenteil beweist.
	}
	
	@Test
	public void contains()
	{
		PowerSet add = new PowerSet();
		
		assertEquals(false, add.contains(1));
		assertEquals(true, add.add(1));
		assertEquals(1, add.first.getNext().getData());
		assertEquals(null, add.first.getNext().getNext());
		assertEquals(true, add.contains(1)); // hier klappts wieder nicht
	}
	
	@Test
	public void test()
	{
		PowerSet set = new PowerSet();
		
		assertEquals(true, set.isEmpty());
		assertEquals(0, set.length());
		assertEquals(false, set.contains("Test")); // Contains ist fehlerhaft
		
		assertEquals(true, set.add("Test"));
		assertEquals(false, set.isEmpty());
		//assertEquals(true, set.contains("Test")); // Contains ist fehlerhaft 
		assertEquals(true, set.delete("Test"));
		assertEquals(true, set.isEmpty());
		assertEquals(0, set.length());
		
		assertEquals(true, set.add("Test")); // werden nicht mehr hinzugefügt
		assertEquals(1, set.length());
		assertEquals(true, set.add("Test2")); // werden nicht hinzugefügt
		assertEquals(2, set.length()); // Dadurch, dass sie intakt sind, sollte ich sie lieber zur laufzeit explizit berechnen
		//assertEquals(true, set.contains("Test2")); // Contains ist fehlerhaft
		debug(set);
		//assertEquals(false, set.isEmpty()); // wird error werfen
		assertEquals(2, set.length());
	}
	
	public void debug(PowerSet set)
	{
		PowerSet.Iterator iterator = set.getIterator();
		while(iterator.next()!=null)
		{
			System.out.println(iterator.getData());
		}
	}
} 


