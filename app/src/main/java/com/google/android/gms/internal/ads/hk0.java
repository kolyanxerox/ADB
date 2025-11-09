package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class hk0 implements hl0, uy0, t01, il0, InterfaceC1770kz, ua1 {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f19808OooOo0O;

    /* renamed from: OooOo0o */
    public final Object f19809OooOo0o;

    public /* synthetic */ hk0(d61 d61Var, o0OoOo0 o0oooo0, h41 h41Var) {
        this.f19808OooOo0O = 8;
        this.f19809OooOo0o = o0oooo0;
    }

    @Override // com.google.android.gms.internal.ads.t01
    public c11 OooO00o(Class cls) {
        for (int i = 0; i < 2; i++) {
            t01 t01Var = ((t01[]) this.f19809OooOo0o)[i];
            if (t01Var.OooO0O0(cls)) {
                return t01Var.OooO00o(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.t01
    public boolean OooO0O0(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((t01[]) this.f19809OooOo0o)[i].OooO0O0(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hl0
    public Iterator OooO0Oo(ni0 ni0Var, CharSequence charSequence) {
        return new cl0(charSequence, new pd0(((xk0) this.f19809OooOo0o).f25642OooOo0o.matcher(charSequence)), 1);
    }

    @Override // com.google.android.gms.internal.ads.ua1
    public gn0 OooO0o(int i, C1421bg c1421bg, int[] iArr) {
        xh0.OooOOoo(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < c1421bg.f17492OooO00o) {
            int i4 = i;
            C1421bg c1421bg2 = c1421bg;
            na1 na1Var = new na1(i4, c1421bg2, i2, (qa1) this.f19809OooOo0o, iArr[i2]);
            int length = objArrCopyOf.length;
            int i5 = i3 + 1;
            int iOooO0o = lm0.OooO0o(length, i5);
            if (iOooO0o > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iOooO0o);
            }
            objArrCopyOf[i3] = na1Var;
            i2++;
            i3 = i5;
            i = i4;
            c1421bg = c1421bg2;
        }
        return rm0.OooOOO(i3, objArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public Object mo13704zza() {
        switch (this.f19808OooOo0O) {
            case 4:
                return (C2128un) this.f19809OooOo0o;
            default:
                return Boolean.valueOf(((b51) this.f19809OooOo0o).f17399OoooOO0);
        }
    }

    public /* synthetic */ hk0(d61 d61Var, AbstractC1632h7 abstractC1632h7) {
        this.f19808OooOo0O = 7;
        this.f19809OooOo0o = abstractC1632h7;
    }

    public /* synthetic */ hk0(Object obj, int i) {
        this.f19808OooOo0O = i;
        this.f19809OooOo0o = obj;
    }

    @Override // com.google.android.gms.internal.ads.uy0
    public Object zza(String str) {
        return ((qv0) this.f19809OooOo0o).OooO0o(str, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        switch (this.f19808OooOo0O) {
            case 5:
                h61 h61Var = (h61) obj;
                ((w41) this.f19809OooOo0o).getClass();
                h61Var.OooO(h61Var.OooO0oO(), 13, new f61(0));
                break;
            case 6:
            default:
                ((e61) obj).OooO0Oo((o0OoOo0) this.f19809OooOo0o);
                break;
            case 7:
                ((e61) obj).OooOO0((AbstractC1632h7) this.f19809OooOo0o);
                break;
        }
    }
}
