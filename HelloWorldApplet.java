import java.applet.Applet;

public class HelloWorldApplet extends Applet {
    @Override
    public void init() {
        // Initialization code for the applet
        System.out.println("Hello, World! Applet initialized.");
    }

    @Override
    public void start() {
        // Code to execute when the applet starts
        System.out.println("Applet started.");
    }

    @Override
    public void stop() {
        // Code to execute when the applet stops
        System.out.println("Applet stopped.");
    }

    @Override
    public void destroy() {
        // Cleanup code for the applet
        System.out.println("Applet destroyed.");
    }

    @Override
    public void paint(java.awt.Graphics g) {
        // Code to draw on the applet
        g.drawString("Hello, Applet!", 20, 20);
        System.out.println("Applet painted.");
    }
}
