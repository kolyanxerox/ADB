package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f15218OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15219OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Executor f15220OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15221OooOoO0;

    public /* synthetic */ OooOO0(Object obj, Executor executor, int i, int i2) {
        this.f15219OooOo0O = i2;
        this.f15221OooOoO0 = obj;
        this.f15220OooOo0o = executor;
        this.f15218OooOo = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15219OooOo0O) {
            case 0:
                ((LocationManagerCompat.GnssMeasurementsTransport) this.f15221OooOoO0).lambda$onStatusChanged$1(this.f15220OooOo0o, this.f15218OooOo);
                break;
            case 1:
                ((LocationManagerCompat.GpsStatusTransport) this.f15221OooOoO0).lambda$onGpsStatusChanged$2(this.f15220OooOo0o, this.f15218OooOo);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) this.f15221OooOoO0).lambda$onFirstFix$2(this.f15220OooOo0o, this.f15218OooOo);
                break;
        }
    }
}
