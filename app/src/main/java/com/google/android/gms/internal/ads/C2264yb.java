package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.yb */
/* loaded from: classes2.dex */
public final class C2264yb implements InterfaceC2042sb {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final zzb f25889OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final h20 f25890OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final s50 f25891OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final C1973qg f25892OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final C1468cr f25893OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public zzaa f25895OooOoo0 = null;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final C2163vl f25894OooOoo = AbstractC2200wl.f25327OooO0oO;

    /* renamed from: OooOo, reason: collision with root package name */
    public final zzu f25888OooOo = new zzu(null);

    public C2264yb(zzb zzbVar, C1973qg c1973qg, s50 s50Var, h20 h20Var, C1468cr c1468cr) {
        this.f25889OooOo0O = zzbVar;
        this.f25892OooOoO0 = c1973qg;
        this.f25891OooOoO = s50Var;
        this.f25890OooOo0o = h20Var;
        this.f25893OooOoOO = c1468cr;
    }

    public static int OooO00o(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri OooO0O0(Context context, C1663i1 c1663i1, Uri uri, View view, Activity activity, xd0 xd0Var) {
        if (c1663i1 != null) {
            try {
                if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o000oO)).booleanValue() || xd0Var == null) {
                    if (c1663i1.OooO0O0(uri)) {
                        return c1663i1.OooO00o(uri, context, view, activity);
                    }
                } else if (c1663i1.OooO0O0(uri)) {
                    return xd0Var.OooO00o(uri, context, view, activity);
                }
            } catch (C1699j1 unused) {
            } catch (Exception e) {
                zzv.zzp().OooO0oo("OpenGmsgHandler.maybeAddClickSignalsToUri", e);
            }
        }
        return uri;
    }

    public static Uri OooO0OO(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            zzo.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public final void OooO(int i) {
        h20 h20Var;
        String str;
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o00o)).booleanValue() || (h20Var = this.f25890OooOo0o) == null) {
            return;
        }
        C1548ey c1548eyOooO00o = h20Var.OooO00o();
        c1548eyOooO00o.OooO0oO("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        c1548eyOooO00o.OooO0oO("cct_open_status", str);
        c1548eyOooO00o.OooOOO0();
    }

    public final void OooO0Oo(Context context, String str, String str2) {
        this.f25891OooOoO.OooO00o(str);
        h20 h20Var = this.f25890OooOo0o;
        if (h20Var != null) {
            xh0.Oooo0o0("dialog_not_shown_reason", str2);
            x50.o000O0O0(context, h20Var, this.f25891OooOoO, str, "dialog_not_shown", mn0.OooO0OO(1, new Object[]{"dialog_not_shown_reason", str2}, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0155, code lost:
    
        r6 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0o(com.google.android.gms.ads.internal.client.zza r17, java.util.Map r18, boolean r19, java.lang.String r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2264yb.OooO0o(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
    public final void OooO0o0(Object obj, Map map) {
        C1468cr c1468cr;
        zza zzaVar = (zza) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) zzaVar;
        if (interfaceC1722jo.OooO0OO() != null) {
            map2 = interfaceC1722jo.OooO0OO().o0ooOoO;
        }
        String strOooOooO = af0.OooOooO(str, interfaceC1722jo.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            zzo.zzj("Action missing from an open GMSG.");
            return;
        }
        zzb zzbVar = this.f25889OooOo0O;
        if (zzbVar != null && !zzbVar.zzc()) {
            zzbVar.zzb(strOooOooO);
        } else {
            o00000oO.OooOOO oooOOOOooO00o = (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOooOo)).booleanValue() && (c1468cr = this.f25893OooOoOO) != null && C1468cr.OooO0O0(strOooOooO)) ? c1468cr.OooO00o(strOooOooO, zzbc.zze()) : ii0.OooooOO(strOooOooO);
            oooOOOOooO00o.addListener(new wp0(0, oooOOOOooO00o, new C2051sk(this, map, zzaVar, str2, 5, false)), this.f25894OooOoo);
        }
    }

    public final void OooO0oO(boolean z) {
        C1973qg c1973qg = this.f25892OooOoO0;
        if (c1973qg != null) {
            c1973qg.OooOOo(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(com.google.android.gms.internal.ads.AbstractC1448c7.o0OO0OoO)).booleanValue() != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e0, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(com.google.android.gms.internal.ads.AbstractC1448c7.o0OoOoO)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(com.google.android.gms.internal.ads.AbstractC1448c7.o0OO00o0)).booleanValue()) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0oo(com.google.android.gms.ads.internal.client.zza r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2264yb.OooO0oo(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }
}
