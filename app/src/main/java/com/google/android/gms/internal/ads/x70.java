package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class x70 {

    /* renamed from: OooO, reason: collision with root package name */
    public long f25539OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Oooo0OO.o00Ooo f25540OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final de0 f25541OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final hg0 f25542OooO0OO;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final o60 f25544OooO0o;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public boolean f25546OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public long f25547OooO0oo;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashMap f25543OooO0Oo = new LinkedHashMap();

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f25545OooO0o0 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O00OOO)).booleanValue();

    public x70(Oooo0OO.o00Ooo o00ooo2, de0 de0Var, o60 o60Var, hg0 hg0Var) {
        this.f25540OooO00o = o00ooo2;
        this.f25541OooO0O0 = de0Var;
        this.f25544OooO0o = o60Var;
        this.f25542OooO0OO = hg0Var;
    }

    public final synchronized void OooO00o(rd0 rd0Var, kd0 kd0Var, o00000oO.OooOOO oooOOO, fg0 fg0Var) {
        md0 md0Var = (md0) rd0Var.f23849OooO0O0.f24096OooOo;
        ((Oooo0OO.oo000o) this.f25540OooO00o).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = kd0Var.f20507OooOo0o;
        if (str != null) {
            this.f25543OooO0Oo.put(kd0Var, new w70(str, kd0Var.f20540OooooOo, 9, 0L, null));
            v70 v70Var = new v70(this, jElapsedRealtime, md0Var, kd0Var, str, fg0Var, rd0Var);
            oooOOO.addListener(new wp0(0, oooOOO, v70Var), AbstractC2200wl.f25327OooO0oO);
        }
    }

    public final synchronized String OooO0O0() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f25543OooO0Oo.entrySet().iterator();
            while (it.hasNext()) {
                w70 w70Var = (w70) ((Map.Entry) it.next()).getValue();
                if (w70Var.f25244OooO0OO != Integer.MAX_VALUE) {
                    arrayList.add(w70Var.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void OooO0OO(List list) {
        ((Oooo0OO.oo000o) this.f25540OooO00o).getClass();
        this.f25539OooO = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kd0 kd0Var = (kd0) it.next();
            if (!TextUtils.isEmpty(kd0Var.f20507OooOo0o)) {
                this.f25543OooO0Oo.put(kd0Var, new w70(kd0Var.f20507OooOo0o, kd0Var.f20540OooooOo, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void OooO0Oo(kd0 kd0Var) {
        w70 w70Var = (w70) this.f25543OooO0Oo.get(kd0Var);
        if (w70Var == null || this.f25546OooO0oO) {
            return;
        }
        w70Var.f25244OooO0OO = 8;
    }
}
