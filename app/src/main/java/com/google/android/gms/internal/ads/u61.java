package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public final /* synthetic */ class u61 implements Runnable {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f24570OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ o00O0O f24571OooOo0o;

    public /* synthetic */ u61(o00O0O o00o0o, int i, long j, long j2) {
        this.f24570OooOo0O = 2;
        this.f24571OooOo0o = o00o0o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00O0O o00o0o = this.f24571OooOo0o;
        int i = this.f24570OooOo0O;
        o00o0o.getClass();
        switch (i) {
            case 0:
                int i2 = i80.f19994OooO00o;
                h61 h61Var = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                h61Var.OooO(h61Var.OooOO0o(), 1007, new qv0(26));
                break;
            case 1:
                int i3 = i80.f19994OooO00o;
                h61 h61Var2 = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                h61Var2.OooO(h61Var2.OooOO0o(), 1010, new f61(8));
                break;
            case 2:
                int i4 = i80.f19994OooO00o;
                h61 h61Var3 = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                h61Var3.OooO(h61Var3.OooOO0o(), 1011, new f61(6));
                break;
            case 3:
                int i5 = i80.f19994OooO00o;
                h61 h61Var4 = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                h61Var4.OooO(h61Var4.OooOO0o(), IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, new f61(22));
                break;
            case 4:
                int i6 = i80.f19994OooO00o;
                h61 h61Var5 = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                h61Var5.OooO(h61Var5.OooOO0o(), IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, new f61(27));
                break;
            case 5:
                int i7 = i80.f19994OooO00o;
                h61 h61Var6 = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                h61Var6.OooO(h61Var6.OooOO0o(), IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new f61(25));
                break;
            case 6:
                int i8 = i80.f19994OooO00o;
                h61 h61Var7 = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                h61Var7.OooO(h61Var7.OooOO0o(), 1014, new f61(28));
                break;
            case 7:
                int i9 = i80.f19994OooO00o;
                h61 h61Var8 = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                h61Var8.OooO(h61Var8.OooOO0o(), 1008, new f61(11));
                break;
            default:
                int i10 = i80.f19994OooO00o;
                h61 h61Var9 = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                h61Var9.OooO(h61Var9.OooOO0o(), PointerIconCompat.TYPE_NO_DROP, new qv0(28));
                break;
        }
    }

    public /* synthetic */ u61(o00O0O o00o0o, long j) {
        this.f24570OooOo0O = 1;
        this.f24571OooOo0o = o00o0o;
    }

    public /* synthetic */ u61(o00O0O o00o0o, Object obj, int i) {
        this.f24570OooOo0O = i;
        this.f24571OooOo0o = o00o0o;
    }

    public /* synthetic */ u61(o00O0O o00o0o, String str, long j, long j2) {
        this.f24570OooOo0O = 7;
        this.f24571OooOo0o = o00o0o;
    }
}
