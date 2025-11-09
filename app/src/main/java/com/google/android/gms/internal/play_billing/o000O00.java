package com.google.android.gms.internal.play_billing;

import com.ironsource.C3037dc;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class o000O00 implements Map, Serializable {

    /* renamed from: OooOoo0 */
    public static final o000O00 f27000OooOoo0 = new o000O00(new Object[0], 0, null);

    /* renamed from: OooOo */
    public transient o000Oo0 f27001OooOo;

    /* renamed from: OooOo0O */
    public transient o000O000 f27002OooOo0O;

    /* renamed from: OooOo0o */
    public transient o000O0o f27003OooOo0o;

    /* renamed from: OooOoO */
    public final transient Object[] f27004OooOoO;

    /* renamed from: OooOoO0 */
    public final transient Object f27005OooOoO0;

    /* renamed from: OooOoOO */
    public final transient int f27006OooOoOO;

    public o000O00(Object[] objArr, int i, Object obj) {
        this.f27005OooOoO0 = obj;
        this.f27004OooOoO = objArr;
        this.f27006OooOoOO = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x019c  */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.play_billing.o000O00 OooO00o(int r19, java.lang.Object[] r20, OoooO0O.o0000O00 r21) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.o000O00.OooO00o(int, java.lang.Object[], OoooO0O.o0000O00):com.google.android.gms.internal.play_billing.o000O00");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        o000Oo0 o000oo02 = this.f27001OooOo;
        if (o000oo02 == null) {
            o000oo02 = new o000Oo0(this.f27004OooOoO, 1, this.f27006OooOoOO);
            this.f27001OooOo = o000oo02;
        }
        return o000oo02.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        o000O000 o000o0002 = this.f27002OooOo0O;
        if (o000o0002 != null) {
            return o000o0002;
        }
        o000O000 o000o0003 = new o000O000(this, this.f27004OooOoO, this.f27006OooOoOO);
        this.f27002OooOo0O = o000o0003;
        return o000o0003;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0003 A[EDGE_INSN: B:94:0x0003->B:54:0x0003 BREAK  A[LOOP:0: B:66:0x0038->B:72:0x004e], EDGE_INSN: B:97:0x0003->B:54:0x0003 BREAK  A[LOOP:1: B:76:0x0063->B:82:0x007a], EDGE_INSN: B:98:0x0003->B:54:0x0003 BREAK  A[LOOP:2: B:84:0x0089->B:93:0x00a0]] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            r1 = 1
            int r2 = r9.f27006OooOoOO
            java.lang.Object[] r3 = r9.f27004OooOoO
            if (r2 != r1) goto L20
            r2 = 0
            r2 = r3[r2]
            java.util.Objects.requireNonNull(r2)
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L3
            r10 = r3[r1]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r2 = r9.f27005OooOoO0
            if (r2 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r2 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r2
            byte[] r4 = (byte[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = com.google.android.gms.internal.play_billing.o0O000Oo.OooO0O0(r2)
        L38:
            r2 = r2 & r6
            r5 = r4[r2]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L4e:
            int r2 = r2 + 1
            goto L38
        L51:
            boolean r4 = r2 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r2
            short[] r4 = (short[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = com.google.android.gms.internal.play_billing.o0O000Oo.OooO0O0(r2)
        L63:
            r2 = r2 & r6
            short r5 = r4[r2]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L7a:
            int r2 = r2 + 1
            goto L63
        L7d:
            int[] r2 = (int[]) r2
            int r4 = r2.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.play_billing.o0O000Oo.OooO0O0(r6)
        L89:
            r6 = r6 & r4
            r7 = r2[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r3[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r3[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.o000O00.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        o000O000 o000o0002 = this.f27002OooOo0O;
        if (o000o0002 == null) {
            o000o0002 = new o000O000(this, this.f27004OooOoO, this.f27006OooOoOO);
            this.f27002OooOo0O = o000o0002;
        }
        Iterator it = o000o0002.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        o000O0o o000o0o2 = this.f27003OooOo0o;
        if (o000o0o2 != null) {
            return o000o0o2;
        }
        o000O0o o000o0o3 = new o000O0o(this, new o000Oo0(this.f27004OooOoO, 0, this.f27006OooOoOO));
        this.f27003OooOo0o = o000o0o3;
        return o000o0o3;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f27006OooOoOO;
    }

    public final String toString() {
        int i = this.f27006OooOoOO;
        o0O000Oo.OooO0oo(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        Iterator it = ((o000O000) entrySet()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(C3037dc.f8244T);
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        o000Oo0 o000oo02 = this.f27001OooOo;
        if (o000oo02 != null) {
            return o000oo02;
        }
        o000Oo0 o000oo03 = new o000Oo0(this.f27004OooOoO, 1, this.f27006OooOoOO);
        this.f27001OooOo = o000oo03;
        return o000oo03;
    }
}
