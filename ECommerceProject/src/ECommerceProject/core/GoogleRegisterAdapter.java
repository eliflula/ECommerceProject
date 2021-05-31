package ECommerceProject.core;

import ECommerceProject.Google.GoogleRegister;

public class GoogleRegisterAdapter implements GoogleService {
	// d��ardan m�dahale yapamad���m googleregister s�n�f�n� implements yaparak m�dahale edebiliyorum

	@Override
	public void registerToSystem(String message) {
		GoogleRegister googleRegister = new GoogleRegister();
		googleRegister.send(message);
		
	}

}
