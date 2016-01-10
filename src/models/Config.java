package models;

public abstract class Config {
     String key;
     String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;

    }

    Config(String key, String value){
        this.key = key;
        this.value = value;
    }
}
