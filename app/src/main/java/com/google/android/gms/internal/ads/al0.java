package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class al0 implements Serializable, zk0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final List f17052OooOo0O;

    public final boolean equals(Object obj) {
        if (obj instanceof al0) {
            return this.f17052OooOo0O.equals(((al0) obj).f17052OooOo0O);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17052OooOo0O.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f17052OooOo0O) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zk0
    public final boolean zza(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f17052OooOo0O;
            if (i >= list.size()) {
                return true;
            }
            if (!((zk0) list.get(i)).zza(obj)) {
                return false;
            }
            i++;
        }
    }
}
