public class Sign {
    private String message;
    private int width;
    public Sign(String m, int w) {
        message = m;
        width = w;
    }

    public int numberOfLines() {
        int lines = message.length() / width;
        if(message.length() % width == 0) return lines;
        return lines + 1;
        //return message.length() / width + 1;
    }

    public String getLines() {
        String s = "";
        int i = 0;
        if(message.length() == 0) return null;
        while(i < message.length()){
            s += message.substring(i, i +1); 
            i++;
            if(i % width == 0 && i != message.length()) s += ";";
        }
        return s;
    }
}
