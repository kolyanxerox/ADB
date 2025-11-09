package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15208OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15209OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Executor f15210OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15211OooOoO0;

    public /* synthetic */ OooO(Object obj, Executor executor, Object obj2, int i) {
        this.f15209OooOo0O = i;
        this.f15208OooOo = obj;
        this.f15210OooOo0o = executor;
        this.f15211OooOoO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15209OooOo0O) {
            case 0:
                ((LocationManagerCompat.GnssMeasurementsTransport) this.f15208OooOo).lambda$onGnssMeasurementsReceived$0(this.f15210OooOo0o, (GnssMeasurementsEvent) this.f15211OooOoO0);
                break;
            case 1:
                ((LocationManagerCompat.GpsStatusTransport) this.f15208OooOo).lambda$onGpsStatusChanged$3(this.f15210OooOo0o, (GnssStatusCompat) this.f15211OooOoO0);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) this.f15208OooOo).lambda$onSatelliteStatusChanged$3(this.f15210OooOo0o, (GnssStatus) this.f15211OooOoO0);
                break;
        }
    }
}
