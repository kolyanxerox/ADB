package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class fg0 {

    /* renamed from: OooO */
    public final C1663i1 f18938OooO;

    /* renamed from: OooO00o */
    public final x70 f18939OooO00o;

    /* renamed from: OooO0O0 */
    public final String f18940OooO0O0;

    /* renamed from: OooO0OO */
    public final String f18941OooO0OO;

    /* renamed from: OooO0Oo */
    public final String f18942OooO0Oo;

    /* renamed from: OooO0o */
    public final sd0 f18943OooO0o;

    /* renamed from: OooO0o0 */
    public final Context f18944OooO0o0;

    /* renamed from: OooO0oO */
    public final td0 f18945OooO0oO;

    /* renamed from: OooO0oo */
    public final Oooo0OO.o00Ooo f18946OooO0oo;

    public fg0(x70 x70Var, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, sd0 sd0Var, td0 td0Var, Oooo0OO.o00Ooo o00ooo2, C1663i1 c1663i1) {
        this.f18939OooO00o = x70Var;
        this.f18940OooO0O0 = versionInfoParcel.afmaVersion;
        this.f18941OooO0OO = str;
        this.f18942OooO0Oo = str2;
        this.f18944OooO0o0 = context;
        this.f18943OooO0o = sd0Var;
        this.f18945OooO0oO = td0Var;
        this.f18946OooO0oo = o00ooo2;
        this.f18938OooO = c1663i1;
    }

    public static String OooO0OO(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final ArrayList OooO00o(rd0 rd0Var, kd0 kd0Var, List list) {
        return OooO0O0(rd0Var, kd0Var, false, "", "", list);
    }

    public final ArrayList OooO0O0(rd0 rd0Var, kd0 kd0Var, boolean z, String str, String str2, List list) {
        long j;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            String strOooO0OO = OooO0OO(OooO0OO(OooO0OO((String) it.next(), "@gw_adlocid@", ((vd0) rd0Var.f23848OooO00o.f23325OooOo0o).f24955OooO0o), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.f18940OooO0O0);
            if (kd0Var != null) {
                strOooO0OO = af0.OooOooO(OooO0OO(OooO0OO(OooO0OO(strOooO0OO, "@gw_qdata@", kd0Var.f20509OooOoO0), "@gw_adnetid@", kd0Var.f20504OooOo), "@gw_allocid@", kd0Var.f20507OooOo0o), this.f18944OooO0o0, kd0Var.f20531OoooOOO, kd0Var.o0ooOoO);
            }
            x70 x70Var = this.f18939OooO00o;
            String strOooO0OO2 = OooO0OO(strOooO0OO, "@gw_adnetstatus@", x70Var.OooO0O0());
            synchronized (x70Var) {
                j = x70Var.f25547OooO0oo;
            }
            String strOooO0OO3 = OooO0OO(OooO0OO(OooO0OO(strOooO0OO2, "@gw_ttr@", Long.toString(j, 10)), "@gw_seqnum@", this.f18941OooO0OO), "@gw_sessid@", this.f18942OooO0Oo);
            boolean z3 = false;
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17901o00OOOO)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z4 = !zIsEmpty;
            if (z3) {
                z2 = z4;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strOooO0OO3);
            }
            if (this.f18938OooO.OooO0OO(Uri.parse(strOooO0OO3))) {
                Uri.Builder builderBuildUpon = Uri.parse(strOooO0OO3).buildUpon();
                if (z3) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strOooO0OO3 = builderBuildUpon.build().toString();
            }
            arrayList.add(strOooO0OO3);
        }
        return arrayList;
    }
}
