package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zb0 implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f26142OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0oO.Oooo0 f26143OooO0O0;

    public /* synthetic */ zb0(OooO0oO.Oooo0 oooo0, int i) {
        this.f26142OooO00o = i;
        this.f26143OooO0O0 = oooo0;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f26142OooO00o) {
            case 0:
                String str = ((C2197wi) this.f26143OooO0O0.f13283OooOo).zzd;
                ii0.Oooo000(str);
                return str;
            case 1:
                return Integer.valueOf(this.f26143OooO0O0.f13285OooOo0o);
            case 2:
                return Boolean.valueOf(((C2197wi) this.f26143OooO0O0.f13283OooOo).zzl);
            case 3:
                return Boolean.valueOf(((C2197wi) this.f26143OooO0O0.f13283OooOo).zza.getBoolean("is_gbid"));
            case 4:
                return Boolean.valueOf(((C2197wi) this.f26143OooO0O0.f13283OooOo).zzk);
            default:
                String str2 = ((C2197wi) this.f26143OooO0O0.f13283OooOo).zzh;
                ii0.Oooo000(str2);
                return str2;
        }
    }
}
