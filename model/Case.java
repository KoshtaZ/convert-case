package model;

public class Case {
    private String text;

    public Case(){

    }
    public Case(String text){
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

    public String CamelCase(String text) {
        String[] texts = text.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            stringBuilder.append(texts[i].substring(0, 1).toUpperCase() + texts[i].substring(1).toLowerCase());
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }


    @Override
    public String toString() {
        return  text;
    }
}
