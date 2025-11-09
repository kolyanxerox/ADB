package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C1643hi;
import com.google.android.gms.internal.ads.InterfaceC1722jo;
import com.google.android.gms.internal.ads.ck0;
import com.google.android.gms.internal.ads.ek0;
import com.google.android.gms.internal.ads.gk0;
import com.google.android.gms.internal.ads.hk0;
import com.google.android.gms.internal.ads.kk0;
import com.google.android.gms.internal.ads.lk0;
import com.google.android.gms.internal.ads.o000oOoO;
import com.google.android.gms.internal.ads.ok0;
import com.google.android.gms.internal.ads.qk0;
import com.google.android.gms.internal.ads.sk0;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzz {

    /* renamed from: OooO0o, reason: collision with root package name */
    public ok0 f16166OooO0o;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public InterfaceC1722jo f16164OooO0OO = null;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f16167OooO0o0 = false;

    /* renamed from: OooO00o, reason: collision with root package name */
    public String f16162OooO00o = null;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public hk0 f16165OooO0Oo = null;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public String f16163OooO0O0 = null;

    public final void OooO00o(final String str, final HashMap map) {
        AbstractC2200wl.f25325OooO0o.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzx
            @Override // java.lang.Runnable
            public final void run() {
                zzz zzzVar = this.zza;
                String str2 = str;
                Map map2 = map;
                InterfaceC1722jo interfaceC1722jo = zzzVar.f16164OooO0OO;
                if (interfaceC1722jo != null) {
                    interfaceC1722jo.OooO0o(str2, map2);
                }
            }
        });
    }

    public final void OooO0O0(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.f16164OooO0OO != null) {
            HashMap map = new HashMap();
            map.put(Constants.MESSAGE, str);
            map.put("action", str2);
            OooO00o("onError", map);
        }
    }

    public final gk0 OooO0OO() {
        String str;
        String str2 = null;
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOOOoo)).booleanValue() || TextUtils.isEmpty(this.f16163OooO0O0)) {
            String str3 = this.f16162OooO00o;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                OooO0O0("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = this.f16163OooO0O0;
        }
        return new gk0(str2, str);
    }

    public final synchronized void zza(@Nullable InterfaceC1722jo interfaceC1722jo, Context context) {
        this.f16164OooO0OO = interfaceC1722jo;
        if (!zzk(context)) {
            OooO0O0("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        OooO00o("on_play_store_bind", map);
    }

    public final void zzb() {
        hk0 hk0Var;
        if (!this.f16167OooO0o0 || (hk0Var = this.f16165OooO0Oo) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            ((kk0) hk0Var.f19809OooOo0o).OooO00o(OooO0OO(), this.f16166OooO0o, 2);
            OooO00o("onLMDOverlayCollapse", new HashMap());
        }
    }

    public final void zzc() {
        hk0 hk0Var;
        String str;
        if (!this.f16167OooO0o0 || (hk0Var = this.f16165OooO0Oo) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        String str2 = null;
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOOOoo)).booleanValue() || TextUtils.isEmpty(this.f16163OooO0O0)) {
            String str3 = this.f16162OooO00o;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                OooO0O0("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = this.f16163OooO0O0;
        }
        ck0 ck0Var = new ck0(str2, str);
        ok0 ok0Var = this.f16166OooO0o;
        kk0 kk0Var = (kk0) hk0Var.f19809OooOo0o;
        C1643hi c1643hi = kk0Var.f20613OooO00o;
        if (c1643hi == null) {
            kk0.f20611OooO0OO.OooO00o("error: %s", "Play Store not found.");
        } else if (kk0.OooO0OO(ok0Var, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(str2, str))) {
            c1643hi.OooOOO0(new qk0(c1643hi, new o000oOoO(kk0Var, ck0Var, ok0Var, 8), 1));
        }
    }

    public final void zzg() {
        hk0 hk0Var;
        if (!this.f16167OooO0o0 || (hk0Var = this.f16165OooO0Oo) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            ((kk0) hk0Var.f19809OooOo0o).OooO00o(OooO0OO(), this.f16166OooO0o, 1);
            OooO00o("onLMDOverlayExpand", new HashMap());
        }
    }

    public final void zzj(@Nullable InterfaceC1722jo interfaceC1722jo, @Nullable lk0 lk0Var) {
        if (interfaceC1722jo == null) {
            OooO0O0("adWebview missing", "onLMDShow");
            return;
        }
        this.f16164OooO0OO = interfaceC1722jo;
        if (!this.f16167OooO0o0 && !zzk(interfaceC1722jo.getContext())) {
            OooO0O0("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOOOoo)).booleanValue()) {
            this.f16163OooO0O0 = ((ek0) lk0Var).f18619OooO0O0;
        }
        if (this.f16166OooO0o == null) {
            this.f16166OooO0o = new zzy(this);
        }
        hk0 hk0Var = this.f16165OooO0Oo;
        if (hk0Var != null) {
            ok0 ok0Var = this.f16166OooO0o;
            kk0 kk0Var = (kk0) hk0Var.f19809OooOo0o;
            C1643hi c1643hi = kk0Var.f20613OooO00o;
            if (c1643hi == null) {
                kk0.f20611OooO0OO.OooO00o("error: %s", "Play Store not found.");
            } else if (kk0.OooO0OO(ok0Var, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, ((ek0) lk0Var).f18619OooO0O0))) {
                c1643hi.OooOOO0(new qk0(c1643hi, new o000oOoO(kk0Var, lk0Var, ok0Var, 9), 1));
            }
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!sk0.OooO00o(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f16165OooO0Oo = new hk0(new kk0(context), 0);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("LastMileDeliveryOverlay.bindLastMileDeliveryService", e);
        }
        if (this.f16165OooO0Oo == null) {
            this.f16167OooO0o0 = false;
            return false;
        }
        if (this.f16166OooO0o == null) {
            this.f16166OooO0o = new zzy(this);
        }
        this.f16167OooO0o0 = true;
        return true;
    }
}
