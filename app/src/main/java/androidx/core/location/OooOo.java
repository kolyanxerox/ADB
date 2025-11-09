package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOo implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Executor f15233OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15234OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f15235OooOo0o;

    public /* synthetic */ OooOo(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i) {
        this.f15234OooOo0O = i;
        this.f15235OooOo0o = preRGnssStatusTransport;
        this.f15233OooOo = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15234OooOo0O) {
            case 0:
                this.f15235OooOo0o.lambda$onStopped$1(this.f15233OooOo);
                break;
            default:
                this.f15235OooOo0o.lambda$onStarted$0(this.f15233OooOo);
                break;
        }
    }
}
