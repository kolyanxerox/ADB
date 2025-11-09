package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class oO0Oo0oo implements oO0OOO00 {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final oO0Oo0oo f26758OooOo0o = new oO0Oo0oo(0);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f26759OooOo0O;

    public /* synthetic */ oO0Oo0oo(int i) {
        this.f26759OooOo0O = i;
    }

    public static final oO00o000 OooO0OO(Object obj, Object obj2) {
        oO00o000 oo00o000OooO00o = (oO00o000) obj;
        oO00o000 oo00o000 = (oO00o000) obj2;
        if (!oo00o000.isEmpty()) {
            if (!oo00o000OooO00o.f26718OooOo0O) {
                oo00o000OooO00o = oo00o000OooO00o.OooO00o();
            }
            oo00o000OooO00o.OooO0OO();
            if (!oo00o000.isEmpty()) {
                oo00o000OooO00o.putAll(oo00o000);
            }
        }
        return oo00o000OooO00o;
    }

    @Override // com.google.android.gms.internal.measurement.oO0OOO00
    public boolean OooO00o(Class cls) {
        switch (this.f26759OooOo0O) {
            case 0:
                return ooOOOOoo.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.oO0OOO00
    public oOo000o0 OooO0O0(Class cls) {
        switch (this.f26759OooOo0O) {
            case 0:
                if (!ooOOOOoo.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (oOo000o0) ooOOOOoo.OooOO0o(cls.asSubclass(ooOOOOoo.class)).OooOOOO(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
