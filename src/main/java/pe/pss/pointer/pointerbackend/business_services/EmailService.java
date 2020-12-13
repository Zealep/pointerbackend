package pe.pss.pointer.pointerbackend.business_services;

public interface EmailService {
	
	public void sendMailRestorePass(String to, String subject, String text);
		
}
