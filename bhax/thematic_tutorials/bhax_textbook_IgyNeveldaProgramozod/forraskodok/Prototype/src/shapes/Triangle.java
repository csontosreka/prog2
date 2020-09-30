package shapes;

import java.util.Objects;

public class Triangle extends Shape{
    public int r;

    public Triangle(){
    }

    public Triangle(Triangle target){
        super(target);
        if(target != null){
            this.r = target.r;
        }
    }

    @Override
    public Shape clone() {
        return new Triangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Triangle) || !super.equals(o)) return false;
        Triangle triangle2 = (Triangle) o;
        return triangle2.r == r;
    }
}
