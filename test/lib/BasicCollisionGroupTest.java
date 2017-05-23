/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;
import java.awt.image.BufferedImage;
//import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duke
 */
public class BasicCollisionGroupTest {

    
    public class TestSprite extends Sprite{
        public TestSprite(){
            super();
        }
        
        public float getWidh(){
            return 10;
        }
        
        public float getHight(){
            return 10;
        }

        private void setLocation(int i, int j) {
        }
    }
    
    TestSprite a;
    TestSprite b;
    BufferedImage img ;
    public BasicCollisionGroupTest() {
        a = new TestSprite();
        b = new TestSprite();
    }
    
    
    @Before
    public void setUp() {
    }
    
    
    @Test
    public void testNull(){
        BasicCollisionGroup instance = new BasicCollisionGroupImpl();
        //assertFalse(instance.isCollided(a,b));
        instance.collided(a, a);
    }
    /**
     * Test of checkCollision method, of class BasicCollisionGroup.
     *///BasicCollisionGroup instance = new BasicCollisionGroupImpl();
   
    @Test
    public void testAtSamePosition(){
        a.setLocation(5,10);
        b.setLocation(5,10);
        BasicCollisionGroup instance = new BasicCollisionGroupImpl();
        //assertFalse(instance.isCollided(a,b));
    }
    

    public class BasicCollisionGroupImpl extends BasicCollisionGroup{
        public boolean testIsCollided(Sprite a, Sprite b)
        {
            return true;
        }
        
        public void collided(Sprite sprite, Sprite sprite1){
            
        }
    }
}
