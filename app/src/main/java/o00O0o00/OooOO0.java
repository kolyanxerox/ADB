package o00O0O00;

import com.ironsource.C3037dc;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class OooOO0 implements Map, Serializable, o00O0OoO.OooOO0 {

    /* renamed from: Oooo0 */
    public static final OooOO0 f31338Oooo0;

    /* renamed from: OooOo */
    public int[] f31339OooOo;

    /* renamed from: OooOo0O */
    public Object[] f31340OooOo0O;

    /* renamed from: OooOo0o */
    public Object[] f31341OooOo0o;

    /* renamed from: OooOoO */
    public int f31342OooOoO;

    /* renamed from: OooOoO0 */
    public int[] f31343OooOoO0;

    /* renamed from: OooOoOO */
    public int f31344OooOoOO;

    /* renamed from: OooOoo */
    public int f31345OooOoo;

    /* renamed from: OooOoo0 */
    public int f31346OooOoo0;

    /* renamed from: OooOooO */
    public int f31347OooOooO;

    /* renamed from: OooOooo */
    public OooOO0O f31348OooOooo;

    /* renamed from: Oooo000 */
    public OooOOO0 f31349Oooo000;

    /* renamed from: Oooo00O */
    public OooOO0O f31350Oooo00O;

    /* renamed from: Oooo00o */
    public boolean f31351Oooo00o;

    static {
        OooOO0 oooOO0 = new OooOO0(0);
        oooOO0.f31351Oooo00o = true;
        f31338Oooo0 = oooOO0;
    }

    public OooOO0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f31340OooOo0O = objArr;
        this.f31341OooOo0o = null;
        this.f31339OooOo = iArr;
        this.f31343OooOoO0 = new int[iHighestOneBit];
        this.f31342OooOoO = 2;
        this.f31344OooOoOO = 0;
        this.f31346OooOoo0 = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int OooO(Object obj) {
        int iOooOO0O = OooOO0O(obj);
        int i = this.f31342OooOoO;
        while (true) {
            int i2 = this.f31343OooOoO0[iOooOO0O];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (OooOo.OooO00o(this.f31340OooOo0O[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iOooOO0O = iOooOO0O == 0 ? this.f31343OooOoO0.length - 1 : iOooOO0O - 1;
        }
    }

    public final int OooO00o(Object obj) {
        OooO0O0();
        while (true) {
            int iOooOO0O = OooOO0O(obj);
            int i = this.f31342OooOoO * 2;
            int length = this.f31343OooOoO0.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f31343OooOoO0;
                int i3 = iArr[iOooOO0O];
                if (i3 <= 0) {
                    int i4 = this.f31344OooOoOO;
                    Object[] objArr = this.f31340OooOo0O;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.f31344OooOoOO = i5;
                        objArr[i4] = obj;
                        this.f31339OooOo[i4] = iOooOO0O;
                        iArr[iOooOO0O] = i5;
                        this.f31347OooOooO++;
                        this.f31345OooOoo++;
                        if (i2 > this.f31342OooOoO) {
                            this.f31342OooOoO = i2;
                        }
                        return i4;
                    }
                    OooO0oo(1);
                } else {
                    if (OooOo.OooO00o(this.f31340OooOo0O[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        OooOO0o(this.f31343OooOoO0.length * 2);
                        break;
                    }
                    iOooOO0O = iOooOO0O == 0 ? this.f31343OooOoO0.length - 1 : iOooOO0O - 1;
                }
            }
        }
    }

    public final void OooO0O0() {
        if (this.f31351Oooo00o) {
            throw new UnsupportedOperationException();
        }
    }

    public final void OooO0OO(boolean z) {
        int i;
        Object[] objArr = this.f31341OooOo0o;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f31344OooOoOO;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f31339OooOo;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f31340OooOo0O;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f31343OooOoO0[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        o00OoO00.OooOOO0.OooO0oo(this.f31340OooOo0O, i3, i);
        if (objArr != null) {
            o00OoO00.OooOOO0.OooO0oo(objArr, i3, this.f31344OooOoOO);
        }
        this.f31344OooOoOO = i3;
    }

    public final boolean OooO0o(Collection m) {
        OooOo.OooO0o0(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!OooO0oO((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean OooO0oO(Map.Entry entry) {
        OooOo.OooO0o0(entry, "entry");
        int iOooO = OooO(entry.getKey());
        if (iOooO < 0) {
            return false;
        }
        Object[] objArr = this.f31341OooOo0o;
        OooOo.OooO0O0(objArr);
        return OooOo.OooO00o(objArr[iOooO], entry.getValue());
    }

    public final void OooO0oo(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f31340OooOo0O;
        int length = objArr.length;
        int i2 = this.f31344OooOoOO;
        int i3 = length - i2;
        int i4 = i2 - this.f31347OooOooO;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            OooO0OO(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            o00O0.OooO0O0 oooO0O0 = o00O0.OooO.Companion;
            int length2 = objArr.length;
            oooO0O0.getClass();
            int iOooO0Oo = o00O0.OooO0O0.OooO0Oo(length2, i5);
            Object[] objArr2 = this.f31340OooOo0O;
            OooOo.OooO0o0(objArr2, "<this>");
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, iOooO0Oo);
            OooOo.OooO0Oo(objArrCopyOf2, "copyOf(...)");
            this.f31340OooOo0O = objArrCopyOf2;
            Object[] objArr3 = this.f31341OooOo0o;
            if (objArr3 != null) {
                objArrCopyOf = Arrays.copyOf(objArr3, iOooO0Oo);
                OooOo.OooO0Oo(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f31341OooOo0o = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f31339OooOo, iOooO0Oo);
            OooOo.OooO0Oo(iArrCopyOf, "copyOf(...)");
            this.f31339OooOo = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((iOooO0Oo >= 1 ? iOooO0Oo : 1) * 3);
            if (iHighestOneBit > this.f31343OooOoO0.length) {
                OooOO0o(iHighestOneBit);
            }
        }
    }

    public final int OooOO0(Object obj) {
        int i = this.f31344OooOoOO;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f31339OooOo[i] >= 0) {
                Object[] objArr = this.f31341OooOo0o;
                OooOo.OooO0O0(objArr);
                if (OooOo.OooO00o(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int OooOO0O(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f31346OooOoo0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f31339OooOo[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOO0o(int r6) {
        /*
            r5 = this;
            int r0 = r5.f31345OooOoo
            int r0 = r0 + 1
            r5.f31345OooOoo = r0
            int r0 = r5.f31344OooOoOO
            int r1 = r5.f31347OooOooO
            r2 = 0
            if (r0 <= r1) goto L10
            r5.OooO0OO(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f31343OooOoO0 = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f31346OooOoo0 = r6
        L1c:
            int r6 = r5.f31344OooOoOO
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f31340OooOo0O
            r0 = r0[r2]
            int r0 = r5.OooOO0O(r0)
            int r1 = r5.f31342OooOoO
        L2c:
            int[] r3 = r5.f31343OooOoO0
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f31339OooOo
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0O00.OooOO0.OooOO0o(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[LOOP:0: B:43:0x0024->B:67:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOOO0(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f31340OooOo0O
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.OooOo.OooO0o0(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f31341OooOo0o
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f31339OooOo
            r0 = r0[r12]
            int r1 = r11.f31342OooOoO
            int r1 = r1 * 2
            int[] r2 = r11.f31343OooOoO0
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.f31343OooOoO0
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f31342OooOoO
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f31343OooOoO0
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f31343OooOoO0
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.f31340OooOo0O
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.OooOO0O(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f31343OooOoO0
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f31339OooOo
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f31343OooOoO0
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f31339OooOo
            r0[r12] = r6
            int r12 = r11.f31347OooOooO
            int r12 = r12 + r6
            r11.f31347OooOooO = r12
            int r12 = r11.f31345OooOoo
            int r12 = r12 + 1
            r11.f31345OooOoo = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0O00.OooOO0.OooOOO0(int):void");
    }

    @Override // java.util.Map
    public final void clear() {
        OooO0O0();
        int i = this.f31344OooOoOO - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f31339OooOo;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f31343OooOoO0[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        o00OoO00.OooOOO0.OooO0oo(this.f31340OooOo0O, 0, this.f31344OooOoOO);
        Object[] objArr = this.f31341OooOo0o;
        if (objArr != null) {
            o00OoO00.OooOOO0.OooO0oo(objArr, 0, this.f31344OooOoOO);
        }
        this.f31347OooOooO = 0;
        this.f31344OooOoOO = 0;
        this.f31345OooOoo++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return OooO(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return OooOO0(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        OooOO0O oooOO0O = this.f31350Oooo00O;
        if (oooOO0O != null) {
            return oooOO0O;
        }
        OooOO0O oooOO0O2 = new OooOO0O(this, 0);
        this.f31350Oooo00O = oooOO0O2;
        return oooOO0O2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f31347OooOooO == map.size() && OooO0o(map.entrySet());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iOooO = OooO(obj);
        if (iOooO < 0) {
            return null;
        }
        Object[] objArr = this.f31341OooOo0o;
        OooOo.OooO0O0(objArr);
        return objArr[iOooO];
    }

    @Override // java.util.Map
    public final int hashCode() {
        OooO0o oooO0o = new OooO0o(this, 0);
        int i = 0;
        while (oooO0o.hasNext()) {
            int i2 = oooO0o.f31335OooOo0o;
            OooOO0 oooOO0 = oooO0o.f31334OooOo0O;
            if (i2 >= oooOO0.f31344OooOoOO) {
                throw new NoSuchElementException();
            }
            oooO0o.f31335OooOo0o = i2 + 1;
            oooO0o.f31333OooOo = i2;
            Object obj = oooOO0.f31340OooOo0O[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = oooOO0.f31341OooOo0o;
            OooOo.OooO0O0(objArr);
            Object obj2 = objArr[oooO0o.f31333OooOo];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            oooO0o.OooO0O0();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f31347OooOooO == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        OooOO0O oooOO0O = this.f31348OooOooo;
        if (oooOO0O != null) {
            return oooOO0O;
        }
        OooOO0O oooOO0O2 = new OooOO0O(this, 1);
        this.f31348OooOooo = oooOO0O2;
        return oooOO0O2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        OooO0O0();
        int iOooO00o = OooO00o(obj);
        Object[] objArr = this.f31341OooOo0o;
        if (objArr == null) {
            int length = this.f31340OooOo0O.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f31341OooOo0o = objArr;
        }
        if (iOooO00o >= 0) {
            objArr[iOooO00o] = obj2;
            return null;
        }
        int i = (-iOooO00o) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        OooOo.OooO0o0(from, "from");
        OooO0O0();
        Set<Map.Entry> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        OooO0oo(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iOooO00o = OooO00o(entry.getKey());
            Object[] objArr = this.f31341OooOo0o;
            if (objArr == null) {
                int length = this.f31340OooOo0O.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f31341OooOo0o = objArr;
            }
            if (iOooO00o >= 0) {
                objArr[iOooO00o] = entry.getValue();
            } else {
                int i = (-iOooO00o) - 1;
                if (!OooOo.OooO00o(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        OooO0O0();
        int iOooO = OooO(obj);
        if (iOooO < 0) {
            return null;
        }
        Object[] objArr = this.f31341OooOo0o;
        OooOo.OooO0O0(objArr);
        Object obj2 = objArr[iOooO];
        OooOOO0(iOooO);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f31347OooOooO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f31347OooOooO * 3) + 2);
        sb.append("{");
        OooO0o oooO0o = new OooO0o(this, 0);
        int i = 0;
        while (oooO0o.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = oooO0o.f31335OooOo0o;
            OooOO0 oooOO0 = oooO0o.f31334OooOo0O;
            if (i2 >= oooOO0.f31344OooOoOO) {
                throw new NoSuchElementException();
            }
            oooO0o.f31335OooOo0o = i2 + 1;
            oooO0o.f31333OooOo = i2;
            Object obj = oooOO0.f31340OooOo0O[i2];
            if (obj == oooOO0) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append(C3037dc.f8244T);
            Object[] objArr = oooOO0.f31341OooOo0o;
            OooOo.OooO0O0(objArr);
            Object obj2 = objArr[oooO0o.f31333OooOo];
            if (obj2 == oooOO0) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            oooO0o.OooO0O0();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        OooOo.OooO0Oo(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        OooOOO0 oooOOO0 = this.f31349Oooo000;
        if (oooOOO0 != null) {
            return oooOOO0;
        }
        OooOOO0 oooOOO02 = new OooOOO0(this);
        this.f31349Oooo000 = oooOOO02;
        return oooOOO02;
    }
}
