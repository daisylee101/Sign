public class Sign {
    private String message;
    private int width;

    public Sign(String message, int width) {
        this.message = message;
        this.width = width;
    }
}
public int numberOfLines() {
    // return message.length() / width + 1;
}

public String getLines() {
    String s = "";
    int i = 0;
    while(i < message.length()){
        s += message.substring(i, i +1); 
        i++;
        if(i % width == 0 ) s += ";";
    }
    return s;
}
