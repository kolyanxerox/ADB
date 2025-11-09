package com.applovin.impl.sdk;

import android.adservices.topics.GetTopicsRequest;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15820OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15821OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15822OooOo0o;

    public /* synthetic */ OooO0O0(int i, Object obj, Object obj2) {
        this.f15821OooOo0O = i;
        this.f15820OooOo = obj;
        this.f15822OooOo0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15821OooOo0O) {
            case 0:
                ((AppLovinAdServiceImpl.C1194c) this.f15820OooOo).adReceived((AbstractC1207b) this.f15822OooOo0o);
                break;
            case 1:
                ((AppLovinAdLoadListener) this.f15820OooOo).adReceived((AbstractC1207b) this.f15822OooOo0o);
                break;
            case 2:
                ((C1220k) this.f15820OooOo).m2805a((AppLovinSdkInitializationConfiguration) this.f15822OooOo0o);
                break;
            case 3:
                ((C1220k) this.f15820OooOo).m2810b((String) this.f15822OooOo0o);
                break;
            case 4:
                ((C1221l) this.f15820OooOo).m2961b((AppLovinBidTokenCollectionListener) this.f15822OooOo0o);
                break;
            case 5:
                ((C1223n) this.f15820OooOo).m3039a((Long) this.f15822OooOo0o);
                break;
            case 6:
                ((C1243r) this.f15820OooOo).m3236a((GetTopicsRequest) this.f15822OooOo0o);
                break;
            case 7:
                ((C1243r) this.f15820OooOo).m3240a((List) this.f15822OooOo0o);
                break;
            default:
                ((C1243r) this.f15820OooOo).m3238a((String) this.f15822OooOo0o);
                break;
        }
    }
}
