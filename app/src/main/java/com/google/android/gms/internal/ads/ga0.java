package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ga0 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f19283OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Integer f19284OooO0O0;

    public /* synthetic */ ga0(int i, Integer num) {
        this.f19283OooO00o = i;
        this.f19284OooO0O0 = num;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
        int i = this.f19283OooO00o;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        switch (this.f19283OooO00o) {
            case 0:
                C1581fu c1581fu = (C1581fu) obj;
                Integer num = this.f19284OooO0O0;
                if (num != null) {
                    c1581fu.f19125OooO00o.putInt("aos", num.intValue());
                    break;
                }
                break;
            default:
                C1581fu c1581fu2 = (C1581fu) obj;
                Integer num2 = this.f19284OooO0O0;
                if (num2 != null) {
                    c1581fu2.f19125OooO00o.putInt("dspct", Math.min(num2.intValue(), 20));
                    break;
                }
                break;
        }
    }

    private final /* synthetic */ void OooO00o(Object obj) {
    }

    private final /* synthetic */ void OooO0O0(Object obj) {
    }
}
