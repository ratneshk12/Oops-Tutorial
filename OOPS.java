public class OOPS {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColor("Red");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("yellow");
        System.out.println(p1.color);
    }
}

class pen{
    String color;
    int tip;

    Void setColor(String newcolor){
        color = newcolor;
        return null;
    }

    void setTip(int newtip){
        tip = newtip;
    }
}
