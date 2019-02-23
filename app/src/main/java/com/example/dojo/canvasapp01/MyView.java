package com.example.dojo.canvasapp01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;



//コンストラクタ（初期設定）
public class MyView extends View{
private Paint paint;
private Path path;


    public MyView(Context con) {
        super(con);

        paint = new Paint();
        path =new Path();
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
        //線を描く
        paint.setColor(Color.GRAY);
        paint.setStrokeWidth(45);
        canvas.drawLine(0,0,canvas.getWidth(),canvas.getHeight(),paint);
        canvas.drawLine(0,canvas.getHeight(),canvas.getWidth(),0,paint);

        //三角
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(500,500);
        path.lineTo(700,900);
        path.lineTo(800,400);
        path.lineTo(500,500);
        canvas.drawPath(path,paint);

        paint.setColor(Color.DKGRAY);
        path.reset();
        path.moveTo(300,1000);
        path.lineTo(700,1100);
        path.lineTo(200,1200);
        path.lineTo(300,1000);
        canvas.drawPath(path,paint);

    }
}
