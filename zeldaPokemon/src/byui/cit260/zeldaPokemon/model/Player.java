/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.zeldaPokemon.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Player implements Serializable{
    
    // class instance variables
    private String name;
    private double stats;

    public Player() {
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStats() {
        return stats;
    }

    public void setStats(double stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", stats=" + stats + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.stats) ^ (Double.doubleToLongBits(this.stats) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.stats) != Double.doubleToLongBits(other.stats)) {
            return false;
        }
        return true;
    }
    
    
    
}
