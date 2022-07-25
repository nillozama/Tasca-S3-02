
public class Principal32 {
	
	public static void main(String [] args) {
		
		IssuingBroker broker=new IssuingBroker();
		Brokerage vl=new Brokerage("V&L");
		Brokerage cm=new Brokerage("Capital Market");
		Brokerage mm=new Brokerage("MM");
		broker.subscribe(vl);
		broker.subscribe(cm);
		broker.subscribe(mm);
		
		broker.notify("pujat");
		broker.unsubscribe(mm);
		broker.notify("baixat");
		
	}
}
