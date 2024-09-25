import java.util.*;
	class maddy{
		int data;
		maddy next;
	}
	
public class main1{
	maddy head,temp;
	void create (int n) {
		Scanner sc= new Scanner(System.in);
		int data;
		head =new maddy();
		data = sc.nextInt();
		head.data = data;
		head.next= null;
		temp = head;
		for(int i=1;i<n;i++) {
			maddy newfrd;
			newfrd = new maddy();
			data = sc.nextInt();
			newfrd.data = data;
			newfrd.next = null;
			temp.next =newfrd;
			temp = temp.next;
		}
	}
	void display() {
		maddy temp = head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		main1  m = new main1();
		int n = sc.nextInt();
		m.create(n);
		m.display();
	}
}

