package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class e60 {

    /* renamed from: OooO00o */
    public final Context f18501OooO00o;

    /* renamed from: OooO0O0 */
    public final VersionInfoParcel f18502OooO0O0;

    /* renamed from: OooO0OO */
    public final kd0 f18503OooO0OO;

    /* renamed from: OooO0Oo */
    public final InterfaceC1722jo f18504OooO0Oo;

    /* renamed from: OooO0o */
    public dh0 f18505OooO0o;

    /* renamed from: OooO0o0 */
    public final h20 f18506OooO0o0;

    public e60(Context context, VersionInfoParcel versionInfoParcel, kd0 kd0Var, InterfaceC1722jo interfaceC1722jo, h20 h20Var) {
        this.f18501OooO00o = context;
        this.f18502OooO0O0 = versionInfoParcel;
        this.f18503OooO0OO = kd0Var;
        this.f18504OooO0Oo = interfaceC1722jo;
        this.f18506OooO0o0 = h20Var;
    }

    public final synchronized void OooO00o(View view) {
        dh0 dh0Var = this.f18505OooO0o;
        if (dh0Var != null) {
            ((C1658hx) zzv.zzB()).getClass();
            C1658hx.OooOOOo(new wp0(29, dh0Var, view));
        }
    }

    public final synchronized void OooO0O0() {
        InterfaceC1722jo interfaceC1722jo;
        if (this.f18505OooO0o == null || (interfaceC1722jo = this.f18504OooO0Oo) == null) {
            return;
        }
        interfaceC1722jo.OooO0o("onSdkImpression", mn0.f21307OooOoo0);
    }

    public final synchronized void OooO0OO() {
        InterfaceC1722jo interfaceC1722jo;
        try {
            dh0 dh0Var = this.f18505OooO0o;
            if (dh0Var == null || (interfaceC1722jo = this.f18504OooO0Oo) == null) {
                return;
            }
            ArrayList arrayListOooOo = interfaceC1722jo.OooOo();
            int size = arrayListOooOo.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListOooOo.get(i);
                i++;
                ((C1658hx) zzv.zzB()).getClass();
                C1658hx.OooOOOo(new wp0(29, dh0Var, (View) obj));
            }
            this.f18504OooO0Oo.OooO0o("onSdkLoaded", mn0.f21307OooOoo0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean OooO0Oo() {
        if (this.f18503OooO0OO.f20526OoooO) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0oo0)).booleanValue()) {
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o)).booleanValue() && this.f18504OooO0Oo != null) {
                    if (this.f18505OooO0o != null) {
                        zzo.zzj("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!((C1658hx) zzv.zzB()).OooOO0o(this.f18501OooO00o)) {
                        zzo.zzj("Unable to initialize omid.");
                        return false;
                    }
                    wd0 wd0Var = this.f18503OooO0OO.o000oOoO;
                    wd0Var.getClass();
                    if (wd0Var.f25297OooO00o.optBoolean((String) zzbe.zzc().OooO00o(AbstractC1448c7.o00oO000), true)) {
                        dh0 dh0VarOooO0oO = ((C1658hx) zzv.zzB()).OooO0oO(this.f18502OooO0O0, this.f18504OooO0Oo.OooOOo());
                        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oo000)).booleanValue()) {
                            h20 h20Var = this.f18506OooO0o0;
                            String str = dh0VarOooO0oO != null ? "1" : "0";
                            C1548ey c1548eyOooO00o = h20Var.OooO00o();
                            c1548eyOooO00o.OooO0oO("omid_js_session_success", str);
                            c1548eyOooO00o.OooOOO0();
                        }
                        if (dh0VarOooO0oO == null) {
                            zzo.zzj("Unable to create javascript session service.");
                            return false;
                        }
                        zzo.zzi("Created omid javascript session service.");
                        this.f18505OooO0o = dh0VarOooO0oO;
                        this.f18504OooO0Oo.Oooo0(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
