public class MyColor implements ColorADT {
    private ColorsEnum color;
    public MyColor(ColorsEnum s){
        color = s;
    }
    @Override
    public ColorsEnum mix(ColorsEnum color1, ColorsEnum color2){
        ColorsEnum smixColor;
        smixColor = ColorsEnum.RED;
        if (color1==ColorsEnum.RED){
            if(color2==ColorsEnum.YELLOW){
                smixColor = ColorsEnum.ORANGE;
            }
            else{
                smixColor = ColorsEnum.VIOLET;
            }
            if(color1==ColorsEnum.YELLOW){
                if(color2==ColorsEnum.RED){
                    smixColor = ColorsEnum.ORANGE;
                }
                else{
                    smixColor = ColorsEnum.VIOLET;
                }
            }
        }
        return smixColor;
    }
    @Override
    public boolean primary(ColorsEnum color1){
        boolean bprimary;
        if(color1==ColorsEnum.RED || color1==ColorsEnum.YELLOW|| color1==ColorsEnum.BLUE){
            bprimary = true;
        }
        else{
            bprimary = false;
        }
        return bprimary;
    }
    @Override
    public ColorsEnum[] form(ColorsEnum color1){
        ColorsEnum[] formColor;
        formColor = new ColorsEnum[2];
        if(color1==ColorsEnum.VIOLET){
            formColor[0] = ColorsEnum.RED;
            formColor[1] = ColorsEnum.BLUE;
        }
        else if(color1==ColorsEnum.ORANGE){
            formColor[0] = ColorsEnum.YELLOW;
            formColor[1] = ColorsEnum.RED;
        }
        else if(color1==ColorsEnum.GREEN){
            formColor[0] = ColorsEnum.BLUE;
            formColor[1] = ColorsEnum.YELLOW;
        }
        return formColor;
    }
    @Override
    public ColorsEnum assign(ColorsEnum color2){
        color = color2;
        return color;
    }
}
