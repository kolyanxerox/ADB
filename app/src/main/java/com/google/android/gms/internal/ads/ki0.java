package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class ki0 {

    /* renamed from: OooO00o */
    public final Context f20609OooO00o;

    /* renamed from: OooO0O0 */
    public final Looper f20610OooO0O0;

    public ki0(Context context, Looper looper) {
        this.f20609OooO00o = context;
        this.f20610OooO0O0 = looper;
    }

    public final void OooO00o(String str) {
        ti0 ti0VarOooOo0o = ui0.OooOo0o();
        String packageName = this.f20609OooO00o.getPackageName();
        ti0VarOooOo0o.OooO0Oo();
        ui0.OooOo((ui0) ti0VarOooOo0o.f25822OooOo0o, packageName);
        ti0VarOooOo0o.OooO0Oo();
        ui0.OooOoO((ui0) ti0VarOooOo0o.f25822OooOo0o);
        ri0 ri0VarOooOo0o = si0.OooOo0o();
        ri0VarOooOo0o.OooO0Oo();
        si0.OooOo((si0) ri0VarOooOo0o.f25822OooOo0o, str);
        ri0VarOooOo0o.OooO0Oo();
        si0.OooOoO0((si0) ri0VarOooOo0o.f25822OooOo0o);
        ti0VarOooOo0o.OooO0Oo();
        ui0.OooOoO0((ui0) ti0VarOooOo0o.f25822OooOo0o, (si0) ri0VarOooOo0o.OooO0O0());
        li0 li0Var = new li0(this.f20609OooO00o, this.f20610OooO0O0, (ui0) ti0VarOooOo0o.OooO0O0());
        synchronized (li0Var.f20897OooOoOO) {
            try {
                if (!li0Var.f20894OooOo0o) {
                    li0Var.f20894OooOo0o = true;
                    ((yi0) li0Var.f20896OooOoO0).checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
