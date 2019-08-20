
package com.mycompany.resp.api;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class datos {
    
    private String name;
    private int points;

    public datos() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "datos{" + "name=" + name + ", points=" + points + '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
