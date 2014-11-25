package david;

class MiHebra extends Thread{
	public boolean _tabular;
	
	public MiHebra(boolean tabulador){
		_tabular = tabulador;
	}
	public void run(){
		long num = 0;
		while (true) {
			if(num % 100 == 0){
				if(_tabular) System.out.print("\t");
				System.out.println(num);
				yield();
			}
			num++;
		}
	}
}

public class Yield {

	public static void main(String[] args) {
		MiHebra mh;
		
		mh = new MiHebra(true);
		mh.start();
		
		mh = new MiHebra(false);
		mh.start();

	}

}
