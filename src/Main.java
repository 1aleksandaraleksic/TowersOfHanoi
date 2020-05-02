
public class Main {

	public static void main(String[] args) {
	
		int disks = 3;
		
		doTowers(disks, 'A', 'B', 'C');

	}

	public static void doTowers(int disks, char a, char b, char c) {
		
		if(disks == 1 ) {
			System.out.println("DiskA "+disks+" je premestena sa kule "+a+" na kulu "+c);
		}else {
			doTowers(disks-1, a, c, b);
			System.out.println("Disk "+disks+" je premesten sa kule "+a+" na kulu "+c);
			doTowers(disks-1, b, a, c);
		}
		
	}

}
