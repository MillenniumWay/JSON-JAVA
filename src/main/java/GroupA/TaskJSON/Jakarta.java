package GroupA.TaskJSON;

import java.util.List;

public class Jakarta {
    String name;
    String version;
    String technology;

    public List<Jakarta> getJakarta() {
        return jakarta;
    }

    public void setJakarta(List<Jakarta> jakarta) {
        this.jakarta = jakarta;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<Jakarta> jakarta;



    public Jakarta(String name, String version, String technology) {
        this.name = name;
        this.version = version;
        this.technology = technology;
    }
    public  Jakarta () {
        super();
    }


    public String toString() {
        return "\n" + "{" + "\n" +
                "\"name\": " + "\""+ name+  "\""+ "," + "\n" +
                "\"version\": " + "\""+ version+  "\""+  ","+ "\n"+
                "\"technology\": " + "\""+ technology+  "\""+  "\n"+
                 "}"   + "\n" ;

    }

    public String toStrinMY() {
        return "Jakarta{" +
                "name='" + name + '\'' +
                ", version=" + version +
                ", technology='" + technology + '\'' +
                '}';
    }



}
