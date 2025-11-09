package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public final /* synthetic */ class Oooo000 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f16858OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00O0O f16859OooOo0o;

    public /* synthetic */ Oooo000(o00O0O o00o0o, long j, int i) {
        this.f16858OooOo0O = 1;
        this.f16859OooOo0o = o00o0o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00O0O o00o0o = this.f16859OooOo0o;
        int i = this.f16858OooOo0O;
        o00o0o.getClass();
        switch (i) {
            case 0:
                int i2 = i80.f19994OooO00o;
                h61 h61Var = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                h61Var.OooO(h61Var.OooOO0o(), 1016, new f61(26));
                break;
            case 1:
                int i3 = i80.f19994OooO00o;
                h61 h61Var2 = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                h61Var2.OooO(h61Var2.OooOO0((h91) h61Var2.f19577OooO0Oo.f23978OooOoO), 1021, new f61(18));
                break;
            case 2:
                int i4 = i80.f19994OooO00o;
                h61 h61Var3 = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                h61Var3.OooO(h61Var3.OooOO0o(), IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new f61(5));
                break;
            case 3:
                int i5 = i80.f19994OooO00o;
                h61 h61Var4 = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                h61Var4.OooO(h61Var4.OooOO0o(), 1015, new f61(24));
                break;
            default:
                int i6 = i80.f19994OooO00o;
                h61 h61Var5 = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                h61Var5.OooO(h61Var5.OooOO0o(), 1019, new f61(13));
                break;
        }
    }

    public /* synthetic */ Oooo000(o00O0O o00o0o, Object obj, int i) {
        this.f16858OooOo0O = i;
        this.f16859OooOo0o = o00o0o;
    }

    public /* synthetic */ Oooo000(o00O0O o00o0o, String str, long j, long j2) {
        this.f16858OooOo0O = 0;
        this.f16859OooOo0o = o00o0o;
    }
}
