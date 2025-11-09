package o00OO0oo;

import com.google.android.gms.internal.measurement.o0OOO0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import o00O0.o00oO0o;
import o00O0.oo000o;
import o00O0Oo.OooO0O0;
import o00OO0OO.OooO00o;

/* loaded from: classes3.dex */
public class o0OoOo0 implements o00OO0o.OooO, OooO {

    /* renamed from: OooO */
    public final Object f32081OooO;

    /* renamed from: OooO00o */
    public final String f32082OooO00o;

    /* renamed from: OooO0O0 */
    public final OooOOO0 f32083OooO0O0;

    /* renamed from: OooO0OO */
    public final int f32084OooO0OO;

    /* renamed from: OooO0Oo */
    public int f32085OooO0Oo = -1;

    /* renamed from: OooO0o */
    public final List[] f32086OooO0o;

    /* renamed from: OooO0o0 */
    public final String[] f32087OooO0o0;

    /* renamed from: OooO0oO */
    public final boolean[] f32088OooO0oO;

    /* renamed from: OooO0oo */
    public Object f32089OooO0oo;

    /* renamed from: OooOO0 */
    public final Object f32090OooOO0;

    /* renamed from: OooOO0O */
    public final Object f32091OooOO0O;

    public o0OoOo0(String str, OooOOO0 oooOOO0, int i) {
        this.f32082OooO00o = str;
        this.f32083OooO0O0 = oooOOO0;
        this.f32084OooO0OO = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.f32087OooO0o0 = strArr;
        int i3 = this.f32084OooO0OO;
        this.f32086OooO0o = new List[i3];
        this.f32088OooO0oO = new boolean[i3];
        this.f32089OooO0oo = o00oO0o.f31247OooOo0O;
        oo00o.OooO0o oooO0o = oo00o.OooO0o.f33183OooOo0O;
        final int i4 = 0;
        this.f32081OooO = o0OOO0.OooO0oO(oooO0o, new OooO0O0(this) { // from class: o00OO0oo.o000oOoO

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ o0OoOo0 f32073OooOo0o;

            {
                this.f32073OooOo0o = this;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, oo00o.OooO0OO] */
            @Override // o00O0Oo.OooO0O0
            public final Object invoke() {
                o00OO0o.OooO[] oooOArr;
                switch (i4) {
                    case 0:
                        return this.f32073OooOo0o.f32083OooO0O0.OooO0O0();
                    case 1:
                        OooOOO0 oooOOO02 = this.f32073OooOo0o.f32083OooO0O0;
                        ArrayList arrayList = new ArrayList(0);
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                        return (arrayList == null || (oooOArr = (o00OO0o.OooO[]) arrayList.toArray(new o00OO0o.OooO[0])) == null) ? Oooo0.f32069OooO00o : oooOArr;
                    default:
                        o0OoOo0 o0oooo0 = this.f32073OooOo0o;
                        o00OO0o.OooO[] typeParams = (o00OO0o.OooO[]) o0oooo0.f32090OooOO0.getValue();
                        kotlin.jvm.internal.OooOo.OooO0o0(o0oooo0, "<this>");
                        kotlin.jvm.internal.OooOo.OooO0o0(typeParams, "typeParams");
                        int iHashCode = (o0oooo0.OooO0oo().hashCode() * 31) + Arrays.hashCode(typeParams);
                        kotlin.jvm.internal.OooO0O0 oooO0O0 = new kotlin.jvm.internal.OooO0O0(o0oooo0);
                        int iHashCode2 = 1;
                        int i5 = 1;
                        while (true) {
                            int iHashCode3 = 0;
                            if (!oooO0O0.hasNext()) {
                                kotlin.jvm.internal.OooO0O0 oooO0O02 = new kotlin.jvm.internal.OooO0O0(o0oooo0);
                                while (oooO0O02.hasNext()) {
                                    int i6 = iHashCode2 * 31;
                                    Oooo0o0.OooO kind = ((o00OO0o.OooO) oooO0O02.next()).getKind();
                                    iHashCode2 = i6 + (kind != null ? kind.hashCode() : 0);
                                }
                                return Integer.valueOf((((iHashCode * 31) + i5) * 31) + iHashCode2);
                            }
                            int i7 = i5 * 31;
                            String strOooO0oo = ((o00OO0o.OooO) oooO0O0.next()).OooO0oo();
                            if (strOooO0oo != null) {
                                iHashCode3 = strOooO0oo.hashCode();
                            }
                            i5 = i7 + iHashCode3;
                        }
                }
            }
        });
        final int i5 = 1;
        this.f32090OooOO0 = o0OOO0.OooO0oO(oooO0o, new OooO0O0(this) { // from class: o00OO0oo.o000oOoO

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ o0OoOo0 f32073OooOo0o;

            {
                this.f32073OooOo0o = this;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, oo00o.OooO0OO] */
            @Override // o00O0Oo.OooO0O0
            public final Object invoke() {
                o00OO0o.OooO[] oooOArr;
                switch (i5) {
                    case 0:
                        return this.f32073OooOo0o.f32083OooO0O0.OooO0O0();
                    case 1:
                        OooOOO0 oooOOO02 = this.f32073OooOo0o.f32083OooO0O0;
                        ArrayList arrayList = new ArrayList(0);
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                        return (arrayList == null || (oooOArr = (o00OO0o.OooO[]) arrayList.toArray(new o00OO0o.OooO[0])) == null) ? Oooo0.f32069OooO00o : oooOArr;
                    default:
                        o0OoOo0 o0oooo0 = this.f32073OooOo0o;
                        o00OO0o.OooO[] typeParams = (o00OO0o.OooO[]) o0oooo0.f32090OooOO0.getValue();
                        kotlin.jvm.internal.OooOo.OooO0o0(o0oooo0, "<this>");
                        kotlin.jvm.internal.OooOo.OooO0o0(typeParams, "typeParams");
                        int iHashCode = (o0oooo0.OooO0oo().hashCode() * 31) + Arrays.hashCode(typeParams);
                        kotlin.jvm.internal.OooO0O0 oooO0O0 = new kotlin.jvm.internal.OooO0O0(o0oooo0);
                        int iHashCode2 = 1;
                        int i52 = 1;
                        while (true) {
                            int iHashCode3 = 0;
                            if (!oooO0O0.hasNext()) {
                                kotlin.jvm.internal.OooO0O0 oooO0O02 = new kotlin.jvm.internal.OooO0O0(o0oooo0);
                                while (oooO0O02.hasNext()) {
                                    int i6 = iHashCode2 * 31;
                                    Oooo0o0.OooO kind = ((o00OO0o.OooO) oooO0O02.next()).getKind();
                                    iHashCode2 = i6 + (kind != null ? kind.hashCode() : 0);
                                }
                                return Integer.valueOf((((iHashCode * 31) + i52) * 31) + iHashCode2);
                            }
                            int i7 = i52 * 31;
                            String strOooO0oo = ((o00OO0o.OooO) oooO0O0.next()).OooO0oo();
                            if (strOooO0oo != null) {
                                iHashCode3 = strOooO0oo.hashCode();
                            }
                            i52 = i7 + iHashCode3;
                        }
                }
            }
        });
        final int i6 = 2;
        this.f32091OooOO0O = o0OOO0.OooO0oO(oooO0o, new OooO0O0(this) { // from class: o00OO0oo.o000oOoO

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ o0OoOo0 f32073OooOo0o;

            {
                this.f32073OooOo0o = this;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, oo00o.OooO0OO] */
            @Override // o00O0Oo.OooO0O0
            public final Object invoke() {
                o00OO0o.OooO[] oooOArr;
                switch (i6) {
                    case 0:
                        return this.f32073OooOo0o.f32083OooO0O0.OooO0O0();
                    case 1:
                        OooOOO0 oooOOO02 = this.f32073OooOo0o.f32083OooO0O0;
                        ArrayList arrayList = new ArrayList(0);
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                        return (arrayList == null || (oooOArr = (o00OO0o.OooO[]) arrayList.toArray(new o00OO0o.OooO[0])) == null) ? Oooo0.f32069OooO00o : oooOArr;
                    default:
                        o0OoOo0 o0oooo0 = this.f32073OooOo0o;
                        o00OO0o.OooO[] typeParams = (o00OO0o.OooO[]) o0oooo0.f32090OooOO0.getValue();
                        kotlin.jvm.internal.OooOo.OooO0o0(o0oooo0, "<this>");
                        kotlin.jvm.internal.OooOo.OooO0o0(typeParams, "typeParams");
                        int iHashCode = (o0oooo0.OooO0oo().hashCode() * 31) + Arrays.hashCode(typeParams);
                        kotlin.jvm.internal.OooO0O0 oooO0O0 = new kotlin.jvm.internal.OooO0O0(o0oooo0);
                        int iHashCode2 = 1;
                        int i52 = 1;
                        while (true) {
                            int iHashCode3 = 0;
                            if (!oooO0O0.hasNext()) {
                                kotlin.jvm.internal.OooO0O0 oooO0O02 = new kotlin.jvm.internal.OooO0O0(o0oooo0);
                                while (oooO0O02.hasNext()) {
                                    int i62 = iHashCode2 * 31;
                                    Oooo0o0.OooO kind = ((o00OO0o.OooO) oooO0O02.next()).getKind();
                                    iHashCode2 = i62 + (kind != null ? kind.hashCode() : 0);
                                }
                                return Integer.valueOf((((iHashCode * 31) + i52) * 31) + iHashCode2);
                            }
                            int i7 = i52 * 31;
                            String strOooO0oo = ((o00OO0o.OooO) oooO0O0.next()).OooO0oo();
                            if (strOooO0oo != null) {
                                iHashCode3 = strOooO0oo.hashCode();
                            }
                            i52 = i7 + iHashCode3;
                        }
                }
            }
        });
    }

    @Override // o00OO0o.OooO
    public final boolean OooO(int i) {
        return this.f32088OooO0oO[i];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // o00OO0oo.OooO
    public final Set OooO00o() {
        return this.f32089OooO0oo.keySet();
    }

    @Override // o00OO0o.OooO
    public final boolean OooO0O0() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // o00OO0o.OooO
    public final int OooO0OO(String name) {
        kotlin.jvm.internal.OooOo.OooO0o0(name, "name");
        Integer num = (Integer) this.f32089OooO0oo.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // o00OO0o.OooO
    public final int OooO0Oo() {
        return this.f32084OooO0OO;
    }

    @Override // o00OO0o.OooO
    public final List OooO0o(int i) {
        List list = this.f32086OooO0o[i];
        return list == null ? oo000o.f31251OooOo0O : list;
    }

    @Override // o00OO0o.OooO
    public final String OooO0o0(int i) {
        return this.f32087OooO0o0[i];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oo00o.OooO0OO] */
    @Override // o00OO0o.OooO
    public final o00OO0o.OooO OooO0oO(int i) {
        return ((OooO00o[]) this.f32081OooO.getValue())[i].OooO0Oo();
    }

    @Override // o00OO0o.OooO
    public final String OooO0oo() {
        return this.f32082OooO00o;
    }

    public final void OooOO0(String str, boolean z) {
        int i = this.f32085OooO0Oo + 1;
        this.f32085OooO0Oo = i;
        String[] strArr = this.f32087OooO0o0;
        strArr[i] = str;
        this.f32088OooO0oO[i] = z;
        this.f32086OooO0o[i] = null;
        if (i == this.f32084OooO0OO - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.f32089OooO0oo = map;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, oo00o.OooO0OO] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, oo00o.OooO0OO] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0OoOo0) {
            o00OO0o.OooO oooO = (o00OO0o.OooO) obj;
            if (this.f32082OooO00o.equals(oooO.OooO0oo()) && Arrays.equals((o00OO0o.OooO[]) this.f32090OooOO0.getValue(), (o00OO0o.OooO[]) ((o0OoOo0) obj).f32090OooOO0.getValue())) {
                int iOooO0Oo = oooO.OooO0Oo();
                int i = this.f32084OooO0OO;
                if (i == iOooO0Oo) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (kotlin.jvm.internal.OooOo.OooO00o(OooO0oO(i2).OooO0oo(), oooO.OooO0oO(i2).OooO0oo()) && kotlin.jvm.internal.OooOo.OooO00o(OooO0oO(i2).getKind(), oooO.OooO0oO(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o00OO0o.OooO
    public final List getAnnotations() {
        return oo000o.f31251OooOo0O;
    }

    @Override // o00OO0o.OooO
    public final Oooo0o0.OooO getKind() {
        return o00OO0o.OooOO0O.f32049OooOoO0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oo00o.OooO0OO] */
    public int hashCode() {
        return ((Number) this.f32091OooOO0O.getValue()).intValue();
    }

    @Override // o00OO0o.OooO
    public boolean isInline() {
        return false;
    }

    public final String toString() {
        return o00O0.OooOo00.OooOooo(o00Oo0oo.o00oO0o.OooOOOO(0, this.f32084OooO0OO), ", ", this.f32082OooO00o.concat("("), ")", new com.ironsource.sdk.controller.OooO0o(this, 6), 24);
    }
}
