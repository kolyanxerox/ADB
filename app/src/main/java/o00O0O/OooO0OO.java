package o00O0O;

import android.util.Property;

/* loaded from: classes2.dex */
public final class OooO0OO extends Property {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0OO f31309OooO00o = new OooO0OO(Integer.class, "circularRevealScrimColor");

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Integer.valueOf(((OooO) obj).getCircularRevealScrimColor());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((OooO) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
    }
}
