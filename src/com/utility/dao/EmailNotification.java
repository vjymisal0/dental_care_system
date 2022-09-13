package com.utility.dao;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;


import java.util.Properties;


public class EmailNotification {
	
	final static String from="dentalcaremh13@gmail.com";
	static String subject = "Apointment Booking Confirmation";
 	
	
	public Boolean sendAppointmentBookedMail(String to)
	{
		Boolean b = true;
		subject = "Appointment Booked";
		String host = "smtp.gmail.com";
		Properties p = System.getProperties();
		p.put("mail.smtp.host", host);
		p.put("mail.smtp.port", "465");
		p.put("mail.smtp.ssl.enable", "true");
		p.put("mail.smtp.auth", "true");
		Session s = Session.getInstance(p, new Authenticator()
				{

					@Override
					protected PasswordAuthentication getPasswordAuthentication() {
						// TODO Auto-generated method stub
						return new PasswordAuthentication(from,"stlfxrdizvnqqgry");
					}
			
				});
		MimeMessage m = new MimeMessage(s);
		try {
			m.setFrom(from);
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			m.setSubject(subject);
			m.setText("Hello there, thanks for booking your appoinment for dental care with your respective issues"+"\nWe will contact you shortly for any help please contact us on: www.mydental.org.in 😊" );
			Transport.send(m);
		}
		catch(MessagingException e)
		{
			e.printStackTrace();
			b = false;
		}
		finally
		{
			System.out.println("Completed");
			
		}
		return b;
	}
}