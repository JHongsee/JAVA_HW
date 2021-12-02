package edu.pnu.admin;

public class Beverage {
    private String type;
    private String name;

    public Beverage(String name, String type) {
        this.name = name; this.type = type;
    }

    public String toString() {
        String str = "[" + name + ", " + type + "]";
        return str;
    }

    public String getBeverageType() {
        return type;
    }

    public String getBeverageName() {
        return name;
    }

    public boolean equals(Object o) {
        Beverage other = (Beverage) o;
        if(this.name.equals(other.getBeverageName()) && this.type.equals(other.getBeverageType()))
            return true;
        else
            return false;
    }

    public int hashCode() {
        int result = 1;
        result = 31 * result + name.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }
}
