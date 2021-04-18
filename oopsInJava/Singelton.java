package oopsInJava;

class AppConfig{
	private AppConfig() {
		
	}
	
	static AppConfig appConfig = null;
	
	public static AppConfig getInAppConfig() {
		if(appConfig == null) {
			appConfig = new AppConfig();
		}
		return appConfig;
	}
	
	
}

public class Singelton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AppConfig appConfig = AppConfig.getInAppConfig();
		
		System.out.println(appConfig.hashCode());
		
	}

}
