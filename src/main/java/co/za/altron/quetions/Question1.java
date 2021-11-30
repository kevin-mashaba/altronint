package co.za.altron.quetions;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(name = "testMDB", activationConfig = {
@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
@ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/test") })
public class Question1 implements MessageListener {

	public void onMessage(Message message) {
		for (int i = 0; i < 1000; i++) {
			try {
				doReallyComplexProcess(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void doReallyComplexProcess(int i) throws Exception {
		Thread.sleep(1000); 
	}

}