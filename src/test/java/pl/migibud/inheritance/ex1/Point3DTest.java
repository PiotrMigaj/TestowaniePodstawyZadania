package pl.migibud.inheritance.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void isXandYvalues0AfterCreatingObj(){
        //given
        Point3D point3D = new Point3D(4f,3f,2f);

        //then
        assertEquals(4f,point3D.getX());
        assertEquals(3f,point3D.getY());


    }

    @Test
    void getXYZ() {
        //given
        Point3D point3D = new Point3D(2f,3f,4f);

        //then
        assertArrayEquals(new float[]{2f,3f,4f}, point3D.getXYZ());

    }
}