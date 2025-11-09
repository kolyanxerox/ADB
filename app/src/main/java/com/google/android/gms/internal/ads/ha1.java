package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ha1 {

    /* renamed from: OooO0Oo */
    public static final ha1 f19673OooO0Oo = new ha1(new C1421bg[0]);

    /* renamed from: OooO00o */
    public final int f19674OooO00o;

    /* renamed from: OooO0O0 */
    public final gn0 f19675OooO0O0;

    /* renamed from: OooO0OO */
    public int f19676OooO0OO;

    static {
        Integer.toString(0, 36);
    }

    public ha1(C1421bg... c1421bgArr) {
        this.f19675OooO0O0 = rm0.OooOOOo(c1421bgArr);
        this.f19674OooO00o = c1421bgArr.length;
        int i = 0;
        while (i < this.f19675OooO0O0.f19390OooOoO0) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                gn0 gn0Var = this.f19675OooO0O0;
                if (i3 < gn0Var.f19390OooOoO0) {
                    if (((C1421bg) gn0Var.get(i)).equals(this.f19675OooO0O0.get(i3))) {
                        AbstractC1641hg.OooOOO0("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i3++;
                }
            }
            i = i2;
        }
    }

    public final C1421bg OooO00o(int i) {
        return (C1421bg) this.f19675OooO0O0.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ha1.class != obj.getClass()) {
            return false;
        }
        ha1 ha1Var = (ha1) obj;
        return this.f19674OooO00o == ha1Var.f19674OooO00o && this.f19675OooO0O0.equals(ha1Var.f19675OooO0O0);
    }

    public final int hashCode() {
        int i = this.f19676OooO0OO;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f19675OooO0O0.hashCode();
        this.f19676OooO0OO = iHashCode;
        return iHashCode;
    }
}
