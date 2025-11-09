package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class o0O000o0 implements o0O0OOOo {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o0O000o0 f27089OooO0O0 = new o0O000o0(0);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f27090OooO00o;

    public /* synthetic */ o0O000o0(int i) {
        this.f27090OooO00o = i;
    }

    public static final o0O0OO0 OooO0OO(Object obj, Object obj2) {
        o0O0OO0 o0o0oo0 = (o0O0OO0) obj;
        o0O0OO0 o0o0oo02 = (o0O0OO0) obj2;
        if (!o0o0oo02.isEmpty()) {
            if (!o0o0oo0.f27111OooOo0O) {
                if (o0o0oo0.isEmpty()) {
                    o0o0oo0 = new o0O0OO0();
                } else {
                    o0O0OO0 o0o0oo03 = new o0O0OO0(o0o0oo0);
                    o0o0oo03.f27111OooOo0O = true;
                    o0o0oo0 = o0o0oo03;
                }
            }
            o0o0oo0.OooO0O0();
            if (!o0o0oo02.isEmpty()) {
                o0o0oo0.putAll(o0o0oo02);
            }
        }
        return o0o0oo0;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O0OOOo
    public o0OO000 OooO00o(Class cls) {
        switch (this.f27090OooO00o) {
            case 0:
                if (!o0OoO00O.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (o0OO000) o0OoO00O.OooO0oo(cls.asSubclass(o0OoO00O.class)).OooO0Oo(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o0O0OOOo
    public boolean OooO0O0(Class cls) {
        switch (this.f27090OooO00o) {
            case 0:
                return o0OoO00O.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
