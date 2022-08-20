package edu.eci.cvds.Patterns.shapes;

import edu.eci.cvds.Patterns.shapes.concrete.Hexagon;
import edu.eci.cvds.Patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.Patterns.shapes.concrete.Quidrilateral;
import edu.eci.cvds.Patterns.shapes.concrete.Triangle;

public class ShapeFactory {
    public static Shape create (RegularShapeType type){

        switch (type){
            case Triangle:
                return new Triangle();
            case Hexagon:
                return new Hexagon();
            case Pentagon:
                return new Pentagon();
            case Quadrilateral:
                return new Quidrilateral();
        }


        return null;
    }
}
