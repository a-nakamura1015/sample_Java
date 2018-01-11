package member;

public class VipMember extends Member{

    VipMember(int id, String name, double point) {
        super(id, name, point);
    }

    @Override
    public String getName() {
        return super.getName() + " (VIP)";
    }

    @Override
    public double getPoint() {
        return super.getPoint() * 1.5;
    }

}
