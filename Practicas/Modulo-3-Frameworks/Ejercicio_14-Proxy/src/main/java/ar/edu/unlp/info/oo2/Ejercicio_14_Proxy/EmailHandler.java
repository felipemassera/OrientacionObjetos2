package ar.edu.unlp.info.oo2.Ejercicio_14_Proxy;

import java.util.Properties;
import java.util.logging.ConsoleHandler;
import java.util.logging.LogRecord;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class EmailHandler extends ConsoleHandler {
	
	public void publish(LogRecord record) {
		try {
			String from = "example@logger.com";
			String to = "destination@mail.com";

			// Credenciales
			String username = "d64d76ffc0b5d4"; // Completar con su username de mailtrap
			String password = "00b0ab9004395a"; // Completar con su password de mailtrap

			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.mailtrap.io");
			props.put("mail.smtp.port", "587");

			Session session = Session.getInstance(props, new Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			});

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from, "Java logging mail"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject("Tema del mail");
			message.setText(record.getMessage());
			Transport.send(message);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
