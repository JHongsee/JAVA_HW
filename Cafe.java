package edu.pnu.admin;
import edu.pnu.collection.*;


public class Cafe {
    private String name;
    GenericList<Beverage> students = new GenericList<Beverage>();

    public Cafe(String name) {
        this.name = name;
    }

    public String toString() {
        String msg = " Cafe Name: " + name + " Beverage Count: " + students.size() + "\n";
        GenericList<Beverage>.GenericIterator values = students.iterator();
        while(values.hasNext()) {
            msg += "\t" + values.next() + "\n";
        }
        return msg;
    }

    public void addBeverage(Beverage newBeverage) {
        students.add(newBeverage);
    }

    public void removeAllBeverage() {
        students.clear();
    }

    public Beverage findBeverage(String name, String type) {
        Beverage findB = new Beverage(name, type);
        GenericList<Beverage>.GenericIterator values = students.iterator();
        while(values.hasNext()) {
            if(values.next().equals(findB)) {
                return findB;
            }
        }
        return null;
    }
}
