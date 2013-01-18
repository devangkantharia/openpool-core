package openpool;
import java.util.ArrayList;
import java.util.Iterator;

class BallSystem
{
  ArrayList<Ball> balls;

  BallSystem()
  {
    int i=0;
    balls = new ArrayList<Ball>();
    return;
  }
  void addBall(int _x, int _y, int _realr, int _R, int _RINGNUM)
  {
    Ball ball = new Ball(_x, _y, _realr, _R, _RINGNUM);
    balls.add(ball);
  }

  void clearBall()
  {
    int id =0;
    balls.clear();
  }
  void draw(OpenPool op)
  {
    Iterator<Ball> iter = balls.iterator();
    while (iter.hasNext ())
    {
      Ball ball = (Ball)iter.next();
      ball.draw(op);
    }
  }
}
