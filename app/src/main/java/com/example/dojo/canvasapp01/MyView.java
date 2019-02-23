package com.example.dojo.canvasapp01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;



//コンストラクタ（初期設定）
public class MyView extends View{
private Paint paint;

    public MyView(Context con) {
        super(con);

        paint = new Paint();
    }

//描画の処理
    @Override
    protected void dispatchDraw(Canvas canvas) {

        //背景
        canvas
        .drawColor(Color.GREEN);
        //円
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        canvas.drawCircle(300, 500, 50,paint);
        paint.setColor(Color.CYAN);
        canvas.drawCircle(300, 600, 50,paint);

        //　四角形
        paint.setColor(Color.DKGRAY);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(400,800,600,1000,paint);
    }
}
