package testcoco1.com;

import org.cocos2d.actions.interval.CCJumpTo;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;

import android.view.MotionEvent;

public class MyLayer1 extends CCLayer {

	private CCSprite sprite1;
	public MyLayer1()
	{
		this.sprite1=CCSprite.sprite("icon.png");
		this.addChild(this.sprite1);	
		this.setIsTouchEnabled(true);
		this.sprite1.setPosition(CGPoint.ccp(150, 150));
	}
	@Override
	public boolean ccTouchesBegan(MotionEvent event) {
		// TODO Auto-generated method stub
		CGPoint previousPosition=this.sprite1.getPosition();
		CGPoint cp=CGPoint.ccp(event.getX(), event.getY());
		cp=CCDirector.sharedDirector().convertToGL(cp);
		CCJumpTo jump=CCJumpTo.action(1, CGPoint.ccp(150, 150), 100, 1);
		this.sprite1.runAction(jump);
		
		return super.ccTouchesBegan(event);
	}
	@Override
	public boolean ccTouchesCancelled(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.ccTouchesCancelled(event);
	}
	@Override
	public boolean ccTouchesEnded(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.ccTouchesEnded(event);
	}
	
}
