package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class o60 {

    /* renamed from: OooO0OO */
    public final String f22347OooO0OO;

    /* renamed from: OooO0Oo */
    public md0 f22348OooO0Oo = null;

    /* renamed from: OooO0o0 */
    public kd0 f22350OooO0o0 = null;

    /* renamed from: OooO0o */
    public zzw f22349OooO0o = null;

    /* renamed from: OooO0O0 */
    public final Map f22346OooO0O0 = Collections.synchronizedMap(new HashMap());

    /* renamed from: OooO00o */
    public final List f22345OooO00o = Collections.synchronizedList(new ArrayList());

    public o60(String str) {
        this.f22347OooO0OO = str;
    }

    public static String OooO0O0(kd0 kd0Var) {
        return ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17905o00OOOo0)).booleanValue() ? kd0Var.f20548o00o0O : kd0Var.f20507OooOo0o;
    }

    public final void OooO00o(kd0 kd0Var) {
        String strOooO0O0 = OooO0O0(kd0Var);
        Map map = this.f22346OooO0O0;
        Object obj = map.get(strOooO0O0);
        List list = this.f22345OooO00o;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.f22349OooO0o);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.f22349OooO0o = (zzw) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            zzw zzwVar = (zzw) list.get(iIndexOf);
            zzwVar.zzb = 0L;
            zzwVar.zzc = null;
        }
    }

    public final synchronized void OooO0OO(kd0 kd0Var, int i) {
        Map map = this.f22346OooO0O0;
        String strOooO0O0 = OooO0O0(kd0Var);
        if (map.containsKey(strOooO0O0)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = kd0Var.f20506OooOo0O.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, kd0Var.f20506OooOo0O.getString(next));
            } catch (JSONException unused) {
            }
        }
        zzw zzwVar = new zzw(kd0Var.f20514OooOooo, 0L, null, bundle, kd0Var.f20517Oooo000, kd0Var.f20518Oooo00O, kd0Var.f20519Oooo00o, kd0Var.f20516Oooo0);
        try {
            this.f22345OooO00o.add(i, zzwVar);
        } catch (IndexOutOfBoundsException e) {
            zzv.zzp().OooO0oo("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e);
        }
        this.f22346OooO0O0.put(strOooO0O0, zzwVar);
    }

    public final void OooO0Oo(kd0 kd0Var, long j, zze zzeVar, boolean z) {
        String strOooO0O0 = OooO0O0(kd0Var);
        Map map = this.f22346OooO0O0;
        if (map.containsKey(strOooO0O0)) {
            if (this.f22350OooO0o0 == null) {
                this.f22350OooO0o0 = kd0Var;
            }
            zzw zzwVar = (zzw) map.get(strOooO0O0);
            zzwVar.zzb = j;
            zzwVar.zzc = zzeVar;
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O00O0o)).booleanValue() && z) {
                this.f22349OooO0o = zzwVar;
            }
        }
    }
}
