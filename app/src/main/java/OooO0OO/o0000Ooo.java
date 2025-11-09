package Oooo0oO;

import android.content.Context;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.internal.ads.C1599gb;
import com.google.android.gms.internal.ads.InterfaceC1730jw;
import com.google.android.gms.internal.ads.InterfaceC1770kz;
import com.google.android.gms.internal.ads.d61;
import com.google.android.gms.internal.ads.e61;

/* loaded from: classes2.dex */
public final class o0000Ooo implements oo0o0Oo, InterfaceC1730jw, InterfaceC1770kz {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f13883OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f13884OooOo0o;

    public int OooO00o() {
        int i = this.f13884OooOo0o;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i != 42) {
            return i != 22 ? i != 23 ? 0 : 15 : BasicMeasure.EXACTLY;
        }
        return 16;
    }

    @Override // Oooo0oO.oo0o0Oo
    public int OooO0OO(Context context, String str, boolean z) {
        return 0;
    }

    @Override // Oooo0oO.oo0o0Oo
    public int OooO0Oo(Context context, String str) {
        return this.f13884OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1730jw, com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        switch (this.f13883OooOo0O) {
            case 3:
                ((zzr) obj).zzds(this.f13884OooOo0o);
                break;
            case 7:
                ((e61) obj).OooOO0O(this.f13884OooOo0o);
                break;
            case 8:
                ((e61) obj).OooO0O0(this.f13884OooOo0o);
                break;
            default:
                ((e61) obj).OooOOOo(this.f13884OooOo0o);
                break;
        }
    }

    public /* synthetic */ o0000Ooo(int i, int i2) {
        this.f13883OooOo0O = i2;
        this.f13884OooOo0o = i;
    }

    public /* synthetic */ o0000Ooo(o0000Ooo o0000ooo) {
        this.f13883OooOo0O = 5;
        this.f13884OooOo0o = o0000ooo.f13884OooOo0o;
    }

    public /* synthetic */ o0000Ooo(d61 d61Var, int i) {
        this.f13883OooOo0O = 8;
        this.f13884OooOo0o = i;
    }

    public /* synthetic */ o0000Ooo(d61 d61Var, int i, long j) {
        this.f13883OooOo0O = 7;
        this.f13884OooOo0o = i;
    }

    public /* synthetic */ o0000Ooo(d61 d61Var, int i, C1599gb c1599gb, C1599gb c1599gb2) {
        this.f13883OooOo0O = 9;
        this.f13884OooOo0o = i;
    }
}
