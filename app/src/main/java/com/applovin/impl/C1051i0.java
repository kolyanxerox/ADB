package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinMediationProvider;

/* renamed from: com.applovin.impl.i0 */
/* loaded from: classes.dex */
public class C1051i0 extends View {

    /* renamed from: w */
    private static final int f866w = Color.rgb(66, 145, 241);

    /* renamed from: x */
    private static final int f867x = Color.rgb(66, 145, 241);

    /* renamed from: y */
    private static final int f868y = Color.rgb(66, 145, 241);

    /* renamed from: a */
    private Paint f869a;

    /* renamed from: b */
    private Paint f870b;

    /* renamed from: c */
    protected Paint f871c;

    /* renamed from: d */
    protected Paint f872d;

    /* renamed from: e */
    private RectF f873e;

    /* renamed from: f */
    private float f874f;

    /* renamed from: g */
    private int f875g;

    /* renamed from: h */
    private int f876h;

    /* renamed from: i */
    private int f877i;

    /* renamed from: j */
    private int f878j;

    /* renamed from: k */
    private int f879k;

    /* renamed from: l */
    private float f880l;

    /* renamed from: m */
    private int f881m;

    /* renamed from: n */
    private String f882n;

    /* renamed from: o */
    private String f883o;

    /* renamed from: p */
    private float f884p;

    /* renamed from: q */
    private String f885q;

    /* renamed from: r */
    private float f886r;

    /* renamed from: s */
    private final float f887s;

    /* renamed from: t */
    private final float f888t;

    /* renamed from: u */
    private final float f889u;

    /* renamed from: v */
    private final int f890v;

    /* renamed from: com.applovin.impl.i0$a */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static float m965c(Resources resources, float f) {
            return (f * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static float m966d(Resources resources, float f) {
            return f * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public C1051i0(Context context) {
        this(context, null);
    }

    private float getProgressAngle() {
        return (getProgress() / this.f878j) * 360.0f;
    }

    /* renamed from: a */
    public void m961a() {
        this.f879k = f866w;
        this.f875g = f867x;
        this.f874f = this.f888t;
        setMax(100);
        setProgress(0);
        this.f880l = this.f887s;
        this.f881m = 0;
        this.f884p = this.f889u;
        this.f876h = f868y;
    }

    /* renamed from: b */
    public void m962b() {
        TextPaint textPaint = new TextPaint();
        this.f871c = textPaint;
        textPaint.setColor(this.f875g);
        this.f871c.setTextSize(this.f874f);
        this.f871c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f872d = textPaint2;
        textPaint2.setColor(this.f876h);
        this.f872d.setTextSize(this.f884p);
        this.f872d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f869a = paint;
        paint.setColor(this.f879k);
        this.f869a.setStyle(Paint.Style.STROKE);
        this.f869a.setAntiAlias(true);
        this.f869a.setStrokeWidth(this.f880l);
        Paint paint2 = new Paint();
        this.f870b = paint2;
        paint2.setColor(this.f881m);
        this.f870b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.f879k;
    }

    public float getFinishedStrokeWidth() {
        return this.f880l;
    }

    public int getInnerBackgroundColor() {
        return this.f881m;
    }

    public String getInnerBottomText() {
        return this.f885q;
    }

    public int getInnerBottomTextColor() {
        return this.f876h;
    }

    public float getInnerBottomTextSize() {
        return this.f884p;
    }

    public int getMax() {
        return this.f878j;
    }

    public String getPrefixText() {
        return this.f882n;
    }

    public int getProgress() {
        return this.f877i;
    }

    public String getSuffixText() {
        return this.f883o;
    }

    public int getTextColor() {
        return this.f875g;
    }

    public float getTextSize() {
        return this.f874f;
    }

    @Override // android.view.View
    public void invalidate() {
        m962b();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f880l;
        this.f873e.set(f, f, getWidth() - f, getHeight() - f);
        float width = getWidth();
        float f2 = this.f880l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f2) + f2) / 2.0f, this.f870b);
        canvas.drawArc(this.f873e, 270.0f, -getProgressAngle(), false, this.f869a);
        String str = this.f882n + this.f877i + this.f883o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f871c.measureText(str)) / 2.0f, (getWidth() - (this.f871c.ascent() + this.f871c.descent())) / 2.0f, this.f871c);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.f872d.setTextSize(this.f884p);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.f872d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f886r) - ((this.f871c.ascent() + this.f871c.descent()) / 2.0f), this.f872d);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m960a(i), m960a(i2));
        this.f886r = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f875g = bundle.getInt("text_color");
        this.f874f = bundle.getFloat("text_size");
        this.f884p = bundle.getFloat("inner_bottom_text_size");
        this.f885q = bundle.getString("inner_bottom_text");
        this.f876h = bundle.getInt("inner_bottom_text_color");
        this.f879k = bundle.getInt("finished_stroke_color");
        this.f880l = bundle.getFloat("finished_stroke_width");
        this.f881m = bundle.getInt("inner_background_color");
        m962b();
        setMax(bundle.getInt(AppLovinMediationProvider.MAX));
        setProgress(bundle.getInt(NotificationCompat.CATEGORY_PROGRESS));
        this.f882n = bundle.getString("prefix");
        this.f883o = bundle.getString("suffix");
        super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt(AppLovinMediationProvider.MAX, getMax());
        bundle.putInt(NotificationCompat.CATEGORY_PROGRESS, getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i) {
        this.f879k = i;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f) {
        this.f880l = f;
        invalidate();
    }

    public void setInnerBackgroundColor(int i) {
        this.f881m = i;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f885q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i) {
        this.f876h = i;
        invalidate();
    }

    public void setInnerBottomTextSize(float f) {
        this.f884p = f;
        invalidate();
    }

    public void setMax(int i) {
        if (i > 0) {
            this.f878j = i;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f882n = str;
        invalidate();
    }

    public void setProgress(int i) {
        this.f877i = i;
        if (i > getMax()) {
            this.f877i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f883o = str;
        invalidate();
    }

    public void setTextColor(int i) {
        this.f875g = i;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f874f = f;
        invalidate();
    }

    public C1051i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1051i0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f873e = new RectF();
        this.f877i = 0;
        this.f882n = "";
        this.f883o = "";
        this.f885q = "";
        this.f888t = a.m966d(getResources(), 14.0f);
        this.f890v = (int) a.m965c(getResources(), 100.0f);
        this.f887s = a.m965c(getResources(), 4.0f);
        this.f889u = a.m966d(getResources(), 18.0f);
        m961a();
        m962b();
    }

    /* renamed from: a */
    private int m960a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int i2 = this.f890v;
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }
}
