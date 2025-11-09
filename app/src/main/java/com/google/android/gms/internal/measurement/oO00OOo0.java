package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C2051sk;
import java.util.List;

/* loaded from: classes2.dex */
public final class oO00OOo0 extends OooOOO0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f26698OooOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oO00OOo0(String str, int i) {
        super(str);
        this.f26698OooOo = i;
    }

    @Override // com.google.android.gms.internal.measurement.OooOOO0
    public final Oooo0 OooO00o(C2051sk c2051sk, List list) {
        switch (this.f26698OooOo) {
            case 0:
                return Oooo0.OooOO0o;
            case 1:
            case 2:
                return this;
            case 3:
                return new OooOO0O(Double.valueOf(0.0d));
            default:
                return Oooo0.OooOO0o;
        }
    }
}
