package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class l30 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final d30 f20783OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final s10 f20784OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f20785OooO0OO = new Object();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f20786OooO0Oo = new ArrayList();

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f20787OooO0o0;

    public l30(d30 d30Var, s10 s10Var) {
        this.f20783OooO00o = d30Var;
        this.f20784OooO0O0 = s10Var;
    }

    public final JSONArray OooO00o() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f20785OooO0OO) {
            try {
                if (!this.f20787OooO0o0) {
                    d30 d30Var = this.f20783OooO00o;
                    if (!d30Var.f18141OooO0O0) {
                        j30 j30Var = new j30(this);
                        d30 d30Var2 = this.f20783OooO00o;
                        d30Var2.getClass();
                        d30Var2.f18145OooO0o0.addListener(new wp0(25, d30Var2, j30Var), d30Var2.f18148OooOO0);
                        return jSONArray;
                    }
                    OooO0O0(d30Var.OooO00o());
                }
                ArrayList arrayList = this.f20786OooO0Oo;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    jSONArray.put(((k30) obj).OooO00o());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0O0(List list) {
        C1788lg c1788lg;
        r10 r10VarOooO00o;
        r10 r10VarOooO00o2;
        C1788lg c1788lg2;
        synchronized (this.f20785OooO0OO) {
            try {
                if (this.f20787OooO0o0) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C2080tc c2080tc = (C2080tc) it.next();
                    String string = (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOo)).booleanValue() || (r10VarOooO00o2 = this.f20784OooO0O0.OooO00o(c2080tc.zza)) == null || (c1788lg2 = r10VarOooO00o2.f23728OooO0OO) == null) ? "" : c1788lg2.toString();
                    String str = string;
                    boolean z = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOoO0)).booleanValue() && (r10VarOooO00o = this.f20784OooO0O0.OooO00o(c2080tc.zza)) != null && r10VarOooO00o.f23729OooO0Oo;
                    ArrayList arrayList = this.f20786OooO0Oo;
                    String str2 = c2080tc.zza;
                    r10 r10VarOooO00o3 = this.f20784OooO0O0.OooO00o(str2);
                    arrayList.add(new k30(str2, str, (r10VarOooO00o3 == null || (c1788lg = r10VarOooO00o3.f23727OooO0O0) == null) ? "" : c1788lg.toString(), c2080tc.zzb ? 1 : 0, c2080tc.zzd, c2080tc.zzc, z));
                }
                this.f20787OooO0o0 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
