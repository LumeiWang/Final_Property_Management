package entity;

import java.util.Date;
import java.util.Properties;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {	
	// gmail's smtp port
	String emailPort = "587";
	// email address that sends the email
	public static String sendEmailAccount = "propertymanager036@gmail.com";
	// authorization code of the email address sending the email
	public static String sendEmailPassword = "propertymanager123";
	// SMTP server address of the email address sending the email
	public static String sendEmailSMTPHost = "smtp.gmail.com";
	// email address that receives the email
	public static String receiveMailAccount = "";

	public void sendMail(String receiveMailAccount, String mailContent) {
		Properties props = new Properties();
		
		props.setProperty("mail.smtp.port", emailPort);
		props.setProperty("mail.smtp.starttls.enable", "true");
		props.setProperty("mail.transport.protocol", "smtp");
		props.setProperty("mail.smtp.host", sendEmailSMTPHost);
		props.setProperty("mail.smtp.auth", "true");
		props.setProperty("mail.smtp.EnableSSL.enable","true");
		
		Session session = Session.getInstance(props);
		session.setDebug(true);

		try {
			MimeMessage message = createMimeMessage(session, sendEmailAccount, receiveMailAccount, mailContent);
			Transport transport = session.getTransport();
			transport.connect(sendEmailAccount, sendEmailPassword);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();

		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static MimeMessage createMimeMessage(Session session, String sendMail, String receiveMail,
			String mailContent) throws Exception {
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(sendMail, "PropertyManager", "UTF-8"));
		message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail, "User", "UTF-8"));
		message.setSubject("Alert for the Account Password of Property Manager", "UTF-8");
		message.setContent(mailContent, "text/html;charset=UTF-8");
		message.setSentDate(new Date());
		message.saveChanges();
		return message;
	}
}
