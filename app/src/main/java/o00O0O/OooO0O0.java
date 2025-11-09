package o00O0O;

import android.util.Property;

/* loaded from: classes2.dex */
public final class OooO0O0 extends Property {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0O0 f31308OooO00o = new OooO0O0(OooO0o.class, "circularReveal");

    @Override // android.util.Property
    public final Object get(Object obj) {
        return ((OooO) obj).getRevealInfo();
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((OooO) obj).setRevealInfo((OooO0o) obj2);
    }
}
