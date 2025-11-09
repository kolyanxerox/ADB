package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class og0 implements Consumer {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f22992OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f22993OooOo0o;

    public /* synthetic */ og0(Object obj, int i) {
        this.f22992OooOo0O = i;
        this.f22993OooOo0o = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f22992OooOo0O) {
            case 0:
                ((C1548ey) this.f22993OooOo0o).OooO0oO("plaay_ts", Long.toString(((Long) obj).longValue()));
                break;
            case 1:
                ((C1548ey) this.f22993OooOo0o).OooO0oO("gqi", (String) obj);
                break;
            case 2:
                ((C1548ey) this.f22993OooOo0o).OooO0oO("action", (String) obj);
                break;
            case 3:
                ((C1548ey) this.f22993OooOo0o).OooO0oO("gqi", (String) obj);
                break;
            default:
                Bundle bundle = new Bundle();
                bundle.putString("mediaUrl", (String) obj);
                ((C2274yl) this.f22993OooOo0o).zzc(bundle);
                break;
        }
    }
}
