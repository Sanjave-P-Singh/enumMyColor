package com.example.enummycolor;
// Csc 22100 Software Design Lab
// Enum Type MyColor

//import java.awt.Color;
import javafx.scene.paint.Color;

import java.util.Random;

public enum MyColor{
    // Define constant colors: RapidTables
    ALICEBLUE(240, 248, 255),
    ANTIQUEWHITE(250, 235, 215),
    AQUA(0, 255, 255),
    AQUAMARINE(127, 255, 212),
    AZURE(240, 255, 255),
    BEIGE(245,245,220),
    BISQUE(255, 228, 196),
    BLACK(0, 0, 0),
    BLANCHEDALMOND(255, 235, 205),
    BLUE(0, 0, 255),
    BLUEVIOLET(138, 43, 226),
    BROWN(165, 42, 42),
    BURLYWOOD(222, 184, 135),
    CADETBLUE(95, 158, 160),
    CHARTREUSE(127, 255, 0),
    CHOCOLATE(210, 105, 30),
    CORAL(255, 127, 80),
    CORNFLOWERBLUE(100, 149, 237),
    CORNSILK(255, 248, 220),
    CRIMSON(220, 20, 60),
    CYAN(0, 255, 255),
    DARKBLUE(0, 0, 139),
    DARKCYAN(0, 139, 139),
    DARKGOLDENROD(184, 134, 11) ,
    DARKGRAY(169, 169, 169) ,
    DARKGREY(169, 169, 169) ,
    DARKGREEN(0, 100, 0) ,
    DARKKHAKI(189, 183, 107) ,
    DARKMAGENTA(139, 0, 139) ,
    DARKOLIVEGREEN(85, 107, 47) ,
    DARKORANGE(255, 140, 0) ,
    DARKORCHID(153, 50, 204) ,
    DARKRED(139, 0, 0) ,
    DARKSALMON(233, 150, 122) ,
    DARKSEAGREEN(143, 188, 143) ,
    DARKSLATEBLUE(72, 61, 139) ,
    DARKSLATEGRAY(72, 61, 139) ,
    DARKTURQUOISE(0, 206, 209) ,
    DARKVIOLET(148, 0, 211) ,
    DEEPPINK(255, 20, 147) ,
    DEEPSKYBLUE(0, 191, 255) ,
    DIMGRAY(105, 105, 105),
    DIMGREY(105, 105, 105) ,
    DODGERBLUE(301, 44, 255) ,
    FIREBRICK(178, 34, 34) ,
    FLORALWHITE(255, 250, 240) ,
    FORESTGREEN(34, 139, 34) ,
    GAINSBORO(220, 220, 220) ,
    GHOSTWHITE(248, 248, 255) ,
    GOLD(255, 215, 0) ,
    GOLDENROD(218, 165, 32) ,
    GRAY(128, 129, 128),
    GREY (128, 129, 128),
    GREEN(0, 128, 0),
    GREENYELLOW(173, 255, 47),
    HONEYDEW(240, 255, 240),
    HOTPINK(255, 105, 180),
    INDIANRED(205, 92, 92),
    INDIGO(75, 0, 130),
    IVORY(255, 255, 240),
    KHAKI(240, 230, 140),
    LAVENDER(230, 230, 250),
    LAVENDERBLUSH(255, 240, 245),
    LAWNGREEN(124, 252, 0) ,
    LEMONCHIFFON(255, 250, 205) ,
    LIGHTBLUE(173, 216, 230),
    LIGHTCORAL(240, 128, 128),
    LIGHTCYAN(224, 255, 255) ,
    LIGHTGOLDENRODYELLOW(250, 250, 210) ,
    LIGHTGRAY(211, 211, 211) ,
    LIGHTGREY(211, 211, 211) ,
    LIGHTGREEN(144, 238, 144) ,
    LIGHTPINK(255, 182, 193) ,
    LIGHTSALMON(255, 160, 122) ,
    LIGHTSEAGREEN(32, 178, 170) ,
    LIGHTSKYBLUE(135, 206, 250) ,
    LIGHTSLATEGRAY(119, 136, 153) ,
    LIGHTSTEELBLUE(176, 196, 222) ,
    LIGHTYELLOW(255, 255, 224) ,
    LIME(0, 255, 0) ,
    LIMEGREEN(50, 205, 50) ,
    LINEN(250, 240, 230) ,
    MAGENTA(255, 0, 255) ,
    FUCHSIA(255, 0, 255) ,
    MAROON(128, 0, 0) ,
    MEDIUMAQUAMARINE(102, 205, 170) ,
    MEDIUMBLUE(0, 0, 205) ,
    MEDIUMORCHID(186, 85, 211) ,
    MEDIUMPURPLE(147, 112, 219) ,
    MEDIUMSEAGREEN(60, 179, 113),
    MEDIUMSLATEBLUE(123, 104, 238),
    MEDIUMSPRINGGREEN(0, 250, 154),
    MEDIUMTURQUOISE(72, 209, 204),
    MEDIUMVIOLETRED(199, 21, 133),
    MIDNIGHTBLUE(25, 25, 112),
    MINTCREAM(245, 255, 250),
    MISTYROSE(255, 228, 225),
    MOCCASIN(255, 228, 181),
    NAVAJOWHITE(255, 222, 173),
    NAVY(0, 0, 128),
    OLDLACE(253, 245, 230),
    OLIVE(128, 128, 0),
    OLIVEDRAB(107, 142, 35),
    ORANGE(255, 165, 0),
    ORANGERED(255, 69, 0),
    ORCHID(218, 112, 214),
    PALEGOLDENROD(238, 232, 170),
    PALEGREEN(152, 251, 152),
    PALETURQUOISE(175, 238, 238),
    PALEVIOLETRED(219, 112, 147),
    PAPAYAWHIP(255, 239, 213),
    PEACHPUFF(255, 218, 185),
    PERU(205, 133, 63),
    PINK(255, 192, 203),
    PLUM(221, 160, 221),
    POWDERBLUE(176, 224, 230),
    PURPLE(128, 0, 128),
    RED(255, 0, 0),
    ROSYBROWN(188, 143, 143),
    ROYALBLUE(65, 105, 225),
    SADDLEBROWN(139, 69, 19),
    SALMON(250, 128, 114),
    SANDYBROWN(244, 164, 96),
    SEAGREEN(46, 139, 87),
    SEASHELL(255, 245, 238),
    SIENNA(160, 82, 45),
    SILVER(192, 192, 192),
    SKYBLUE(135, 206, 235),
    SLATEBLUE(106, 90, 205),
    SLATEGRAY(112, 128, 144),
    SNOW(255, 250, 250),
    SPRINGGREEN(0, 255, 127),
    STEELBLUE(70, 130, 180),
    TAN(210, 180, 140),
    TEAL(0, 128, 128),
    THISTLE(216, 191, 216),
    TOMATO(255, 99, 71),
    TURQUOISE(64, 224, 208),
    VIOLET(238, 130, 238),
    WHEAT(245, 222, 179),
    WHITE(255,255,255),
    WHITESMOKE(245, 245, 245),
    YELLOW(255, 255, 0),
    YELLOWGREEN(154, 205, 50);


    // Instance variables
    private int r;
    private int g;
    private int b;
    private int a;
    private int argb;

    // Constructor
    MyColor(int r, int g, int a) {
        setR(r);
        setG(g);
        setB(b);
        setA(a);
        setARGB(r, g, b, a);
    }

    // Set Methods
    private void setR(int r){ if (r >= 0 && r <= 255) this.r = r; }
    private void setG(int g){ if (g >= 0 && g <= 255) this.g = g; }
    private void setB(int b){ if (b >= 0 && b <= 255) this.b = b; }
    private void setA(int a){ if (a >= 0 && a <= 255) this.a = a; }

    private void setARGB(int r, int g, int b, int a) {
        this.argb = (a << 24) & 0xFF000000 |
                (r << 16) & 0x00FF0000 |
                (g << 8) & 0x0000FF00 |
                b;
    }

    //Get methods
    public int getR(){ return r; }
    public int getG(){ return g; }
    public int getB(){ return b; }
    public int getA(){ return a; }
    public int getARGB(){return argb; }

    public String getHexColor() { // Opaque colors only

        // Return "#" + Integer.toHexString(argb).toUpperCase();
        return "#" + Integer.toHexString(argb).toUpperCase();
    }

    public Color getJavaFXColor() {
        return Color.rgb(r, g, b, (double) a / 255.0);
    }
    public Color getJavaFXOpaqueColor() {return Color.rgb(r, g, b); }
    public static MyColor[] getMyColors() {return MyColor.values(); }
    public static String[] getMyColorIds() {

        MyColor[] colors = getMyColors();
        String[] myColorsIds = new String[colors.length];
        int i = 0;
        for (MyColor color : colors) {
            myColorsIds[i] = color.toString();
            ++i;
        }
        return myColorsIds;
    }

    public static MyColor getRandomColor(){

        Random rand = new Random();
        return MyColor.values()[rand.nextInt(MyColor.values().length-1)];
    }
    public Color getRandomOpaqueColor() {
        Random rand = new Random();
        return Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
    }

    //Create a new Color inverted from this JavaFX Color object; Opactiy is reserved
    public Color invertColor() {return Color.rgb(255 - r, 255 - g, 255 - b,(double) a / 255.0);}

    public Color blendColors(MyColor otherColor, double scale) {

        int rBlended, gBlended, bBlended;
        double aBlended;

        if (scale == 0.0) return otherColor.getJavaFXColor();
        if (scale == 1.0) return this.getJavaFXColor();
        if (scale < 0 || scale > 1) {scale = 0.5;}

    rBlended =(int)(this.r * scale + otherColor.getR() * (1.0 - scale));
    gBlended =(int)(this.g * scale + otherColor.getG() * (1.0 - scale));
    bBlended =(int)(this.b * scale + otherColor.getB() * (1.0 - scale));
    aBlended =(this.a * scale + otherColor.getA() * (1.0 - scale)) / 255.0;

        return Color.rgb(r,g,b,a);
    }

    public String print() {
        return this + "(" + this.r + "," + this.g + ", " + this.b + ", " + this.a + ")"
                + "Hexadecimal Code: " + this.getHexColor();
    }
}





