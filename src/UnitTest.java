import org.junit.jupiter.api.*;
import paint.*;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.*;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

    @BeforeEach
    void beforeTest() {
        GUI.colour = Color.BLACK;
    }

    @Test
    void testEllipseA1() {
        Ellipse obj = new Ellipse();

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseA2() {
        Ellipse obj = new Ellipse();

        assertNull(obj.getLineColor());
    }

    @Test
    void testEllipseA3() {
        Ellipse obj = new Ellipse();

        assertNull(obj.getElip2d());
    }


    @Test
    void testEllipseB01() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseB02() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseB03() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseB04() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseB05() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e);

        assertNull(obj.getLineColor());
    }

    @Test
    void testEllipseB06() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e);

        assertNull(obj.getLineColor());
    }

    @Test
    void testEllipseB07() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e);

        assertNull(obj.getLineColor());
    }

    @Test
    void testEllipseB08() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e);

        assertNull(obj.getLineColor());
    }

    @Test
    void testEllipseB09() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseB10() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseB11() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseB12() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e);

        assertEquals(e, obj.getElip2d());
    }


    @Test
    void testEllipseC01() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.PINK);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseC02() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.ORANGE);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseC03() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.PINK);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseC04() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.ORANGE);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseC05() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.PINK);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseC06() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.ORANGE);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseC07() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.PINK);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseC08() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.ORANGE);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseC09() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    void testEllipseC10() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.PINK);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    void testEllipseC11() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    void testEllipseC12() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.PINK);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    void testEllipseC13() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    void testEllipseC14() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.PINK);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    void testEllipseC15() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    void testEllipseC16() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.PINK);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    void testEllipseC17() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.GREEN);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseC18() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.RED);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseC19() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.GREEN);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseC20() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.RED);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseC21() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.GREEN);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseC22() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.RED);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseC23() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.GREEN);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseC24() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.RED);

        assertEquals(e, obj.getElip2d());
    }


    @Test
    void testEllipseD01() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.PINK, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    void testEllipseD02() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.ORANGE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    void testEllipseD03() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.PINK, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    void testEllipseD04() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.ORANGE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    void testEllipseD05() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.PINK, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    void testEllipseD06() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.ORANGE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    void testEllipseD07() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.PINK, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    void testEllipseD08() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.ORANGE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    void testEllipseD09() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.BLUE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    void testEllipseD10() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.PINK, Color.YELLOW);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    void testEllipseD11() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.BLUE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    void testEllipseD12() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.PINK, Color.YELLOW);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    void testEllipseD13() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.BLUE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    void testEllipseD14() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.PINK, Color.YELLOW);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    void testEllipseD15() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.BLUE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    void testEllipseD16() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.PINK, Color.YELLOW);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    void testEllipseD17() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.GREEN, Color.GREEN);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseD18() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.RED, Color.MAGENTA);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseD19() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.GREEN, Color.GREEN);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseD20() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.RED, Color.MAGENTA);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseD21() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.GREEN, Color.GREEN);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseD22() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.RED, Color.MAGENTA);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseD23() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.GREEN, Color.GREEN);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseD24() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.RED, Color.MAGENTA);

        assertEquals(e, obj.getElip2d());
    }


    @Test
    void testEllipseColor1() {
        Ellipse obj = new Ellipse();
        obj.setColor(Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    void testEllipseColor2() {
        Ellipse obj = new Ellipse();
        obj.setColor(Color.MAGENTA);

        assertEquals(Color.MAGENTA, obj.getColor());
    }

    @Test
    void testEllipseColor3() {
        Ellipse obj = new Ellipse();
        Color color = Color.decode("#a0a0a0");
        obj.setColor(color);

        assertEquals(color, obj.getColor());
    }

    @Test
    void testEllipseColor4() {
        Ellipse obj = new Ellipse();
        obj.setColor(Color.MAGENTA);

        assertNull(obj.getLineColor());
    }

    @Test
    void testEllipseColor5() {
        Ellipse obj = new Ellipse();
        Color color = Color.decode("#a0a0a0");
        obj.setColor(color);

        assertNull(obj.getLineColor());
    }

    @Test
    void testEllipseColor6() {
        Ellipse obj1 = new Ellipse();
        Ellipse obj2 = new Ellipse();
        obj1.setColor(Color.PINK);
        obj2.setColor(Color.BLUE);

        assertEquals(Color.PINK, obj1.getColor());
    }

    @Test
    void testEllipseColor7() {
        Ellipse obj1 = new Ellipse();
        Ellipse obj2 = new Ellipse();
        obj1.setColor(Color.MAGENTA);
        obj2.setColor(Color.GREEN);

        assertEquals(Color.MAGENTA, obj1.getColor());
    }


    @Test
    void testEllipseLineColor1() {
        Ellipse obj = new Ellipse();
        obj.setLineColor(Color.RED);

        assertEquals(Color.RED, obj.getLineColor());
    }

    @Test
    void testEllipseLineColor2() {
        Ellipse obj = new Ellipse();
        obj.setLineColor(Color.PINK);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    void testEllipseLineColor3() {
        Ellipse obj = new Ellipse();
        Color color = Color.decode("#B2FF66");
        obj.setLineColor(color);

        assertEquals(color, obj.getLineColor());
    }

    @Test
    void testEllipseLineColor4() {
        Ellipse obj = new Ellipse();
        obj.setLineColor(Color.PINK);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseLineColor5() {
        Ellipse obj = new Ellipse();
        Color color = Color.decode("#B2FF66");
        obj.setLineColor(color);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseLineColor6() {
        Ellipse obj1 = new Ellipse();
        Ellipse obj2 = new Ellipse();
        obj1.setLineColor(Color.ORANGE);
        obj2.setLineColor(Color.DARK_GRAY);

        assertEquals(Color.ORANGE, obj1.getLineColor());
    }

    @Test
    void testEllipseLineColor7() {
        Ellipse obj1 = new Ellipse();
        Ellipse obj2 = new Ellipse();
        obj1.setLineColor(Color.MAGENTA);
        obj2.setLineColor(Color.GREEN);

        assertEquals(Color.MAGENTA, obj1.getLineColor());
    }


    @Test
    void testEllipseElip2d1() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        obj.setElip2d(e);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseElip2d2() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        obj.setElip2d(e);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseElip2d3() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        obj.setElip2d(e);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseElip2d4() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        obj.setElip2d(e);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseElip2d5() {
        Ellipse obj1 = new Ellipse();
        Ellipse obj2 = new Ellipse();
        Random r = new Random();
        Ellipse2D e1 = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        obj1.setElip2d(e1);
        Ellipse2D e2 = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        obj2.setElip2d(e2);

        assertEquals(e1, obj1.getElip2d());
    }


    @Test
    void testEllipseMakeObject01() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        GUI.colour = Color.YELLOW;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getLineColor());
    }

    @Test
    void testEllipseMakeObject02() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        GUI.colour = Color.DARK_GRAY;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getLineColor());
    }

    @Test
    void testEllipseMakeObject03() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        GUI.colour = Color.decode("#12FF33");
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getLineColor());
    }

    @Test
    void testEllipseMakeObject04() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        GUI.colour = Color.YELLOW;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseMakeObject05() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        GUI.colour = Color.DARK_GRAY;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseMakeObject06() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        GUI.colour = Color.decode("#12FF33");
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseMakeObject07() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        Ellipse2D e = new Ellipse2D.Float(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseMakeObject08() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextDouble(), r.nextDouble());
        Ellipse2D e = new Ellipse2D.Float(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseMakeObject09() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextFloat(), r.nextFloat());
        Ellipse2D e = new Ellipse2D.Float(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseMakeObject10() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(), r.nextInt());
        fpoint.setLocation(r.nextInt(), r.nextInt());
        Ellipse2D e = new Ellipse2D.Float(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseMakeObject11() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        Ellipse2D e = new Ellipse2D.Float(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseMakeObject12() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        Ellipse2D e = new Ellipse2D.Float(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    void testEllipseMakeObject13() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        Ellipse2D e = new Ellipse2D.Float(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertEquals(Color.BLACK, obj.getLineColor());
    }

    @Test
    void testEllipseMakeObject14() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextDouble(), r.nextDouble());
        Ellipse2D e = new Ellipse2D.Float(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertEquals(Color.BLACK, obj.getLineColor());
    }

    @Test
    void testEllipseMakeObject15() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextFloat(), r.nextFloat());
        Ellipse2D e = new Ellipse2D.Float(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertEquals(Color.BLACK, obj.getLineColor());
    }

    @Test
    void testEllipseMakeObject16() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(), r.nextInt());
        fpoint.setLocation(r.nextInt(), r.nextInt());
        Ellipse2D e = new Ellipse2D.Float(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertEquals(Color.BLACK, obj.getLineColor());
    }

    @Test
    void testEllipseMakeObject17() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        Ellipse2D e = new Ellipse2D.Float(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertEquals(Color.BLACK, obj.getLineColor());
    }

    @Test
    void testEllipseMakeObject18() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        Ellipse2D e = new Ellipse2D.Float(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertEquals(Color.BLACK, obj.getLineColor());
    }

    @Test
    void testEllipseMakeObject19() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        Ellipse2D e = new Ellipse2D.Float(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseMakeObject20() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextDouble(), r.nextDouble());
        Ellipse2D e = new Ellipse2D.Float(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseMakeObject21() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextFloat(), r.nextFloat());
        Ellipse2D e = new Ellipse2D.Float(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseMakeObject22() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(), r.nextInt());
        fpoint.setLocation(r.nextInt(), r.nextInt());
        Ellipse2D e = new Ellipse2D.Float(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseMakeObject23() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        Ellipse2D e = new Ellipse2D.Float(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertNull(obj.getColor());
    }

    @Test
    void testEllipseMakeObject24() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        Ellipse2D e = new Ellipse2D.Float(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertNull(obj.getColor());
    }


    @Test
    void testEllipseFill1() {
        Ellipse obj = new Ellipse();
        obj.fill(Color.MAGENTA);

        assertEquals(Color.MAGENTA, obj.getColor());
    }

    @Test
    void testEllipseFill2() {
        Ellipse obj = new Ellipse();
        obj.fill(Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    void testEllipseFill3() {
        Ellipse obj = new Ellipse();
        obj.fill(Color.decode("#123456"));

        assertEquals(Color.decode("#123456"), obj.getColor());
    }


    @Test
    void testEllipseContains1() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        obj.makeObject(spoint, fpoint);
        Point npoint = new Point();
        npoint.setLocation((spoint.x+fpoint.x)/2, (spoint.y+fpoint.y)/2);

        assertTrue(obj.contains(npoint));
    }

    @Test
    void testEllipseContains2() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        obj.makeObject(spoint, fpoint);

        assertFalse(obj.contains(spoint));
    }

    @Test
    void testEllipseContains3() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        obj.makeObject(spoint, fpoint);

        assertFalse(obj.contains(fpoint));
    }

    @Test
    void testEllipseMove1() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        obj.makeObject(spoint, fpoint);

        Point startDrag = new Point();
        Point endDrag = new Point();
        startDrag.setLocation(spoint.x + r.nextInt(200), spoint.y + r.nextInt(200));
        endDrag.setLocation(fpoint.x + r.nextInt(200), fpoint.y + r.nextInt(200));

        obj.move(startDrag, endDrag);

        Ellipse2D e = new Ellipse2D.Float(Math.min(spoint.x, fpoint.x), Math.min(spoint.y, fpoint.y),
                Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));
        e.setFrame(e.getX() + endDrag.x - startDrag.x,e.getY() + endDrag.y - startDrag.y,
                e.getWidth(), e.getHeight());

        assertEquals(e.getFrame(), obj.getElip2d().getFrame());
    }

    @Test
    void testEllipseMove2() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        fpoint.setLocation(r.nextFloat(), r.nextFloat());

        obj.makeObject(spoint, fpoint);

        Point startDrag = new Point();
        Point endDrag = new Point();
        startDrag.setLocation(spoint.x + r.nextFloat(), spoint.y + r.nextFloat());
        endDrag.setLocation(fpoint.x + r.nextFloat(), fpoint.y + r.nextFloat());

        obj.move(startDrag, endDrag);

        Ellipse2D e = new Ellipse2D.Float(Math.min(spoint.x, fpoint.x), Math.min(spoint.y, fpoint.y),
                Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));
        e.setFrame(e.getX() + endDrag.x - startDrag.x,e.getY() + endDrag.y - startDrag.y,
                e.getWidth(), e.getHeight());

        assertEquals(e.getFrame(), obj.getElip2d().getFrame());
    }

    @Test
    void testEllipseWritetoFile1() {
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        GUI.canvas = new JPanel();
        GUI.canvas.setSize(500, 500);

        double x1 = spoint.x;
        double y1 = spoint.y;
        double x2 = fpoint.x;
        double y2 = fpoint.y;

        Ellipse obj = new Ellipse();
        obj.makeObject(spoint, fpoint);

        String sExpect = "";
        String sActual = "";

        try {
            File fileActual = new File("file1.txt");
            FileWriter fwActual = new FileWriter(fileActual);

            BufferedWriter actual = new BufferedWriter(fwActual);
            obj.writetoFile(actual);
            actual.close();

            File fileExpect = new File("file2.txt");
            FileWriter fwExpect = new FileWriter(fileExpect);

            BufferedWriter expect = new BufferedWriter(fwExpect);
            expect.write("PEN #000000\nFILL OFF\nEllipse " + (double)(x1/GUI.canvas.getWidth())
                    + " " + (double)(y1/GUI.canvas.getHeight()) + " " + (double)(x2/GUI.canvas.getWidth())
                    + " " + (double)(y2/GUI.canvas.getHeight()));
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while(tActual != null) {
                sActual += tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect += tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testEllipseWritetoFile2() {
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        GUI.canvas = new JPanel();
        GUI.canvas.setSize(500, 500);

        double x1 = spoint.x;
        double y1 = spoint.y;
        double x2 = fpoint.x;
        double y2 = fpoint.y;

        Ellipse obj = new Ellipse();
        obj.makeObject(spoint, fpoint);
        obj.setColor(Color.decode("#1258a4"));

        String sExpect = "";
        String sActual = "";

        try {
            File fileActual = new File("file1.txt");
            FileWriter fwActual = new FileWriter(fileActual);

            BufferedWriter actual = new BufferedWriter(fwActual);
            obj.writetoFile(actual);
            actual.close();

            File fileExpect = new File("file2.txt");
            FileWriter fwExpect = new FileWriter(fileExpect);

            BufferedWriter expect = new BufferedWriter(fwExpect);
            expect.write("PEN #000000\nFILL #1258a4\nEllipse " + (double) (x1 / GUI.canvas.getWidth())
                    + " " + (double) (y1 / GUI.canvas.getHeight()) + " " + (double) (x2 / GUI.canvas.getWidth())
                    + " " + (double) (y2 / GUI.canvas.getHeight()));
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while (tActual != null) {
                sActual += tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect += tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testEllipseWritetoFile3() {
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        GUI.canvas = new JPanel();
        GUI.canvas.setSize(500, 500);

        double x1 = spoint.x;
        double y1 = spoint.y;
        double x2 = fpoint.x;
        double y2 = fpoint.y;

        Ellipse obj = new Ellipse();
        obj.makeObject(spoint, fpoint);
        obj.setLineColor(Color.decode("#56df75"));

        String sExpect = "";
        String sActual = "";

        try {
            File fileActual = new File("file1.txt");
            FileWriter fwActual = new FileWriter(fileActual);

            BufferedWriter actual = new BufferedWriter(fwActual);
            obj.writetoFile(actual);
            actual.close();

            File fileExpect = new File("file2.txt");
            FileWriter fwExpect = new FileWriter(fileExpect);

            BufferedWriter expect = new BufferedWriter(fwExpect);
            expect.write("PEN #56df75\nFILL OFF\nEllipse " + (double) (x1 / GUI.canvas.getWidth())
                    + " " + (double) (y1 / GUI.canvas.getHeight()) + " " + (double) (x2 / GUI.canvas.getWidth())
                    + " " + (double) (y2 / GUI.canvas.getHeight()));
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while (tActual != null) {
                sActual += tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect += tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testEllipseWritetoFile4() {
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        GUI.canvas = new JPanel();
        GUI.canvas.setSize(500, 500);

        double x1 = spoint.x;
        double y1 = spoint.y;
        double x2 = fpoint.x;
        double y2 = fpoint.y;

        Ellipse obj = new Ellipse();
        obj.makeObject(spoint, fpoint);
        obj.setLineColor(Color.decode("#aedd88"));
        obj.setColor(Color.PINK);

        String sExpect = "";
        String sActual = "";

        try {
            File fileActual = new File("file1.txt");
            FileWriter fwActual = new FileWriter(fileActual);

            BufferedWriter actual = new BufferedWriter(fwActual);
            obj.writetoFile(actual);
            actual.close();

            File fileExpect = new File("file2.txt");
            FileWriter fwExpect = new FileWriter(fileExpect);

            BufferedWriter expect = new BufferedWriter(fwExpect);
            expect.write("PEN #aedd88\nFILL #ffafaf\nEllipse " + (double) (x1 / GUI.canvas.getWidth())
                    + " " + (double) (y1 / GUI.canvas.getHeight()) + " " + (double) (x2 / GUI.canvas.getWidth())
                    + " " + (double) (y2 / GUI.canvas.getHeight()));
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while (tActual != null) {
                sActual += tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect += tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }








    @Test
    void testRectangleA1() {
        paint.Rectangle obj = new paint.Rectangle();

        assertNull(obj.getColor());
    }

    @Test
    void testRectangleA2() {
        paint.Rectangle obj = new paint.Rectangle();

        assertNull(obj.getLineColor());
    }

    @Test
    void testRectangleA3() {
        paint.Rectangle obj = new paint.Rectangle();

        assertNull(obj.getRect());
    }


    @Test
    void testRectangleB1() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e);

        assertNull(obj.getColor());
    }

    @Test
    void testRectangleB2() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e);

        assertNull(obj.getLineColor());
    }

    @Test
    void testRectangleB3() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e);

        assertEquals(e, obj.getRect());
    }


    @Test
    void testRectangleC1() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.PINK);

        assertNull(obj.getColor());
    }

    @Test
    void testRectangleC2() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.ORANGE);

        assertNull(obj.getColor());
    }

    @Test
    void testRectangleC3() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    void testRectangleC4() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.PINK);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    void testRectangleC5() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.GREEN);

        assertEquals(e, obj.getRect());
    }

    @Test
    void testRectangleC6() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.RED);

        assertEquals(e, obj.getRect());
    }


    @Test
    void testRectangleD1() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.PINK, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    void testRectangleD2() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.ORANGE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    void testRectangleD3() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.BLUE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    void testRectangleD4() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.PINK, Color.YELLOW);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    void testRectangleD5() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.GREEN, Color.GREEN);

        assertEquals(e, obj.getRect());
    }

    @Test
    void testRectangleD6() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.RED, Color.MAGENTA);

        assertEquals(e, obj.getRect());
    }


    @Test
    void testRectangleColor1() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.setColor(Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    void testRectangleColor2() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.setColor(Color.MAGENTA);

        assertEquals(Color.MAGENTA, obj.getColor());
    }

    @Test
    void testRectangleColor3() {
        paint.Rectangle obj = new paint.Rectangle();
        Color color = Color.decode("#a0a0a0");
        obj.setColor(color);

        assertEquals(color, obj.getColor());
    }

    @Test
    void testRectangleColor4() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.setColor(Color.MAGENTA);

        assertNull(obj.getLineColor());
    }

    @Test
    void testRectangleColor5() {
        paint.Rectangle obj = new paint.Rectangle();
        Color color = Color.decode("#a0a0a0");
        obj.setColor(color);

        assertNull(obj.getLineColor());
    }

    @Test
    void testRectangleColor6() {
        paint.Rectangle obj1 = new paint.Rectangle();
        paint.Rectangle obj2 = new paint.Rectangle();
        obj1.setColor(Color.PINK);
        obj2.setColor(Color.BLUE);

        assertEquals(Color.PINK, obj1.getColor());
    }

    @Test
    void testRectangleColor7() {
        paint.Rectangle obj1 = new paint.Rectangle();
        paint.Rectangle obj2 = new paint.Rectangle();
        obj1.setColor(Color.MAGENTA);
        obj2.setColor(Color.GREEN);

        assertEquals(Color.MAGENTA, obj1.getColor());
    }


    @Test
    void testRectangleLineColor1() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.setLineColor(Color.RED);

        assertEquals(Color.RED, obj.getLineColor());
    }

    @Test
    void testRectangleLineColor2() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.setLineColor(Color.PINK);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    void testRectangleLineColor3() {
        paint.Rectangle obj = new paint.Rectangle();
        Color color = Color.decode("#B2FF66");
        obj.setLineColor(color);

        assertEquals(color, obj.getLineColor());
    }

    @Test
    void testRectangleLineColor4() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.setLineColor(Color.PINK);

        assertNull(obj.getColor());
    }

    @Test
    void testRectangleLineColor5() {
        paint.Rectangle obj = new paint.Rectangle();
        Color color = Color.decode("#B2FF66");
        obj.setLineColor(color);

        assertNull(obj.getColor());
    }

    @Test
    void testRectangleLineColor6() {
        paint.Rectangle obj1 = new paint.Rectangle();
        paint.Rectangle obj2 = new paint.Rectangle();
        obj1.setLineColor(Color.PINK);
        obj2.setLineColor(Color.BLUE);

        assertEquals(Color.PINK, obj1.getLineColor());
    }

    @Test
    void testRectangleLineColor7() {
        paint.Rectangle obj1 = new paint.Rectangle();
        paint.Rectangle obj2 = new paint.Rectangle();
        obj1.setLineColor(Color.ORANGE);
        obj2.setLineColor(Color.DARK_GRAY);

        assertEquals(Color.ORANGE, obj1.getLineColor());
    }


    @Test
    void testRectangleRect1() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        obj.setRect(e);

        assertEquals(e, obj.getRect());
    }

    @Test
    void testRectangleRect2() {
        paint.Rectangle obj1 = new paint.Rectangle();
        paint.Rectangle obj2 = new paint.Rectangle();
        Random r = new Random();
        java.awt.Rectangle e1 = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        obj1.setRect(e1);
        java.awt.Rectangle e2 = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        obj2.setRect(e2);

        assertEquals(e1, obj1.getRect());
    }


    @Test
    void testRectangleMakeObject01() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        GUI.colour = Color.YELLOW;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getLineColor());
    }

    @Test
    void testRectangleMakeObject02() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        GUI.colour = Color.DARK_GRAY;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getLineColor());
    }

    @Test
    void testRectangleMakeObject03() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        GUI.colour = Color.decode("#12FF33");
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getLineColor());
    }

    @Test
    void testRectangleMakeObject04() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        GUI.colour = Color.YELLOW;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertNull(obj.getColor());
    }

    @Test
    void testRectangleMakeObject05() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        GUI.colour = Color.DARK_GRAY;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertNull(obj.getColor());
    }

    @Test
    void testRectangleMakeObject06() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        GUI.colour = Color.decode("#12FF33");
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertNull(obj.getColor());
    }

    @Test
    void testRectangleMakeObject07() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertEquals(e, obj.getRect());
    }

    @Test
    void testRectangleMakeObject08() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextDouble(), r.nextDouble());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertEquals(e, obj.getRect());
    }

    @Test
    void testRectangleMakeObject09() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextFloat(), r.nextFloat());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertEquals(e, obj.getRect());
    }

    @Test
    void testRectangleMakeObject10() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(), r.nextInt());
        fpoint.setLocation(r.nextInt(), r.nextInt());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertEquals(e, obj.getRect());
    }

    @Test
    void testRectangleMakeObject11() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertEquals(e, obj.getRect());
    }

    @Test
    void testRectangleMakeObject12() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertEquals(e, obj.getRect());
    }

    @Test
    void testRectangleMakeObject13() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertEquals(Color.BLACK, obj.getLineColor());
    }

    @Test
    void testRectangleMakeObject14() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextDouble(), r.nextDouble());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertEquals(Color.BLACK, obj.getLineColor());
    }

    @Test
    void testRectangleMakeObject15() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextFloat(), r.nextFloat());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertEquals(Color.BLACK, obj.getLineColor());
    }

    @Test
    void testRectangleMakeObject16() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(), r.nextInt());
        fpoint.setLocation(r.nextInt(), r.nextInt());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertEquals(Color.BLACK, obj.getLineColor());
    }

    @Test
    void testRectangleMakeObject17() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertEquals(Color.BLACK, obj.getLineColor());
    }

    @Test
    void testRectangleMakeObject18() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertEquals(Color.BLACK, obj.getLineColor());
    }

    @Test
    void testRectangleMakeObject19() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertNull(obj.getColor());
    }

    @Test
    void testRectangleMakeObject20() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextDouble(), r.nextDouble());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertNull(obj.getColor());
    }

    @Test
    void testRectangleMakeObject21() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextFloat(), r.nextFloat());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        obj.makeObject(point, point);

        assertNull(obj.getColor());
    }

    @Test
    void testRectangleMakeObject22() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(), r.nextInt());
        fpoint.setLocation(r.nextInt(), r.nextInt());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertNull(obj.getColor());
    }

    @Test
    void testRectangleMakeObject23() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertNull(obj.getColor());
    }

    @Test
    void testRectangleMakeObject24() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        obj.makeObject(spoint, fpoint);

        assertNull(obj.getColor());
    }


    @Test
    void testRectangleFill1() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.fill(Color.MAGENTA);

        assertEquals(Color.MAGENTA, obj.getColor());
    }

    @Test
    void testRectangleFill2() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.fill(Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    void testRectangleFill3() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.fill(Color.decode("#123456"));

        assertEquals(Color.decode("#123456"), obj.getColor());
    }


    @Test
    void testRectangleContains1() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        obj.makeObject(spoint, fpoint);
        Point npoint = new Point();
        npoint.setLocation((spoint.x+fpoint.x)/2, (spoint.y+fpoint.y)/2);

        assertTrue(obj.contains(npoint));
    }

    @Test
    void testRectangleContains2() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        obj.makeObject(spoint, fpoint);
        Point npoint = new Point();
        npoint.setLocation(spoint.x + fpoint.x, spoint.y + fpoint.y);

        assertFalse(obj.contains(npoint));
    }

    @Test
    void testRectangleMove1() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        obj.makeObject(spoint, fpoint);

        Point startDrag = new Point();
        Point endDrag = new Point();
        startDrag.setLocation(spoint.x + r.nextInt(200), spoint.y + r.nextInt(200));
        endDrag.setLocation(fpoint.x + r.nextInt(200), fpoint.y + r.nextInt(200));

        obj.move(startDrag, endDrag);

        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(spoint.x, fpoint.x), Math.min(spoint.y, fpoint.y),
                Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));
        e.setFrame(e.getX() + endDrag.x - startDrag.x,e.getY() + endDrag.y - startDrag.y,
                e.getWidth(), e.getHeight());

        assertEquals(e.getFrame(), obj.getRect().getFrame());
    }

    @Test
    void testRectangleMove2() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        fpoint.setLocation(r.nextFloat(), r.nextFloat());

        obj.makeObject(spoint, fpoint);

        Point startDrag = new Point();
        Point endDrag = new Point();
        startDrag.setLocation(spoint.x + r.nextFloat(), spoint.y + r.nextFloat());
        endDrag.setLocation(fpoint.x + r.nextFloat(), fpoint.y + r.nextFloat());

        obj.move(startDrag, endDrag);

        java.awt.Rectangle e = new java.awt.Rectangle(Math.min(spoint.x, fpoint.x), Math.min(spoint.y, fpoint.y),
                Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));
        e.setFrame(e.getX() + endDrag.x - startDrag.x,e.getY() + endDrag.y - startDrag.y,
                e.getWidth(), e.getHeight());

        assertEquals(e.getFrame(), obj.getRect().getFrame());
    }

    @Test
    void testRectangleWritetoFile1() {
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        GUI.canvas = new JPanel();
        GUI.canvas.setSize(500, 500);

        double x1 = spoint.x;
        double y1 = spoint.y;
        double x2 = fpoint.x;
        double y2 = fpoint.y;

        paint.Rectangle obj = new paint.Rectangle();
        obj.makeObject(spoint, fpoint);

        String sExpect = "";
        String sActual = "";

        try {
            File fileActual = new File("file1.txt");
            FileWriter fwActual = new FileWriter(fileActual);

            BufferedWriter actual = new BufferedWriter(fwActual);
            obj.writetoFile(actual);
            actual.close();

            File fileExpect = new File("file2.txt");
            FileWriter fwExpect = new FileWriter(fileExpect);

            BufferedWriter expect = new BufferedWriter(fwExpect);
            expect.write("PEN #000000\nFILL OFF\nRectangle " + (double)(x1/GUI.canvas.getWidth())
                    + " " + (double)(y1/GUI.canvas.getHeight()) + " " + (double)(x2/GUI.canvas.getWidth())
                    + " " + (double)(y2/GUI.canvas.getHeight()));
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while(tActual != null) {
                sActual += tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect += tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testRectangleWritetoFile2() {
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        GUI.canvas = new JPanel();
        GUI.canvas.setSize(500, 500);

        double x1 = spoint.x;
        double y1 = spoint.y;
        double x2 = fpoint.x;
        double y2 = fpoint.y;

        paint.Rectangle obj = new paint.Rectangle();
        obj.makeObject(spoint, fpoint);
        obj.setColor(Color.decode("#1258a4"));

        String sExpect = "";
        String sActual = "";

        try {
            File fileActual = new File("file1.txt");
            FileWriter fwActual = new FileWriter(fileActual);

            BufferedWriter actual = new BufferedWriter(fwActual);
            obj.writetoFile(actual);
            actual.close();

            File fileExpect = new File("file2.txt");
            FileWriter fwExpect = new FileWriter(fileExpect);

            BufferedWriter expect = new BufferedWriter(fwExpect);
            expect.write("PEN #000000\nFILL #1258a4\nRectangle " + (double) (x1 / GUI.canvas.getWidth())
                    + " " + (double) (y1 / GUI.canvas.getHeight()) + " " + (double) (x2 / GUI.canvas.getWidth())
                    + " " + (double) (y2 / GUI.canvas.getHeight()));
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while (tActual != null) {
                sActual += tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect += tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testRectangleWritetoFile3() {
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        GUI.canvas = new JPanel();
        GUI.canvas.setSize(500, 500);

        double x1 = spoint.x;
        double y1 = spoint.y;
        double x2 = fpoint.x;
        double y2 = fpoint.y;

        paint.Rectangle obj = new paint.Rectangle();
        obj.makeObject(spoint, fpoint);
        obj.setLineColor(Color.decode("#56df75"));

        String sExpect = "";
        String sActual = "";

        try {
            File fileActual = new File("file1.txt");
            FileWriter fwActual = new FileWriter(fileActual);

            BufferedWriter actual = new BufferedWriter(fwActual);
            obj.writetoFile(actual);
            actual.close();

            File fileExpect = new File("file2.txt");
            FileWriter fwExpect = new FileWriter(fileExpect);

            BufferedWriter expect = new BufferedWriter(fwExpect);
            expect.write("PEN #56df75\nFILL OFF\nRectangle " + (double) (x1 / GUI.canvas.getWidth())
                    + " " + (double) (y1 / GUI.canvas.getHeight()) + " " + (double) (x2 / GUI.canvas.getWidth())
                    + " " + (double) (y2 / GUI.canvas.getHeight()));
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while (tActual != null) {
                sActual += tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect += tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testRectangleWriteToFile4() {
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        GUI.canvas = new JPanel();
        GUI.canvas.setSize(500, 500);

        double x1 = spoint.x;
        double y1 = spoint.y;
        double x2 = fpoint.x;
        double y2 = fpoint.y;

        paint.Rectangle obj = new paint.Rectangle();
        obj.makeObject(spoint, fpoint);
        obj.setLineColor(Color.decode("#aedd88"));
        obj.setColor(Color.PINK);

        String sExpect = "";
        String sActual = "";

        try {
            File fileActual = new File("file1.txt");
            FileWriter fwActual = new FileWriter(fileActual);

            BufferedWriter actual = new BufferedWriter(fwActual);
            obj.writetoFile(actual);
            actual.close();

            File fileExpect = new File("file2.txt");
            FileWriter fwExpect = new FileWriter(fileExpect);

            BufferedWriter expect = new BufferedWriter(fwExpect);
            expect.write("PEN #aedd88\nFILL #ffafaf\nRectangle " + (double) (x1 / GUI.canvas.getWidth())
                    + " " + (double) (y1 / GUI.canvas.getHeight()) + " " + (double) (x2 / GUI.canvas.getWidth())
                    + " " + (double) (y2 / GUI.canvas.getHeight()));
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while (tActual != null) {
                sActual += tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect += tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }








    @Test
    void testPlotA1() {
        Plot obj = new Plot();

        assertEquals(Color.BLACK, obj.getColor());
    }

    @Test
    void testPlotA3() {
        Plot obj = new Plot();

        assertNull(obj.getPoint());
    }


    @Test
    void testPlotB1() {
        Random r = new Random();
        Point e = new Point(r.nextInt(), r.nextInt());
        Plot obj = new Plot(e);

        assertEquals(Color.BLACK, obj.getColor());
    }

    @Test
    void testPlotB2() {
        Random r = new Random();
        Point e = new Point(r.nextInt(), r.nextInt());
        Plot obj = new Plot(e);

        assertEquals(e, obj.getPoint());
    }

    @Test
    void testPlotC1() {
        Random r = new Random();
        Point e = new Point(r.nextInt(), r.nextInt());
        Plot obj = new Plot(e, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    void testPlotC2() {
        Random r = new Random();
        Point e = new Point(r.nextInt(), r.nextInt());
        Plot obj = new Plot(e, Color.ORANGE);

        assertEquals(Color.ORANGE, obj.getColor());
    }

    @Test
    void testPlotC3() {
        Random r = new Random();
        Point e = new Point(r.nextInt(), r.nextInt());
        Plot obj = new Plot(e, Color.GREEN);

        assertEquals(e, obj.getPoint());
    }

    @Test
    void testPlotC4() {
        Random r = new Random();
        Point e = new Point(r.nextInt(), r.nextInt());
        Plot obj = new Plot(e, Color.RED);

        assertEquals(e, obj.getPoint());
    }


    @Test
    void testPlotColor1() {
        Plot obj = new Plot();
        obj.setColor(Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    void testPlotColor2() {
        Plot obj = new Plot();
        obj.setColor(Color.MAGENTA);

        assertEquals(Color.MAGENTA, obj.getColor());
    }

    @Test
    void testPlotColor3() {
        Plot obj = new Plot();
        Color color = Color.decode("#a0a0a0");
        obj.setColor(color);

        assertEquals(color, obj.getColor());
    }

    @Test
    void testPlotColor4() {
        Plot obj1 = new Plot();
        Plot obj2 = new Plot();
        obj1.setColor(Color.PINK);
        obj2.setColor(Color.BLUE);

        assertEquals(Color.PINK, obj1.getColor());
    }

    @Test
    void testPlotColor5() {
        Plot obj1 = new Plot();
        Plot obj2 = new Plot();
        obj1.setColor(Color.MAGENTA);
        obj2.setColor(Color.GREEN);

        assertEquals(Color.MAGENTA, obj1.getColor());
    }


    @Test
    void testPlotPoint1() {
        Plot obj = new Plot();
        Random r = new Random();
        Point e = new Point(r.nextInt(), r.nextInt());
        obj.setPoint(e);

        assertEquals(e, obj.getPoint());
    }

    @Test
    void testPlotPoint2() {
        Plot obj1 = new Plot();
        Plot obj2 = new Plot();
        Random r = new Random();
        Point e1 = new Point(r.nextInt(), r.nextInt());
        obj1.setPoint(e1);
        Point e2 = new Point(r.nextInt(), r.nextInt());
        obj2.setPoint(e2);

        assertEquals(e1, obj1.getPoint());
    }


    @Test
    void testPlotMakeObject01() {
        Plot obj = new Plot();
        Random r = new Random();
        GUI.colour = Color.YELLOW;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getColor());
    }

    @Test
    void testPlotMakeObject02() {
        Plot obj = new Plot();
        Random r = new Random();
        GUI.colour = Color.DARK_GRAY;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getColor());
    }

    @Test
    void testPlotMakeObject03() {
        Plot obj = new Plot();
        Random r = new Random();
        GUI.colour = Color.decode("#12FF33");
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getColor());
    }

    @Test
    void testPlotMakeObject04() {
        Plot obj = new Plot();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        Point e = new Point(point.x, point.y);

        obj.makeObject(point, point);

        assertEquals(e, obj.getPoint());
    }

    @Test
    void testPlotMakeObject05() {
        Plot obj = new Plot();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextDouble(), r.nextDouble());
        Point e = new Point(point.x, point.y);

        obj.makeObject(point, point);

        assertEquals(e, obj.getPoint());
    }

    @Test
    void testPlotMakeObject06() {
        Plot obj = new Plot();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextFloat(), r.nextFloat());
        Point e = new Point(point.x, point.y);

        obj.makeObject(point, point);

        assertEquals(e, obj.getPoint());
    }

    @Test
    void testPlotMakeObject07() {
        Plot obj = new Plot();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(), r.nextInt());
        fpoint.setLocation(r.nextInt(), r.nextInt());
        Point e = new Point(spoint.x, spoint.y);

        obj.makeObject(spoint, fpoint);

        assertEquals(e, obj.getPoint());
    }

    @Test
    void testPlotMakeObject08() {
        Plot obj = new Plot();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        Point e = new Point(spoint.x, spoint.y);

        obj.makeObject(spoint, fpoint);

        assertEquals(e, obj.getPoint());
    }

    @Test
    void testPlotMakeObject09() {
        Plot obj = new Plot();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        Point e = new Point(spoint.x, spoint.y);

        obj.makeObject(spoint, fpoint);

        assertEquals(e, obj.getPoint());
    }

    @Test
    void testPlotMakeObject10() {
        Plot obj = new Plot();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        Point e = new Point(point.x, point.y);

        obj.makeObject(point, point);

        assertEquals(Color.BLACK, obj.getColor());
    }

    @Test
    void testPlotMakeObject11() {
        Plot obj = new Plot();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextDouble(), r.nextDouble());
        Point e = new Point(point.x, point.y);

        obj.makeObject(point, point);

        assertEquals(Color.BLACK, obj.getColor());
    }

    @Test
    void testPlotMakeObject12() {
        Plot obj = new Plot();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextFloat(), r.nextFloat());
        Point e = new Point(point.x, point.y);

        obj.makeObject(point, point);

        assertEquals(Color.BLACK, obj.getColor());
    }

    @Test
    void testPlotMakeObject13() {
        Plot obj = new Plot();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(), r.nextInt());
        fpoint.setLocation(r.nextInt(), r.nextInt());
        Point e = new Point(spoint.x, spoint.y);

        obj.makeObject(spoint, fpoint);

        assertEquals(Color.BLACK, obj.getColor());
    }

    @Test
    void testPlotMakeObject14() {
        Plot obj = new Plot();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        Point e = new Point(spoint.x, spoint.y);

        obj.makeObject(spoint, fpoint);

        assertEquals(Color.BLACK, obj.getColor());
    }

    @Test
    void testPlotMakeObject15() {
        Plot obj = new Plot();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        Point e = new Point(spoint.x, spoint.y);

        obj.makeObject(spoint, fpoint);

        assertEquals(Color.BLACK, obj.getColor());
    }


    @Test
    void testPlotContains1() {
        Plot obj = new Plot();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        obj.makeObject(spoint, fpoint);

        assertTrue(obj.contains(spoint));
    }

    @Test
    void testPlotContains2() {
        Plot obj = new Plot();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        obj.makeObject(spoint, fpoint);

        assertFalse(obj.contains(fpoint));
    }

    @Test
    void testPlotMove1() {
        Plot obj = new Plot();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        obj.makeObject(spoint, fpoint);

        Point startDrag = new Point();
        Point endDrag = new Point();
        startDrag.setLocation(spoint.x + r.nextInt(200), spoint.y + r.nextInt(200));
        endDrag.setLocation(fpoint.x + r.nextInt(200), fpoint.y + r.nextInt(200));

        obj.move(startDrag, endDrag);

        assertEquals(endDrag, obj.getPoint());
    }

    @Test
    void testPlotMove2() {
        Plot obj = new Plot();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        fpoint.setLocation(r.nextFloat(), r.nextFloat());

        obj.makeObject(spoint, fpoint);

        Point startDrag = new Point();
        Point endDrag = new Point();
        startDrag.setLocation(spoint.x + r.nextFloat(), spoint.y + r.nextFloat());
        endDrag.setLocation(fpoint.x + r.nextFloat(), fpoint.y + r.nextFloat());

        obj.move(startDrag, endDrag);

        assertEquals(endDrag, obj.getPoint());
    }

    @Test
    void testPlotWritetoFile1() {
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        GUI.canvas = new JPanel();
        GUI.canvas.setSize(500, 500);

        Plot obj = new Plot();
        obj.makeObject(spoint, fpoint);

        String sExpect = "";
        String sActual = "";

        try {
            File fileActual = new File("file1.txt");
            FileWriter fwActual = new FileWriter(fileActual);

            BufferedWriter actual = new BufferedWriter(fwActual);
            obj.writetoFile(actual);
            actual.close();

            File fileExpect = new File("file2.txt");
            FileWriter fwExpect = new FileWriter(fileExpect);

            BufferedWriter expect = new BufferedWriter(fwExpect);
            expect.write("PEN #000000\nPlot " + (double)(obj.getPoint().x)/GUI.canvas.getWidth() + " " +
                    (double)(obj.getPoint().y)/GUI.canvas.getHeight());
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while(tActual != null) {
                sActual += tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect += tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testPlotWritetoFile2() {
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        GUI.canvas = new JPanel();
        GUI.canvas.setSize(500, 500);

        Plot obj = new Plot();
        obj.makeObject(spoint, fpoint);
        obj.setColor(Color.decode("#1258a4"));

        String sExpect = "";
        String sActual = "";

        try {
            File fileActual = new File("file1.txt");
            FileWriter fwActual = new FileWriter(fileActual);

            BufferedWriter actual = new BufferedWriter(fwActual);
            obj.writetoFile(actual);
            actual.close();

            File fileExpect = new File("file2.txt");
            FileWriter fwExpect = new FileWriter(fileExpect);

            BufferedWriter expect = new BufferedWriter(fwExpect);
            expect.write("PEN #1258a4\nPlot " + (double)(obj.getPoint().x)/GUI.canvas.getWidth() + " " +
                    (double)(obj.getPoint().y)/GUI.canvas.getHeight());
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while (tActual != null) {
                sActual += tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect += tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }







    @Test
    void testLineA1() {
        Line obj = new Line();

        assertNull(obj.getColor());
    }

    @Test
    void testLineA2() {
        Line obj = new Line();

        assertNull(obj.getLine());
    }


    @Test
    void testLineB01() {
        Random r = new Random();
        Line2D e = new Line2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Line obj = new Line(e);

        assertNull(obj.getColor());
    }

    @Test
    void testLineB02() {
        Random r = new Random();
        Line2D e = new Line2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Line obj = new Line(e);

        assertNull(obj.getColor());
    }

    @Test
    void testLineB03() {
        Random r = new Random();
        Line2D e = new Line2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Line obj = new Line(e);

        assertNull(obj.getColor());
    }

    @Test
    void testLineB04() {
        Random r = new Random();
        Line2D e = new Line2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Line obj = new Line(e);

        assertNull(obj.getColor());
    }

    @Test
    void testLineB09() {
        Random r = new Random();
        Line2D e = new Line2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Line obj = new Line(e);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineB10() {
        Random r = new Random();
        Line2D e = new Line2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Line obj = new Line(e);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineB11() {
        Random r = new Random();
        Line2D e = new Line2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Line obj = new Line(e);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineB12() {
        Random r = new Random();
        Line2D e = new Line2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Line obj = new Line(e);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }


    @Test
    void testLineC01() {
        Random r = new Random();
        Point spoint = new Point(r.nextInt(), r.nextInt());
        Line obj = new Line(spoint, spoint);

        assertNull(obj.getColor());
    }

    @Test
    void testLineC02() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        Line obj = new Line(spoint, spoint);

        assertNull(obj.getColor());
    }

    @Test
    void testLineC03() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        Line obj = new Line(spoint, spoint);

        assertNull(obj.getColor());
    }

    @Test
    void testLineC04() {
        Random r = new Random();
        Point spoint = new Point(r.nextInt(), r.nextInt());
        Point fpoint = new Point(r.nextInt(), r.nextInt());
        Line obj = new Line(spoint, fpoint);

        assertNull(obj.getColor());
    }

    @Test
    void testLineC05() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        Point fpoint = new Point();
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        Line obj = new Line(spoint, fpoint);

        assertNull(obj.getColor());
    }

    @Test
    void testLineC06() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        Point fpoint = new Point();
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        Line obj = new Line(spoint, fpoint);

        assertNull(obj.getColor());
    }

    @Test
    void testLineC07() {
        Random r = new Random();
        Point spoint = new Point(r.nextInt(), r.nextInt());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, spoint.x, spoint.y);
        Line obj = new Line(spoint, spoint);

        assertEquals(e.getBounds(), obj.getLine().getBounds().getBounds());
    }

    @Test
    void testLineC08() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, spoint.x, spoint.y);
        Line obj = new Line(spoint, spoint);

        assertEquals(e.getBounds(), obj.getLine().getBounds().getBounds());
    }

    @Test
    void testLineC09() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, spoint.x, spoint.y);
        Line obj = new Line(spoint, spoint);

        assertEquals(e.getBounds(), obj.getLine().getBounds().getBounds());
    }

    @Test
    void testLineC10() {
        Random r = new Random();
        Point spoint = new Point(r.nextInt(), r.nextInt());
        Point fpoint = new Point(r.nextInt(), r.nextInt());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, fpoint.x, fpoint.y);
        Line obj = new Line(spoint, fpoint);

        assertEquals(e.getBounds(), obj.getLine().getBounds().getBounds());
    }

    @Test
    void testLineC11() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        Point fpoint = new Point();
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, fpoint.x, fpoint.y);
        Line obj = new Line(spoint, fpoint);

        assertEquals(e.getBounds(), obj.getLine().getBounds().getBounds());
    }

    @Test
    void testLineC12() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        Point fpoint = new Point();
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, fpoint.x, fpoint.y);
        Line obj = new Line(spoint, fpoint);

        assertEquals(e.getBounds(), obj.getLine().getBounds().getBounds());
    }


    @Test
    void testLineD01() {
        Random r = new Random();
        Point spoint = new Point(r.nextInt(), r.nextInt());
        Line obj = new Line(spoint, spoint, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    void testLineD02() {
        Random r = new Random();
        Point spoint = new Point(r.nextInt(), r.nextInt());
        Line obj = new Line(spoint, spoint, Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    void testLineD03() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        Line obj = new Line(spoint, spoint, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    void testLineD04() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        Line obj = new Line(spoint, spoint, Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    void testLineD05() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        Line obj = new Line(spoint, spoint, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    void testLineD06() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        Line obj = new Line(spoint, spoint, Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    void testLineD07() {
        Random r = new Random();
        Point spoint = new Point(r.nextInt(), r.nextInt());
        Point fpoint = new Point(r.nextInt(), r.nextInt());
        Line obj = new Line(spoint, fpoint, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    void testLineD08() {
        Random r = new Random();
        Point spoint = new Point(r.nextInt(), r.nextInt());
        Point fpoint = new Point(r.nextInt(), r.nextInt());
        Line obj = new Line(spoint, fpoint, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    void testLineD09() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        Point fpoint = new Point();
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        Line obj = new Line(spoint, fpoint, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    void testLineD10() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        Point fpoint = new Point();
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        Line obj = new Line(spoint, fpoint, Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    void testLineD11() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        Point fpoint = new Point();
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        Line obj = new Line(spoint, fpoint, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    void testLineD12() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        Point fpoint = new Point();
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        Line obj = new Line(spoint, fpoint, Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    void testLineD13() {
        Random r = new Random();
        Point spoint = new Point(r.nextInt(), r.nextInt());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, spoint.x, spoint.y);
        Line obj = new Line(spoint, spoint, Color.CYAN);

        assertEquals(e.getBounds(), obj.getLine().getBounds().getBounds());
    }

    @Test
    void testLineD14() {
        Random r = new Random();
        Point spoint = new Point(r.nextInt(), r.nextInt());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, spoint.x, spoint.y);
        Line obj = new Line(spoint, spoint, Color.YELLOW);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineD15() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, spoint.x, spoint.y);
        Line obj = new Line(spoint, spoint, Color.CYAN);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineD16() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, spoint.x, spoint.y);
        Line obj = new Line(spoint, spoint, Color.YELLOW);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineD17() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, spoint.x, spoint.y);
        Line obj = new Line(spoint, spoint, Color.CYAN);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineD18() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, spoint.x, spoint.y);
        Line obj = new Line(spoint, spoint, Color.YELLOW);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineD19() {
        Random r = new Random();
        Point spoint = new Point(r.nextInt(), r.nextInt());
        Point fpoint = new Point(r.nextInt(), r.nextInt());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, fpoint.x, fpoint.y);
        Line obj = new Line(spoint, fpoint, Color.CYAN);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineD20() {
        Random r = new Random();
        Point spoint = new Point(r.nextInt(), r.nextInt());
        Point fpoint = new Point(r.nextInt(), r.nextInt());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, fpoint.x, fpoint.y);
        Line obj = new Line(spoint, fpoint, Color.YELLOW);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineD21() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        Point fpoint = new Point();
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, fpoint.x, fpoint.y);
        Line obj = new Line(spoint, fpoint, Color.CYAN);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineD22() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        Point fpoint = new Point();
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, fpoint.x, fpoint.y);
        Line obj = new Line(spoint, fpoint, Color.YELLOW);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineD23() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        Point fpoint = new Point();
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, fpoint.x, fpoint.y);
        Line obj = new Line(spoint, fpoint, Color.CYAN);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineD24() {
        Random r = new Random();
        Point spoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        Point fpoint = new Point();
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, fpoint.x, fpoint.y);
        Line obj = new Line(spoint, fpoint, Color.YELLOW);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }


    @Test
    void testLineColor1() {
        Line obj = new Line();
        obj.setColor(Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    void testLineColor2() {
        Line obj = new Line();
        obj.setColor(Color.MAGENTA);

        assertEquals(Color.MAGENTA, obj.getColor());
    }

    @Test
    void testLineColor3() {
        Line obj = new Line();
        Color color = Color.decode("#a0a0a0");
        obj.setColor(color);

        assertEquals(color, obj.getColor());
    }

    @Test
    void testLineColor4() {
        Line obj1 = new Line();
        Line obj2 = new Line();
        obj1.setColor(Color.PINK);
        obj2.setColor(Color.BLUE);

        assertEquals(Color.PINK, obj1.getColor());
    }

    @Test
    void testLineColor5() {
        Line obj1 = new Line();
        Line obj2 = new Line();
        obj1.setColor(Color.MAGENTA);
        obj2.setColor(Color.GREEN);

        assertEquals(Color.MAGENTA, obj1.getColor());
    }


    @Test
    void testLineLine2d1() {
        Line obj = new Line();
        Random r = new Random();
        Line2D e = new Line2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        obj.setLine(e);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineLine2d2() {
        Line obj = new Line();
        Random r = new Random();
        Line2D e = new Line2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        obj.setLine(e);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineLine2d3() {
        Line obj = new Line();
        Random r = new Random();
        Line2D e = new Line2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        obj.setLine(e);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineLine2d4() {
        Line obj = new Line();
        Random r = new Random();
        Line2D e = new Line2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        obj.setLine(e);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineLine2d5() {
        Line obj1 = new Line();
        Line obj2 = new Line();
        Random r = new Random();
        Line2D e1 = new Line2D.Double(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        obj1.setLine(e1);
        Line2D e2 = new Line2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        obj2.setLine(e2);

        assertEquals(e1.getBounds(), obj1.getLine().getBounds());
    }


    @Test
    void testLineMakeObject01() {
        Line obj = new Line();
        Random r = new Random();
        GUI.colour = Color.YELLOW;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getColor());
    }

    @Test
    void testLineMakeObject02() {
        Line obj = new Line();
        Random r = new Random();
        GUI.colour = Color.DARK_GRAY;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getColor());
    }

    @Test
    void testLineMakeObject03() {
        Line obj = new Line();
        Random r = new Random();
        GUI.colour = Color.decode("#12FF33");
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getColor());
    }

    @Test
    void testLineMakeObject04() {
        Line obj = new Line();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        Line2D e = new Line2D.Double(point.x, point.y, point.x,  point.y);

        obj.makeObject(point, point);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineMakeObject05() {
        Line obj = new Line();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextDouble(), r.nextDouble());
        Line2D e = new Line2D.Double(point.x, point.y, point.x,  point.y);

        obj.makeObject(point, point);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineMakeObject06() {
        Line obj = new Line();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextFloat(), r.nextFloat());
        Line2D e = new Line2D.Double(point.x, point.y, point.x,  point.y);

        obj.makeObject(point, point);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineMakeObject07() {
        Line obj = new Line();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(), r.nextInt());
        fpoint.setLocation(r.nextInt(), r.nextInt());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, fpoint.x,  fpoint.y);

        obj.makeObject(spoint, fpoint);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineMakeObject08() {
        Line obj = new Line();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, fpoint.x,  fpoint.y);

        obj.makeObject(spoint, fpoint);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineMakeObject09() {
        Line obj = new Line();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, fpoint.x,  fpoint.y);

        obj.makeObject(spoint, fpoint);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineMakeObject10() {
        Line obj = new Line();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        Line2D e = new Line2D.Double(point.x, point.y, point.x,  point.y);

        obj.makeObject(point, point);

        assertEquals(Color.BLACK, obj.getColor());
    }

    @Test
    void testLineMakeObject11() {
        Line obj = new Line();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextDouble(), r.nextDouble());
        Line2D e = new Line2D.Double(point.x, point.y, point.x,  point.y);

        obj.makeObject(point, point);

        assertEquals(Color.BLACK, obj.getColor());
    }

    @Test
    void testLineMakeObject12() {
        Line obj = new Line();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextFloat(), r.nextFloat());
        Line2D e = new Line2D.Double(point.x, point.y, point.x,  point.y);

        obj.makeObject(point, point);

        assertEquals(Color.BLACK, obj.getColor());
    }

    @Test
    void testLineMakeObject13() {
        Line obj = new Line();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(), r.nextInt());
        fpoint.setLocation(r.nextInt(), r.nextInt());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, fpoint.x,  fpoint.y);

        obj.makeObject(spoint, fpoint);

        assertEquals(Color.BLACK, obj.getColor());
    }

    @Test
    void testLineMakeObject14() {
        Line obj = new Line();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, fpoint.x,  fpoint.y);

        obj.makeObject(spoint, fpoint);

        assertEquals(Color.BLACK, obj.getColor());
    }

    @Test
    void testLineMakeObject15() {
        Line obj = new Line();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        Line2D e = new Line2D.Double(spoint.x, spoint.y, fpoint.x,  fpoint.y);

        obj.makeObject(spoint, fpoint);

        assertEquals(Color.BLACK, obj.getColor());
    }


    @Test
    void testLineContains1() {
        Line obj = new Line();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        obj.makeObject(spoint, fpoint);
        Point npoint = new Point();
        npoint.setLocation((spoint.x+fpoint.x)/2, (spoint.y+fpoint.y)/2);

        assertTrue(obj.contains(npoint));
    }

    @Test
    void testLineContains2() {
        Line obj = new Line();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        obj.makeObject(spoint, fpoint);

        assertFalse(obj.contains(spoint));
    }

    @Test
    void testLineContains3() {
        Line obj = new Line();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        obj.makeObject(spoint, fpoint);

        assertFalse(obj.contains(fpoint));
    }


    @Test
    void testLineMove1() {
        Line obj = new Line();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));
        obj.makeObject(spoint, fpoint);

        Point endDrag = new Point();
        endDrag.setLocation(fpoint.x + r.nextInt(200), fpoint.y + r.nextInt(200));

        Point startPoint = new Point((int)spoint.getX() + (endDrag.x - spoint.x),
                (int)spoint.getY() + (endDrag.y - spoint.y));
        Point endPoint = new Point((int)fpoint.getX() + (endDrag.x - spoint.x),
                (int)fpoint.getY() + (endDrag.y - spoint.y));
        Line2D e = new Line2D.Double(startPoint.x, startPoint.y, endPoint.x, endPoint.y);

        obj.move(spoint, endDrag);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineMove2() {
        Line obj = new Line();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        fpoint.setLocation(r.nextDouble(), r.nextDouble());

        obj.makeObject(spoint, fpoint);

        Point endDrag = new Point();
        endDrag.setLocation(fpoint.x + r.nextDouble(), fpoint.y + r.nextDouble());

        Point startPoint = new Point((int)spoint.getX() + (endDrag.x - spoint.x),
                (int)spoint.getY() + (endDrag.y - spoint.y));
        Point endPoint = new Point((int)fpoint.getX() + (endDrag.x - spoint.x),
                (int)fpoint.getY() + (endDrag.y - spoint.y));
        Line2D e = new Line2D.Double(startPoint.x, startPoint.y, endPoint.x, endPoint.y);

        obj.move(spoint, endDrag);

        assertEquals(e.getBounds(), obj.getLine().getBounds());
    }

    @Test
    void testLineWritetoFile1() {
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        GUI.canvas = new JPanel();
        GUI.canvas.setSize(500, 500);

        Line obj = new Line();
        obj.makeObject(spoint, fpoint);

        String sExpect = "";
        String sActual = "";

        try {
            File fileActual = new File("file1.txt");
            FileWriter fwActual = new FileWriter(fileActual);

            BufferedWriter actual = new BufferedWriter(fwActual);
            obj.writetoFile(actual);
            actual.close();

            File fileExpect = new File("file2.txt");
            FileWriter fwExpect = new FileWriter(fileExpect);

            BufferedWriter expect = new BufferedWriter(fwExpect);
            expect.write("PEN #000000\nLine " + (obj.getLine().getX1())/GUI.canvas.getWidth()
                    + " " + (obj.getLine().getY1())/GUI.canvas.getHeight()
                    + " " + (obj.getLine().getX2())/GUI.canvas.getWidth()
                    + " " + (obj.getLine().getY2())/GUI.canvas.getHeight());
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while(tActual != null) {
                sActual += tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect += tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testLineWritetoFile2() {
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        GUI.canvas = new JPanel();
        GUI.canvas.setSize(500, 500);

        Line obj = new Line();
        obj.makeObject(spoint, fpoint);
        obj.setColor(Color.decode("#1258a4"));

        String sExpect = "";
        String sActual = "";

        try {
            File fileActual = new File("file1.txt");
            FileWriter fwActual = new FileWriter(fileActual);

            BufferedWriter actual = new BufferedWriter(fwActual);
            obj.writetoFile(actual);
            actual.close();

            File fileExpect = new File("file2.txt");
            FileWriter fwExpect = new FileWriter(fileExpect);

            BufferedWriter expect = new BufferedWriter(fwExpect);
            expect.write("PEN #1258a4\nLine " + (obj.getLine().getX1())/GUI.canvas.getWidth()
                    + " " + (obj.getLine().getY1())/GUI.canvas.getHeight()
                    + " " + (obj.getLine().getX2())/GUI.canvas.getWidth()
                    + " " + (obj.getLine().getY2())/GUI.canvas.getHeight());
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while (tActual != null) {
                sActual += tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect += tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }











}