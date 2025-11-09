package androidx.core.content.res;

import androidx.core.content.res.ResourcesCompat;
import com.applovin.impl.adview.C0962a;
import com.applovin.impl.sdk.C1218i;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15205OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15206OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f15207OooOo0o;

    public /* synthetic */ OooO00o(Object obj, int i, int i2) {
        this.f15206OooOo0O = i2;
        this.f15205OooOo = obj;
        this.f15207OooOo0o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15206OooOo0O) {
            case 0:
                ((ResourcesCompat.FontCallback) this.f15205OooOo).lambda$callbackFailAsync$1(this.f15207OooOo0o);
                break;
            case 1:
                ((C0962a) this.f15205OooOo).m157a(this.f15207OooOo0o);
                break;
            case 2:
                ((C1218i.a) this.f15205OooOo).mo2765a(this.f15207OooOo0o);
                break;
            default:
                ((MaxAdPlacer) this.f15205OooOo).m3933a(this.f15207OooOo0o);
                break;
        }
    }
}
