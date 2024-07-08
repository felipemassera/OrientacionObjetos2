package ar.edu.unlp.oo1.ejercicio1.app;

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
			String username = "db68956d2f944b"; // Completar con su username de mailtrap
			String password = "539168989e4cf4"; // Completar con su password de mailtrap

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
