package o000oooo;

import Ooooo0o.o00O0OO;
import Ooooo0o.o00OO000;
import Ooooo0o.o00OO00O;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.util.Preconditions;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.unity3d.scar.adapter.common.OooO0OO;
import java.util.ArrayList;
import o000Ooo.o00oO0o;
import o000ooOO.o000O0Oo;
import o000oooO.o000O0O0;
import o0O0ooO.OooO00o;

/* loaded from: classes3.dex */
public abstract class o000O {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f31131OooO00o;

    /* renamed from: OooO0O0 */
    public final Context f31132OooO0O0;

    /* renamed from: OooO0OO */
    public Object f31133OooO0OO;

    /* renamed from: OooO0Oo */
    public final Object f31134OooO0Oo;

    /* renamed from: OooO0o */
    public Object f31135OooO0o;

    /* renamed from: OooO0o0 */
    public final Object f31136OooO0o0;

    /* renamed from: OooO0oO */
    public Object f31137OooO0oO;

    public /* synthetic */ o000O(Context context, o000O0Oo o000o0oo2, Object obj, OooO0OO oooO0OO, int i) {
        this.f31131OooO00o = i;
        this.f31132OooO0O0 = context;
        this.f31134OooO0Oo = o000o0oo2;
        this.f31136OooO0o0 = obj;
        this.f31137OooO0oO = oooO0OO;
    }

    public abstract void OooO(Animator animator);

    public AnimatorSet OooO0O0() {
        o00OO00O o00oo00o = (o00OO00O) this.f31137OooO0oO;
        if (o00oo00o == null) {
            if (((o00OO00O) this.f31135OooO0o) == null) {
                this.f31135OooO0o = o00OO00O.OooO0O0(this.f31132OooO0O0, OooO0Oo());
            }
            o00oo00o = (o00OO00O) Preconditions.checkNotNull((o00OO00O) this.f31135OooO0o);
        }
        return OooO0OO(o00oo00o);
    }

    public AnimatorSet OooO0OO(o00OO00O o00oo00o) {
        ArrayList arrayList = new ArrayList();
        boolean zOooO0oO = o00oo00o.OooO0oO("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f31133OooO0OO;
        if (zOooO0oO) {
            arrayList.add(o00oo00o.OooO0Oo("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (o00oo00o.OooO0oO("scale")) {
            arrayList.add(o00oo00o.OooO0Oo("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(o00oo00o.OooO0Oo("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (o00oo00o.OooO0oO("width")) {
            arrayList.add(o00oo00o.OooO0Oo("width", extendedFloatingActionButton, ExtendedFloatingActionButton.f27618OoooOOo));
        }
        if (o00oo00o.OooO0oO("height")) {
            arrayList.add(o00oo00o.OooO0Oo("height", extendedFloatingActionButton, ExtendedFloatingActionButton.f27619OoooOo0));
        }
        if (o00oo00o.OooO0oO("paddingStart")) {
            arrayList.add(o00oo00o.OooO0Oo("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.f27620OoooOoO));
        }
        if (o00oo00o.OooO0oO("paddingEnd")) {
            arrayList.add(o00oo00o.OooO0Oo("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.f27621OoooOoo));
        }
        if (o00oo00o.OooO0oO("labelOpacity")) {
            arrayList.add(o00oo00o.OooO0Oo("labelOpacity", extendedFloatingActionButton, new o00OO000(this)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        o00O0OO.OooO00o(animatorSet, arrayList);
        return animatorSet;
    }

    public abstract int OooO0Oo();

    public abstract void OooO0o(AdRequest adRequest);

    public void OooO0o0(o00oO0o o00oo0o) {
        AdRequest adRequestBuild;
        switch (this.f31131OooO00o) {
            case 0:
                AdRequest adRequestOooO00o = ((o000O0O0) this.f31136OooO0o0).OooO00o(((o000O0Oo) this.f31134OooO0Oo).f31116OooO0Oo);
                if (o00oo0o != null) {
                    ((o000OO00) this.f31135OooO0o).f31138OooO00o = o00oo0o;
                }
                OooO0o(adRequestOooO00o);
                break;
            default:
                String str = ((o000O0Oo) this.f31134OooO0Oo).f31116OooO0Oo;
                OooO00o oooO00o = (OooO00o) this.f31136OooO0o0;
                oooO00o.getClass();
                if (str.isEmpty()) {
                    AdRequest.Builder requestAgent = new AdRequest.Builder().setRequestAgent(oooO00o.f32828OooO00o.f30118OooO0O0);
                    Bundle bundle = new Bundle();
                    bundle.putString("query_info_type", "requester_type_5");
                    adRequestBuild = requestAgent.addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
                } else {
                    AdRequest.Builder requestAgent2 = new AdRequest.Builder().setRequestAgent(oooO00o.f32828OooO00o.f30118OooO0O0);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("query_info_type", "requester_type_5");
                    adRequestBuild = requestAgent2.addNetworkExtrasBundle(AdMobAdapter.class, bundle2).setAdString(str).build();
                }
                if (o00oo0o != null) {
                    ((o000OO00) this.f31135OooO0o).f31138OooO00o = o00oo0o;
                }
                OooO0o(adRequestBuild);
                break;
        }
    }

    public void OooO0oO() {
        ((o00oO0o) this.f31136OooO0o0).f30487OooOo0o = null;
    }

    public abstract void OooO0oo();

    public abstract void OooOO0();

    public abstract boolean OooOO0O();

    public o000O(ExtendedFloatingActionButton extendedFloatingActionButton, o00oO0o o00oo0o) {
        this.f31131OooO00o = 1;
        this.f31134OooO0Oo = new ArrayList();
        this.f31133OooO0OO = extendedFloatingActionButton;
        this.f31132OooO0O0 = extendedFloatingActionButton.getContext();
        this.f31136OooO0o0 = o00oo0o;
    }
}
