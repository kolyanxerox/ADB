package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class OooO0o implements Iterable, Oooo0, OooOOOO {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final TreeMap f26421OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final TreeMap f26422OooOo0o;

    public OooO0o() {
        this.f26421OooOo0O = new TreeMap();
        this.f26422OooOo0o = new TreeMap();
    }

    public final Iterator OooO() {
        return this.f26421OooOo0O.keySet().iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x085a, code lost:
    
        if (com.google.android.gms.internal.measurement.o0OO0O0.OooOOOo(r29, r31, (com.google.android.gms.internal.measurement.Oooo000) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).OooOO0() == OooOO0()) goto L378;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016f  */
    @Override // com.google.android.gms.internal.measurement.Oooo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.Oooo0 OooO0Oo(java.lang.String r30, com.google.android.gms.internal.ads.C2051sk r31, java.util.ArrayList r32) {
        /*
            Method dump skipped, instructions count: 2380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.OooO0o.OooO0Oo(java.lang.String, com.google.android.gms.internal.ads.sk, java.util.ArrayList):com.google.android.gms.internal.measurement.Oooo0");
    }

    @Override // com.google.android.gms.internal.measurement.OooOOOO
    public final void OooO0o0(String str, Oooo0 oooo0) {
        TreeMap treeMap = this.f26422OooOo0o;
        if (oooo0 == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, oooo0);
        }
    }

    public final List OooO0oO() {
        ArrayList arrayList = new ArrayList(OooOO0());
        for (int i = 0; i < OooOO0(); i++) {
            arrayList.add(OooOO0O(i));
        }
        return arrayList;
    }

    public final int OooOO0() {
        TreeMap treeMap = this.f26421OooOo0O;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final Oooo0 OooOO0O(int i) {
        Oooo0 oooo0;
        if (i < OooOO0()) {
            return (!OooOOO0(i) || (oooo0 = (Oooo0) this.f26421OooOo0O.get(Integer.valueOf(i))) == null) ? Oooo0.OooOO0o : oooo0;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void OooOO0o(int i, Oooo0 oooo0) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        TreeMap treeMap = this.f26421OooOo0O;
        if (oooo0 == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), oooo0);
        }
    }

    public final void OooOOO(int i) {
        TreeMap treeMap = this.f26421OooOo0O;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            treeMap.put(numValueOf, Oooo0.OooOO0o);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            Oooo0 oooo0 = (Oooo0) treeMap.get(numValueOf2);
            if (oooo0 != null) {
                treeMap.put(Integer.valueOf(i - 1), oooo0);
                treeMap.remove(numValueOf2);
            }
        }
    }

    public final boolean OooOOO0(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.f26421OooOo0O;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final String OooOOOO(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f26421OooOo0O.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= OooOO0()) {
                    break;
                }
                Oooo0 oooo0OooOO0O = OooOO0O(i);
                sb.append(str2);
                if (!(oooo0OooOO0O instanceof o00Oo0) && !(oooo0OooOO0O instanceof OooOo)) {
                    sb.append(oooo0OooOO0O.zzc());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        if (OooOO0() != oooO0o.OooOO0()) {
            return false;
        }
        TreeMap treeMap = this.f26421OooOo0O;
        if (treeMap.isEmpty()) {
            return oooO0o.f26421OooOo0O.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!OooOO0O(iIntValue).equals(oooO0o.OooOO0O(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f26421OooOo0O.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new o0OoOo0(this, 2);
    }

    public final String toString() {
        return OooOOOO(",");
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final String zzc() {
        return OooOOOO(",");
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Double zzd() {
        TreeMap treeMap = this.f26421OooOo0O;
        return treeMap.size() == 1 ? OooOO0O(0).zzd() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Iterator zzf() {
        return new OooO0OO(this, this.f26421OooOo0O.keySet().iterator(), this.f26422OooOo0o.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.OooOOOO
    public final boolean zzj(String str) {
        return "length".equals(str) || this.f26422OooOo0o.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.OooOOOO
    public final Oooo0 zzk(String str) {
        Oooo0 oooo0;
        return "length".equals(str) ? new OooOO0O(Double.valueOf(OooOO0())) : (!zzj(str) || (oooo0 = (Oooo0) this.f26422OooOo0o.get(str)) == null) ? Oooo0.OooOO0o : oooo0;
    }

    @Override // com.google.android.gms.internal.measurement.Oooo0
    public final Oooo0 zzt() {
        OooO0o oooO0o = new OooO0o();
        for (Map.Entry entry : this.f26421OooOo0O.entrySet()) {
            boolean z = entry.getValue() instanceof OooOOOO;
            TreeMap treeMap = oooO0o.f26421OooOo0O;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (Oooo0) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((Oooo0) entry.getValue()).zzt());
            }
        }
        return oooO0o;
    }

    public OooO0o(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                OooOO0o(i, (Oooo0) list.get(i));
            }
        }
    }
}
