package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class v90 implements jb0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f24891OooO00o;

    /* renamed from: OooO0O0 */
    public final ArrayList f24892OooO0O0;

    public /* synthetic */ v90(int i, ArrayList arrayList) {
        this.f24891OooO00o = i;
        this.f24892OooO0O0 = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
        switch (this.f24891OooO00o) {
            case 0:
                ((C1581fu) obj).f19126OooO0O0.putStringArrayList("ad_types", this.f24892OooO0O0);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        switch (this.f24891OooO00o) {
            case 0:
                ((C1581fu) obj).f19125OooO00o.putStringArrayList("ad_types", this.f24892OooO0O0);
                break;
            default:
                af0.Oooo0oo(((C1581fu) obj).f19125OooO00o, "android_permissions", this.f24892OooO0O0);
                break;
        }
    }

    private final /* synthetic */ void OooO00o(Object obj) {
    }
}
