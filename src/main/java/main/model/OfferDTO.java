package main.model;

public class OfferDTO {

	private int id;
	
	private String code;
	
	private String name;
	
	private long duration;
	
	private boolean external;
	
	private String source;

	public OfferDTO() {
	}

	public OfferDTO(int id, String code, String name, long duration, boolean external, String source) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.duration = duration;
		this.external = external;
		this.source = source;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public boolean isExternal() {
		return external;
	}

	public void setExternal(boolean external) {
		this.external = external;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
}
