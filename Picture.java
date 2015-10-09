/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle suelo;
    private Person persona;
    private Circle sun2;
    private Person persona2;
    private Person persona3;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        suelo = new Circle();
        suelo.changeColor("green");
        suelo.moveHorizontal(-350);
        suelo.moveVertical(150);
        suelo.changeSize(700);
        suelo.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        persona = new Person();
        persona.moveHorizontal(-300);
        persona.makeVisible();
        
        sun2 = new Circle();
        sun2.changeColor("blue");
        sun2.moveHorizontal(-200);
        sun2.moveVertical(-30);
        sun2.changeSize(70);
       
        
        persona2 = new Person();
        persona2.moveHorizontal(-150);
        
        persona3 = new Person();
        persona3.moveHorizontal(120);
        
        
        
      
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    
     /**
     * Change the sun up-down
     */
    public void movesun()
    {  
        sun.slowMoveVertical(70);
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        suelo.changeColor("black");
        
    }
    
    /**
     * Persona goes to the house
     */
    public void moveperson()
    {
        persona.slowMoveHorizontal(160);
        
    }
     /**
     * aparecen figuras
     */
    public void crearfiguras()
    {
        sun2.makeVisible();
        persona2.makeVisible();
        persona3.makeVisible();
        
    }
    
     /**
     * Desaparecen figuras
     */
    public void desaparecerfiguras()
    {
        sun2.slowMoveVertical(-140);
        persona2.slowMoveHorizontal(-250);
        persona3.slowMoveHorizontal(300);
        
        
    }
        
}
