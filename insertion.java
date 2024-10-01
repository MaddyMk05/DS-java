import java.util.*;

	class madhan{

		int data;

		madhan next;

	}



	public class main {

		madhan head,temp;

		void Create(int n) {

			Scanner sc =new Scanner(System.in);

			int data;

			head  = new madhan();

			data = sc.nextInt();

			head.data = data;

			head.next = null;

			temp = head;

			for(int i=1;i<n;i++) {

				madhan newfrd;

				newfrd = new madhan();

				data = sc.nextInt();

				newfrd.data = data;

				newfrd.next = null;

				temp.next = newfrd;

				temp = temp.next;

			}

		}

		void insbeg(int d) {

			madhan newfrd;

			newfrd = new madhan();

			newfrd.data = d;

			newfrd.next = head;

			head = newfrd;

		}

		void insatpos(int data,int p) {

			madhan newfrd;

			newfrd = new madhan();

			newfrd.data = data;

			newfrd.next = null;

			temp = head;

			for(int i =0;i<p;i++) {

				temp = temp.next;

			}

			newfrd.next  = temp.next;

			temp.next = newfrd;

		}

		void insend(int data) {

			madhan newfrd;

			newfrd = new madhan();

			newfrd.data  = data;

			newfrd.next = null;

			temp = head;

			while(temp.next!=null) {

			temp = temp.next;

			}

			temp.next = newfrd;

		}

		void delatpos(int data2) {

			madhan temp = head;

			madhan temp1 = null;

			

			for (int i = 1 ; i<data2;i++) {

				temp1  = temp;

				temp = temp.next;

			}

			temp1.next = temp.next;

			

			

		}

		void Display() {

			madhan temp = head;

			while(temp!=null) {

				System.out.println(temp.data+" ");

				temp = temp.next;

			}

		}

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			main m = new main();

			int n = sc.nextInt();

			m.Create(n);

			m.Display();

			System.out.println("Insert at Beginning-->");



			int d = sc.nextInt();

			m.insbeg(d);

			m.Display();

			System.out.println("Insert at Position-->");

			int data =sc.nextInt();

			int pos  = sc.nextInt();

			m.insatpos(data, pos);

			m.Display();

			System.out.println("Insert at End-->");

			int data1 = sc.nextInt();

			m.insend(data1);

			m.Display();

			

			System.out.print("Deletion at any position");

			int data2 = sc.nextInt();

			m.delatpos(data2);

			m.Display();

			

		}



	}
