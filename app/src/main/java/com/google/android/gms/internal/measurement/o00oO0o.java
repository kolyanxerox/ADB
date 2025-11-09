package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C2051sk;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class o00oO0o implements Comparator {

    /* renamed from: OooOo0O */
    public final /* synthetic */ OooOOO0 f26535OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ C2051sk f26536OooOo0o;

    public o00oO0o(OooOOO0 oooOOO0, C2051sk c2051sk) {
        this.f26535OooOo0O = oooOOO0;
        this.f26536OooOo0o = c2051sk;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Oooo0 oooo0 = (Oooo0) obj;
        Oooo0 oooo02 = (Oooo0) obj2;
        if (oooo0 instanceof o00Oo0) {
            return !(oooo02 instanceof o00Oo0) ? 1 : 0;
        }
        if (oooo02 instanceof o00Oo0) {
            return -1;
        }
        OooOOO0 oooOOO0 = this.f26535OooOo0O;
        return oooOOO0 == null ? oooo0.zzc().compareTo(oooo02.zzc()) : (int) o00O0.o000OOo.OooOo0(oooOOO0.OooO00o(this.f26536OooOo0o, Arrays.asList(oooo0, oooo02)).zzd().doubleValue());
    }
}
