package member;

public class Member {
    int id;
    String name;
    double point;

    Member(int id, String name, double point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPoint() {
        return this.point;
    }

    @Override
    public String toString() {
        return "ID:" + getId() + ", Name:" + getName() + ", Point:" + getPoint();
    }
}
