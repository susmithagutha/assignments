package inheritance;

public class MainClass {
	public static void main(String args[]){
		math md=new math();
		System.out.println("math dept minbudget is"+md.getMinbudget());
		System.out.println("math dept maxbudget is"+md.getMaxbudget());
		science sd=new science();
		System.out.println("science dept minbudget is"+sd.getMinbudget());
		System.out.println("science dept maxbudget is"+sd.getMaxbudget());
		Language ld=new Language();
		System.out.println("language dept minbudget is"+ld.getMinbudget());
		System.out.println("language dept max budget is"+ld.getMaxbudget());
	}

}
