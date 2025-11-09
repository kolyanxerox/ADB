package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.pz0;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class o0O0O0o0 implements o0O0OOOo {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o0O000o0 f27108OooO0O0 = new o0O000o0(3);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f27109OooO00o;

    public o0O0O0o0(o0O0OOOo... o0o0ooooArr) {
        this.f27109OooO00o = o0o0ooooArr;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O0OOOo
    public o0OO000 OooO00o(Class cls) {
        for (int i = 0; i < 2; i++) {
            o0O0OOOo o0o0oooo = ((o0O0OOOo[]) this.f27109OooO00o)[i];
            if (o0o0oooo.OooO0O0(cls)) {
                return o0o0oooo.OooO00o(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.o0O0OOOo
    public boolean OooO0O0(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((o0O0OOOo[]) this.f27109OooO00o)[i].OooO0O0(cls)) {
                return true;
            }
        }
        return false;
    }

    public void OooO0OO(int i, Object obj, o0OO000o o0oo000o) throws pz0 {
        o0O0000O o0o0000o = (o0O0000O) this.f27109OooO00o;
        o0o0000o.OoooOOo(i, 3);
        o0oo000o.OooO0oO((o0O00o0) obj, o0o0000o.f27084OooOo0o);
        o0o0000o.OoooOOo(i, 4);
    }

    public void OooO0Oo(int i, Object obj, o0OO000o o0oo000o) throws pz0 {
        o0O00o0 o0o00o0 = (o0O00o0) obj;
        o0O0000O o0o0000o = (o0O0000O) this.f27109OooO00o;
        o0o0000o.OoooOoO((i << 3) | 2);
        o0o0000o.OoooOoO(o0o00o0.OooO00o(o0oo000o));
        o0oo000o.OooO0oO(o0o00o0, o0o0000o.f27084OooOo0o);
    }

    public o0O0O0o0() {
        o0O0oo00 o0o0oo00 = o0O0oo00.f27130OooO0OO;
        o0O0O0o0 o0o0o0o0 = new o0O0O0o0(o0O000o0.f27089OooO0O0, f27108OooO0O0);
        Charset charset = o0oO0Ooo.f27160OooO00o;
        this.f27109OooO00o = o0o0o0o0;
    }

    public o0O0O0o0(o0O0000O o0o0000o) {
        Charset charset = o0oO0Ooo.f27160OooO00o;
        this.f27109OooO00o = o0o0000o;
        o0o0000o.f27084OooOo0o = this;
    }
}
