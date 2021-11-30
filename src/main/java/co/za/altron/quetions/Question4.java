package co.za.altron.quetions;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(name = "testMDB", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/test") })
public class Question4 implements MessageListener {

	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		TextMessage m = (TextMessage) message;
		if (message instanceof TextMessage) {

			

			try {

				Thread.sleep(10000);
				System.out.println("Message received: " + m.getText());

			} catch (InterruptedException | JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				System.out.println("Message received: " + m.getText());
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
