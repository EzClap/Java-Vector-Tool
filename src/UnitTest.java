
import org.junit.jupiter.api.*;
import Canvas.*;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {

    @Test
    public void testEllipseA1() {
        Ellipse ellipse = new Ellipse();

        assertEquals(null, ellipse.getColor());
    }

    @Test
    public void testEllipseA2() {
        Ellipse ellipse = new Ellipse();

        assertEquals(null, ellipse.getLineColor());
    }

    @Test
    public void testEllipseA3() {
        Ellipse ellipse = new Ellipse();

        assertEquals(null, ellipse.getElip2d());
    }


    @Test
    public void testEllipseB01() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse ellipse = new Ellipse(e);

        assertEquals(null, ellipse.getColor());
    }

    @Test
    public void testEllipseB02() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e);

        assertEquals(null, ellipse.getColor());
    }

    @Test
    public void testEllipseB03() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse ellipse = new Ellipse(e);

        assertEquals(null, ellipse.getColor());
    }

    @Test
    public void testEllipseB04() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e);

        assertEquals(null, ellipse.getColor());
    }

    @Test
    public void testEllipseB05() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse ellipse = new Ellipse(e);

        assertEquals(null, ellipse.getLineColor());
    }

    @Test
    public void testEllipseB06() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e);

        assertEquals(null, ellipse.getLineColor());
    }

    @Test
    public void testEllipseB07() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse ellipse = new Ellipse(e);

        assertEquals(null, ellipse.getLineColor());
    }

    @Test
    public void testEllipseB08() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e);

        assertEquals(null, ellipse.getLineColor());
    }

    @Test
    public void testEllipseB09() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse ellipse = new Ellipse(e);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseB10() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseB11() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse ellipse = new Ellipse(e);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseB12() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e);

        assertEquals(e, ellipse.getElip2d());
    }


    @Test
    public void testEllipseC01() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse ellipse = new Ellipse(e, Color.PINK);

        assertEquals(null, ellipse.getColor());
    }

    @Test
    public void testEllipseC02() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse ellipse = new Ellipse(e, Color.ORANGE);

        assertEquals(null, ellipse.getColor());
    }

    @Test
    public void testEllipseC03() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.PINK);

        assertEquals(null, ellipse.getColor());
    }

    @Test
    public void testEllipseC04() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.ORANGE);

        assertEquals(null, ellipse.getColor());
    }

    @Test
    public void testEllipseC05() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse ellipse = new Ellipse(e, Color.PINK);

        assertEquals(null, ellipse.getColor());
    }

    @Test
    public void testEllipseC06() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse ellipse = new Ellipse(e, Color.ORANGE);

        assertEquals(null, ellipse.getColor());
    }

    @Test
    public void testEllipseC07() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.PINK);

        assertEquals(null, ellipse.getColor());
    }

    @Test
    public void testEllipseC08() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.ORANGE);

        assertEquals(null, ellipse.getColor());
    }

    @Test
    public void testEllipseC09() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse ellipse = new Ellipse(e, Color.BLUE);

        assertEquals(Color.BLUE, ellipse.getLineColor());
    }

    @Test
    public void testEllipseC10() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse ellipse = new Ellipse(e, Color.PINK);

        assertEquals(Color.PINK, ellipse.getLineColor());
    }

    @Test
    public void testEllipseC11() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.BLUE);

        assertEquals(Color.BLUE, ellipse.getLineColor());
    }

    @Test
    public void testEllipseC12() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.PINK);

        assertEquals(Color.PINK, ellipse.getLineColor());
    }

    @Test
    public void testEllipseC13() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse ellipse = new Ellipse(e, Color.BLUE);

        assertEquals(Color.BLUE, ellipse.getLineColor());
    }

    @Test
    public void testEllipseC14() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse ellipse = new Ellipse(e, Color.PINK);

        assertEquals(Color.PINK, ellipse.getLineColor());
    }

    @Test
    public void testEllipseC15() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.BLUE);

        assertEquals(Color.BLUE, ellipse.getLineColor());
    }

    @Test
    public void testEllipseC16() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.PINK);

        assertEquals(Color.PINK, ellipse.getLineColor());
    }

    @Test
    public void testEllipseC17() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse ellipse = new Ellipse(e, Color.GREEN);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseC18() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse ellipse = new Ellipse(e, Color.RED);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseC19() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.GREEN);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseC20() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.RED);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseC21() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse ellipse = new Ellipse(e, Color.GREEN);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseC22() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse ellipse = new Ellipse(e, Color.RED);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseC23() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.GREEN);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseC24() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.RED);

        assertEquals(e, ellipse.getElip2d());
    }


    @Test
    public void testEllipseD01() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse ellipse = new Ellipse(e, Color.PINK, Color.PINK);

        assertEquals(Color.PINK, ellipse.getColor());
    }

    @Test
    public void testEllipseD02() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse ellipse = new Ellipse(e, Color.ORANGE, Color.BLUE);

        assertEquals(Color.BLUE, ellipse.getColor());
    }

    @Test
    public void testEllipseD03() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.PINK, Color.PINK);

        assertEquals(Color.PINK, ellipse.getColor());
    }

    @Test
    public void testEllipseD04() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.ORANGE, Color.BLUE);

        assertEquals(Color.BLUE, ellipse.getColor());
    }

    @Test
    public void testEllipseD05() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse ellipse = new Ellipse(e, Color.PINK, Color.PINK);

        assertEquals(Color.PINK, ellipse.getColor());
    }

    @Test
    public void testEllipseD06() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse ellipse = new Ellipse(e, Color.ORANGE, Color.BLUE);

        assertEquals(Color.BLUE, ellipse.getColor());
    }

    @Test
    public void testEllipseD07() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.PINK, Color.PINK);

        assertEquals(Color.PINK, ellipse.getColor());
    }

    @Test
    public void testEllipseD08() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.ORANGE, Color.BLUE);

        assertEquals(Color.BLUE, ellipse.getColor());
    }

    @Test
    public void testEllipseD09() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse ellipse = new Ellipse(e, Color.BLUE, Color.BLUE);

        assertEquals(Color.BLUE, ellipse.getLineColor());
    }

    @Test
    public void testEllipseD10() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse ellipse = new Ellipse(e, Color.PINK, Color.YELLOW);

        assertEquals(Color.PINK, ellipse.getLineColor());
    }

    @Test
    public void testEllipseD11() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.BLUE, Color.BLUE);

        assertEquals(Color.BLUE, ellipse.getLineColor());
    }

    @Test
    public void testEllipseD12() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.PINK, Color.YELLOW);

        assertEquals(Color.PINK, ellipse.getLineColor());
    }

    @Test
    public void testEllipseD13() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse ellipse = new Ellipse(e, Color.BLUE, Color.BLUE);

        assertEquals(Color.BLUE, ellipse.getLineColor());
    }

    @Test
    public void testEllipseD14() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse ellipse = new Ellipse(e, Color.PINK, Color.YELLOW);

        assertEquals(Color.PINK, ellipse.getLineColor());
    }

    @Test
    public void testEllipseD15() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.BLUE, Color.BLUE);

        assertEquals(Color.BLUE, ellipse.getLineColor());
    }

    @Test
    public void testEllipseD16() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.PINK, Color.YELLOW);

        assertEquals(Color.PINK, ellipse.getLineColor());
    }

    @Test
    public void testEllipseD17() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse ellipse = new Ellipse(e, Color.GREEN, Color.GREEN);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseD18() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        Ellipse ellipse = new Ellipse(e, Color.RED, Color.MAGENTA);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseD19() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.GREEN, Color.GREEN);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseD20() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.RED, Color.MAGENTA);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseD21() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse ellipse = new Ellipse(e, Color.GREEN, Color.GREEN);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseD22() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        Ellipse ellipse = new Ellipse(e, Color.RED, Color.MAGENTA);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseD23() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.GREEN, Color.GREEN);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseD24() {
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        Ellipse ellipse = new Ellipse(e, Color.RED, Color.MAGENTA);

        assertEquals(e, ellipse.getElip2d());
    }


    @Test
    public void testEllipseColor1() {
        Ellipse ellipse = new Ellipse();
        ellipse.setColor(Color.BLUE);

        assertEquals(Color.BLUE, ellipse.getColor());
    }

    @Test
    public void testEllipseColor2() {
        Ellipse ellipse = new Ellipse();
        ellipse.setColor(Color.MAGENTA);

        assertEquals(Color.MAGENTA, ellipse.getColor());
    }

    @Test
    public void testEllipseColor3() {
        Ellipse ellipse = new Ellipse();
        Color color = Color.decode("#a0a0a0");
        ellipse.setColor(color);

        assertEquals(color, ellipse.getColor());
    }

    @Test
    public void testEllipseColor4() {
        Ellipse ell1 = new Ellipse();
        Ellipse ell2 = new Ellipse();
        ell1.setColor(Color.PINK);
        ell2.setColor(Color.BLUE);

        assertEquals(Color.PINK, ell1.getColor());
    }


    @Test
    public void testEllipseLineColor1() {
        Ellipse ellipse = new Ellipse();
        ellipse.setLineColor(Color.RED);

        assertEquals(Color.RED, ellipse.getLineColor());
    }

    @Test
    public void testEllipseLineColor2() {
        Ellipse ellipse = new Ellipse();
        ellipse.setLineColor(Color.PINK);

        assertEquals(Color.PINK, ellipse.getLineColor());
    }

    @Test
    public void testEllipseLineColor3() {
        Ellipse ellipse = new Ellipse();
        Color color = Color.decode("#B2FF66");
        ellipse.setLineColor(color);

        assertEquals(color, ellipse.getLineColor());
    }

    @Test
    public void testEllipseLineColor4() {
        Ellipse ell1 = new Ellipse();
        Ellipse ell2 = new Ellipse();
        ell1.setLineColor(Color.PINK);
        ell2.setLineColor(Color.BLUE);

        assertEquals(Color.PINK, ell1.getLineColor());
    }


    @Test
    public void testEllipseElip2d1() {
        Ellipse ellipse = new Ellipse();
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble());
        ellipse.setElip2d(e);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseElip2d2() {
        Ellipse ellipse = new Ellipse();
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Double(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        ellipse.setElip2d(e);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseElip2d3() {
        Ellipse ellipse = new Ellipse();
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        ellipse.setElip2d(e);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseElip2d4() {
        Ellipse ellipse = new Ellipse();
        Random r = new Random();
        Ellipse2D e = new Ellipse2D.Float(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
        ellipse.setElip2d(e);

        assertEquals(e, ellipse.getElip2d());
    }


    @Test
    public void testEllipseMakeObject1() {
        Ellipse ellipse = new Ellipse();
        Random r = new Random();
        GUI.colour = Color.YELLOW;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        ellipse.makeObject(point, point);

        assertEquals(GUI.colour, ellipse.getLineColor());
    }

    @Test
    public void testEllipseMakeObject2() {
        Ellipse ellipse = new Ellipse();
        Random r = new Random();
        GUI.colour = Color.DARK_GRAY;
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        ellipse.makeObject(point, point);

        assertEquals(GUI.colour, ellipse.getLineColor());
    }

    @Test
    public void testEllipseMakeObject3() {
        Ellipse ellipse = new Ellipse();
        Random r = new Random();
        GUI.colour = Color.decode("#12FF33");
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        ellipse.makeObject(point, point);

        assertEquals(GUI.colour, ellipse.getLineColor());
    }

    @Test
    public void testEllipseMakeObject4() {
        Ellipse ellipse = new Ellipse();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextInt(), r.nextInt());
        Ellipse2D e = new Ellipse2D.Float(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        ellipse.makeObject(point, point);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseMakeObject5() {
        Ellipse ellipse = new Ellipse();
        Random r = new Random();
        Point point = new Point();
        point.setLocation(r.nextDouble(), r.nextDouble());
        Ellipse2D e = new Ellipse2D.Float(Math.min(point.x, point.x),
                Math.min(point.y, point.y), Math.abs(point.x - point.x), Math.abs(point.y - point.y));

        ellipse.makeObject(point, point);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseMakeObject6() {
        Ellipse ellipse = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(), r.nextInt());
        fpoint.setLocation(r.nextInt(), r.nextInt());
        Ellipse2D e = new Ellipse2D.Float(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        ellipse.makeObject(spoint, fpoint);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseMakeObject7() {
        Ellipse ellipse = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextDouble(), r.nextDouble());
        fpoint.setLocation(r.nextDouble(), r.nextDouble());
        Ellipse2D e = new Ellipse2D.Float(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        ellipse.makeObject(spoint, fpoint);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseMakeObject8() {
        Ellipse ellipse = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextFloat(), r.nextFloat());
        fpoint.setLocation(r.nextFloat(), r.nextFloat());
        Ellipse2D e = new Ellipse2D.Float(Math.min(spoint.x, fpoint.x),
                Math.min(spoint.y, fpoint.y), Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));

        ellipse.makeObject(spoint, fpoint);

        assertEquals(e, ellipse.getElip2d());
    }

    @Test
    public void testEllipseFill1() {
        Ellipse ellipse = new Ellipse();
        ellipse.fill(Color.MAGENTA);

        assertEquals(Color.MAGENTA, ellipse.getColor());
    }

    @Test
    public void testEllipseFill2() {
        Ellipse ellipse = new Ellipse();
        ellipse.fill(Color.BLUE);

        assertEquals(Color.BLUE, ellipse.getColor());
    }

    @Test
    public void testEllipseFill3() {
        Ellipse ellipse = new Ellipse();
        ellipse.fill(Color.decode("#123456"));

        assertEquals(Color.decode("#123456"), ellipse.getColor());
    }


    @Test
    public void testEllipseContains1() {
        Ellipse ellipse = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        ellipse.makeObject(spoint, fpoint);
        Point npoint = new Point();
        npoint.setLocation((spoint.x+fpoint.x)/2, (spoint.y+fpoint.y)/2);

        assertTrue(ellipse.contains(npoint));
    }

    @Test
    public void testEllipseContains2() {
        Ellipse ellipse = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        ellipse.makeObject(spoint, fpoint);

        assertFalse(ellipse.contains(spoint));
    }

    @Test
    public void testEllipseContains3() {
        Ellipse ellipse = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        ellipse.makeObject(spoint, fpoint);

        assertFalse(ellipse.contains(fpoint));
    }

    @Test
    public void testEllipseMove() {
        Ellipse ellipse = new Ellipse();
        Random r = new Random();
        Point spoint = new Point();
        Point fpoint = new Point();
        spoint.setLocation(r.nextInt(500), r.nextInt(500));
        fpoint.setLocation(r.nextInt(500), r.nextInt(500));

        ellipse.makeObject(spoint, fpoint);

        Point startDrag = new Point();
        Point endDrag = new Point();
        startDrag.setLocation(spoint.x + r.nextInt(200), spoint.y + r.nextInt(200));
        endDrag.setLocation(fpoint.x + r.nextInt(200), fpoint.y + r.nextInt(200));

        ellipse.move(startDrag, endDrag);

        Ellipse2D e = new Ellipse2D.Float(Math.min(spoint.x, fpoint.x), Math.min(spoint.y, fpoint.y),
                Math.abs(spoint.x - fpoint.x), Math.abs(spoint.y - fpoint.y));
        e.setFrame(e.getX() + endDrag.x - startDrag.x,e.getY() + endDrag.y - startDrag.y,
                e.getWidth(), e.getHeight());

        assertEquals(e.getFrame(), ellipse.getElip2d().getFrame());
    }

}
