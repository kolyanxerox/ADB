package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.applovin.impl.adview.AbstractC0970e;

/* renamed from: com.applovin.impl.adview.j */
/* loaded from: classes.dex */
public final class C0975j extends AbstractC0970e {

    /* renamed from: e */
    private static final Paint f317e = new Paint(1);

    /* renamed from: f */
    private static final Paint f318f = new Paint(1);

    /* renamed from: c */
    private final float[] f319c;

    /* renamed from: d */
    private Path f320d;

    public C0975j(Context context) {
        super(context);
        this.f319c = new float[]{30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};
        f317e.setARGB(80, 0, 0, 0);
        Paint paint = f318f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.AbstractC0970e
    /* renamed from: a */
    public void mo275a(int i) {
        setViewScale(i / 30.0f);
        m293a();
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getStrokeWidth() {
        return this.f297a * 2.0f;
    }

    @Override // com.applovin.impl.adview.AbstractC0970e
    public AbstractC0970e.a getStyle() {
        return AbstractC0970e.a.TRANSPARENT_SKIP;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f317e);
        Paint paint = f318f;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f320d, paint);
    }

    /* renamed from: a */
    private void m293a() {
        int i = 0;
        while (true) {
            float[] fArr = this.f319c;
            if (i < fArr.length) {
                fArr[i] = fArr[i] * 0.3f * this.f297a;
                i++;
            } else {
                Path path = new Path();
                this.f320d = path;
                float[] fArr2 = this.f319c;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f320d;
                float[] fArr3 = this.f319c;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f320d;
                float[] fArr4 = this.f319c;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f320d;
                float[] fArr5 = this.f319c;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f320d;
                float[] fArr6 = this.f319c;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f320d;
                float[] fArr7 = this.f319c;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
        }
    }
}
