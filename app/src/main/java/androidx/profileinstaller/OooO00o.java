package androidx.profileinstaller;

import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.ironsource.AbstractC3887z;
import com.ironsource.C3218id;
import java.util.Collection;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15311OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15312OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f15313OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15314OooOoO0;

    public /* synthetic */ OooO00o(int i, Object obj, int i2, Object obj2) {
        this.f15312OooOo0O = i2;
        this.f15311OooOo = obj;
        this.f15313OooOo0o = i;
        this.f15314OooOoO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15312OooOo0O) {
            case 0:
                ((DeviceProfileWriter) this.f15311OooOo).lambda$result$0(this.f15313OooOo0o, this.f15314OooOoO0);
                break;
            case 1:
                ((MaxAdPlacer) this.f15311OooOo).m3934a(this.f15313OooOo0o, (Collection) this.f15314OooOoO0);
                break;
            case 2:
                C3218id.m9313a((C3218id) this.f15311OooOo, this.f15313OooOo0o, (String) this.f15314OooOoO0);
                break;
            default:
                AbstractC3887z.m13253a((AbstractC3887z) this.f15311OooOo, this.f15313OooOo0o, (String) this.f15314OooOoO0);
                break;
        }
    }
}
