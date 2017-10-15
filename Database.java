import java.util.ArrayList;

public class Database {
	private ArrayList<CD> listCD=new ArrayList<CD>();
	private ArrayList<DVD> listDVD=new ArrayList<DVD>();
	private ArrayList<Mp3> listMp3=new ArrayList<Mp3>();
	public void add(CD cd){
		listCD.add(cd);
	}
	public void add(DVD dvd){
		listDVD.add(dvd);
	}
	public void add(Mp3 mp3){
		listMp3.add(mp3);
	}	
	public void list(){
		for(CD cd:listCD){
			cd.print();
		}
		for(DVD dvd:listDVD){
			dvd.print();
		}		
		for(Mp3 mp3:listMp3){
			mp3.print();
		}
	}
	
	public static void main(String[] args) {
		Database db=new Database();
		db.add(new CD("a","zhang",30,2,"555"));
		db.add(new DVD("b",30,"666","wang"));
		db.add(new Mp3("c",30,"000","here"));
		db.list();
	}
}
