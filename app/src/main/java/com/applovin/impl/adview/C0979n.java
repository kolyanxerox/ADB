package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.AbstractC0970e;

/* renamed from: com.applovin.impl.adview.n */
/* loaded from: classes.dex */
public final class C0979n extends AbstractC0970e {

    /* renamed from: c */
    private static final Paint f325c = new Paint(1);

    /* renamed from: d */
    private static final Paint f326d = new Paint(1);

    /* renamed from: e */
    private static final Paint f327e = new Paint(1);

    public C0979n(Context context) {
        super(context);
        f325c.setColor(-1);
        f326d.setColor(ViewCompat.MEASURED_STATE_MASK);
        Paint paint = f327e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getCrossOffset() {
        return this.f297a * 10.0f;
    }

    public float getInnerCircleOffset() {
        return this.f297a * 2.0f;
    }

    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    public float getStrokeWidth() {
        return this.f297a * 3.0f;
    }

    @Override // com.applovin.impl.adview.AbstractC0970e
    public AbstractC0970e.a getStyle() {
        return AbstractC0970e.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f325c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f326d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f327e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
