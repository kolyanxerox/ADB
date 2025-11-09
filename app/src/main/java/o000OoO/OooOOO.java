package o000OOo;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public final class OooOOO {

    /* renamed from: OooO, reason: collision with root package name */
    public static final int[] f30255OooO = new int[3];

    /* renamed from: OooOO0, reason: collision with root package name */
    public static final float[] f30256OooOO0 = {0.0f, 0.5f, 1.0f};

    /* renamed from: OooOO0O, reason: collision with root package name */
    public static final int[] f30257OooOO0O = new int[4];
    public static final float[] OooOO0o = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Paint f30258OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Paint f30259OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Paint f30260OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f30261OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f30262OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f30263OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final Path f30264OooO0oO = new Path();

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final Paint f30265OooO0oo;

    public OooOOO() {
        Paint paint = new Paint();
        this.f30265OooO0oo = paint;
        this.f30258OooO00o = new Paint();
        OooO00o(ViewCompat.MEASURED_STATE_MASK);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f30259OooO0O0 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f30260OooO0OO = new Paint(paint2);
    }

    public final void OooO00o(int i) {
        this.f30261OooO0Oo = ColorUtils.setAlphaComponent(i, 68);
        this.f30263OooO0o0 = ColorUtils.setAlphaComponent(i, 20);
        this.f30262OooO0o = ColorUtils.setAlphaComponent(i, 0);
        this.f30258OooO00o.setColor(this.f30261OooO0Oo);
    }
}
