package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.ads.pz0;
import com.unity3d.services.core.fid.Constants;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class o0000O00 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o00Ooo f28076OooO0O0 = new o00Ooo(1);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f28077OooO00o;

    public o0000O00(OooOo00 oooOo00) {
        oo0o0Oo.OooO00o(oooOo00, "output");
        this.f28077OooO00o = oooOo00;
        oooOo00.f28037OooO0OO = this;
    }

    public void OooO00o(int i, OooOOO0 oooOOO0) throws pz0 {
        OooOo00 oooOo00 = (OooOo00) this.f28077OooO00o;
        oooOo00.Oooo00o(i, 2);
        oooOo00.Oooo0(oooOOO0.size());
        OooOO0O oooOO0O = (OooOO0O) oooOOO0;
        oooOo00.OooOoo0(oooOO0O.f28016OooOoO0, oooOO0O.OooOO0O(), oooOO0O.size());
    }

    public void OooO0O0(int i, Object obj, o000O0O0 o000o0o02) throws pz0 {
        OooOo00 oooOo00 = (OooOo00) this.f28077OooO00o;
        oooOo00.Oooo00o(i, 3);
        o000o0o02.OooO0O0((OooO00o) obj, oooOo00.f28037OooO0OO);
        oooOo00.Oooo00o(i, 4);
    }

    public void OooO0OO(int i, Object obj, o000O0O0 o000o0o02) throws pz0 {
        OooO00o oooO00o = (OooO00o) obj;
        OooOo00 oooOo00 = (OooOo00) this.f28077OooO00o;
        oooOo00.Oooo00o(i, 2);
        oooOo00.Oooo0(oooO00o.OooO00o(o000o0o02));
        o000o0o02.OooO0O0(oooO00o, oooOo00.f28037OooO0OO);
    }

    public o0000O00() {
        o000OO o000oo2;
        try {
            o000oo2 = (o000OO) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            o000oo2 = f28076OooO0O0;
        }
        o000OO[] o000ooArr = {o00Ooo.f28118OooO0O0, o000oo2};
        o0000 o0000Var = new o0000();
        o0000Var.f28059OooO00o = o000ooArr;
        Charset charset = oo0o0Oo.f28134OooO00o;
        this.f28077OooO00o = o0000Var;
    }
}
