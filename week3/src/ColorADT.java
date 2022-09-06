interface ColorADT {
    public enum ColorsEnum {RED,YELLOW,BLUE,GREEN,ORANGE,VIOLET}

    public ColorsEnum mix(ColorsEnum color1,ColorsEnum color2);
    public boolean primary(ColorsEnum color1);
    public ColorsEnum[] form(ColorsEnum color1);
    public ColorsEnum assign(ColorsEnum color2);
    
}
