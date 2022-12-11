package model;

public class Text {
    private String text;

    public Text(){

    }
    public Text(String text){
        this. text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toLowerCase(String text){
        return text.toLowerCase();
    }

    public String toUpperCase(String text){
        return text.toUpperCase();
    }


    @Override
    public String toString() {
        return  text;
    }
}
