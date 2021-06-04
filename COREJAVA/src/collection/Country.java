package collection;

public class Country implements Comparable {
	private String iso;
    private String code;
    private String name;

    public Country(String iso, String code, String name) {
        this.iso = iso;
        this.code = code;
        this.name = name;
    }

    public String getIso() {
        return iso;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    

    @Override
    public String toString() {
        return "Country{" +
                "iso='" + iso + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(((Country) o).getName());
	}


}
