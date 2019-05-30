
import org.junit.jupiter.api.*;
import Canvas.*;
import paint.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.io.*;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {

    @BeforeEach
    public void beforeTest() {
        GUI.colour = Color.BLACK;
    }

    @Test
    public void testEllipseA1() {
        Ellipse obj = new Ellipse();

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testEllipseA2() {
        Ellipse obj = new Ellipse();

        assertEquals(null, obj.getLineColor());
    }

    @Test
    public void testEllipseA3() {
        Ellipse obj = new Ellipse();

        assertEquals(null, obj.getElip2d());
    }


    @Test
    public void testEllipseB01() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testEllipseB02() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testEllipseB03() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testEllipseB04() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testEllipseB05() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e);

        assertEquals(null, obj.getLineColor());
    }

    @Test
    public void testEllipseB06() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e);

        assertEquals(null, obj.getLineColor());
    }

    @Test
    public void testEllipseB07() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e);

        assertEquals(null, obj.getLineColor());
    }

    @Test
    public void testEllipseB08() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e);

        assertEquals(null, obj.getLineColor());
    }

    @Test
    public void testEllipseB09() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseB10() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseB11() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseB12() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e);

        assertEquals(e, obj.getElip2d());
    }


    @Test
    public void testEllipseC01() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.PINK);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testEllipseC02() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.ORANGE);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testEllipseC03() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.PINK);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testEllipseC04() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.ORANGE);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testEllipseC05() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.PINK);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testEllipseC06() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.ORANGE);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testEllipseC07() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.PINK);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testEllipseC08() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.ORANGE);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testEllipseC09() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    public void testEllipseC10() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.PINK);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    public void testEllipseC11() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    public void testEllipseC12() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.PINK);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    public void testEllipseC13() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    public void testEllipseC14() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.PINK);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    public void testEllipseC15() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    public void testEllipseC16() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.PINK);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    public void testEllipseC17() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.GREEN);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseC18() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.RED);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseC19() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.GREEN);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseC20() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.RED);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseC21() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.GREEN);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseC22() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.RED);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseC23() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.GREEN);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseC24() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.RED);

        assertEquals(e, obj.getElip2d());
    }


    @Test
    public void testEllipseD01() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.PINK, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    public void testEllipseD02() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.ORANGE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    public void testEllipseD03() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.PINK, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    public void testEllipseD04() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.ORANGE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    public void testEllipseD05() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.PINK, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    public void testEllipseD06() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.ORANGE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    public void testEllipseD07() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.PINK, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    public void testEllipseD08() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.ORANGE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    public void testEllipseD09() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.BLUE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    public void testEllipseD10() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.PINK, Color.YELLOW);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    public void testEllipseD11() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.BLUE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    public void testEllipseD12() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.PINK, Color.YELLOW);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    public void testEllipseD13() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.BLUE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    public void testEllipseD14() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.PINK, Color.YELLOW);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    public void testEllipseD15() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.BLUE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    public void testEllipseD16() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.PINK, Color.YELLOW);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    public void testEllipseD17() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.GREEN, Color.GREEN);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseD18() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse obj = new Ellipse(e, Color.RED, Color.MAGENTA);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseD19() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.GREEN, Color.GREEN);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseD20() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.RED, Color.MAGENTA);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseD21() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.GREEN, Color.GREEN);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseD22() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse obj = new Ellipse(e, Color.RED, Color.MAGENTA);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseD23() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.GREEN, Color.GREEN);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseD24() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse obj = new Ellipse(e, Color.RED, Color.MAGENTA);

        assertEquals(e, obj.getElip2d());
    }


    @Test
    public void testEllipseColor1() {
        Ellipse obj = new Ellipse();
        obj.setColor(Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    public void testEllipseColor2() {
        Ellipse obj = new Ellipse();
        obj.setColor(Color.MAGENTA);

        assertEquals(Color.MAGENTA, obj.getColor());
    }

    @Test
    public void testEllipseColor3() {
        Ellipse obj = new Ellipse();
        Color color = Color.decode("#a0a0a0");
        obj.setColor(color);

        assertEquals(color, obj.getColor());
    }

    @Test
    public void testEllipseColor4() {
        Ellipse obj = new Ellipse();
        obj.setColor(Color.MAGENTA);

        assertEquals(null, obj.getLineColor());
    }

    @Test
    public void testEllipseColor5() {
        Ellipse obj = new Ellipse();
        Color color = Color.decode("#a0a0a0");
        obj.setColor(color);

        assertEquals(null, obj.getLineColor());
    }

    @Test
    public void testEllipseColor6() {
        Ellipse obj1 = new Ellipse();
        Ellipse obj2 = new Ellipse();
        obj1.setColor(Color.PINK);
        obj2.setColor(Color.BLUE);

        assertEquals(Color.PINK, obj1.getColor());
    }


    @Test
    public void testEllipseLineColor1() {
        Ellipse obj = new Ellipse();
        obj.setLineColor(Color.RED);

        assertEquals(Color.RED, obj.getLineColor());
    }

    @Test
    public void testEllipseLineColor2() {
        Ellipse obj = new Ellipse();
        obj.setLineColor(Color.PINK);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    public void testEllipseLineColor3() {
        Ellipse obj = new Ellipse();
        Color color = Color.decode("#B2FF66");
        obj.setLineColor(color);

        assertEquals(color, obj.getLineColor());
    }

    @Test
    public void testEllipseLineColor4() {
        Ellipse obj = new Ellipse();
        obj.setLineColor(Color.PINK);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testEllipseLineColor5() {
        Ellipse obj = new Ellipse();
        Color color = Color.decode("#B2FF66");
        obj.setLineColor(color);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testEllipseLineColor6() {
        Ellipse obj1 = new Ellipse();
        Ellipse obj2 = new Ellipse();
        obj1.setLineColor(Color.PINK);
        obj2.setLineColor(Color.BLUE);

        assertEquals(Color.PINK, obj1.getLineColor());
    }


    @Test
    public void testEllipseElip2d1() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        obj.setElip2d(e);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseElip2d2() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        obj.setElip2d(e);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseElip2d3() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        obj.setElip2d(e);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseElip2d4() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        obj.setElip2d(e);

        assertEquals(e, obj.getElip2d());
    }

    @Test
    public void testEllipseElip2d5() {
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
    public void testEllipseMakeObject1() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        GUI.colour = Color.YELLOW;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getLineColor());
    }

    @Test
    public void testEllipseMakeObject2() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        GUI.colour = Color.DARK_GRAY;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getLineColor());
    }

    @Test
    public void testEllipseMakeObject3() {
        Ellipse obj = new Ellipse();
        Random r = new Random();
        GUI.colour = Color.decode("#12FF33");
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getLineColor());
    }

    @Test
    public void testEllipseMakeObject4() {
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
    public void testEllipseMakeObject5() {
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
    public void testEllipseMakeObject6() {
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
    public void testEllipseMakeObject7() {
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
    public void testEllipseMakeObject8() {
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
    public void testEllipseFill1() {
        Ellipse obj = new Ellipse();
        obj.fill(Color.MAGENTA);

        assertEquals(Color.MAGENTA, obj.getColor());
    }

    @Test
    public void testEllipseFill2() {
        Ellipse obj = new Ellipse();
        obj.fill(Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    public void testEllipseFill3() {
        Ellipse obj = new Ellipse();
        obj.fill(Color.decode("#123456"));

        assertEquals(Color.decode("#123456"), obj.getColor());
    }


    @Test
    public void testEllipseContains1() {
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
    public void testEllipseContains2() {
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
    public void testEllipseContains3() {
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
    public void testEllipseMove1() {
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
    public void testEllipseMove2() {
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
    public void testEllipseWritetoFile1() {
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
            expect.write("PEN #000000\nFILL OFF\nEllipse " + (double)(x1/GUI.canvas.getWidth()) + " " + (double)(y1/GUI.canvas.getHeight()) + " " + (double)(x2/GUI.canvas.getWidth()) + " " + (double)(y2/GUI.canvas.getHeight()));
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while(tActual != null) {
                sActual = sActual + tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect = sExpect + tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            System.out.println(sActual);
            System.out.println(sExpect);

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEllipseWritetoFile2() {
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
            expect.write("PEN #000000\nFILL #1258a4\nEllipse " + (double) (x1 / GUI.canvas.getWidth()) + " " + (double) (y1 / GUI.canvas.getHeight()) + " " + (double) (x2 / GUI.canvas.getWidth()) + " " + (double) (y2 / GUI.canvas.getHeight()));
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while (tActual != null) {
                sActual = sActual + tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect = sExpect + tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            System.out.println(sActual);
            System.out.println(sExpect);

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEllipseWritetoFile3() {
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
            expect.write("PEN #56df75\nFILL OFF\nEllipse " + (double) (x1 / GUI.canvas.getWidth()) + " " + (double) (y1 / GUI.canvas.getHeight()) + " " + (double) (x2 / GUI.canvas.getWidth()) + " " + (double) (y2 / GUI.canvas.getHeight()));
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while (tActual != null) {
                sActual = sActual + tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect = sExpect + tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            System.out.println(sActual);
            System.out.println(sExpect);

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEllipseWritetoFile4() {
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
            expect.write("PEN #aedd88\nFILL #ffafaf\nEllipse " + (double) (x1 / GUI.canvas.getWidth()) + " " + (double) (y1 / GUI.canvas.getHeight()) + " " + (double) (x2 / GUI.canvas.getWidth()) + " " + (double) (y2 / GUI.canvas.getHeight()));
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while (tActual != null) {
                sActual = sActual + tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect = sExpect + tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            System.out.println(sActual);
            System.out.println(sExpect);

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }








    @Test
    public void testRectangleA1() {
        paint.Rectangle obj = new paint.Rectangle();

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testRectangleA2() {
        paint.Rectangle obj = new paint.Rectangle();

        assertEquals(null, obj.getLineColor());
    }

    @Test
    public void testRectangleA3() {
        paint.Rectangle obj = new paint.Rectangle();

        assertEquals(null, obj.getRect());
    }


    @Test
    public void testRectangleB1() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testRectangleB2() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e);

        assertEquals(null, obj.getLineColor());
    }

    @Test
    public void testRectangleB3() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e);

        assertEquals(e, obj.getRect());
    }


    @Test
    public void testRectangleC1() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.PINK);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testRectangleC2() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.ORANGE);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testRectangleC3() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    public void testRectangleC4() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.PINK);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    public void testRectangleC5() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.GREEN);

        assertEquals(e, obj.getRect());
    }

    @Test
    public void testRectangleC6() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.RED);

        assertEquals(e, obj.getRect());
    }


    @Test
    public void testRectangleD1() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.PINK, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    public void testRectangleD2() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.ORANGE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    public void testRectangleD3() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.BLUE, Color.BLUE);

        assertEquals(Color.BLUE, obj.getLineColor());
    }

    @Test
    public void testRectangleD4() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.PINK, Color.YELLOW);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    public void testRectangleD5() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.GREEN, Color.GREEN);

        assertEquals(e, obj.getRect());
    }

    @Test
    public void testRectangleD6() {
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        paint.Rectangle obj = new paint.Rectangle(e, Color.RED, Color.MAGENTA);

        assertEquals(e, obj.getRect());
    }


    @Test
    public void testRectangleColor1() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.setColor(Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    public void testRectangleColor2() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.setColor(Color.MAGENTA);

        assertEquals(Color.MAGENTA, obj.getColor());
    }

    @Test
    public void testRectangleColor3() {
        paint.Rectangle obj = new paint.Rectangle();
        Color color = Color.decode("#a0a0a0");
        obj.setColor(color);

        assertEquals(color, obj.getColor());
    }

    @Test
    public void testRectangleColor4() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.setColor(Color.MAGENTA);

        assertEquals(null, obj.getLineColor());
    }

    @Test
    public void testRectangleColor5() {
        paint.Rectangle obj = new paint.Rectangle();
        Color color = Color.decode("#a0a0a0");
        obj.setColor(color);

        assertEquals(null, obj.getLineColor());
    }

    @Test
    public void testRectangleColor6() {
        paint.Rectangle obj1 = new paint.Rectangle();
        paint.Rectangle obj2 = new paint.Rectangle();
        obj1.setColor(Color.PINK);
        obj2.setColor(Color.BLUE);

        assertEquals(Color.PINK, obj1.getColor());
    }


    @Test
    public void testRectangleLineColor1() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.setLineColor(Color.RED);

        assertEquals(Color.RED, obj.getLineColor());
    }

    @Test
    public void testRectangleLineColor2() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.setLineColor(Color.PINK);

        assertEquals(Color.PINK, obj.getLineColor());
    }

    @Test
    public void testRectangleLineColor3() {
        paint.Rectangle obj = new paint.Rectangle();
        Color color = Color.decode("#B2FF66");
        obj.setLineColor(color);

        assertEquals(color, obj.getLineColor());
    }

    @Test
    public void testRectangleLineColor4() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.setLineColor(Color.PINK);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testRectangleLineColor5() {
        paint.Rectangle obj = new paint.Rectangle();
        Color color = Color.decode("#B2FF66");
        obj.setLineColor(color);

        assertEquals(null, obj.getColor());
    }

    @Test
    public void testRectangleLineColor6() {
        paint.Rectangle obj1 = new paint.Rectangle();
        paint.Rectangle obj2 = new paint.Rectangle();
        obj1.setLineColor(Color.PINK);
        obj2.setLineColor(Color.BLUE);

        assertEquals(Color.PINK, obj1.getLineColor());
    }


    @Test
    public void testRectangleRect1() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        java.awt.Rectangle e = new java.awt.Rectangle(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        obj.setRect(e);

        assertEquals(e, obj.getRect());
    }

    @Test
    public void testRectangleRect2() {
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
    public void testRectangleMakeObject1() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        GUI.colour = Color.YELLOW;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getLineColor());
    }

    @Test
    public void testRectangleMakeObject2() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        GUI.colour = Color.DARK_GRAY;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getLineColor());
    }

    @Test
    public void testRectangleMakeObject3() {
        paint.Rectangle obj = new paint.Rectangle();
        Random r = new Random();
        GUI.colour = Color.decode("#12FF33");
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getLineColor());
    }

    @Test
    public void testRectangleMakeObject4() {
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
    public void testRectangleMakeObject5() {
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
    public void testRectangleMakeObject6() {
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
    public void testRectangleMakeObject7() {
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
    public void testRectangleMakeObject8() {
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
    public void testRectangleFill1() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.fill(Color.MAGENTA);

        assertEquals(Color.MAGENTA, obj.getColor());
    }

    @Test
    public void testRectangleFill2() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.fill(Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    public void testRectangleFill3() {
        paint.Rectangle obj = new paint.Rectangle();
        obj.fill(Color.decode("#123456"));

        assertEquals(Color.decode("#123456"), obj.getColor());
    }


    @Test
    public void testRectangleContains1() {
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
    public void testRectangleContains2() {
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
    public void testRectangleMove1() {
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
    public void testRectangleMove2() {
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
    public void testRectangleWritetoFile1() {
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
            expect.write("PEN #000000\nFILL OFF\nRectangle " + (double)(x1/GUI.canvas.getWidth()) + " " + (double)(y1/GUI.canvas.getHeight()) + " " + (double)(x2/GUI.canvas.getWidth()) + " " + (double)(y2/GUI.canvas.getHeight()));
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while(tActual != null) {
                sActual = sActual + tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect = sExpect + tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            System.out.println(sActual);
            System.out.println(sExpect);

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRectangleWritetoFile2() {
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
            expect.write("PEN #000000\nFILL #1258a4\nRectangle " + (double) (x1 / GUI.canvas.getWidth()) + " " + (double) (y1 / GUI.canvas.getHeight()) + " " + (double) (x2 / GUI.canvas.getWidth()) + " " + (double) (y2 / GUI.canvas.getHeight()));
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while (tActual != null) {
                sActual = sActual + tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect = sExpect + tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            System.out.println(sActual);
            System.out.println(sExpect);

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRectangleWritetoFile3() {
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
            expect.write("PEN #56df75\nFILL OFF\nRectangle " + (double) (x1 / GUI.canvas.getWidth()) + " " + (double) (y1 / GUI.canvas.getHeight()) + " " + (double) (x2 / GUI.canvas.getWidth()) + " " + (double) (y2 / GUI.canvas.getHeight()));
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while (tActual != null) {
                sActual = sActual + tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect = sExpect + tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            System.out.println(sActual);
            System.out.println(sExpect);

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRectangleWritetoFile4() {
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
            expect.write("PEN #aedd88\nFILL #ffafaf\nRectangle " + (double) (x1 / GUI.canvas.getWidth()) + " " + (double) (y1 / GUI.canvas.getHeight()) + " " + (double) (x2 / GUI.canvas.getWidth()) + " " + (double) (y2 / GUI.canvas.getHeight()));
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while (tActual != null) {
                sActual = sActual + tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect = sExpect + tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            System.out.println(sActual);
            System.out.println(sExpect);

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }








    @Test
    public void testPlotA1() {
        Plot obj = new Plot();

        assertEquals(Color.BLACK, obj.getColor());
    }

    @Test
    public void testPlotA3() {
        Plot obj = new Plot();

        assertEquals(null, obj.getPoint());
    }


    @Test
    public void testPlotB1() {
        Random r = new Random();
        Point e = new Point(r.nextInt(), r.nextInt());
        Plot obj = new Plot(e);

        assertEquals(Color.BLACK, obj.getColor());
    }

    @Test
    public void testPlotB2() {
        Random r = new Random();
        Point e = new Point(r.nextInt(), r.nextInt());
        Plot obj = new Plot(e);

        assertEquals(e, obj.getPoint());
    }

    @Test
    public void testPlotC1() {
        Random r = new Random();
        Point e = new Point(r.nextInt(), r.nextInt());
        Plot obj = new Plot(e, Color.PINK);

        assertEquals(Color.PINK, obj.getColor());
    }

    @Test
    public void testPlotC2() {
        Random r = new Random();
        Point e = new Point(r.nextInt(), r.nextInt());
        Plot obj = new Plot(e, Color.ORANGE);

        assertEquals(Color.ORANGE, obj.getColor());
    }

    @Test
    public void testPlotC3() {
        Random r = new Random();
        Point e = new Point(r.nextInt(), r.nextInt());
        Plot obj = new Plot(e, Color.GREEN);

        assertEquals(e, obj.getPoint());
    }

    @Test
    public void testPlotC4() {
        Random r = new Random();
        Point e = new Point(r.nextInt(), r.nextInt());
        Plot obj = new Plot(e, Color.RED);

        assertEquals(e, obj.getPoint());
    }


    @Test
    public void testPlotColor1() {
        Plot obj = new Plot();
        obj.setColor(Color.BLUE);

        assertEquals(Color.BLUE, obj.getColor());
    }

    @Test
    public void testPlotColor2() {
        Plot obj = new Plot();
        obj.setColor(Color.MAGENTA);

        assertEquals(Color.MAGENTA, obj.getColor());
    }

    @Test
    public void testPlotColor3() {
        Plot obj = new Plot();
        Color color = Color.decode("#a0a0a0");
        obj.setColor(color);

        assertEquals(color, obj.getColor());
    }

    @Test
    public void testPlotColor4() {
        Plot obj1 = new Plot();
        Plot obj2 = new Plot();
        obj1.setColor(Color.PINK);
        obj2.setColor(Color.BLUE);

        assertEquals(Color.PINK, obj1.getColor());
    }


    @Test
    public void testPlotPoint1() {
        Plot obj = new Plot();
        Random r = new Random();
        Point e = new Point(r.nextInt(), r.nextInt());
        obj.setPoint(e);

        assertEquals(e, obj.getPoint());
    }

    @Test
    public void testPlotPoint2() {
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
    public void testPlotMakeObject1() {
        Plot obj = new Plot();
        Random r = new Random();
        GUI.colour = Color.YELLOW;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getColor());
    }

    @Test
    public void testPlotMakeObject2() {
        Plot obj = new Plot();
        Random r = new Random();
        GUI.colour = Color.DARK_GRAY;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getColor());
    }

    @Test
    public void testPlotMakeObject3() {
        Plot obj = new Plot();
        Random r = new Random();
        GUI.colour = Color.decode("#12FF33");
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        obj.makeObject(point, point);

        assertEquals(GUI.colour, obj.getColor());
    }

    @Test
    public void testPlotMakeObject4() {
        Plot obj = new Plot();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        Point e = new Point(point.x, point.y);

        obj.makeObject(point, point);

        assertEquals(e, obj.getPoint());
    }

    @Test
    public void testPlotMakeObject5() {
        Plot obj = new Plot();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextDouble(), r.nextDouble());
        Point e = new Point(point.x, point.y);

        obj.makeObject(point, point);

        assertEquals(e, obj.getPoint());
    }

    @Test
    public void testPlotMakeObject6() {
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
    public void testPlotMakeObject7() {
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
    public void testPlotMakeObject8() {
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
    public void testPlotContains1() {
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
    public void testPlotContains2() {
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
    public void testPlotMove1() {
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
    public void testPlotMove2() {
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
    public void testPlotWritetoFile1() {
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
            expect.write("PEN #000000\nPlot " + (double)(obj.getPoint().x)/GUI.canvas.getWidth() + " " + (double)(obj.getPoint().y)/GUI.canvas.getHeight());
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while(tActual != null) {
                sActual = sActual + tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect = sExpect + tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            System.out.println(sActual);
            System.out.println(sExpect);

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPlotWritetoFile2() {
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
            expect.write("PEN #1258a4\nPlot " + (double)(obj.getPoint().x)/GUI.canvas.getWidth() + " " + (double)(obj.getPoint().y)/GUI.canvas.getHeight());
            expect.close();


            FileReader frActual = new FileReader(fileActual);
            BufferedReader brActual = new BufferedReader(frActual);

            String tActual = brActual.readLine();
            while (tActual != null) {
                sActual = sActual + tActual + "\n";
                tActual = brActual.readLine();
            }

            FileReader frExpect = new FileReader(fileExpect);
            BufferedReader brExpect = new BufferedReader(frExpect);

            String tExpect = brExpect.readLine();
            while (tExpect != null) {
                sExpect = sExpect + tExpect + "\n";
                tExpect = brExpect.readLine();
            }

            System.out.println(sActual);
            System.out.println(sExpect);

            assertEquals(sExpect, sActual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
