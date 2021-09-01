import java.util.LinkedList;

public class LimkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList L= new LinkedList();
		L.add("Swap");
		L.add("22");
		L.add(11);
		L.add("1992");
		L.add(null);
		L.add("Swap");
System.out.println(L);
L.addFirst("Engineer");
L.addLast("ENTC");
L.removeLast();
System.out.println(L);
for(int i=0;i<L.size();i++)
{
	System.out.println(L.get(i));
}


		

	}

}
