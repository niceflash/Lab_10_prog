package lab10.Task3;

import java.util.Objects;

public class Document {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Document(String name){
        this.name = name;
    }

    public String toString() {
        return "File name: " + "'" + name + "'";
    }

}
