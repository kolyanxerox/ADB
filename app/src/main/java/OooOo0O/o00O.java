package Ooooo0o;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class o00O extends Property {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o00O f15004OooO00o;

    static {
        o00O o00o = new o00O(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
        f15004OooO00o = o00o;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Integer.valueOf(((Drawable) obj).getAlpha());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((Drawable) obj).setAlpha(((Integer) obj2).intValue());
    }
}
