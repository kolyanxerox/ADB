package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;

/* loaded from: classes2.dex */
public final class tq0 implements vp0, InterfaceC1730jw {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final tq0 f24467OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final tq0 f24468OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final tq0 f24469OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final tq0 f24470OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public static final tq0 f24471OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public static final tq0 f24472OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public static final tq0 f24473OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public static final tq0 f24474OooOooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public static final tq0 f24475Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public static final tq0 f24476Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public static final tq0 f24477Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public static final tq0 f24478Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public static final tq0 f24479Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public static final tq0 f24480Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public static final tq0 f24481Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public static final tq0 f24482Oooo0o0;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f24483OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final String f24484OooOo0o;

    static {
        int i = 0;
        f24467OooOo = new tq0("ENABLED", i);
        f24469OooOoO0 = new tq0("DISABLED", i);
        f24468OooOoO = new tq0("DESTROYED", i);
        int i2 = 1;
        f24470OooOoOO = new tq0("TINK", i2);
        f24472OooOoo0 = new tq0("CRUNCHY", i2);
        f24471OooOoo = new tq0("NO_PREFIX", i2);
        int i3 = 2;
        f24473OooOooO = new tq0("ASSUME_AES_GCM", i3);
        f24474OooOooo = new tq0("ASSUME_XCHACHA20POLY1305", i3);
        f24476Oooo000 = new tq0("ASSUME_CHACHA20POLY1305", i3);
        f24477Oooo00O = new tq0("ASSUME_AES_CTR_HMAC", i3);
        f24478Oooo00o = new tq0("ASSUME_AES_EAX", i3);
        f24475Oooo0 = new tq0("ASSUME_AES_GCM_SIV", i3);
        int i4 = 3;
        f24479Oooo0O0 = new tq0("TINK", i4);
        f24480Oooo0OO = new tq0("CRUNCHY", i4);
        f24482Oooo0o0 = new tq0("LEGACY", i4);
        f24481Oooo0o = new tq0("NO_PREFIX", i4);
    }

    public /* synthetic */ tq0(String str, int i) {
        this.f24483OooOo0O = i;
        this.f24484OooOo0o = str;
    }

    public String toString() {
        switch (this.f24483OooOo0O) {
            case 0:
                return this.f24484OooOo0o;
            case 1:
                return this.f24484OooOo0o;
            case 2:
                return this.f24484OooOo0o;
            case 3:
                return this.f24484OooOo0o;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1730jw, com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        switch (this.f24483OooOo0O) {
            case 6:
                ((InterfaceC1952pw) obj).OooO0o(this.f24484OooOo0o);
                break;
            default:
                ((InterfaceC1584fx) obj).zzf(this.f24484OooOo0o);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        zzv.zzp().OooO0oo(this.f24484OooOo0o, th);
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public void mo13705zzb(Object obj) {
    }
}
