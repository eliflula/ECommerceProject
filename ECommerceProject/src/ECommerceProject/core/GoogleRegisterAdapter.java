package ECommerceProject.core;

import ECommerceProject.Google.GoogleRegister;

public class GoogleRegisterAdapter implements GoogleService {
	// dýþardan müdahale yapamadýðým googleregister sýnýfýný implements yaparak müdahale edebiliyorum

	@Override
	public void registerToSystem(String message) {
		GoogleRegister googleRegister = new GoogleRegister();
		googleRegister.send(message);
		
	}

}
