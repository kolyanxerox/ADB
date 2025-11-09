package o000oooO;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import o000O0O0.OooO0O0;

/* loaded from: classes3.dex */
public final class o000O0O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public OooO0O0 f31128OooO00o;

    public final AdRequest OooO00o(String str) {
        return str.isEmpty() ? OooO0O0().build() : OooO0O0().setAdString(str).build();
    }

    public final AdRequest.Builder OooO0O0() {
        AdRequest.Builder requestAgent = new AdRequest.Builder().setRequestAgent(this.f31128OooO00o.f30118OooO0O0);
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_5");
        return requestAgent.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
    }
}
