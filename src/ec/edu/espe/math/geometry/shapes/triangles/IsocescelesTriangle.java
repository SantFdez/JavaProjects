/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shapes.triangles;

/**
 *
 * @author SONY
 */
public class IsocescelesTriangle extends RightAngleTriangle{

    public IsocescelesTriangle(Float base, Float heigth) {
        super(base, heigth);
    }

    @Override
    public Float perimeter() {
        return (float)(Math.sqrt(Math.pow(this.base/2, 2)+Math.pow(this.height, 2)*2+this.height));
    }
}
