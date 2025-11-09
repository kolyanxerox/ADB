package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class ik0 implements Consumer {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f20059OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Bundle f20060OooOo0o;

    public /* synthetic */ ik0(int i, Bundle bundle) {
        this.f20059OooOo0O = i;
        this.f20060OooOo0o = bundle;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Bundle bundle = this.f20060OooOo0o;
        String str = (String) obj;
        switch (this.f20059OooOo0O) {
            case 0:
                or0 or0Var = kk0.f20611OooO0OO;
                bundle.putString("sessionToken", str);
                break;
            case 1:
                or0 or0Var2 = kk0.f20611OooO0OO;
                bundle.putString("deeplinkUrl", str);
                break;
            case 2:
                or0 or0Var3 = kk0.f20611OooO0OO;
                bundle.putString("sessionToken", str);
                break;
            case 3:
                or0 or0Var4 = kk0.f20611OooO0OO;
                bundle.putString("appId", str);
                break;
            case 4:
                or0 or0Var5 = kk0.f20611OooO0OO;
                bundle.putString("thirdPartyAuthCallerId", str);
                break;
            case 5:
                or0 or0Var6 = kk0.f20611OooO0OO;
                bundle.putString("appId", str);
                break;
            case 6:
                or0 or0Var7 = kk0.f20611OooO0OO;
                bundle.putString("sessionToken", str);
                break;
            case 7:
                or0 or0Var8 = kk0.f20611OooO0OO;
                bundle.putString("appId", str);
                break;
            default:
                or0 or0Var9 = kk0.f20611OooO0OO;
                bundle.putString("adFieldEnifd", str);
                break;
        }
    }
}
