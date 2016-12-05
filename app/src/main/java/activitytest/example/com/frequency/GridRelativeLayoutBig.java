package activitytest.example.com.frequency;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by Administrator on 2016/11/20.
 */

public class GridRelativeLayoutBig extends RelativeLayout {
    private Canvas myCavans;
    private int horGrid = 100;
    private int verGrid = 100;
    private int screenW, screenH;


    public GridRelativeLayoutBig(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public GridRelativeLayoutBig(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
    }

    public GridRelativeLayoutBig(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setWillNotDraw(false);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        screenW = 2300;
        screenH = 1200;
        super.onDraw(canvas);
        this.myCavans = canvas;
        Paint paint = new Paint();
        paint.setColor(Color.GRAY);
        paint.setStrokeWidth(3);
        int verNum = (int) (screenH / verGrid) + 1;
        int horNum = (int) (screenW / horGrid) + 1;


        for (int i = 0; i < verNum; i++) {
            canvas.drawLine(0, i * verGrid-1 , screenW, i * verGrid-1 , paint);
        }
        for (int i = 0; i < horNum; i++) {
            canvas.drawLine(i * horGrid-1 ,0, i * horGrid , screenH-1, paint);
        }

    }
}
