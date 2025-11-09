package com.applovin.impl.sdk.nativeAd;

import androidx.arch.core.util.Function;
import com.applovin.impl.C1026f5;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Function {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15849OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15850OooOo0o;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f15849OooOo0O = i;
        this.f15850OooOo0o = obj;
    }

    @Override // androidx.arch.core.util.Function, OooOOO.OooO0o
    public final Object apply(Object obj) {
        switch (this.f15849OooOo0O) {
            case 0:
                return ((AppLovinNativeAdImpl) this.f15850OooOo0o).lambda$getDirectClickTrackingPostbacks$1((C1026f5) obj);
            case 1:
                return ((AppLovinNativeAdImpl) this.f15850OooOo0o).lambda$getOpenMeasurementVerificationScriptResources$2((JSONArray) obj);
            default:
                return AppLovinNativeAdImpl.lambda$getOpenMeasurementVerificationScriptResources$3((OooO00o) this.f15850OooOo0o, (C1026f5) obj);
        }
    }
}
