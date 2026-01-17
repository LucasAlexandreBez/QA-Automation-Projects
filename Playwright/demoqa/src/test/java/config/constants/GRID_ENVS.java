package config.constants;

public enum GRID_ENVS {
	ENV1("ws://localhost:4444/playwright"),
	ENV2("ws://localhost:4444/playwright"),
	PROD("ws://localhost:4444/playwright");
	
	private String url;
	
	GRID_ENVS(String url){
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}
}
