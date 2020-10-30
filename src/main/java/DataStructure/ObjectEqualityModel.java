package DataStructure;

public class ObjectEqualityModel {
    private String name;
    private int id;

    public ObjectEqualityModel(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj1)
    {
        return this.hashCode() == obj1.hashCode();
    }
}
