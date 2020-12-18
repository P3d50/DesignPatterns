package criacionais.factorymethod;

public class FactoryMethodMain {
	
	public static void main(String []args) {
		
		String msg = "K19 - Treinamentos";
		
		EmissorCreator emissorCreator = new EmissorCreator();
		
		Emissor emissorSMS = emissorCreator.getEmissor(EmissorType.SMS);
		emissorSMS.envia(msg);
		
		Emissor emissorJMS = emissorCreator.getEmissor(EmissorType.JMS);
		emissorJMS.envia(msg);
		
		Emissor emissorEMail = emissorCreator.getEmissor(EmissorType.EMail);
		emissorEMail.envia(msg);
	}
}
