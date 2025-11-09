package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzt extends LinkedHashMap {

    /* renamed from: OooOo0O */
    public final /* synthetic */ zzv f16625OooOo0O;

    public zzt(zzv zzvVar) {
        this.f16625OooOo0O = zzvVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.f16625OooOo0O) {
            try {
                int size = size();
                zzv zzvVar = this.f16625OooOo0O;
                if (size <= zzvVar.f16627OooO00o) {
                    return false;
                }
                zzvVar.f16631OooO0o.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).zzb));
                return size() > this.f16625OooOo0O.f16627OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
