package o0000oo0;

import OooOo.OooOO0;
import o0000O.OooOo00;
import o000Oo00.OooOOO;
import o000Oo00.OooOOO0;

/* loaded from: classes2.dex */
public final class o00000O0 implements OooOOO {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final OooOo00 f29660OooO0OO = new OooOo00(10);

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0ooOOo f29661OooO0Oo = new o0ooOOo(1);

    /* renamed from: OooO00o, reason: collision with root package name */
    public OooOOO0 f29662OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public volatile OooOOO f29663OooO0O0;

    public o00000O0(OooOo00 oooOo00, OooOOO oooOOO) {
        this.f29662OooO00o = oooOo00;
        this.f29663OooO0O0 = oooOOO;
    }

    public final void OooO00o(OooOOO0 oooOOO0) {
        OooOOO oooOOO;
        OooOOO oooOOO2;
        OooOOO oooOOO3 = this.f29663OooO0O0;
        o0ooOOo o0ooooo = f29661OooO0Oo;
        if (oooOOO3 != o0ooooo) {
            oooOOO0.OooO00o(oooOOO3);
            return;
        }
        synchronized (this) {
            oooOOO = this.f29663OooO0O0;
            if (oooOOO != o0ooooo) {
                oooOOO2 = oooOOO;
            } else {
                this.f29662OooO00o = new OooOO0(8, this.f29662OooO00o, oooOOO0);
                oooOOO2 = null;
            }
        }
        if (oooOOO2 != null) {
            oooOOO0.OooO00o(oooOOO);
        }
    }

    @Override // o000Oo00.OooOOO
    public final Object get() {
        return this.f29663OooO0O0.get();
    }
}
