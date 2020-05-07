package behavioural.chain_of_responsibility;

public enum AuthenticationTypes {
    NONE("None"), USER("User"), ADMIN("Admin");
    private final String _type;
    private AuthenticationTypes(String type){
        this._type = type;
    }

    public String getType() {
        return this._type;
    }
}
