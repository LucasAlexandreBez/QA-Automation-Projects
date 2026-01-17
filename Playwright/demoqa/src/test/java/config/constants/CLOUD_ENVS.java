package config.constants;

public enum CLOUD_ENVS {
	ENV1("wss://your-cloud-playwright-endpoint"),
	ENV2("wss://your-cloud-playwright-endpoint"),
	PROD("wss://your-cloud-playwright-endpoint");
	
	private String url;
	
	CLOUD_ENVS(String url){
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}
}
