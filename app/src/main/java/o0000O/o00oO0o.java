package o0000o;

import com.google.android.gms.internal.measurement.o00000O;
import com.google.android.gms.internal.measurement.o00O0000;
import com.google.android.gms.internal.measurement.o00O00OO;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class o00oO0o implements Callable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f29573OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FirebaseAnalytics f29574OooOo0o;

    public o00oO0o(FirebaseAnalytics firebaseAnalytics, int i) {
        this.f29573OooOo0O = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(firebaseAnalytics);
                this.f29574OooOo0o = firebaseAnalytics;
                break;
            default:
                Objects.requireNonNull(firebaseAnalytics);
                this.f29574OooOo0o = firebaseAnalytics;
                break;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f29573OooOo0O) {
            case 0:
                o00O00OO o00o00oo = this.f29574OooOo0o.f28137OooO00o;
                o00o00oo.getClass();
                o00000O o00000o = new o00000O();
                o00o00oo.OooO0OO(new o00O0000(o00o00oo, o00000o, 5));
                return o00000o.OooOOO(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
            default:
                o00O00OO o00o00oo2 = this.f29574OooOo0o.f28137OooO00o;
                o00o00oo2.getClass();
                o00000O o00000o2 = new o00000O();
                o00o00oo2.OooO0OO(new o00O0000(o00o00oo2, o00000o2, 6));
                return (Long) o00000O.o000O0O0(Long.class, o00000o2.o000OO0O(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS));
        }
    }
}
