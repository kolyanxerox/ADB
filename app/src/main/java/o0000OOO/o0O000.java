package o0000Ooo;

import com.google.android.gms.internal.measurement.o0OO0O0;
import com.ironsource.C3037dc;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class o0O000 implements Map, Serializable {

    /* renamed from: OooOoo0 */
    public static final o0O000 f29533OooOoo0 = new o0O000(new Object[0], 0, null);

    /* renamed from: OooOo */
    public transient o0O0000O f29534OooOo;

    /* renamed from: OooOo0O */
    public transient C4521o0 f29535OooOo0O;

    /* renamed from: OooOo0o */
    public transient o0O00000 f29536OooOo0o;

    /* renamed from: OooOoO */
    public final transient Object[] f29537OooOoO;

    /* renamed from: OooOoO0 */
    public final transient Object f29538OooOoO0;

    /* renamed from: OooOoOO */
    public final transient int f29539OooOoOO;

    public o0O000(Object[] objArr, int i, Object obj) {
        this.f29538OooOoO0 = obj;
        this.f29537OooOoO = objArr;
        this.f29539OooOoOO = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0199  */
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
    public static o0000Ooo.o0O000 OooO00o(int r19, java.lang.Object[] r20, OoooO0O.o0000O00 r21) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000Ooo.o0O000.OooO00o(int, java.lang.Object[], OoooO0O.o0000O00):o0000Ooo.o0O000");
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
        o0O0000O o0o0000o = this.f29534OooOo;
        if (o0o0000o == null) {
            o0o0000o = new o0O0000O(this.f29537OooOoO, 1, this.f29539OooOoOO);
            this.f29534OooOo = o0o0000o;
        }
        return o0o0000o.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C4521o0 c4521o0 = this.f29535OooOo0O;
        if (c4521o0 != null) {
            return c4521o0;
        }
        C4521o0 c4521o02 = new C4521o0(this, this.f29537OooOoO, this.f29539OooOoOO);
        this.f29535OooOo0O = c4521o02;
        return c4521o02;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((o0O00o0) entrySet()).equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0003 A[EDGE_INSN: B:94:0x0003->B:54:0x0003 BREAK  A[LOOP:0: B:66:0x0037->B:72:0x004d], EDGE_INSN: B:97:0x0003->B:54:0x0003 BREAK  A[LOOP:1: B:76:0x0062->B:82:0x0079], EDGE_INSN: B:98:0x0003->B:54:0x0003 BREAK  A[LOOP:2: B:84:0x0088->B:93:0x00a0]] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r9 = r0
            goto L9c
        L6:
            r1 = 1
            java.lang.Object[] r2 = r8.f29537OooOoO
            int r3 = r8.f29539OooOoOO
            if (r3 != r1) goto L20
            r3 = 0
            r3 = r2[r3]
            java.util.Objects.requireNonNull(r3)
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L3
            r9 = r2[r1]
            java.util.Objects.requireNonNull(r9)
            goto L9c
        L20:
            java.lang.Object r3 = r8.f29538OooOoO0
            if (r3 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L50
            r4 = r3
            byte[] r4 = (byte[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = com.google.android.gms.internal.measurement.o0OOO0.OooOO0(r3)
        L37:
            r3 = r3 & r5
            r6 = r4[r3]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L3
        L40:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L4d:
            int r3 = r3 + 1
            goto L37
        L50:
            boolean r4 = r3 instanceof short[]
            if (r4 == 0) goto L7c
            r4 = r3
            short[] r4 = (short[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = com.google.android.gms.internal.measurement.o0OOO0.OooOO0(r3)
        L62:
            r3 = r3 & r5
            short r6 = r4[r3]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L3
        L6c:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L79:
            int r3 = r3 + 1
            goto L62
        L7c:
            int[] r3 = (int[]) r3
            int r4 = r3.length
            int r4 = r4 - r1
            int r5 = r9.hashCode()
            int r5 = com.google.android.gms.internal.measurement.o0OOO0.OooOO0(r5)
        L88:
            r5 = r5 & r4
            r6 = r3[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L3
        L90:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r2[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r0
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000Ooo.o0O000.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C4521o0 c4521o0 = this.f29535OooOo0O;
        if (c4521o0 == null) {
            c4521o0 = new C4521o0(this, this.f29537OooOoO, this.f29539OooOoOO);
            this.f29535OooOo0O = c4521o0;
        }
        Iterator it = c4521o0.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        o0O00000 o0o00000 = this.f29536OooOo0o;
        if (o0o00000 != null) {
            return o0o00000;
        }
        o0O00000 o0o000002 = new o0O00000(this, new o0O0000O(this.f29537OooOoO, 0, this.f29539OooOoOO));
        this.f29536OooOo0o = o0o000002;
        return o0o000002;
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
        return this.f29539OooOoOO;
    }

    public final String toString() {
        int i = this.f29539OooOoOO;
        o0OO0O0.OooO0o(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        o0O000Oo it = ((C4521o0) entrySet()).iterator();
        boolean z = true;
        while (true) {
            o00OOOO0 o00oooo0 = (o00OOOO0) it;
            if (!o00oooo0.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) o00oooo0.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(C3037dc.f8244T);
            sb.append(entry.getValue());
            z = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        o0O0000O o0o0000o = this.f29534OooOo;
        if (o0o0000o != null) {
            return o0o0000o;
        }
        o0O0000O o0o0000o2 = new o0O0000O(this.f29537OooOoO, 1, this.f29539OooOoOO);
        this.f29534OooOo = o0o0000o2;
        return o0o0000o2;
    }
}
