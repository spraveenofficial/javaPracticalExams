import java.awt.*;
import java.applet.*;

public class ParamDemo extends Applet {
    String fn = null, fz = null, l = null, ac = null;

    public void init() {
        setBackground(Color.gray);
        setBackground(Color.white);
    }

    public void start() {
        fn = getParameter("fontName");
        fz = getParameter("fontSize");
        l = getParameter("leading");
        ac = getParameter("accountEnabled");
    }

    public void paint(Graphics g) {
        g.drawString("fontName" + fn, 10, 10);
        g.drawString("fontSize" + fz, 10, 30);
        g.drawString("leading" + l, 10, 50);
        g.drawString("accountEnabled" + ac, 10, 70);
    }
}