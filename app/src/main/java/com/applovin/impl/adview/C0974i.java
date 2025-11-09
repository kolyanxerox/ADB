package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.AbstractC0970e;

/* renamed from: com.applovin.impl.adview.i */
/* loaded from: classes.dex */
public final class C0974i extends AbstractC0970e {

    /* renamed from: c */
    private static final Paint f315c = new Paint(1);

    /* renamed from: d */
    private static final Paint f316d = new Paint(1);

    public C0974i(Context context) {
        super(context);
        f315c.setARGB(80, 0, 0, 0);
        Paint paint = f316d;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.AbstractC0970e
    /* renamed from: a */
    public void mo275a(int i) {
        setViewScale(i / 30.0f);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getCrossOffset() {
        return this.f297a * 8.0f;
    }

    public float getStrokeWidth() {
        return this.f297a * 2.0f;
    }

    @Override // com.applovin.impl.adview.AbstractC0970e
    public AbstractC0970e.a getStyle() {
        return AbstractC0970e.a.WHITE_ON_TRANSPARENT;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f315c);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f316d;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
