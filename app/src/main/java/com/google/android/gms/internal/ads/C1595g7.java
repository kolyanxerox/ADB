package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.admanager.AppEventListener;

/* renamed from: com.google.android.gms.internal.ads.g7 */
/* loaded from: classes2.dex */
public final class C1595g7 implements InterfaceC1730jw {

    /* renamed from: OooOo, reason: collision with root package name */
    public final String f19244OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f19245OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final String f19246OooOo0o;

    public /* synthetic */ C1595g7(int i, String str, String str2) {
        this.f19245OooOo0O = i;
        this.f19246OooOo0o = str;
        this.f19244OooOo = str2;
    }

    public static C1595g7 OooO00o(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        return new C1595g7(3, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1730jw, com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        switch (this.f19245OooOo0O) {
            case 1:
                ((AppEventListener) obj).onAppEvent(this.f19246OooOo0o, this.f19244OooOo);
                break;
            default:
                ((InterfaceC1952pw) obj).OooO00o(this.f19246OooOo0o, this.f19244OooOo);
                break;
        }
    }
}
