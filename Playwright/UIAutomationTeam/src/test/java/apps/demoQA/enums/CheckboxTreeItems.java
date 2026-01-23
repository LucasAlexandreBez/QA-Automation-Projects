package apps.demoQA.enums;

public enum CheckboxTreeItems {
	    HOME("Home"),
	    DESKTOP("Desktop"),
	    NOTES("Notes"),
	    COMMANDS("Commands"),
	    DOCUMENTS("Documents"),
	    WORKSPACE("WorkSpace"),
	    REACT("React"),
	    ANGULAR("Angular"),
	    VEU("Veu"),
	    OFFICE("Office"),
	    PUBLIC("Public"),
	    PRIVATE("Private"),
	    CLASSIFIED("Classified"),
	    GENERAL("General"),
	    DOWNLOADS("Downloads"),
	    WORD("Word File.doc"),
	 	EXCEL("Excel File.doc");

	    public final String label;

	    CheckboxTreeItems(String label) {
	        this.label = label;
	    }
	    
	    public String getLabel() {
			return label;
		}
}
