package JavaKodlama.northwind.Core.utilities.results;

public class result {
	private boolean success;
	private String message;
	
	public result(boolean success) {
		this.success=success;
	}	
	public result(boolean success,String message) {
		this(success);
		this.message = message;
	}
	public boolean isSuccess() {
		return this.success;
	}
	public String getMessage() {
		return this.message;
	}
}
