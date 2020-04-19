/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author modhv
 */
public class Color {
    private String name,rgb;

    Color() {
        
    }

    public String getName() {
        return name;
    }

    public String getRgb() {
        return rgb;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb;
    }

    public Color(String name, String rgb) {
        this.name = name;
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return "Color{" + "name=" + name + ", rgb=" + rgb + '}';
    }
    
     

}
