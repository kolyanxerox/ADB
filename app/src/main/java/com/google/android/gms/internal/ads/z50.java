package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;

/* loaded from: classes2.dex */
public final /* synthetic */ class z50 implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ View f26090OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f26091OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ yg0 f26092OooOo0o;

    public /* synthetic */ z50(yg0 yg0Var, View view, int i) {
        this.f26091OooOo0O = i;
        this.f26092OooOo0o = yg0Var;
        this.f26090OooOo = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26091OooOo0O) {
            case 0:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0oo0)).booleanValue() && ze0.f26157OooO0Oo.f29577OooOo0o) {
                    ah0 ah0Var = ah0.f17039OooOo0O;
                    yg0 yg0Var = this.f26092OooOo0o;
                    if (!yg0Var.f25910OooO0o) {
                        yg0Var.f25907OooO0O0.OooO00o(this.f26090OooOo, ah0Var);
                        break;
                    }
                }
                break;
            default:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0oo0)).booleanValue() && ze0.f26157OooO0Oo.f29577OooOo0o) {
                    this.f26092OooOo0o.OooO0O0(this.f26090OooOo);
                    break;
                }
                break;
        }
    }
}
