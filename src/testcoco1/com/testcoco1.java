package testcoco1.com;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.opengl.CCGLSurfaceView;

import android.app.Activity;
import android.os.Bundle;

public class testcoco1 extends Activity {
    /** Called when the activity is first created. */
    private CCGLSurfaceView mGLSurfaceView;
	private MyLayer1 layer1;
	private CCScene scene1;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        
        this.mGLSurfaceView=new CCGLSurfaceView(this);
        CCDirector director=CCDirector.sharedDirector();
        director.attachInView(this.mGLSurfaceView);
        this.setContentView(this.mGLSurfaceView);
        
        director.setDisplayFPS(true);
        director.setAnimationInterval(1/60.0);
    
        this.scene1=CCScene.node();
        this.layer1=new MyLayer1();
        this.scene1.addChild(layer1);
        director.runWithScene(scene1);
	}
}